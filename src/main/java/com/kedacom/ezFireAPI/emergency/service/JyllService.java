package com.kedacom.ezFireAPI.emergency.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.emergency.model.Jyll;
import org.springframework.stereotype.Service;

@Service
public class JyllService extends EsBaseService<Jyll> {
    public JyllService(){
        this.config = EsServiceConfigEnum.JYLL;
    }
}
