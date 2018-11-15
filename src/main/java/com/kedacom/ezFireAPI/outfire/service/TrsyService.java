package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.*;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.Trsy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TrsyService
 * @Date 2018/5/30 15:25
 * @Author zhaomeng
 */
@Service
public class TrsyService extends EsBaseService<Trsy>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(TrsyService.class);

    public TrsyService() {
        this.config = EsServiceConfigEnum.TRSY;
    }

    public Trsy setData(Trsy trsy) throws Exception{
        trsy.setSylx(commonService.FillDxlb(trsy.getSylx(),ZdxDefine.SYLX));
        trsy.setSyxz(commonService.FillDxlb(trsy.getSyxz(),ZdxDefine.SYXZ));
        trsy.setSzdxzqh(commonService.FillXzqh(trsy.getSzdxzqh()));
        trsy.setSzdxfjg(commonService.FillXfjg(trsy.getSzdxfjg()));
        List<String> jsnr = Utils.pinyinList(trsy.getSymc());
        jsnr.addAll(Utils.pinyinList(trsy.getSydz()));
        trsy.setJsnr(jsnr);
        return trsy;
    }
}