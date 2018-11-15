package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Zydw;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/30.
 */
@Service
public class ZydwService extends EsBaseService<Zydw> {
    public ZydwService() {
        this.config = EsServiceConfigEnum.ZYDW;
    }
}
