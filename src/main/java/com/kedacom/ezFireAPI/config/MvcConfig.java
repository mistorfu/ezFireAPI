package com.kedacom.ezFireAPI.config;

import com.kedacom.ezFireAPI.common.CustomRequestBodyArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by fudapeng on 2018/11/14.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(new CustomRequestBodyArgumentResolver());
    }
}