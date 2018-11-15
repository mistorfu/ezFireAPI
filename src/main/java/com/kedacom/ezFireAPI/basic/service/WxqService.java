package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.model.Wxq;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.springframework.stereotype.Service;

/**
 * @Description: 危险区
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Service
public class WxqService extends EsBaseService<Wxq>{
    public WxqService() {
        this.config = EsServiceConfigEnum.WXQ;
    }
}
