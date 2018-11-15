package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 灾情对象
 * @author: wangjinbo
 * @create: 2018-05-28 17:12
 */
@ApiModel(value="灾情对象",description="灾情对象对象")
public class InnerZqdx {
    @ApiModelProperty(value="对象类型")
    private String dxlx;    //对象类型
    @ApiModelProperty(value="对象编号")
    private String dxbh;    //对象编号
    @ApiModelProperty(value="对象名称")
    private String dxmc;    //对象名称
    @ApiModelProperty(value="对象概述")
    private String dxgs;    //对象概述

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

    public String getDxgs() {
        return dxgs;
    }

    public void setDxgs(String dxgs) {
        this.dxgs = dxgs;
    }
}
