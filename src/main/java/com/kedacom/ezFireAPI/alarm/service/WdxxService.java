package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Wdxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: ezFireAPI
 * @description: 文电信息
 * @author: wangjinbo
 * @create: 2018-05-29 09:22
 */

@Service
public class WdxxService extends EsBaseService<Wdxx> {
    private static final Logger logger = LoggerFactory.getLogger(WdxxService.class);

    public WdxxService() {
        this.config = EsServiceConfigEnum.WDXX;
    }
}
