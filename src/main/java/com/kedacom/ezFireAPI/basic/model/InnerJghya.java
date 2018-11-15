package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerJghya  结构化预案
 * @Date 2018/5/25 11:05
 * @Author zhaomeng
 */
@ApiModel(value = "结构化预案",description = "结构化预案对象")
public class InnerJghya {
    @ApiModelProperty(value = "预案类型 1：URL地址 2：存储地址")
    private String yalx;
    @ApiModelProperty(value = "预案名称")
    private String yamc;
    @ApiModelProperty(value = "预案文件")
    private String yawj;

    public String getYalx() {
        return yalx;
    }

    public void setYalx(String yalx) {
        this.yalx = yalx;
    }

    public String getYamc() {
        return yamc;
    }

    public void setYamc(String yamc) {
        this.yamc = yamc;
    }

    public String getYawj() {
        return yawj;
    }

    public void setYawj(String yawj) {
        this.yawj = yawj;
    }
}