package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.*;
import com.kedacom.ezFireAPI.outfire.model.Zbxx;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ZbxxService
 * @Date 2018/5/29 16:29
 * @Author zhaomeng
 */
@Service
public class ZbxxService extends EsBaseService<Zbxx>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(ZbxxService.class);

    public ZbxxService() {
        this.config = EsServiceConfigEnum.ZBXX;
    }

    public Zbxx setData(Zbxx zbxx) throws Exception{
        zbxx.setZblx(commonService.FillDxlb(zbxx.getZblx(),ZdxDefine.ZBLX));
        zbxx.setSzdxzqh(commonService.FillXzqh(zbxx.getSzdxzqh()));
        zbxx.setSzdxfjg(commonService.FillXfjg(zbxx.getSzdxfjg()));

        List<String> jsnr = Utils.pinyinList(zbxx.getZbmc());
        jsnr.addAll(Utils.pinyinList(zbxx.getCfdd()));  //存放地点
        zbxx.setJsnr(jsnr);
        return zbxx;
    }
}