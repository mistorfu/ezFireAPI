package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 车辆
 * @author: wangjinbo
 * @create: 2018-05-28 16:25
 */
@ApiModel(value="车辆",description="车辆对象")
public class InnerCl {
    @ApiModelProperty(value="车辆编号")
    private String clbh;  //车辆编号
    @ApiModelProperty(value="车辆名称")
    private String clmc;  //车辆名称
    @ApiModelProperty(value="车牌号码")
    private String cphm;  //车牌号码
    @ApiModelProperty(value="车辆类型")
    private String cllx;  //车辆类型
    @ApiModelProperty(value="所属单位（单位编号）")
    private String ssdw;  //所属单位（单位编号）
    @ApiModelProperty(value="开始时间")
    private String kssj;  //开始时间
    @ApiModelProperty(value="结束时间")
    private String jssj;  //结束时间

    public String getClbh() {
        return clbh;
    }

    public void setClbh(String clbh) {
        this.clbh = clbh;
    }

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc;
    }

    public String getCphm() {
        return cphm;
    }

    public void setCphm(String cphm) {
        this.cphm = cphm;
    }

    public String getCllx() {
        return cllx;
    }

    public void setCllx(String cllx) {
        this.cllx = cllx;
    }

    public String getSsdw() {
        return ssdw;
    }

    public void setSsdw(String ssdw) {
        this.ssdw = ssdw;
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
