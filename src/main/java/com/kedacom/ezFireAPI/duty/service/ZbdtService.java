package com.kedacom.ezFireAPI.duty.service;


import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.duty.model.Zbdt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ZbdtService extends EsBaseService<Zbdt>{
    private static final Logger logger = LoggerFactory.getLogger(ZbdtService.class);
    public ZbdtService(){

        this.config = EsServiceConfigEnum.ZBDT;
    }
}
