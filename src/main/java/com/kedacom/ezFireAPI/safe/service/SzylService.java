package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Szyl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SzylService extends EsBaseService<Szyl> {
    private static final Logger logger = LoggerFactory.getLogger(SzylService.class);

    public SzylService(){
        this.config = EsServiceConfigEnum.SZYL;
    }
}
