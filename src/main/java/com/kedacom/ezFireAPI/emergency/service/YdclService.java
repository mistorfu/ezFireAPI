package com.kedacom.ezFireAPI.emergency.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.emergency.model.Ydcl;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/8/28.
 */
@Service
public class YdclService extends EsBaseService<Ydcl> {
    public YdclService() {
        this.config = EsServiceConfigEnum.YDCL;
    }
}