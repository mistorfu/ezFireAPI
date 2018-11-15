package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Abhd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AbhdService extends EsBaseService<Abhd> {
    private static final Logger logger = LoggerFactory.getLogger(AbhdService.class);

    public AbhdService(){
        this.config = EsServiceConfigEnum.ABHD;
    }
}
