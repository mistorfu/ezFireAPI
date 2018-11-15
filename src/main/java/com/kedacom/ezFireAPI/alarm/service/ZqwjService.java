package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Zqwj;
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
public class ZqwjService extends EsBaseService<Zqwj>{
    private static final Logger logger = LoggerFactory.getLogger(ZqwjService.class);

    public ZqwjService(){
        this.config = EsServiceConfigEnum.ZQWJ;
    }
}
