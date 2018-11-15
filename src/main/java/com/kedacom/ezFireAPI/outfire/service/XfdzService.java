package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Xfdz;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/29.
 */
@Service
public class XfdzService extends EsBaseService<Xfdz> {
    public XfdzService() {
        this.config = EsServiceConfigEnum.XFDZ;
    }
}
