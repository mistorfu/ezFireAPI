package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Clzt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/22.
 */
@Service
public class ClztService extends EsBaseService<Clzt> {
    private static final Logger logger = LoggerFactory.getLogger(ClztService.class);

    public ClztService() {
        this.config = EsServiceConfigEnum.CLZT;
    }

}
