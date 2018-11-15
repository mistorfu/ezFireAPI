package com.kedacom.ezFireAPI.person.service;

import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.person.model.Device;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/8/14.
 */
@Service
public class DeviceService extends RedisBaseService<Device> {
    public DeviceService() {
        this.setConfig(EsServiceConfigEnum.DEVICE);
    }
}