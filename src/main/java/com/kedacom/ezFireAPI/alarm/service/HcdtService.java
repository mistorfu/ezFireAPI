package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Hcdt;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: ezFireAPI
 * @description: 火场动态
 * @author: wangjinbo
 * @create: 2018-05-29 09:23
 */

@Service
public class HcdtService extends EsBaseService<Hcdt> {
    private static final Logger logger = LoggerFactory.getLogger(HcdtService.class);

    public HcdtService() {
        this.config = EsServiceConfigEnum.HCDT;
    }
}
