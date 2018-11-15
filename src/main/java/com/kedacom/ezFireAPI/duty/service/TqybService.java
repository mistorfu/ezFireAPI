package com.kedacom.ezFireAPI.duty.service;


import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.duty.model.Tqyb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TqybService extends EsBaseService<Tqyb>{

    private static final Logger logger = LoggerFactory.getLogger(TqybService.class);
    public TqybService(){
        this.config = EsServiceConfigEnum.TQYB;
    }
}
