package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Abdt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AbdtService extends EsBaseService<Abdt>{
    private static final Logger logger = LoggerFactory.getLogger(AbdtService.class);

    public AbdtService(){
        this.config = EsServiceConfigEnum.ABDT;
    }
}
