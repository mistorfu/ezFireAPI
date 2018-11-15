package com.kedacom.ezFireAPI.emergency.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.emergency.model.Dzyd;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/8/28.
 */
@Service
public class DzydService extends EsBaseService<Dzyd> {
    public DzydService() {
        this.config = EsServiceConfigEnum.DZYD;
    }
}