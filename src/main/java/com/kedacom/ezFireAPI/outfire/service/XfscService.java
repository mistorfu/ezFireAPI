package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.Xfsc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName XfscService
 * @Date 2018/5/30 14:09
 * @Author zhaomeng
 */
@Service
public class XfscService extends EsBaseService<Xfsc>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(XfscService.class);

    public XfscService() {
        this.config = EsServiceConfigEnum.XFSC;
    }

    public Xfsc setData(Xfsc xfsc) throws Exception{
        xfsc.setSzdxzqh(commonService.FillXzqh(xfsc.getSzdxzqh()));
        xfsc.setSzdxfjg(commonService.FillXfjg(xfsc.getSzdxfjg()));
        List<String> jsnr = Utils.pinyinList(xfsc.getScmc());
        jsnr.addAll(Utils.pinyinList(xfsc.getScdz()));
        xfsc.setJsnr(jsnr);
        return xfsc;
    }
}