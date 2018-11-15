package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Zqwx;
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
public class ZqwxService extends EsBaseService<Zqwx>{
    private static final Logger logger = LoggerFactory.getLogger(ZqwxService.class);

    public ZqwxService(){
        this.config = EsServiceConfigEnum.ZQWX;
    }
}
