package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Zqwz;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * @author luping
 * @date 2018/6/12
 */
@Service
public class ZqwzService extends EsBaseService<Zqwz>{
    private final static Logger logger = LoggerFactory.getLogger(ZqwzService.class);

    public ZqwzService(){
        this.config = EsServiceConfigEnum.ZQWZ;
    }
}
