package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.*;
import com.kedacom.ezFireAPI.outfire.model.Cbwz;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CbwzService
 * @Date 2018/5/30 10:49
 * @Author zhaomeng
 */
@Service
public class CbwzService extends EsBaseService<Cbwz> {

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(CbwzService.class);

    public CbwzService() {
        this.config = EsServiceConfigEnum.CBWZ;
    }

    public Cbwz setData(Cbwz cbwz) throws Exception{
        cbwz.setWzlx(commonService.FillDxlb(cbwz.getWzlx(), ZdxDefine.ZBLX));
        cbwz.setSzdxzqh(commonService.FillXzqh(cbwz.getSzdxzqh()));
        cbwz.setSzdxfjg(commonService.FillXfjg(cbwz.getSzdxfjg()));
        List<String> jsnr = Utils.pinyinList(cbwz.getWzmc());
        cbwz.setJsnr(jsnr);
        return cbwz;
    }
}