package com.kedacom.ezFireAPI.duty.service;


import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.duty.model.Zqll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ZqllService extends EsBaseService<Zqll>{
    private static final Logger logger = LoggerFactory.getLogger(ZqllService.class);
    public ZqllService(){

        this.config = EsServiceConfigEnum.ZQLL;
    }
}
