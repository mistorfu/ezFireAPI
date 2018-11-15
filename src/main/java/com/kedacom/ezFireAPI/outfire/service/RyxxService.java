package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Ryxx;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/31.
 */
@Service
public class RyxxService extends EsBaseService<Ryxx> {
    public RyxxService() {
        this.config = EsServiceConfigEnum.RYXX;
    }
}
