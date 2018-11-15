package com.kedacom.ezFireAPI.person.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;
import redis.clients.util.IOUtils;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by fudapeng on 2018/7/10.
 */
public abstract class RedisBaseService<T> {
    private static final Logger logger = LoggerFactory.getLogger(RedisBaseService.class);
    private String keyColumn = "";
    private String fieldColumn = "";

    @Autowired
    protected Jedis jedis;

    protected EsServiceConfigEnum config;

    public void setConfig(EsServiceConfigEnum config) {
        this.config = config;
        String[] primaryKeys = this.config.getPrimaryKey().split("\\+");
        this.keyColumn = primaryKeys[0];
        if (primaryKeys.length > 1) this.fieldColumn = primaryKeys[1];
    }

    public List<T> selectByMap(Map<String, Object> params) throws Exception {
        List<T> result = new LinkedList<T>();
        Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        if (config.getRedisKeyPrefix() != null && !config.getRedisKeyPrefix().equals("")) {
            try {
                jedis.get("");
            } catch (JedisConnectionException e) { // redis长连接断开后重连
                IOUtils.closeQuietly(jedis.getClient().getSocket());
                jedis.connect();
            }
            String resultS = null;
            ObjectMapper objMapper = new ObjectMapper();
            if (params.containsKey(keyColumn.toLowerCase()) && params.containsKey(fieldColumn.toLowerCase())) {
                String id = params.get(keyColumn.toLowerCase()).toString();
                String field = params.get(fieldColumn.toLowerCase()).toString();
                resultS = jedis.hget(config.getRedisKeyPrefix() + id, field);
                if (resultS != null) {
                    Map dataMap = objMapper.readValue(resultS, Map.class);
                    T data = (T) Utils.convertMapToObject(tClass, dataMap);
                    result.add(data);
                }
            } else if (params.containsKey(keyColumn.toLowerCase()) && params.containsKey("keys")) {
                String id = params.get(keyColumn.toLowerCase()).toString();
                List<String> keys = objMapper.readValue(params.get("keys").toString(), List.class);
                for (String field : keys) {
                    resultS = jedis.hget(config.getRedisKeyPrefix() + id, field);
                    if (resultS != null) {
                        Map dataMap = objMapper.readValue(resultS, Map.class);
                        T data = (T) Utils.convertMapToObject(tClass, dataMap);
                        result.add(data);
                    }
                }
            } else {
                String hashKey = "";
                if (params.containsKey(keyColumn.toLowerCase())) {
                    hashKey = config.getRedisKeyPrefix() + params.get(keyColumn.toLowerCase()).toString();
                } else {
                    Object[] keys = jedis.keys(config.getRedisKeyPrefix() + "*").toArray();
                    if (keys.length > 0) {
                        hashKey = keys[keys.length - 1].toString();
                    }
                }
                if (!hashKey.equals("")) {
                    Map<String, String> redisHashMaps = jedis.hgetAll(hashKey);

                    int limit = params.containsKey("limit") ? Integer.parseInt(params.get("limit").toString()) : 10;
                    int offset = params.containsKey("offset") ? Integer.parseInt(params.get("offset").toString()) : 0;
                    int i = 0;
                    for (Map.Entry<String, String> entry : redisHashMaps.entrySet()) {
                        if (i < offset) continue;
                        if (i >= offset + limit) break;
                        resultS = entry.getValue();
                        Map dataMap = objMapper.readValue(resultS, Map.class);
                        T data = (T) Utils.convertMapToObject(tClass, dataMap);
                        result.add(data);
                        i++;
                    }
                }
            }
        }
        return result;
    }

    public List<T> selectByKeyField(String key, String field) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put(keyColumn.toLowerCase(), key);
        params.put(fieldColumn.toLowerCase(), field);
        return selectByMap(params);
    }

    public ReturnMessage insert(T record) throws Exception {
        Map<String, Object> dataMap = Utils.convertObjectToMap(record);
        String key = dataMap.get(keyColumn).toString();
        String field = dataMap.get(fieldColumn).toString();

        List<T> oriData = selectByKeyField(key, field);
        if (oriData.size() > 0) {
            return update(record);
        }
        ObjectMapper objMapper = new ObjectMapper();
        String recordString = objMapper.writeValueAsString(dataMap);

        redisHset(key, field, recordString);

        return new ReturnMessage();
    }

    public ReturnMessage update(T record) throws Exception {
        Map<String, Object> dataMap = Utils.convertObjectToMap(record);
        String key = dataMap.get(keyColumn).toString();
        String field = dataMap.get(fieldColumn).toString();

        List<T> oriData = selectByKeyField(key, field);
        if (oriData.size() != 1) {
            return new ReturnMessage("2", "data not found.");
        }
        ObjectMapper objMapper = new ObjectMapper();
        String recordString = objMapper.writeValueAsString(dataMap);

        redisHset(key, field, recordString);

        return new ReturnMessage();
    }

    private void redisHset(String key, String field, String recordString) throws Exception {
        if (config.getRedisKeyPrefix() != null && !config.getRedisKeyPrefix().equals("")) {
            try {
                jedis.hset(config.getRedisKeyPrefix() + key, field, recordString);
            } catch (JedisConnectionException e) {
                IOUtils.closeQuietly(jedis.getClient().getSocket());
                jedis.connect();
                jedis.hset(config.getRedisKeyPrefix() + key, field, recordString);
            }
            logger.info("redis hset, key: " + config.getRedisKeyPrefix() + key + " field: " + field + " value: " + recordString);
        }
    }

    public ReturnMessage delete(T record) throws Exception {
        Map<String, Object> dataMap = Utils.convertObjectToMap(record);
        String key = dataMap.get(keyColumn).toString();
        String field = dataMap.get(fieldColumn).toString();

        if (config.getRedisKeyPrefix() != null && !config.getRedisKeyPrefix().equals("")) {
            try {
                jedis.hdel(config.getRedisKeyPrefix() + key, field);
            } catch (JedisConnectionException e) {
                IOUtils.closeQuietly(jedis.getClient().getSocket());
                jedis.connect();
                jedis.hdel(config.getRedisKeyPrefix() + key, field);
            }
            logger.info("redis hdel, key: " + config.getRedisKeyPrefix() + key + " field: " + field);
        }

        return new ReturnMessage();
    }
}