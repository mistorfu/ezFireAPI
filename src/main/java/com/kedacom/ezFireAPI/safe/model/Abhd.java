package com.kedacom.ezFireAPI.safe.model;

import com.kedacom.ezFireAPI.outfire.model.InnerDxlb;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * create by liangliang on 2018/5/28
 * @ClassName Abhd 安保活动
 */
@ApiModel(value = "安保活动", description = "安保活动对象")
public class Abhd{
    @ApiModelProperty(value = "活动编号",name = "hdbh", example = "9c3fd0f6475c48a0b636d127fa85e6d4")
    private String hdbh;
    @ApiModelProperty(value = "活动名称")
    private String hdmc;
    @ApiModelProperty(value = "活动级别")
    private InnerDxlb hdjb;
    @ApiModelProperty(value = "活动内容")
    private String hdnr;
    @ApiModelProperty(value = "活动地点")
    private String hddd;
    @ApiModelProperty(value = "活动概述")
    private String hdgs;
    @ApiModelProperty(value = "开始时间")
    private String kssj;
    @ApiModelProperty(value = "结束时间")
    private String jssj;
    @ApiModelProperty(value = "经度,精确到小数点后6位")
    private Double jd;
    @ApiModelProperty(value = "纬度,精确到小数点后6位")
    private Double wd;
    @ApiModelProperty(value = "核心区域")
    private List<String> hxqy;
    @ApiModelProperty(value = "内圈区域")
    private List<String> nqqy;
    @ApiModelProperty(value = "外圈区域")
    private String wqqy;
    @ApiModelProperty(value = "环省区域")
    private List<String> hsqy;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value = "记录状态,0：废弃 1：正常")
    private String jlzt;
    @ApiModelProperty(value = "入库人员")
    private String rkry;
    @ApiModelProperty(value = "入库时间,格式：yyyy-MM-dd HH:mm:ss",example = "2018-05-28 17:32:36")
    private String rksj;
    @ApiModelProperty(value = "更新人员")
    private String gxry;
    @ApiModelProperty(value = "更新时间,格式：yyyy-MM-dd HH:mm:ss",example = "2018-05-28 17:32:36")
    private String gxsj;
    @ApiModelProperty(value = "元素状态")
    private InnerShape shape;

    public String getHdbh() {
        return hdbh;
    }

    public void setHdbh(String hdbh) {
        this.hdbh = hdbh;
    }

    public String getHdmc() {
        return hdmc;
    }

    public void setHdmc(String hdmc) {
        this.hdmc = hdmc;
    }

    public InnerDxlb getHdjb() {
        return hdjb;
    }

    public void setHdjb(InnerDxlb hdjb) {
        this.hdjb = hdjb;
    }

    public String getHdnr() {
        return hdnr;
    }

    public void setHdnr(String hdnr) {
        this.hdnr = hdnr;
    }

    public String getHddd() {
        return hddd;
    }

    public void setHddd(String hddd) {
        this.hddd = hddd;
    }

    public String getHdgs() {
        return hdgs;
    }

    public void setHdgs(String hdgs) {
        this.hdgs = hdgs;
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

    public Double getJd() {
        return jd;
    }

    public void setJd(Double jd) {
        this.jd = jd;
    }

    public Double getWd() {
        return wd;
    }

    public void setWd(Double wd) {
        this.wd = wd;
    }

    public List<String> getHxqy() {
        return hxqy;
    }

    public void setHxqy(List<String> hxqy) {
        this.hxqy = hxqy;
    }

    public List<String> getNqqy() {
        return nqqy;
    }

    public void setNqqy(List<String> nqqy) {
        this.nqqy = nqqy;
    }

    public String getWqqy() {
        return wqqy;
    }

    public void setWqqy(String wqqy) {
        this.wqqy = wqqy;
    }

    public List<String> getHsqy() {
        return hsqy;
    }

    public void setHsqy(List<String> hsqy) {
        this.hsqy = hsqy;
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

    public InnerSjjc getSjjc() {
        return sjjc;
    }

    public void setSjjc(InnerSjjc sjjc) {
        this.sjjc = sjjc;
    }

    public List<String> getJsnr() {
        return jsnr;
    }

    public void setJsnr(List<String> jsnr) {
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