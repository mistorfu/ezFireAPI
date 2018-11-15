package com.kedacom.ezFireAPI.alarm.service;


import com.kedacom.ezFireAPI.alarm.model.Wsxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: ezFireAPI
 * @description: 火场文书
 * @author: wangjinbo
 * @create: 2018-05-29 09:23
 */

@Service
public class WsxxService extends EsBaseService<Wsxx> {
    private static final Logger logger = LoggerFactory.getLogger(WsxxService.class);

    public WsxxService() {
        this.config = EsServiceConfigEnum.WSXX;
    }
}
