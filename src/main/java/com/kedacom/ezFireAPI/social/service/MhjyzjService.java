package com.kedacom.ezFireAPI.social.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.social.model.Mhjyzj;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:
 */
@Service
public class MhjyzjService  extends EsBaseService<Mhjyzj> {
    private static final Logger logger = LoggerFactory.getLogger(MhjyzjService.class);

    public MhjyzjService() {
        this.config = EsServiceConfigEnum.MHJYZJ;
    }
}
