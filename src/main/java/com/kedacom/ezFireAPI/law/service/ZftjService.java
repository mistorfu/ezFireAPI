package com.kedacom.ezFireAPI.law.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.law.model.Zftj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:
 */
@Service
public class ZftjService  extends EsBaseService<Zftj> {
    private static final Logger logger = LoggerFactory.getLogger(ZftjService.class);

    public ZftjService() {
        this.config = EsServiceConfigEnum.ZFTJ;
    }
}
