package com.kedacom.ezFireAPI.ez.service;

import com.kedacom.ezFireAPI.common.EsBaseService;
import com.kedacom.ezFireAPI.common.EsServiceConfigEnum;
import com.kedacom.ezFireAPI.ez.model.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
/**
 * @author  guojiahao
 * @create  2018/5/28
 **/
@Service
public class FileService extends EsBaseService<File> {
    private static final Logger logger = LoggerFactory.getLogger(com.kedacom.ezFireAPI.ez.service.FileService.class);

    public FileService() {
        this.config = EsServiceConfigEnum.FILE;
    }
}
