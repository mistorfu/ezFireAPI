package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.*;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Mhyj  灭火药剂
 * @Date 2018/5/30 9:27
 * @Author zhaomeng
 */
@ApiModel(value = "灭火药剂",description = "灭火药剂对象")
public class Mhyj {
    @ApiModelProperty(value = "信息编号")
    private String xxbh;
    @ApiModelProperty(value = "药剂编号")
    private String yjbh;
    @ApiModelProperty(value = "药剂名称")
    private String yjmc;
    @ApiModelProperty(value = "药剂类型")
    private InnerDxlbext yjlx;
    @ApiModelProperty(value = "药剂概述")
    private String yjgs;
    @ApiModelProperty(value = "库存数量")
    private Double kcsl;
    @ApiModelProperty(value = "计量单位")
    private String jldw;
    @ApiModelProperty(value = "混合比例")
    private String hhbl;
    @ApiModelProperty(value = "储存方式")
    private String ccfs;
    @ApiModelProperty(value = "存放单位")
    private String cfdw;
    @ApiModelProperty(value = "存放地点")
    private String cfdd;
    @ApiModelProperty(value = "联系人员")
    private String lxry;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
    @ApiModelProperty(value = "经度")
    private Double jd;
    @ApiModelProperty(value = "纬度")
    private Double wd;
    @ApiModelProperty(value = "备注信息")
    private String bzxx;
    @ApiModelProperty(value = "所属消防队站")
    private InnerXfdz ssxfdz;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjgext szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value = "记录状态")
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

    public String getXxbh() {
        return xxbh;
    }

    public void setXxbh(String xxbh) {
        this.xxbh = xxbh;
    }

    public String getYjbh() {
        return yjbh;
    }

    public void setYjbh(String yjbh) {
        this.yjbh = yjbh;
    }

    public String getYjmc() {
        return yjmc;
    }

    public void setYjmc(String yjmc) {
        this.yjmc = yjmc;
    }

    public InnerDxlbext getYjlx() {
        return yjlx;
    }

    public void setYjlx(InnerDxlbext yjlx) {
        this.yjlx = yjlx;
    }

    public String getYjgs() {
        return yjgs;
    }

    public void setYjgs(String yjgs) {
        this.yjgs = yjgs;
    }

    public Double getKcsl() {
        return kcsl;
    }

    public void setKcsl(Double kcsl) {
        this.kcsl = kcsl;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getHhbl() {
        return hhbl;
    }

    public void setHhbl(String hhbl) {
        this.hhbl = hhbl;
    }

    public String getCcfs() {
        return ccfs;
    }

    public void setCcfs(String ccfs) {
        this.ccfs = ccfs;
    }

    public String getCfdw() {
        return cfdw;
    }

    public void setCfdw(String cfdw) {
        this.cfdw = cfdw;
    }

    public String getCfdd() {
        return cfdd;
    }

    public void setCfdd(String cfdd) {
        this.cfdd = cfdd;
    }

    public String getLxry() {
        return lxry;
    }

    public void setLxry(String lxry) {
        this.lxry = lxry;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
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

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
    }

    public InnerXfdz getSsxfdz() {
        return ssxfdz;
    }

    public void setSsxfdz(InnerXfdz ssxfdz) {
        this.ssxfdz = ssxfdz;
    }

    public InnerXfjgext getSzdxfjg() {
        return szdxfjg;
    }

    public void setSzdxfjg(InnerXfjgext szdxfjg) {
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