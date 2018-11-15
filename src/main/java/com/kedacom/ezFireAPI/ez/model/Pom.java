package com.kedacom.ezFireAPI.ez.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "地图全景图",description = "地图全景图对象")
public class Pom {
    @ApiModelProperty(value = "图像编号")
    private String txbh;
    @ApiModelProperty(value = "图像名称")
    private String txmc;
    @ApiModelProperty(value = "图像分类 1：高空全景\n" +
            "2：街道全景\n")
    private String txfl;
    @ApiModelProperty(value = "图像地点")
    private String txdd;
    @ApiModelProperty(value = "图像概述")
    private String txgs;
    @ApiModelProperty(value = "缩略图纸")
    private String sltz;
    @ApiModelProperty(value = "原始图纸")
    private String ystz;
    @ApiModelProperty(value = "拍摄单位")
    private String psdw;
    @ApiModelProperty(value = "拍摄开始时间")
    private String pskssj;
    @ApiModelProperty(value = "拍摄结束时间")
    private String psjssj;
    @ApiModelProperty(value = "经度")
    private double jd;
    @ApiModelProperty(value = "纬度")
    private double wd;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "检索内容")
    private List jsnr;
    @ApiModelProperty(value = "记录状态  0：废弃 1：正常")
    private String jlzt;
    @ApiModelProperty(value = "入库人员")
    private String rkry;
    @ApiModelProperty(value = "入库时间")
    private String rksj;
    @ApiModelProperty(value = "更新人员")
    private String gxry;
    @ApiModelProperty(value = "更新时间")
    private String gxsj;
    @ApiModelProperty(value = "元素形状")
    private InnerShape shape;

    public String getTxbh() {
        return txbh;
    }

    public void setTxbh(String txbh) {
        this.txbh = txbh;
    }

    public String getTxmc() {
        return txmc;
    }

    public void setTxmc(String txmc) {
        this.txmc = txmc;
    }

    public String getTxfl() {
        return txfl;
    }

    public void setTxfl(String txfl) {
        this.txfl = txfl;
    }

    public String getTxdd() {
        return txdd;
    }

    public void setTxdd(String txdd) {
        this.txdd = txdd;
    }

    public String getTxgs() {
        return txgs;
    }

    public void setTxgs(String txgs) {
        this.txgs = txgs;
    }

    public String getSltz() {
        return sltz;
    }

    public void setSltz(String sltz) {
        this.sltz = sltz;
    }

    public String getYstz() {
        return ystz;
    }

    public void setYstz(String ystz) {
        this.ystz = ystz;
    }

    public String getPsdw() {
        return psdw;
    }

    public void setPsdw(String psdw) {
        this.psdw = psdw;
    }

    public String getPskssj() {
        return pskssj;
    }

    public void setPskssj(String pskssj) {
        this.pskssj = pskssj;
    }

    public String getPsjssj() {
        return psjssj;
    }

    public void setPsjssj(String psjssj) {
        this.psjssj = psjssj;
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

    public InnerXfjg getSzdxfjg() {
        return szdxfjg;
    }

    public void setSzdxfjg(InnerXfjg szdxfjg) {
        this.szdxfjg = szdxfjg;
    }

    public InnerXzqh getSzdxzqh() {
        return szdxzqh;
    }

    public void setSzdxzqh(InnerXzqh szdxzqh) {
        this.szdxzqh = szdxzqh;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public List getJsnr() {
        return jsnr;
    }

    public void setJsnr(List jsnr) {
        this.jsnr = jsnr;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }

    public String getRkry() {
        return rkry;
    }

    public void setRkry(String rkry) {
        this.rkry = rkry;
    }

    public String getRksj() {
        return rksj;
    }

    public void setRksj(String rksj) {
        this.rksj = rksj;
    }

    public String getGxry() {
        return gxry;
    }

    public void setGxry(String gxry) {
        this.gxry = gxry;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public InnerShape getShape() {
        return shape;
    }

    public void setShape(InnerShape shape) {
        this.shape = shape;
    }
}
