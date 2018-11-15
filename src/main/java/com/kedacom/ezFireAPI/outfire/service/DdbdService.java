package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Ddbd;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/31.
 */
@Service
public class DdbdService extends EsBaseService<Ddbd> {
    public DdbdService() {
        this.config = EsServiceConfigEnum.DDBD;
    }
}
