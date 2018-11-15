package com.kedacom.ezFireAPI.common;

import java.lang.annotation.*;

/**
 * Created by fudapeng on 2018/11/7.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomRequestBody {
    boolean required() default true;
}
