package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 调派专家
 * @author: wangjinbo
 * @create: 2018-05-28 16:24
 */
@ApiModel(value="调派专家",description="调派专家对象")
public class InnerDpzj {
    @ApiModelProperty(value="专家姓名")
    private String zjxm;    //专家姓名
    @ApiModelProperty(value="身份证号")
    private String sfzh;    //身份证号
    @ApiModelProperty(value="所属单位（单位编号）")
    private String ssdw;    //所属单位（单位编号）
    @ApiModelProperty(value="专家领域")
    private String zjly;    //专家领域
    @ApiModelProperty(value="开始时间")
    private String kssj;    //开始时间
    @ApiModelProperty(value="结束时间")
    private String jssj;    //结束时间

    public String getZjxm() {
        return zjxm;
    }

    public void setZjxm(String zjxm) {
        this.zjxm = zjxm;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getSsdw() {
        return ssdw;
    }

    public void setSsdw(String ssdw) {
        this.ssdw = ssdw;
    }

    public String getZjly() {
        return zjly;
    }

    public void setZjly(String zjly) {
        this.zjly = zjly;
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
    }
}
