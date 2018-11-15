package com.kedacom.ezFireAPI.basic.service;

import com.kedacom.ezFireAPI.basic.model.Yqgx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.springframework.stereotype.Service;

/**
 * @Description: 油气管线
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@Service
public class YqgxService extends EsBaseService<Yqgx>{
    public YqgxService() {
        this.config = EsServiceConfigEnum.YQGX;
    }
}
