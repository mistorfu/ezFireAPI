package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerWbya  文本预案
 * @Date 2018/5/25 11:03
 * @Author zhaomeng
 */
@ApiModel(value = "文本预案",description = "文本预案对象")
public class InnerWbya {
    @ApiModelProperty(value = "预案类型 1：URL地址 2：存储地址")
    private String yalx;
    @ApiModelProperty(value = "预案名称")
    private String yamc;
    @ApiModelProperty(value = "预案文件")
    private String yawj;
    @ApiModelProperty(value = "文件类型 1：文档 2：图片 3：网页")
    private String wjlx;

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

    public String getWjlx() {
        return wjlx;
    }

    public void setWjlx(String wjlx) {
        this.wjlx = wjlx;
    }
}