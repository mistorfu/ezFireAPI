package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Zqxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author luping
 * @date 2018/5/28
 */
@Service
public class ZqxxService extends EsBaseService<Zqxx>{
    private static final Logger logger = LoggerFactory.getLogger(ZqxxService.class);

    public ZqxxService(){
        this.config = EsServiceConfigEnum.ZQXX;
    }

}
