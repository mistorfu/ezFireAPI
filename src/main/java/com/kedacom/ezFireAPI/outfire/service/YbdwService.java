package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Ybdw;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/29.
 */
@Service
public class YbdwService extends EsBaseService<Ybdw> {
    public YbdwService() {
        this.config = EsServiceConfigEnum.YBDW;
    }
}
