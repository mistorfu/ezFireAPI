package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Cldp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * Created by fudapeng on 2018/5/22.
 */
@Service
public class CldpService extends EsBaseService<Cldp>{ private static final Logger logger = LoggerFactory.getLogger(CldpService.class);

    public CldpService() {
        this.config = EsServiceConfigEnum.CLDP;
    }
}
