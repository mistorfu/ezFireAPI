package com.kedacom.ezFireAPI.common;

import com.kedacom.ezFireAPI.outfire.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by fudapeng on 2018/6/5.
 */
@Service
public class CommonService {
    private static final Logger logger = LoggerFactory.getLogger(CommonService.class);

    @Autowired
    private CommonCache commonCache;

    /**
     * 根据类别名称和类别ID得到类别Value
     *
     * @param dxlb
     * @param lxbh 类型编号
     * @return
     */
    public InnerDxlb FillDxlb(InnerDxlb dxlb, String lxbh) {
        if (dxlb != null) {
            String keyId = lxbh + dxlb.getId();
            if (commonCache.getDxlbMap().containsKey(keyId)) {
                TempDxlb temp = commonCache.getDxlbMap().get(keyId);
                dxlb = getDxlb(temp, dxlb);
                return dxlb;
            }
        }
        return dxlb;
    }

    /**
     * 根据类别名称和类别ID得到类别Value和类别Chain
     *
     * @param dxlbext
     * @param lxbh    类型编号
     * @return
     */
    public InnerDxlbext FillDxlb(InnerDxlbext dxlbext, String lxbh) {
        if (dxlbext != null) {
            String keyId = lxbh + dxlbext.getId();
            if (commonCache.getDxlbMap().containsKey(keyId)) {
                TempDxlb temp = commonCache.getDxlbMap().get(keyId);
                dxlbext = (InnerDxlbext) getDxlb(temp, dxlbext);
                return dxlbext;
            }
        }
        return dxlbext;
    }

    private InnerDxlb getDxlb(TempDxlb tempDxlb, InnerDxlb dxlb) {
        dxlb.setValue(tempDxlb.getValue());
        if (dxlb instanceof InnerDxlbext) {
            ((InnerDxlbext) dxlb).setChain(tempDxlb.getChain());
        }
        return dxlb;
    }

    /**
     * 根据行政区划编号填充行政区划其它字段
     *
     * @param xzqh
     * @return
     */
    public InnerXzqh FillXzqh(InnerXzqh xzqh) {
        if (xzqh != null) {
            String xzbm = xzqh.getXzqhbh();
            if (xzbm != null && !xzbm.equals("") && commonCache.getXzqhMap().containsKey(xzbm)) {
                String xznbbm = commonCache.getXzqhMap().get(xzbm).getXzqhnbbm();
                xzqh.setXzqhnbbm(xznbbm);

                String fullName = "";
                String[] arr = xznbbm.split("\\.");
                for (int i = 1; i < arr.length; i++) {
                    InnerXzqh tempXzqh = commonCache.getXzqhMap().get(arr[i]);
                    if (tempXzqh != null) {
                        String name = tempXzqh.getXzqhmc();
                        if (name.contains("市辖区"))
                            continue;
                        else
                            fullName += name;
                    }
                }
                xzqh.setXzqhmc(fullName);

                return xzqh;
            }
        }
        return xzqh;
    }

    /**
     * 根据消防机构编号填充消防机构其它字段
     *
     * @param xfjg
     * @return
     */
    public InnerXfjg FillXfjg(InnerXfjg xfjg) {
        return getXfjgFromEs(xfjg);
    }

    public InnerXfjgext FillXfjg(InnerXfjgext xfjgext) {
        return (InnerXfjgext) getXfjgFromEs(xfjgext);
    }

    private InnerXfjg getXfjgFromEs(InnerXfjg xfjg) {
        if (xfjg != null) {
            String dwbh = xfjg.getXfjgbh();
            if (dwbh != null && !dwbh.equals("") && commonCache.getXfjgMap().containsKey(dwbh)) {
                Map<String, Object> map = commonCache.getXfjgMap().get(dwbh);
                xfjg.setXfjgmc(map.get("DWMC").toString());
                xfjg.setXfjgjc(map.get("DWSX").toString());
                if (xfjg instanceof InnerXfjgext) {
                    ((InnerXfjgext) xfjg).setXfjgjb(map.get("DWJB").toString());
                }
                xfjg.setXfjgnbbm(map.get("DWNBBM").toString());
            }
        }
        return xfjg;
    }
}
