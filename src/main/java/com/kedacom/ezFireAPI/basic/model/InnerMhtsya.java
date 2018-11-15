package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerMhtsya  灭火逃生疏散预案
 * @Date 2018/5/25 11:12
 * @Author zhaomeng
 */
@ApiModel(value = "灭火逃生预案",description = "灭火逃生预案对象")
public class InnerMhtsya {
    @ApiModelProperty(value = "预案名称")
    private String yamc;
    @ApiModelProperty(value = "预案概述")
    private String yags;
    @ApiModelProperty(value = "预案文件")
    private String yawj;

    public String getYamc() {
        return yamc;
    }

    public void setYamc(String yamc) {
        this.yamc = yamc;
    }

    public String getYags() {
        return yags;
    }

    public void setYags(String yags) {
        this.yags = yags;
    }

    public String getYawj() {
        return yawj;
    }

    public void setYawj(String yawj) {
        this.yawj = yawj;
    }
}