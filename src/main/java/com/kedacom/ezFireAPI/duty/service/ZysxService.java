package com.kedacom.ezFireAPI.duty.service;


import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.duty.model.Zysx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ZysxService extends EsBaseService<Zysx>{
    private static final Logger logger = LoggerFactory.getLogger(ZysxService.class);
    public ZysxService(){

        this.config = EsServiceConfigEnum.ZYSX;
    }
}
