package com.kedacom.ezFireAPI.emergency.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.emergency.model.Yjya;
import org.springframework.stereotype.Service;

/**
 * @Author: zhanghao
 * @Description:
 * @Data: create in 13:45 2018/5/29
 * @Mod By:
 */
@Service
public class YjyaService extends EsBaseService<Yjya> {
    public YjyaService() {
        this.config = EsServiceConfigEnum.YJYA;
    }
}
