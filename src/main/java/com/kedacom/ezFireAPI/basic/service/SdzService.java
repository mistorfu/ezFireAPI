package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.model.Sdz;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.springframework.stereotype.Service;

/**
 * @Description: 水电站
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Service
public class SdzService extends EsBaseService<Sdz>{
    public SdzService() {
        this.config = EsServiceConfigEnum.SDZ;
    }
}
