package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Abld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AbldService extends EsBaseService<Abld> {
    private static final Logger logger = LoggerFactory.getLogger(AbldService.class);

    public AbldService(){
        this.config = EsServiceConfigEnum.ABLD;
    }
}
