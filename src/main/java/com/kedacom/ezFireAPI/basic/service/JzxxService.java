package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.model.Jzxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.springframework.stereotype.Service;

/**
 * @Description: 建筑信息
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Service
public class JzxxService extends EsBaseService<Jzxx>{
    public JzxxService() {
        this.config = EsServiceConfigEnum.JZXX;
    }
}
