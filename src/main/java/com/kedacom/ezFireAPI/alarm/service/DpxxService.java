package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Dpxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: ezFireAPI
 * @description: 调派信息
 * @author: wangjinbo
 * @create: 2018-05-29 09:21
 */

@Service
public class DpxxService extends EsBaseService<Dpxx> {
    private static final Logger logger = LoggerFactory.getLogger(DpxxService.class);

    public DpxxService() {
        this.config = EsServiceConfigEnum.DPXX;
    }
}
