package com.kedacom.ezFireAPI.emergency.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.emergency.model.Bncs;
import org.springframework.stereotype.Service;

@Service
public class BncsService extends EsBaseService<Bncs> {
    public BncsService(){
        this.config = EsServiceConfigEnum.BNCS;
    }
}
