package com.kedacom.ezFireAPI.ez.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "关联对象",description = "关联对象对象")
public class InnerGldx {
    @ApiModelProperty(value = "对象类型")
    private String dxlx;
    @ApiModelProperty(value = "对象编号")
    private String dxbh;
    @ApiModelProperty(value = "对象名称")
    private String dxmc;

    public String getDxlx() {
        return dxlx;
    }

    public void setDxlx(String dxlx) {
        this.dxlx = dxlx;
    }

    public String getDxbh() {
        return dxbh;
    }

    public void setDxbh(String dxbh) {
        this.dxbh = dxbh;
    }

    public String getDxmc() {
        return dxmc;
    }

    public void setDxmc(String dxmc) {
        this.dxmc = dxmc;
    }
}
