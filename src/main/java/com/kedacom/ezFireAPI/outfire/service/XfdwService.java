package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Xfdw;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/25.
 */
@Service
public class XfdwService extends EsBaseService<Xfdw> {
    private static final Logger logger = LoggerFactory.getLogger(XfdwService.class);

    public XfdwService() {
        this.config = EsServiceConfigEnum.XFDW;
    }

}
