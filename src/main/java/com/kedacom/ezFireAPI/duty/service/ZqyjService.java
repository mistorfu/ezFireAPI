package com.kedacom.ezFireAPI.duty.service;


import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.duty.model.Zqyj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ZqyjService extends EsBaseService<Zqyj>{

    private static final Logger logger = LoggerFactory.getLogger(ZqyjService.class);
    public ZqyjService(){

        this.config = EsServiceConfigEnum.ZQYJ;
    }
}
