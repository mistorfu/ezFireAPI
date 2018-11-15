package com.kedacom.ezFireAPI.safe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "关联单位", description = "关联单位对象")
public class InnerGldw {
    @ApiModelProperty(value = "对象编号")
    private String dxbh;
    @ApiModelProperty(value = "对象类型")
    private String dxlx;

    public String getDxbh() {
        return dxbh;
    }

    public void setDxbh(String dxbh) {
        this.dxbh = dxbh;
    }

    public String getDxlx() {
        return dxlx;
    }

    public void setDxlx(String dxlx) {
        this.dxlx = dxlx;
    }
}
