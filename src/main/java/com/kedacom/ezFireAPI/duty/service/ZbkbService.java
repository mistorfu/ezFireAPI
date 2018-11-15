package com.kedacom.ezFireAPI.duty.service;


import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.duty.model.Zbkb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ZbkbService extends EsBaseService<Zbkb>{
    private static final Logger logger = LoggerFactory.getLogger(ZbkbService.class);
    public ZbkbService(){

        this.config = EsServiceConfigEnum.ZBKB;
    }
}
