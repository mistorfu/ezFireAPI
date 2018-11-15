package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.model.Shxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.springframework.stereotype.Service;

/**
 * @Description: 石化信息
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Service
public class ShxxService extends EsBaseService<Shxx>{
    public ShxxService() {
        this.config = EsServiceConfigEnum.SHXX;
    }
}
