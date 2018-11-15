package com.kedacom.ezFireAPI.outfire.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.outfire.model.Clsz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * @ClassName ClszService
 * @Date 2018/5/23 16:50
 * @Author zhaomeng
 */

@Service
public class ClszService extends EsBaseService<Clsz>{
    private static final Logger logger = LoggerFactory.getLogger(ClszService.class);

    public ClszService() {
        this.config = EsServiceConfigEnum.CLSZ;
    }



}