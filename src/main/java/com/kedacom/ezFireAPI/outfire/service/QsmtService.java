package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.Qsmt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName QsmtService
 * @Date 2018/5/30 14:52
 * @Author zhaomeng
 */
@Service
public class QsmtService extends EsBaseService<Qsmt>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(QsmtService.class);

    public QsmtService() {
        this.config = EsServiceConfigEnum.QSMT;
    }

    public Qsmt setData(Qsmt qsmt)throws Exception{
        qsmt.setSzdxzqh(commonService.FillXzqh(qsmt.getSzdxzqh()));
        qsmt.setSzdxfjg(commonService.FillXfjg(qsmt.getSzdxfjg()));
        List<String> jsnr = Utils.pinyinList(qsmt.getMtmc());
        jsnr.addAll(Utils.pinyinList(qsmt.getMtdz()));
        qsmt.setJsnr(jsnr);
        return qsmt;
    }
}