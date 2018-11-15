package com.kedacom.ezFireAPI.person.service;

import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.person.model.Breath;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/5/27.
 */
@Service
public class BreathService extends RedisBaseService<Breath> {
    public BreathService() {
        this.setConfig(EsServiceConfigEnum.BREATH);
    }
}
