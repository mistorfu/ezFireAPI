package com.kedacom.ezFireAPI.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kedacom.ezFireAPI.common.bean.ReturnMessage;
import org.elasticsearch.action.DocWriteResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.common.geo.builders.ShapeBuilders;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;
import redis.clients.util.IOUtils;

import java.lang.reflect.ParameterizedType;
import java.util.*;

/**
 * Created by fudapeng on 2018/5/22.
 */
public abstract class EsBaseService<T> {
    private static final Logger logger = LoggerFactory.getLogger(EsBaseService.class);
    private static final List<String> reservedParams = Arrays.asList("limit", "offset", "lat", "lon", "distance", "sort", "order", "keys");

    @Autowired
    private EsClientManager esClientManager;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private Jedis jedis;

    @Value("${config.dataOperateMode}")
    protected Integer dataOperateMode;

    protected EsServiceConfigEnum config;

    public List<T> selectByMap(Map<String, Object> params) throws Exception {
        List<T> result = new LinkedList<T>();
        Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        int limit = params.containsKey("limit") ? Integer.parseInt(params.get("limit").toString()) : 10;
        int offset = params.containsKey("offset") ? Integer.parseInt(params.get("offset").toString()) : 0;
        if (config.getRead() != null && !config.getRead().equals("")) {
            QueryBuilder query = getQueryBuilderFromMap(params);

            boolean isGeoRangeSearch = false;
            double jd = 0.0;
            double wd = 0.0;
            if (params.containsKey("lat") && params.containsKey("lon") && params.containsKey("distance")) {
                isGeoRangeSearch = true;
                jd = Double.parseDouble(params.get("lon").toString());
                wd = Double.parseDouble(params.get("lat").toString());
            }

            SortBuilder sort = SortBuilders.fieldSort("GXSJ").order(SortOrder.DESC);
            if (params.containsKey("sort")) {
                if (params.containsKey("order")) {
                    if (params.get("order").toString().toUpperCase().equals("DESC"))
                        sort = SortBuilders.fieldSort(params.get("sort").toString().toUpperCase()).order(SortOrder.DESC);
                    else
                        sort = SortBuilders.fieldSort(params.get("sort").toString().toUpperCase()).order(SortOrder.ASC);
                } else {
                    sort = SortBuilders.fieldSort(params.get("sort").toString().toUpperCase()).order(SortOrder.ASC);
                }
            }
            if (isGeoRangeSearch) {
                //sort = SortBuilders.geoDistanceSort("SHAPE", wd, jd).order(SortOrder.ASC);
            }

            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder().from(offset).size(limit).query(query).sort(sort).explain(false);
            SearchRequest searchRequest = new SearchRequest().indices(config.getRead()).types(config.getType()).source(searchSourceBuilder);
            logger.info(searchRequest.toString());

            SearchResponse response = esClientManager.getClient().search(searchRequest);
            SearchHits hits = response.getHits();
            SearchHit[] searchHits = hits.getHits();
            if (searchHits == null || searchHits.length == 0) {
                return result;
            } else {
                if (isGeoRangeSearch && !params.containsKey("sort")) {
                    final double startX = jd;
                    final double startY = wd;
                    Arrays.sort(searchHits, new Comparator<SearchHit>() {
                        @Override
                        public int compare(SearchHit o1, SearchHit o2) {
                            List point1 = (List) ((Map) (o1.getSource().get("SHAPE"))).get("coordinates");
                            List point2 = (List) ((Map) (o2.getSource().get("SHAPE"))).get("coordinates");
                            Double distance1 = Utils.getSphericalDistance(startX, startY,
                                    Double.parseDouble(point1.get(0).toString()), Double.parseDouble(point1.get(1).toString()));
                            Double distance2 = Utils.getSphericalDistance(startX, startY,
                                    Double.parseDouble(point2.get(0).toString()), Double.parseDouble(point2.get(1).toString()));
                            return distance1 < distance2 ? -1 : distance1 == distance2 ? 0 : 1; // 升序
                        }
                    });
                }
                for (int i = 0; i < searchHits.length; i++) {
                    try {
                        T data = (T) Utils.convertMapToObject(tClass, searchHits[i].getSource());
                        result.add(data);
                    } catch (Exception e) {
                        logger.error(e.getMessage() + ", data source: " + searchHits[i].getSource().toString());
                    }
                }
            }
        } else if (config.getRedisKeyPrefix() != null && !config.getRedisKeyPrefix().equals("")) {
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
                    T data = (T) Utils.convertMapToObject(tClass, dataMap);
                    result.add(data);
                }
            } else if (params.containsKey("keys")) {
                List<String> keys = objMapper.readValue(params.get("keys").toString(), List.class);
                for (String id : keys) {
                    resultS = jedis.get(config.getRedisKeyPrefix() + id);
                    if (resultS != null) {
                        Map dataMap = objMapper.readValue(resultS, Map.class);
                        T data = (T) Utils.convertMapToObject(tClass, dataMap);
                        result.add(data);
                    }
                }
            } else {
                Object[] keys = jedis.keys(config.getRedisKeyPrefix() + "*").toArray();
                for (int i = offset; i < keys.length && i < offset + limit; i++) {
                    resultS = jedis.get(keys[i].toString());
                    Map dataMap = objMapper.readValue(resultS, Map.class);
                    T data = (T) Utils.convertMapToObject(tClass, dataMap);
                    result.add(data);
                }
            }
        }

        return result;
    }

    public long getCountByMap(Map<String, Object> params) throws Exception {
        long result = 0;
        if (config.getRead() != null && !config.getRead().equals("")) {
            QueryBuilder query = getQueryBuilderFromMap(params);
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder().query(query).size(0).explain(false);
            SearchRequest searchRequest = new SearchRequest().indices(config.getRead()).types(config.getType()).source(searchSourceBuilder);
            logger.info(searchRequest.toString());

            SearchResponse response = esClientManager.getClient().search(searchRequest);
            SearchHits hits = response.getHits();
            result = hits.getTotalHits();
        } else if (config.getRedisKeyPrefix() != null && !config.getRedisKeyPrefix().equals("")) {
            String primaryKey = config.getPrimaryKey().toLowerCase();
            try {
                jedis.get("");
            } catch (JedisConnectionException e) { // redis长连接断开后重连
                IOUtils.closeQuietly(jedis.getClient().getSocket());
                jedis.connect();
            }
            if (params.containsKey(primaryKey)) {
                String id = params.get(primaryKey).toString();
                String resultS = jedis.get(config.getRedisKeyPrefix() + id);
                if (resultS != null) result = 1;
            } else {
                Object[] keys = jedis.keys(config.getRedisKeyPrefix() + "*").toArray();
                result = keys.length;
            }
        }
        return result;
    }

    private QueryBuilder getQueryBuilderFromMap(Map<String, Object> params) throws Exception {
        BoolQueryBuilder query = QueryBuilders.boolQuery();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String field = entry.getKey();
            String pattern = entry.getValue().toString();
            if (!reservedParams.contains(field)) {
                if (field.contains("|")) { //范围查询
                    String[] condition = field.toUpperCase().split("\\|");
                    if (condition.length == 2) {
                        if (condition[1].equals("GTE")) {
                            query.must(QueryBuilders.rangeQuery(condition[0]).gte(pattern));
                        } else if (condition[1].equals("GT")) {
                            query.must(QueryBuilders.rangeQuery(condition[0]).gt(pattern));
                        } else if (condition[1].equals("LTE")) {
                            query.must(QueryBuilders.rangeQuery(condition[0]).lte(pattern));
                        } else if (condition[1].equals("LT")) {
                            query.must(QueryBuilders.rangeQuery(condition[0]).lt(pattern));
                        }
                    }
                } else if (pattern.contains("*")) { //通配符查询
                    query.must(QueryBuilders.wildcardQuery(field.toUpperCase(), pattern));
                } else { //精准查询
                    query.must(QueryBuilders.termQuery(field.toUpperCase(), pattern));
                }
            }
        }

        if (params.containsKey("lat") && params.containsKey("lon") && params.containsKey("distance")) {
            double jd = Double.parseDouble(params.get("lon").toString());
            double wd = Double.parseDouble(params.get("lat").toString());
            double distance = Double.parseDouble(params.get("distance").toString());
            query.must(QueryBuilders.geoShapeQuery("SHAPE",
                    ShapeBuilders.newCircleBuilder().center(jd, wd).radius(String.valueOf(distance) + "m")));
        }

        if (params.containsKey("keys")) {
            List<String> keys = new ObjectMapper().readValue(params.get("keys").toString(), List.class);
            query.must(QueryBuilders.termsQuery(config.getPrimaryKey(), keys));
        }
        return query;
    }

    public List<T> selectByID(String id) throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put(config.getPrimaryKey().toLowerCase(), id);
        return selectByMap(params);
    }

    public ReturnMessage insert(T record) throws Exception {
        Map<String, Object> dataMap = Utils.convertObjectToMap(record);
        String id = null;
        if (config.getPrimaryKey() != null && !config.getPrimaryKey().equals("")) {
            id = dataMap.get(config.getPrimaryKey()).toString();
            List<T> oriData = selectByID(id);
            if (oriData.size() > 0) {
                return updateByMapID(id, dataMap);
            }
        } else {
            id = UUID.randomUUID().toString();
        }

        ObjectMapper objMapper = new ObjectMapper();
        String recordString = objMapper.writeValueAsString(dataMap);
        if (config.getWrite() != null && !config.getWrite().equals("")) {
            IndexRequest request = new IndexRequest(config.getWrite(), config.getType());
            request.source(recordString, XContentType.JSON);
            request.id(id);
            logger.info(request.toString());
            IndexResponse resp = esClientManager.getClient().index(request);

            if (resp.getResult() != DocWriteResponse.Result.CREATED) {
                return new ReturnMessage("1", "insert failed.");
            }
        }

        if (dataOperateMode > 1) {
            sendKafkaMessage(id, KafkaMessage.OPERA_ADD, recordString);
        }
        if (dataOperateMode > 2) {
            redisSet(id, recordString);
        }

        return new ReturnMessage();
    }

    public ReturnMessage update(T record) throws Exception {
        Map<String, Object> dataMap = Utils.convertObjectToMap(record);
        String id = dataMap.get(config.getPrimaryKey()).toString();
        List<T> oriData = selectByID(id);
        if (oriData.size() != 1) {
            return new ReturnMessage("2", "data not found.");
        }

        return updateByMapID(id, dataMap);
    }

    private ReturnMessage updateByMapID(String id, Map<String, Object> dataMap) throws Exception {
        String recordString = new ObjectMapper().writeValueAsString(dataMap);
        if (config.getWrite() != null && !config.getWrite().equals("")) {
            UpdateRequest request = new UpdateRequest(config.getWrite(), config.getType(), id);
            request.doc(recordString, XContentType.JSON);
            logger.info(request.toString());
            esClientManager.getClient().update(request);
        }

        if (dataOperateMode > 1) {
            sendKafkaMessage(id, KafkaMessage.OPERA_MOD, recordString);
        }
        if (dataOperateMode > 2) {
            redisSet(id, recordString);
        }

        return new ReturnMessage();
    }

    private void redisSet(String id, String recordString) {
        if (config.getRedisKeyPrefix() != null && !config.getRedisKeyPrefix().equals("")) {
            try {
                jedis.set(config.getRedisKeyPrefix() + id, recordString);
            } catch (JedisConnectionException e) {
                IOUtils.closeQuietly(jedis.getClient().getSocket());
                jedis.connect();
                jedis.set(config.getRedisKeyPrefix() + id, recordString);
            }
            logger.info("redis set, key: " + config.getRedisKeyPrefix() + id + " value: " + recordString);
        }
    }

    public ReturnMessage delete(T record) throws Exception {
        Map<String, Object> dataMap = Utils.convertObjectToMap(record);
        String id = dataMap.get(config.getPrimaryKey()).toString();
        String recordString = new ObjectMapper().writeValueAsString(dataMap);

        if (config.getWrite() != null && !config.getWrite().equals("")) {
            DeleteRequest dr = new DeleteRequest(config.getWrite(), config.getType(), id);
            logger.info(dr.toString());
            esClientManager.getClient().delete(dr);
        }

        if (dataOperateMode > 1) {
            sendKafkaMessage(id, KafkaMessage.OPERA_DEL, recordString);
        }
        if (dataOperateMode > 2 && config.getRedisKeyPrefix() != null && !config.getRedisKeyPrefix().equals("")) {
            try {
                jedis.del(config.getRedisKeyPrefix() + id);
            } catch (JedisConnectionException e) {
                IOUtils.closeQuietly(jedis.getClient().getSocket());
                jedis.connect();
                jedis.del(config.getRedisKeyPrefix() + id);
            }
            logger.info("redis del: " + config.getRedisKeyPrefix() + id);
        }

        return new ReturnMessage();
    }

    private void sendKafkaMessage(String xxbh, String czlx, String xxnr) throws Exception {
        if (config.getKafkaTopic() != null && !config.getKafkaTopic().equals("")) {
            KafkaMessage msg = new KafkaMessage();
            msg.setXxbh(xxbh);
            msg.setXxlb(config.getType());
            msg.setXxdx(config.getIndex() + ":" + config.getType());
            msg.setXxnr(xxnr);
            msg.setXxly("ezFireAPI");
            msg.setCzlx(czlx);
            msg.setCzsj(DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
            String msgString = new ObjectMapper().writeValueAsString(Utils.convertObjectToMap(msg));
            kafkaTemplate.send(config.getKafkaTopic(), xxbh, msgString);
            logger.info("sent kafka message, topic: " + config.getKafkaTopic() + " key: " + xxbh + " data: " + msgString);
        }
    }
}
