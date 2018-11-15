package com.kedacom.ezFireAPI.alarm.service;


import com.kedacom.ezFireAPI.alarm.model.Zyxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: ezFireAPI
 * @description: 请求增援
 * @author: wangjinbo
 * @create: 2018-05-29 09:22
 */

@Service
public class ZyxxService extends EsBaseService<Zyxx> {
    private static final Logger logger = LoggerFactory.getLogger(ZyxxService.class);

    public ZyxxService() {
        this.config = EsServiceConfigEnum.ZYXX;
    }
}
