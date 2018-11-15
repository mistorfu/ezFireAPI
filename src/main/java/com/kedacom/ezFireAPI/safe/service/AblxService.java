package com.kedacom.ezFireAPI.safe.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.safe.model.Ablx;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/8/14.
 */
@Service
public class AblxService extends EsBaseService<Ablx> {
    public AblxService() {
        this.config = EsServiceConfigEnum.ABLX;
    }
}