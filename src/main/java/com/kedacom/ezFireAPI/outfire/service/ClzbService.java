package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Clzb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/7/16.
 */
@Service
public class ClzbService extends EsBaseService<Clzb> {
    private static final Logger logger = LoggerFactory.getLogger(ClzbService.class);

    public ClzbService() {
        this.config = EsServiceConfigEnum.CLZB;
    }

}
