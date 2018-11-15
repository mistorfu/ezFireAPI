package com.kedacom.ezFireAPI.alarm.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author luping
 * @date 2018/5/28 16:28
 */
@ApiModel(value = "处理结果",description = "处理结果对象")
public class InnerCljg {
    @ApiModelProperty(value = "是否处理 0：否 1：是",name = "sfcl",example = "1")
    private String sfcl;
    @ApiModelProperty(value = "处理概述",name = "clgs",example = "处理了")
    private String clgs;
    @ApiModelProperty(value = "处理人员",name = "clry",example = "admin")
    private String clry;
    @ApiModelProperty(value = "处理时间",name = "clsj",example = "2018-05-02 10:00:49")
    private String clsj;

    public String getSfcl() {
        return sfcl;
    }

    public void setSfcl(String sfcl) {
        this.sfcl = sfcl;
    }

    public String getClgs() {
        return clgs;
    }

    public void setClgs(String clgs) {
        this.clgs = clgs;
    }

    public String getClry() {
        return clry;
    }

    public void setClry(String clry) {
        this.clry = clry;
    }

    public String getClsj() {
        return clsj;
    }

    public void setClsj(String clsj) {
        this.clsj = clsj;
    }
}
