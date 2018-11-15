package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerZbqk 装备情况
 * Created by fudapeng on 2018/5/29.
 */
@ApiModel(value="装备情况",description="装备情况对象")
public class InnerZbqk {
    @ApiModelProperty(value="装备类型")
    private String zblx;
    @ApiModelProperty(value="装备名称")
    private String zbmc;
    @ApiModelProperty(value="装备数量")
    private double zbsl;
    @ApiModelProperty(value="装备概述")
    private String zbgs;

    public String getZblx() {
        return zblx;
    }

    public void setZblx(String zblx) {
        this.zblx = zblx;
    }

    public String getZbmc() {
        return zbmc;
    }

    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }

    public double getZbsl() {
        return zbsl;
    }

    public void setZbsl(double zbsl) {
        this.zbsl = zbsl;
    }

    public String getZbgs() {
        return zbgs;
    }

    public void setZbgs(String zbgs) {
        this.zbgs = zbgs;
    }
}
