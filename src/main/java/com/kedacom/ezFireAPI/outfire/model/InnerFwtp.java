package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerFwtp  方位图
 * @Date 2018/5/30 13:23
 * @Author zhaomeng
 */
@ApiModel(value = "方位图",description = "方位图对象")
public class InnerFwtp {
    @ApiModelProperty(value = "方向类型")
    private String fxlx;
    @ApiModelProperty(value = "图片地址")
    private String tpdz;

    public String getFxlx() {
        return fxlx;
    }

    public void setFxlx(String fxlx) {
        this.fxlx = fxlx;
    }

    public String getTpdz() {
        return tpdz;
    }

    public void setTpdz(String tpdz) {
        this.tpdz = tpdz;
    }
}