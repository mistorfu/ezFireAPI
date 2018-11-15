package com.kedacom.ezFireAPI.ez.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.ez.model.Pom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author  guojiahao
 * @create  2018/5/28
 **/
@Service
public class PomService extends EsBaseService<Pom> {
    private static final Logger logger = LoggerFactory.getLogger(com.kedacom.ezFireAPI.ez.service.PomService.class);

    public PomService(){
        this.config=EsServiceConfigEnum.POM;
    }
}
