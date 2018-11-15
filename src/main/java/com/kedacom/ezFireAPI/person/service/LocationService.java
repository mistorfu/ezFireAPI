package com.kedacom.ezFireAPI.person.service;

import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.person.model.Location;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/7/2.
 */
@Service
public class LocationService extends RedisBaseService<Location> {
    public LocationService() {
        this.setConfig(EsServiceConfigEnum.LOCATION);
    }
}
