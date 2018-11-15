package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Abbs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AbbsService extends EsBaseService<Abbs>{
    private static final Logger logger = LoggerFactory.getLogger(AbbsService.class);

    public AbbsService(){
        this.config = EsServiceConfigEnum.ABBS;
    }
}
