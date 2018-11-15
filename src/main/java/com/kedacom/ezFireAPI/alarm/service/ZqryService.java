package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Zqry;
import com.kedacom.ezFireAPI.common.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author luping
 * @date 2018/5/28
 */
@Service
public class ZqryService extends EsBaseService<Zqry>{

    private static final Logger logger = LoggerFactory.getLogger(ZqryService.class);

    public ZqryService(){
        this.config = EsServiceConfigEnum.ZQRY;
    }

}
