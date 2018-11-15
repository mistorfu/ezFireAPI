package com.kedacom.ezFireAPI.safe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "视频信息", description = "视频信息对象")
public class InnerSpxx {
    @ApiModelProperty(value = "设备编号")
    private String sbbh;
    @ApiModelProperty(value = "设备名称")
    private String sbmc;

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh;
    }

    public String getSbmc() {
        return sbmc;
    }

    public void setSbmc(String sbmc) {
        this.sbmc = sbmc;
    }
}
