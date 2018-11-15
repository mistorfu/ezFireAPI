package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.Xfsh;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName XfshService
 * @Date 2018/5/30 14:28
 * @Author zhaomeng
 */
@Service
public class XfshService extends EsBaseService<Xfsh>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(XfshService.class);

    public XfshService() {
        this.config = EsServiceConfigEnum.XFSH;
    }

    public Xfsh setData(Xfsh xfsh) throws Exception{
        xfsh.setSzdxzqh(commonService.FillXzqh(xfsh.getSzdxzqh()));
        xfsh.setSzdxfjg(commonService.FillXfjg(xfsh.getSzdxfjg()));
        List<String> jsnr = Utils.pinyinList(xfsh.getShmc());
        jsnr.addAll(Utils.pinyinList(xfsh.getShdz()));
        xfsh.setJsnr(jsnr);
        return xfsh;
    }
}