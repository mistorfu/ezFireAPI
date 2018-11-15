package com.kedacom.ezFireAPI.person.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by fudapeng on 2018/7/2.
 * @ClassName Location 人员室内定位
 */
@ApiModel(value="人员室内定位",description="人员室内定位对象")
public class Location {
    @ApiModelProperty(value="人员编号")
    private String rybh; // 人员编号
    @ApiModelProperty(value="人员姓名")
    private String ryxm; // 人员姓名
    @ApiModelProperty(value="经度")
    private double jd; // 经度
    @ApiModelProperty(value="纬度")
    private double wd; // 纬度
    @ApiModelProperty(value="高度 单位 米")
    private double gd; // 高度
    @ApiModelProperty(value="楼层")
    private int lc; // 楼层
    @ApiModelProperty(value="方向 范围 [0, 360]")
    private double fx; // 方向
    @ApiModelProperty(value="精准度 单位 米")
    private double jzd; // 精准度
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

    public double getJd() {
        return jd;
    }

    public void setJd(double jd) {
        this.jd = jd;
    }

    public double getWd() {
        return wd;
    }

    public void setWd(double wd) {
        this.wd = wd;
    }

    public double getGd() {
        return gd;
    }

    public void setGd(double gd) {
        this.gd = gd;
    }

    public int getLc() {
        return lc;
    }

    public void setLc(int lc) {
        this.lc = lc;
    }

    public double getFx() {
        return fx;
    }

    public void setFx(double fx) {
        this.fx = fx;
    }

    public double getJzd() {
        return jzd;
    }

    public void setJzd(double jzd) {
        this.jzd = jzd;
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
}