package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerSzsy  所在水源
 * @Date 2018/5/30 14:47
 * @Author zhaomeng
 */
@ApiModel(value = "所在水源",description = "所在水源对象")
public class InnerSzsy {
    @ApiModelProperty(value = "水源编号")
    private String sybh;
    @ApiModelProperty(value = "水源名称")
    private String symc;

    public String getSybh() {
        return sybh;
    }

    public void setSybh(String sybh) {
        this.sybh = sybh;
    }

    public String getSymc() {
        return symc;
    }

    public void setSymc(String symc) {
        this.symc = symc;
    }
}