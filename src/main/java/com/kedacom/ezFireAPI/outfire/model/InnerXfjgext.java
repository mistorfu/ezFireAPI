package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @description: 消防机构扩展
 * Created by fudapeng on 2018/6/6.
 */
@ApiModel(value="消防机构扩展",description="消防机构扩展对象")
public class InnerXfjgext extends InnerXfjg{
    @ApiModelProperty(value="消防机构级别")
    private String  xfjgjb;    //消防机构级别

    public String getXfjgjb() {
        return xfjgjb;
    }

    public void setXfjgjb(String xfjgjb) {
        this.xfjgjb = xfjgjb;
    }
}
