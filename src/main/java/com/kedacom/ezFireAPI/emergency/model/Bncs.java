package com.kedacom.ezFireAPI.emergency.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "避难场所",description = "避难场所对象")
public class Bncs {
    @ApiModelProperty(value="数据来源")
    private String sjly;

    @ApiModelProperty(value="场所名称")
    private String csmc;

    @ApiModelProperty(value="场所地址")
    private String csdz;

    @ApiModelProperty(value="入库人员")
    private String rkry;

    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;

    @ApiModelProperty(value="更新时间：格式：yyyy-MM-dd HH:mm:ss")
    private String gxsj;

    @ApiModelProperty(value="场所用途")
    private String csyt;

    @ApiModelProperty(value="场所面积：单位：平方米")
    private Double csmj;

    @ApiModelProperty(value="纬度：精确到小数点后6位")
    private Double wd;

    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;

    @ApiModelProperty(value="元素形状")
    private InnerShape shape;

    @ApiModelProperty(value="联系电话")
    private String lxdh;

    @ApiModelProperty(value="场所编号：主键")
    private String csbh;

    @ApiModelProperty(value="场所描述")
    private String csms;

    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;

    @ApiModelProperty(value="数据监测：1.检测结果：（0：正常 1：异常）2.异常数据：字段标识:规则编号:所在行数")
    private InnerSjjc sjjc;

    @ApiModelProperty(value="入库时间：格式：yyyy-MM-dd HH:mm:ss")
    private String rksj;

    @ApiModelProperty(value="联系人员")
    private String lxry;

    @ApiModelProperty(value="经度：精确到小数点后6位")
    private double jd;

    @ApiModelProperty(value="更新人员")
    private String gxry;

    @ApiModelProperty(value="容纳人数")
    private String rnrs;

    @ApiModelProperty(value="记录状态：0：废弃 1：正常")
    private String jlzt;


    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public String getCsmc() {
        return csmc;
    }

    public void setCsmc(String csmc) {
        this.csmc = csmc;
    }

    public String getCsdz() {
        return csdz;
    }

    public void setCsdz(String csdz) {
        this.csdz = csdz;
    }

    public String getRkry() {
        return rkry;
    }

    public void setRkry(String rkry) {
        this.rkry = rkry;
    }

    public InnerXfjg getSzdxfjg() {
        return szdxfjg;
    }

    public void setSzdxfjg(InnerXfjg szdxfjg) {
        this.szdxfjg = szdxfjg;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public String getCsyt() {
        return csyt;
    }

    public void setCsyt(String csyt) {
        this.csyt = csyt;
    }

    public Double getCsmj() {
        return csmj;
    }

    public void setCsmj(Double csmj) {
        this.csmj = csmj;
    }

    public Double getWd() {
        return wd;
    }

    public void setWd(Double wd) {
        this.wd = wd;
    }

    public List<String> getJsnr() {
        return jsnr;
    }

    public void setJsnr(List<String> jsnr) {
        this.jsnr = jsnr;
    }

    public InnerShape getShape() {
        return shape;
    }

    public void setShape(InnerShape shape) {
        this.shape = shape;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getCsbh() {
        return csbh;
    }

    public void setCsbh(String csbh) {
        this.csbh = csbh;
    }

    public String getCsms() {
        return csms;
    }

    public void setCsms(String csms) {
        this.csms = csms;
    }

    public InnerXzqh getSzdxzqh() {
        return szdxzqh;
    }

    public void setSzdxzqh(InnerXzqh szdxzqh) {
        this.szdxzqh = szdxzqh;
    }

    public InnerSjjc getSjjc() {
        return sjjc;
    }

    public void setSjjc(InnerSjjc sjjc) {
        this.sjjc = sjjc;
    }

    public String getRksj() {
        return rksj;
    }

    public void setRksj(String rksj) {
        this.rksj = rksj;
    }

    public String getLxry() {
        return lxry;
    }

    public void setLxry(String lxry) {
        this.lxry = lxry;
    }

    public double getJd() {
        return jd;
    }

    public void setJd(double jd) {
        this.jd = jd;
    }

    public String getGxry() {
        return gxry;
    }

    public void setGxry(String gxry) {
        this.gxry = gxry;
    }

    public String getRnrs() {
        return rnrs;
    }

    public void setRnrs(String rnrs) {
        this.rnrs = rnrs;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }
}