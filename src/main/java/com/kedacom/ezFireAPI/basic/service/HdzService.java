package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.model.Hdz;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.springframework.stereotype.Service;

/**
 * @Description: 核电站
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Service
public class HdzService extends EsBaseService<Hdz>{
    public HdzService() {
        this.config = EsServiceConfigEnum.HDZ;
    }
}
