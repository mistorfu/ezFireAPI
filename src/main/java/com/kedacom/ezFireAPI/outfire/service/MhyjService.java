package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.*;
import com.kedacom.ezFireAPI.outfire.model.Mhyj;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MhyjService
 * @Date 2018/5/30 9:36
 * @Author zhaomeng
 */
@Service
public class MhyjService extends EsBaseService<Mhyj>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(MhyjService.class);

    public MhyjService() {
        this.config = EsServiceConfigEnum.MHYJ;
    }

    public Mhyj setData(Mhyj mhyj) throws Exception{
        mhyj.setYjlx(commonService.FillDxlb(mhyj.getYjlx(), ZdxDefine.ZBLX));

        mhyj.setSzdxfjg(commonService.FillXfjg(mhyj.getSzdxfjg()));
        mhyj.setSzdxzqh(commonService.FillXzqh(mhyj.getSzdxzqh()));

        List<String> jsnr = Utils.pinyinList(mhyj.getYjmc());
        jsnr.addAll(Utils.pinyinList(mhyj.getCfdd()));  //存放地点
        mhyj.setJsnr(jsnr);
        return mhyj;
    }
}