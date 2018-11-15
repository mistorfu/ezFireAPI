package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerClqk 车辆情况
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="车辆情况",description="车辆情况对象")
public class InnerClqk {
    @ApiModelProperty(value="车辆类型")
    private String cllx;
    @ApiModelProperty(value="车辆名称")
    private String clmc;
    @ApiModelProperty(value="车辆数量")
    private int clsl;
    @ApiModelProperty(value="车辆概述")
    private String clgs;

    public String getCllx() {
        return cllx;
    }

    public void setCllx(String cllx) {
        this.cllx = cllx;
    }

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc;
    }

    public int getClsl() {
        return clsl;
    }

    public void setClsl(int clsl) {
        this.clsl = clsl;
    }

    public String getClgs() {
        return clgs;
    }

    public void setClgs(String clgs) {
        this.clgs = clgs;
    }
}
