package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Abcs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AbcsService extends EsBaseService<Abcs>{
    private static final Logger logger = LoggerFactory.getLogger(AbcsService.class);

    public AbcsService(){
        this.config = EsServiceConfigEnum.ABCS;
    }
}
