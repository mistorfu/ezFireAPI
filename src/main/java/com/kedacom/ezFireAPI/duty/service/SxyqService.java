package com.kedacom.ezFireAPI.duty.service;


import com.kedacom.ezFireAPI.common.EsBaseService;

import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.duty.model.Sxyq;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class SxyqService extends EsBaseService<Sxyq>{

    private static final Logger logger = LoggerFactory.getLogger(SxyqService.class);
    public SxyqService(){
        this.config = EsServiceConfigEnum.SXYQ;
    }

}
