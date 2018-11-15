package com.kedacom.ezFireAPI.alarm.service;

import com.kedacom.ezFireAPI.alarm.model.Xcxx;
import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: ezFireAPI
 * @description: 现场信息
 * @author: wangjinbo
 * @create: 2018-05-29 09:21
 */

@Service
public class XcxxService extends EsBaseService<Xcxx> {
    private static final Logger logger = LoggerFactory.getLogger(XcxxService.class);

    public XcxxService() {
        this.config = EsServiceConfigEnum.XCXX;
    }
}
