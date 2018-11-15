package com.kedacom.ezFireAPI.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName ApplicationRun
 * @Date 2018/6/11 16:26
 * @Author zhaomeng
 */
@Component
@Order(1)
public class ApplicationRun implements ApplicationRunner {

    @Autowired
    private CommonCache commonCache;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        commonCache.initCommonCache();
    }
}