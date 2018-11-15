package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.CommonService;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.common.Utils;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.Wzck;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName WzckService
 * @Date 2018/5/30 10:27
 * @Author zhaomeng
 */
@Service
public class WzckService extends EsBaseService<Wzck>{

    @Autowired
    private CommonService commonService;

    private static final Logger logger = LoggerFactory.getLogger(WzckService.class);

    public WzckService() {
        this.config = EsServiceConfigEnum.WZCK;
    }

    public Wzck setData(Wzck wzck)throws Exception{
        wzck.setSzdxzqh(commonService.FillXzqh(wzck.getSzdxzqh()));
        wzck.setSzdxfjg(commonService.FillXfjg(wzck.getSzdxfjg()));
        List<String> jsnr = Utils.pinyinList(wzck.getCkmc());
        jsnr.addAll(Utils.pinyinList(wzck.getCkdz()));
        wzck.setJsnr(jsnr);
        return wzck;
    }
}