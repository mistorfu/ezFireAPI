package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Abqy;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/8/14.
 */
@Service
public class AbqyService extends EsBaseService<Abqy> {
    public AbqyService() {
        this.config = EsServiceConfigEnum.ABQY;
    }
}