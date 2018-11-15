package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.*;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.basic.model.InnerSjzl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Xfsc 消防水池
 * @Date 2018/5/30 13:58
 * @Author zhaomeng
 */
@ApiModel(value = "消防水池",description = "消防水池对象")
public class Xfsc {
    @ApiModelProperty(value = "水池编号")
    private String scbh;
    @ApiModelProperty(value = "水池名称")
    private String scmc;
    @ApiModelProperty(value = "水池地址")
    private String scdz;
    @ApiModelProperty(value = "水池容量")
    private Double scrl;
    @ApiModelProperty(value = "储水量")
    private Double csl;
    @ApiModelProperty(value = "经度")
    private Double jd;
    @ApiModelProperty(value = "纬度")
    private Double wd;
    @ApiModelProperty(value = "可用状态 0：不可用 1：可用")
    private String kyzt;
    @ApiModelProperty(value = "所属路段")
    private String ssld;
    @ApiModelProperty(value = "取水形式")
    private String qsxs;
    @ApiModelProperty(value = "取水高度")
    private Double qsgd;
    @ApiModelProperty(value = "水源标高差")
    private Double sybgc;
    @ApiModelProperty(value = "停车位置")
    private String tcwz;
    @ApiModelProperty(value = "停车数量")
    private int tcsl;
    @ApiModelProperty(value = "管网形式")
    private String gwxs;
    @ApiModelProperty(value = "管网形式/态")
    private InnerDxlb gwxt;
    @ApiModelProperty(value = "流量大小")
    private Double lldx;
    @ApiModelProperty(value = "供水单位")
    private String gsdw;
    @ApiModelProperty(value = "实景图")
    private String sjtp;
    @ApiModelProperty(value = "方位图")
    private List<InnerFwtp> fwtp;
    @ApiModelProperty(value = "建成日期")
    private String jcrq;
    @ApiModelProperty(value = "检查记录")
    private List<InnerJcjl> jcjl;
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
    private InnerShape shape;

    public String getScbh() {
        return scbh;
    }

    public void setScbh(String scbh) {
        this.scbh = scbh;
    }

    public String getScmc() {
        return scmc;
    }

    public void setScmc(String scmc) {
        this.scmc = scmc;
    }

    public String getScdz() {
        return scdz;
    }

    public void setScdz(String scdz) {
        this.scdz = scdz;
    }

    public Double getScrl() {
        return scrl;
    }

    public void setScrl(Double scrl) {
        this.scrl = scrl;
    }

    public Double getCsl() {
        return csl;
    }

    public void setCsl(Double csl) {
        this.csl = csl;
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

    public String getSsld() {
        return ssld;
    }

    public void setSsld(String ssld) {
        this.ssld = ssld;
    }

    public String getQsxs() {
        return qsxs;
    }

    public void setQsxs(String qsxs) {
        this.qsxs = qsxs;
    }

    public Double getQsgd() {
        return qsgd;
    }

    public void setQsgd(Double qsgd) {
        this.qsgd = qsgd;
    }

    public Double getSybgc() {
        return sybgc;
    }

    public void setSybgc(Double sybgc) {
        this.sybgc = sybgc;
    }

    public String getTcwz() {
        return tcwz;
    }

    public void setTcwz(String tcwz) {
        this.tcwz = tcwz;
    }

    public int getTcsl() {
        return tcsl;
    }

    public void setTcsl(int tcsl) {
        this.tcsl = tcsl;
    }

    public String getGwxs() {
        return gwxs;
    }

    public void setGwxs(String gwxs) {
        this.gwxs = gwxs;
    }

    public Double getLldx() {
        return lldx;
    }

    public void setLldx(Double lldx) {
        this.lldx = lldx;
    }

    public String getGsdw() {
        return gsdw;
    }

    public void setGsdw(String gsdw) {
        this.gsdw = gsdw;
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

    public String getJcrq() {
        return jcrq;
    }

    public void setJcrq(String jcrq) {
        this.jcrq = jcrq;
    }

    public List<InnerJcjl> getJcjl() {
        return jcjl;
    }

    public void setJcjl(List<InnerJcjl> jcjl) {
        this.jcjl = jcjl;
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

    public InnerShape getShape() {
        return shape;
    }

    public void setShape(InnerShape shape) {
        this.shape = shape;
    }

    public InnerDxlb getGwxt() {
        return gwxt;
    }

    public void setGwxt(InnerDxlb gwxt) {
        this.gwxt = gwxt;
    }
}