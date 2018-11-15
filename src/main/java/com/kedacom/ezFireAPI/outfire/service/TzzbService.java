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
 * @ClassName TzzbService
 * @Date 2018/5/29 17:10
 * @Author zhaomeng
 */
@Service
public class TzzbService extends EsBaseService<Zbxx>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(TzzbService.class);

    public TzzbService() {
        this.config = EsServiceConfigEnum.TZZB;
    }

    public Zbxx setData(Zbxx tzzb) throws  Exception{
        tzzb.setZblx(commonService.FillDxlb(tzzb.getZblx(), ZdxDefine.ZBLX));
        tzzb.setSzdxfjg(commonService.FillXfjg(tzzb.getSzdxfjg()));
        tzzb.setSzdxzqh(commonService.FillXzqh(tzzb.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(tzzb.getZbmc());
        jsnr.addAll(Utils.pinyinList(tzzb.getCfdd()));  //存放地点
        tzzb.setJsnr(jsnr);
        return tzzb;
    }
}