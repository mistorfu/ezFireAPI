package com.kedacom.ezFireAPI.person.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by fudapeng on 2018/5/27.
 * @ClassName Breath 人员空呼数据
 */
@ApiModel(value="人员空呼数据",description="人员空呼数据对象")
public class Breath {
    @ApiModelProperty(value="人员编号")
    private String rybh; // 人员编号
    @ApiModelProperty(value="人员姓名")
    private String ryxm; // 人员姓名
    @ApiModelProperty(value="环境温度 单位 ℃")
    private double hjwd; // 环境温度
    @ApiModelProperty(value="气瓶压力 单位 MPa")
    private double qpyl; // 气瓶压力 单位 MPa
    @ApiModelProperty(value="氧气余量 单位 %")
    private double yqyl; // 氧气余量 单位 %
    @ApiModelProperty(value="剩余时间 单位 分钟")
    private double sysj; // 剩余时间 单位 分钟
    @ApiModelProperty(value="空呼状态 0:正常 1:警戒 2:危险")
    private String khzt; //  空呼状态 0:正常 1:警戒 2:危险
    @ApiModelProperty(value="采集设备")
    private String cjsb; // 采集设备
    @ApiModelProperty(value="消防机构")
    private String xfjg; // 消防机构
    @ApiModelProperty(value="灾情编号")
    private String zqbh; // 灾情编号
    @ApiModelProperty(value="采集时间")
    private String cjsj; // 采集时间
    @ApiModelProperty(value="更新时间")
    private String gxsj; // 更新时间

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    public String getRyxm() {
        return ryxm;
    }

    public void setRyxm(String ryxm) {
        this.ryxm = ryxm;
    }

    public double getQpyl() {
        return qpyl;
    }

    public void setQpyl(double qpyl) {
        this.qpyl = qpyl;
    }

    public double getYqyl() {
        return yqyl;
    }

    public void setYqyl(double yqyl) {
        this.yqyl = yqyl;
    }

    public double getSysj() {
        return sysj;
    }

    public void setSysj(double sysj) {
        this.sysj = sysj;
    }

    public String getKhzt() {
        return khzt;
    }

    public void setKhzt(String khzt) {
        this.khzt = khzt;
    }

    public String getCjsb() {
        return cjsb;
    }

    public void setCjsb(String cjsb) {
        this.cjsb = cjsb;
    }

    public String getXfjg() {
        return xfjg;
    }

    public void setXfjg(String xfjg) {
        this.xfjg = xfjg;
    }

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public double getHjwd() {
        return hjwd;
    }

    public void setHjwd(double hjwd) {
        this.hjwd = hjwd;
    }
}
