package com.kedacom.ezFireAPI.person.service;

import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.person.model.Life;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/27.
 */
@Service
public class LifeService extends RedisBaseService<Life> {
    public LifeService() {
        this.setConfig(EsServiceConfigEnum.LIFE);
    }
}
