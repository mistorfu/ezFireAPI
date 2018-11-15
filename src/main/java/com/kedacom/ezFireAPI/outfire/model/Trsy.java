package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.*;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.basic.model.InnerSjzl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Trsy 天然水源
 * @Date 2018/5/30 15:11
 * @Author zhaomeng
 */
@ApiModel(value = "天然水源",description = "天然水源对象")
public class Trsy {
    @ApiModelProperty(value = "水源编号")
    private String sybh;
    @ApiModelProperty(value = "水源名称")
    private String symc;
    @ApiModelProperty(value = "水源类型")
    private InnerDxlb sylx;
    @ApiModelProperty(value = "水源性质")
    private InnerDxlb syxz;
    @ApiModelProperty(value = "水源地址")
    private String sydz;
    @ApiModelProperty(value = "经度")
    private Double jd;
    @ApiModelProperty(value = "纬度")
    private Double wd;
    @ApiModelProperty(value = "可用状态 0：不可用 1：可用")
    private String kyzt;
    @ApiModelProperty(value = "水源容量")
    private Double syrl;
    @ApiModelProperty(value = "水源面积")
    private Double symj;
    @ApiModelProperty(value = "水质情况")
    private String szqk;
    @ApiModelProperty(value = "四季变化")
    private String sjbh;
    @ApiModelProperty(value = "有无枯水期")
    private String ywksq;
    @ApiModelProperty(value = "枯水期跨度")
    private String ksqkd;
    @ApiModelProperty(value = "实景图")
    private String sjtp;
    @ApiModelProperty(value = "方位图")
    private List<InnerFwtp> fwtp;
    @ApiModelProperty(value = "启用日期")
    private String qyrq;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "数据质量")
    private InnerSjzl sjzl;
    @ApiModelProperty(value = "数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value = "记录状态 0：废弃 1：正常")
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
    private InnerMultiShape shape;

    public String getSybh() {
        return sybh;
    }

    public void setSybh(String sybh) {
        this.sybh = sybh;
    }

    public String getSymc() {
        return symc;
    }

    public void setSymc(String symc) {
        this.symc = symc;
    }

    public InnerDxlb getSylx() {
        return sylx;
    }

    public void setSylx(InnerDxlb sylx) {
        this.sylx = sylx;
    }

    public InnerDxlb getSyxz() {
        return syxz;
    }

    public void setSyxz(InnerDxlb syxz) {
        this.syxz = syxz;
    }

    public String getSydz() {
        return sydz;
    }

    public void setSydz(String sydz) {
        this.sydz = sydz;
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

    public String getKyzt() {
        return kyzt;
    }

    public void setKyzt(String kyzt) {
        this.kyzt = kyzt;
    }

    public Double getSyrl() {
        return syrl;
    }

    public void setSyrl(Double syrl) {
        this.syrl = syrl;
    }

    public Double getSymj() {
        return symj;
    }

    public void setSymj(Double symj) {
        this.symj = symj;
    }

    public String getSzqk() {
        return szqk;
    }

    public void setSzqk(String szqk) {
        this.szqk = szqk;
    }

    public String getSjbh() {
        return sjbh;
    }

    public void setSjbh(String sjbh) {
        this.sjbh = sjbh;
    }

    public String getYwksq() {
        return ywksq;
    }

    public void setYwksq(String ywksq) {
        this.ywksq = ywksq;
    }

    public String getKsqkd() {
        return ksqkd;
    }

    public void setKsqkd(String ksqkd) {
        this.ksqkd = ksqkd;
    }

    public String getSjtp() {
        return sjtp;
    }

    public void setSjtp(String sjtp) {
        this.sjtp = sjtp;
    }

    public List<InnerFwtp> getFwtp() {
        return fwtp;
    }

    public void setFwtp(List<InnerFwtp> fwtp) {
        this.fwtp = fwtp;
    }

    public String getQyrq() {
        return qyrq;
    }

    public void setQyrq(String qyrq) {
        this.qyrq = qyrq;
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

    public InnerSjzl getSjzl() {
        return sjzl;
    }

    public void setSjzl(InnerSjzl sjzl) {
        this.sjzl = sjzl;
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

    public InnerMultiShape getShape() {
        return shape;
    }

    public void setShape(InnerMultiShape shape) {
        this.shape = shape;
    }
}