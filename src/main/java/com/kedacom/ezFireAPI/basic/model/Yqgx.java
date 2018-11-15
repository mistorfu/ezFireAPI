package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: 油气管线
 * @author: hanshuhao
 * @Date: 2018/5/28
 */
@ApiModel(value="油气管线",description="油气管线对象")
public class Yqgx {
    @ApiModelProperty(value="管线编号")
    private String gxbh;

    @ApiModelProperty(value="管线名称")
    private String gxmc;

    @ApiModelProperty(value="管线类别")
    private InnerDxlb gxlb;

    @ApiModelProperty(value="输送物质")
    private InnerDxlb sswz;

    @ApiModelProperty(value="输送能力")
    private Double ssnl;

    @ApiModelProperty(value="起始地点")
    private String qsdd;

    @ApiModelProperty(value="途径地点")
    private String tjdd;

    @ApiModelProperty(value="终止地点")
    private String zzdd;

    @ApiModelProperty(value="区内里程")
    private Double qnlc;

    @ApiModelProperty(value="总体里程")
    private Double ztlc;

    @ApiModelProperty(value="开建日期 格式：yyyy-MM-dd")
    private String kjrq;

    @ApiModelProperty(value="开通日期 格式：yyyy-MM-dd")
    private String ktrq;

    @ApiModelProperty(value="联系人员")
    private String lxry;

    @ApiModelProperty(value="联系电话")
    private String lxdh;

    @ApiModelProperty(value="管线概述")
    private String gxgs;

    @ApiModelProperty(value="管线概况图")
    private String gxgkt;

    @ApiModelProperty(value="周边毗邻概述")
    private String zbplgs;

    @ApiModelProperty(value="图片信息")
    private List<InnerTpxx> tpxx;

    @ApiModelProperty(value="消防队站")
    private List<InnerXfdz> xfdz;

    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg xfjg;

    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;

    @ApiModelProperty(value="数据来源")
    private String sjly;

    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;

    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;

    @ApiModelProperty(value="记录状态")
    private String jlzt;

    @ApiModelProperty(value="入库人员")
    private String rkry;

    @ApiModelProperty(value="入库时间 格式：yyyy-MM-dd HH:mm:ss")
    private String rksj;

    @ApiModelProperty(value="更新人员")
    private String gxry;

    @ApiModelProperty(value="更新时间 格式：yyyy-MM-dd HH:mm:ss")
    private String gxsj;

    @ApiModelProperty(value="元素形状")
    private InnerShape shape;

    @ApiModelProperty(value="元素形状")
    private InnerAllShape allShape;

    public String getGxbh() {
        return gxbh;
    }

    public void setGxbh(String gxbh) {
        this.gxbh = gxbh;
    }

    public String getGxmc() {
        return gxmc;
    }

    public void setGxmc(String gxmc) {
        this.gxmc = gxmc;
    }

    public InnerDxlb getGxlb() {
        return gxlb;
    }

    public void setGxlb(InnerDxlb gxlb) {
        this.gxlb = gxlb;
    }

    public InnerDxlb getSswz() {
        return sswz;
    }

    public void setSswz(InnerDxlb sswz) {
        this.sswz = sswz;
    }

    public Double getSsnl() {
        return ssnl;
    }

    public void setSsnl(Double ssnl) {
        this.ssnl = ssnl;
    }

    public String getQsdd() {
        return qsdd;
    }

    public void setQsdd(String qsdd) {
        this.qsdd = qsdd;
    }

    public String getTjdd() {
        return tjdd;
    }

    public void setTjdd(String tjdd) {
        this.tjdd = tjdd;
    }

    public String getZzdd() {
        return zzdd;
    }

    public void setZzdd(String zzdd) {
        this.zzdd = zzdd;
    }

    public Double getQnlc() {
        return qnlc;
    }

    public void setQnlc(Double qnlc) {
        this.qnlc = qnlc;
    }

    public Double getZtlc() {
        return ztlc;
    }

    public void setZtlc(Double ztlc) {
        this.ztlc = ztlc;
    }

    public String getKjrq() {
        return kjrq;
    }

    public void setKjrq(String kjrq) {
        this.kjrq = kjrq;
    }

    public String getKtrq() {
        return ktrq;
    }

    public void setKtrq(String ktrq) {
        this.ktrq = ktrq;
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

    public String getGxgs() {
        return gxgs;
    }

    public void setGxgs(String gxgs) {
        this.gxgs = gxgs;
    }

    public String getGxgkt() {
        return gxgkt;
    }

    public void setGxgkt(String gxgkt) {
        this.gxgkt = gxgkt;
    }

    public String getZbplgs() {
        return zbplgs;
    }

    public void setZbplgs(String zbplgs) {
        this.zbplgs = zbplgs;
    }

    public List<InnerTpxx> getTpxx() {
        return tpxx;
    }

    public void setTpxx(List<InnerTpxx> tpxx) {
        this.tpxx = tpxx;
    }

    public List<InnerXfdz> getXfdz() {
        return xfdz;
    }

    public void setXfdz(List<InnerXfdz> xfdz) {
        this.xfdz = xfdz;
    }

    public InnerXfjg getXfjg() {
        return xfjg;
    }

    public void setXfjg(InnerXfjg xfjg) {
        this.xfjg = xfjg;
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

    public InnerAllShape getAllShape() {
        return allShape;
    }

    public void setAllShape(InnerAllShape allShape) {
        this.allShape = allShape;
    }
}
