package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Qzxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.springframework.stereotype.Service;

/**
 * Created by fudapeng on 2018/7/12.
 */
@Service
public class QzxxService extends EsBaseService<Qzxx> {
    public QzxxService() {
        this.config = EsServiceConfigEnum.QZXX;
    }
}