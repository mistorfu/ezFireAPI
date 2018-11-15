package com.kedacom.ezFireAPI.alarm.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 装备
 * @author: wangjinbo
 * @create: 2018-05-28 16:45
 */
@ApiModel(value="装备",description="装备对象")
public class InnerZb {
    @ApiModelProperty(value="装备类型")
    private String zblx;   //装备类型
    @ApiModelProperty(value="装备名称")
    private String zbmc;   //装备名称
    @ApiModelProperty(value="装备数量")
    private Integer zbsl;  //装备数量
    @ApiModelProperty(value="装备概述")
    private String zbgs;   //装备概述

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

    public Integer getZbsl() {
        return zbsl;
    }

    public void setZbsl(Integer zbsl) {
        this.zbsl = zbsl;
    }

    public String getZbgs() {
        return zbgs;
    }

    public void setZbgs(String zbgs) {
        this.zbgs = zbgs;
    }
}
