package com.kedacom.ezFireAPI.emergency.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by fudapeng on 2018/8/28.
 */
@ApiModel(value = "运输物质",description = "运输物质对象")
public class InnerYswz {
    @ApiModelProperty(value = "物质编号")
    private String wzbh;
    @ApiModelProperty(value = "物质名称")
    private String wzmc;
    @ApiModelProperty(value = "物质类型")
    private String wzlx;
    @ApiModelProperty(value = "物质重量 单位 吨")
    private Double wzzl;
    @ApiModelProperty(value = "物质体积 单位 立方米")
    private Double wztj;

    public String getWzbh() {
        return wzbh;
    }

    public void setWzbh(String wzbh) {
        this.wzbh = wzbh;
    }

    public String getWzmc() {
        return wzmc;
    }

    public void setWzmc(String wzmc) {
        this.wzmc = wzmc;
    }

    public String getWzlx() {
        return wzlx;
    }

    public void setWzlx(String wzlx) {
        this.wzlx = wzlx;
    }

    public Double getWzzl() {
        return wzzl;
    }

    public void setWzzl(Double wzzl) {
        this.wzzl = wzzl;
    }

    public Double getWztj() {
        return wztj;
    }

    public void setWztj(Double wztj) {
        this.wztj = wztj;
    }
}