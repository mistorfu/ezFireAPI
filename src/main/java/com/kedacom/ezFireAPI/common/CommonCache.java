package com.kedacom.ezFireAPI.common;

import com.kedacom.ezFireAPI.common.dao.CommonDao;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import com.kedacom.ezFireAPI.outfire.model.TempDxlb;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchScrollRequest;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fudapeng on 2018/6/8.
 */
@Service
public class CommonCache {
    private static final Logger logger = LoggerFactory.getLogger(CommonCache.class);

    private Map<String, InnerXzqh> xzqhMap = null;
    private Map<String, TempDxlb> dxlbMap = null;
    private Map<String, Map<String, Object>> xfjgMap = null;

    @Autowired
    private CommonDao commonDao;

    @Autowired
    private EsClientManager esClientManager;

    public void initCommonCache() {
        logger.info("Caching Data...");

        initXzqhMap();
        initDxlbMap();
        initXfjgMap();
    }

    public Map<String, InnerXzqh> getXzqhMap() {
        if (xzqhMap == null || xzqhMap.size() < 1) {
            initXzqhMap();
        }
        return xzqhMap;
    }

    public Map<String, TempDxlb> getDxlbMap() {
        if (dxlbMap == null || dxlbMap.size() < 1) {
            initDxlbMap();
        }
        return dxlbMap;
    }

    public Map<String, Map<String, Object>> getXfjgMap() {
        if (xfjgMap == null || xfjgMap.size() < 1) {
            initXfjgMap();
        }
        return xfjgMap;
    }

    private void initXzqhMap() {
        xzqhMap = new HashMap<String, InnerXzqh>();
        List<InnerXzqh> xzqhList = commonDao.getAllXzqh();
        for (InnerXzqh xzqh : xzqhList) {
            xzqhMap.put(xzqh.getXzqhbh(), xzqh);
        }
    }

    private void initDxlbMap() {
        dxlbMap = new HashMap<String, TempDxlb>();
        List<TempDxlb> tempDxlbs = commonDao.getAllDxlb();
        for (TempDxlb dxlb : tempDxlbs) {
            dxlbMap.put(dxlb.getKey(), dxlb);
        }
    }

    private void initXfjgMap() {
        xfjgMap = new HashMap<String, Map<String, Object>>();

        MatchAllQueryBuilder query = QueryBuilders.matchAllQuery();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder().from(0).size(1000).query(query).explain(false);
        SearchRequest searchRequest = new SearchRequest().indices(EsServiceConfigEnum.XFDW.getRead()).types(EsServiceConfigEnum.XFDW.getType())
                .source(searchSourceBuilder).scroll(new TimeValue(60000));
        logger.info(searchRequest.toString());
        try {
            SearchResponse response = esClientManager.getClient().search(searchRequest);
            String scrollID = response.getScrollId();
            SearchHits hits = response.getHits();
            for (SearchHit hit : hits.getHits()) {
                xfjgMap.put(hit.getId(), hit.getSource());
            }
            if (hits.getHits().length == 1000) {
                while (true) {
                    SearchScrollRequest scrollRequest = new SearchScrollRequest(scrollID).scroll(new TimeValue(60000));
                    response = esClientManager.getClient().searchScroll(scrollRequest);
                    scrollID = response.getScrollId();
                    hits = response.getHits();
                    for (SearchHit hit : hits.getHits()) {
                        xfjgMap.put(hit.getId(), hit.getSource());
                    }
                    if (hits.getHits().length < 1000) {
                        break;
                    }
                }
            }
            logger.info("Total cached XFDW: " + xfjgMap.size());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

    }
}
