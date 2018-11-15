package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Abll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AbllService extends EsBaseService<Abll> {
    private static final Logger logger = LoggerFactory.getLogger(AbllService.class);

    public AbllService(){
        this.config = EsServiceConfigEnum.ABLL;
    }
}
