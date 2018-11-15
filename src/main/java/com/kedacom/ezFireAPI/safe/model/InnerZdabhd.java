package com.kedacom.ezFireAPI.safe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "重大安保活动", description = "重大安保活动对象")
public class InnerZdabhd {
    @ApiModelProperty(value = "安保活动编号")
    private String abhdbh;
    @ApiModelProperty(value = "安保活动名称")
    private String abhdmc;

    public String getAbhdbh() {
        return abhdbh;
    }

    public void setAbhdbh(String abhdbh) {
        this.abhdbh = abhdbh;
    }

    public String getAbhdmc() {
        return abhdmc;
    }

    public void setAbhdmc(String abhdmc) {
        this.abhdmc = abhdmc;
    }
}
