package com.kedacom.ezFireAPI.safe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "力量明细", description = "力量明细对象")
public class InnerLlmx {
    @ApiModelProperty(value = "对象名称")
    private String dxmc;
    @ApiModelProperty(value = "对象描述")
    private String dxms;
    @ApiModelProperty(value = "对象经度")
    private Double dxjd;
    @ApiModelProperty(value = "对象纬度")
    private Double dxwd;

    public String getDxmc() {
        return dxmc;
    }

    public void setDxmc(String dxmc) {
        this.dxmc = dxmc;
    }

    public String getDxms() {
        return dxms;
    }

    public void setDxms(String dxms) {
        this.dxms = dxms;
    }

    public Double getDxjd() {
        return dxjd;
    }

    public void setDxjd(Double dxjd) {
        this.dxjd = dxjd;
    }

    public Double getDxwd() {
        return dxwd;
    }

    public void setDxwd(Double dxwd) {
        this.dxwd = dxwd;
    }
}
