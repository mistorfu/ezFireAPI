package com.kedacom.ezFireAPI.outfire.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Clwz;
import com.kedacom.ezFireAPI.person.service.RedisBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;
import redis.clients.util.IOUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by fudapeng on 2018/8/27.
 */
@Service
public class ClwzService extends RedisBaseService<Clwz> {
    private static final Logger logger = LoggerFactory.getLogger(ClwzService.class);

    @Autowired
    protected Jedis jedis;

    public ClwzService() {
        this.setConfig(EsServiceConfigEnum.CLWZ);
    }

    public List<Map> selectListByMap(Map<String, Object> params) throws Exception {
        List<Map> result = new LinkedList<Map>();

        if (config.getRedisKeyPrefix() != null && !config.getRedisKeyPrefix().equals("")) {
            try {
                jedis.get("");
            } catch (JedisConnectionException e) { // redis长连接断开后重连
                IOUtils.closeQuietly(jedis.getClient().getSocket());
                jedis.connect();
            }
            String primaryKey = config.getPrimaryKey().toLowerCase();
            String resultS = null;
            ObjectMapper objMapper = new ObjectMapper();
            if (params.containsKey(primaryKey)) {
                String id = params.get(primaryKey).toString();
                resultS = jedis.get(config.getRedisKeyPrefix() + id);
                if (resultS != null) {
                    Map dataMap = objMapper.readValue(resultS, Map.class);
                    result.add(dataMap);
                }
            } else if (params.containsKey("keys")) {
                List<String> keys = objMapper.readValue(params.get("keys").toString(), List.class);
                for (String id : keys) {
                    resultS = jedis.get(config.getRedisKeyPrefix() + id);
                    if (resultS != null) {
                        Map dataMap = objMapper.readValue(resultS, Map.class);
                        result.add(dataMap);
                    }
                }
            } else {
                int limit = params.containsKey("limit") ? Integer.parseInt(params.get("limit").toString()) : 10;
                int offset = params.containsKey("offset") ? Integer.parseInt(params.get("offset").toString()) : 0;

                Object[] keys = jedis.keys(config.getRedisKeyPrefix() + "*").toArray();
                for (int i = offset; i < keys.length && i < offset + limit; i++) {
                    resultS = jedis.get(keys[i].toString());
                    Map dataMap = objMapper.readValue(resultS, Map.class);
                    result.add(dataMap);
                }
            }
        }
        return result;
    }
}