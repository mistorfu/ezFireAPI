package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerZbplqk  周边毗邻情况
 * @Date 2018/5/25 11:08
 * @Author zhaomeng
 */
@ApiModel(value = "周边毗邻情况",description = "周边毗邻情况对象")
public class InnerZbplqk {
    @ApiModelProperty(value = "方向类型")
    private String fxlx;
    @ApiModelProperty(value = "方向描述")
    private String fxms;

    public String getFxlx() {
        return fxlx;
    }

    public void setFxlx(String fxlx) {
        this.fxlx = fxlx;
    }

    public String getFxms() {
        return fxms;
    }

    public void setFxms(String fxms) {
        this.fxms = fxms;
    }
}