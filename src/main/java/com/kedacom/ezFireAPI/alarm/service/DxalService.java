package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Dxal;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: ezFireAPI
 * @description: 典型案例
 * @author: wangjinbo
 * @create: 2018-05-29 09:24
 */

@Service
public class DxalService extends EsBaseService<Dxal> {
    private static final Logger logger = LoggerFactory.getLogger(DxalService.class);

    public DxalService() {
        this.config = EsServiceConfigEnum.DXAL;
    }
}
