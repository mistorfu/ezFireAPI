package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.model.Glsd;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.springframework.stereotype.Service;

/**
 * @Description: 公路隧道
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Service
public class GlsdService extends EsBaseService<Glsd>{
    public GlsdService() {
        this.config = EsServiceConfigEnum.GLSD;
    }
}
