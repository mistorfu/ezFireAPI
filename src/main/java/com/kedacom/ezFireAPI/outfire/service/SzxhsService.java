package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.Szxhs;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SzxhsService
 * @Date 2018/5/30 13:29
 * @Author zhaomeng
 */
@Service
public class SzxhsService extends EsBaseService<Szxhs>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(SzxhsService.class);

    public SzxhsService() {
        this.config = EsServiceConfigEnum.XHS;
    }

    public Szxhs setData(Szxhs xhs) throws Exception{
        xhs.setSzdxzqh(commonService.FillXzqh(xhs.getSzdxzqh()));
        xhs.setSzdxfjg(commonService.FillXfjg(xhs.getSzdxfjg()));
        List<String> jsnr = Utils.pinyinList(xhs.getXhsmc());
        jsnr.addAll(Utils.pinyinList(xhs.getXhsdz()));
        xhs.setJsnr(jsnr);
        return xhs;
    }
}