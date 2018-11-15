package com.kedacom.ezFireAPI.emergency.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "救援力量",description = "救援力量对象")
public class Jyll{
    @ApiModelProperty(value="力量编号：主键")
    private String llbh;

    @ApiModelProperty(value="数据来源")
    private String sjly;

    @ApiModelProperty(value="力量地点")
    private String lldd;

    @ApiModelProperty(value="入库人员")
    private String rkry;

    @ApiModelProperty(value="力量概述")
    private String llgs;

    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;

    @ApiModelProperty(value="更新时间：格式：yyyy-MM-dd HH:mm:ss")
    private String gxsj;

    @ApiModelProperty(value="纬度：精确到小数点后6位")
    private Double wd;

    @ApiModelProperty(value="实战经历")
    private String szjl;

    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;

    @ApiModelProperty(value="力量类型：1：社会公益2：自发组织9：其他")
    private InnerDxlb lllx;

    @ApiModelProperty(value="力量名称")
    private String llmc;

    @ApiModelProperty(value="元素形状")
    private InnerShape shape;

    @ApiModelProperty(value="联系电话")
    private String lxdh;

    @ApiModelProperty(value="配备人数")
    private String pbrs;

    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;

    @ApiModelProperty(value="数据监测：1..检测结果：（0：正常 1：异常）2.异常数据：字段标识:规则编号:所在行数")
    private InnerSjjc sjjc;

    @ApiModelProperty(value="入库时间：格式：yyyy-MM-dd HH:mm:ss")
    private String rksj;

    @ApiModelProperty(value="联系人员")
    private String lxry;

    @ApiModelProperty(value="经度：精确到小数点后6位")
    private Double jd;

    @ApiModelProperty(value="更新人员")
    private String gxry;

    @ApiModelProperty(value="配备车辆")
    private String pbcl;

    @ApiModelProperty(value="记录状态：0：废弃 1：正常")
    private String jlzt;

    public String getLlbh() {
        return llbh;
    }

    public void setLlbh(String llbh) {
        this.llbh = llbh;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public String getLldd() {
        return lldd;
    }

    public void setLldd(String lldd) {
        this.lldd = lldd;
    }

    public String getRkry() {
        return rkry;
    }

    public void setRkry(String rkry) {
        this.rkry = rkry;
    }

    public String getLlgs() {
        return llgs;
    }

    public void setLlgs(String llgs) {
        this.llgs = llgs;
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

    public Double getWd() {
        return wd;
    }

    public void setWd(Double wd) {
        this.wd = wd;
    }

    public String getSzjl() {
        return szjl;
    }

    public void setSzjl(String szjl) {
        this.szjl = szjl;
    }

    public List<String> getJsnr() {
        return jsnr;
    }

    public void setJsnr(List<String> jsnr) {
        this.jsnr = jsnr;
    }

    public InnerDxlb getLllx() {
        return lllx;
    }

    public void setLllx(InnerDxlb lllx) {
        this.lllx = lllx;
    }

    public String getLlmc() {
        return llmc;
    }

    public void setLlmc(String llmc) {
        this.llmc = llmc;
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

    public String getPbrs() {
        return pbrs;
    }

    public void setPbrs(String pbrs) {
        this.pbrs = pbrs;
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

    public Double getJd() {
        return jd;
    }

    public void setJd(Double jd) {
        this.jd = jd;
    }

    public String getGxry() {
        return gxry;
    }

    public void setGxry(String gxry) {
        this.gxry = gxry;
    }

    public String getPbcl() {
        return pbcl;
    }

    public void setPbcl(String pbcl) {
        this.pbcl = pbcl;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }
}