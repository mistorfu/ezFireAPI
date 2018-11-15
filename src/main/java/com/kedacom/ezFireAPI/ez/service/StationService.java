package com.kedacom.ezFireAPI.ez.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.ez.model.Station;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/8/28.
 */
@Service
public class StationService extends EsBaseService<Station> {
    public StationService() {
        this.config = EsServiceConfigEnum.STATION;
    }
}