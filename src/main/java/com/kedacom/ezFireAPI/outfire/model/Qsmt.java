package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.*;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.basic.model.InnerSjzl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Qsmt 取水码头
 * @Date 2018/5/30 14:45
 * @Author zhaomeng
 */
@ApiModel(value = "取水码头",description = "取水码头对象")
public class Qsmt {
    @ApiModelProperty(value = "码头编号")
    private String mtbh;
    @ApiModelProperty(value = "码头名称")
    private String mtmc;
    @ApiModelProperty(value = "码头地址")
    private String mtdz;
    @ApiModelProperty(value = "经度")
    private Double jd;
    @ApiModelProperty(value = "纬度")
    private Double wd;
    @ApiModelProperty(value = "可用状态 0：不可用 1：可以")
    private String kyzt;
    @ApiModelProperty(value = "所在水源")
    private InnerSzsy szsy;
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
    @ApiModelProperty(value = "实景图")
    private String sjtp;
    @ApiModelProperty(value = "封面图")
    private List<InnerFwtp> fwtp;
    @ApiModelProperty(value = "建成日期")
    private String jcrq;
    @ApiModelProperty(value = "检查记录")
    private InnerJcjl jcjl;
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

    public String getMtbh() {
        return mtbh;
    }

    public void setMtbh(String mtbh) {
        this.mtbh = mtbh;
    }

    public String getMtmc() {
        return mtmc;
    }

    public void setMtmc(String mtmc) {
        this.mtmc = mtmc;
    }

    public String getMtdz() {
        return mtdz;
    }

    public void setMtdz(String mtdz) {
        this.mtdz = mtdz;
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

    public InnerSzsy getSzsy() {
        return szsy;
    }

    public void setSzsy(InnerSzsy szsy) {
        this.szsy = szsy;
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

    public InnerJcjl getJcjl() {
        return jcjl;
    }

    public void setJcjl(InnerJcjl jcjl) {
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
}