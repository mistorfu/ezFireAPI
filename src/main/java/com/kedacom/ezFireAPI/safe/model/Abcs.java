package com.kedacom.ezFireAPI.safe.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * create by liangliang on 2018/5/28
 * @ClassName Abcs 安保场所
 */
@ApiModel(value = "安保场所",description = "安保场所对象")
public class Abcs{
    @ApiModelProperty(value = "活动编号", name = "hdbh", example = "ddhihohofad")
    private String hdbh;
    @ApiModelProperty(value = "场所编号", name = "csbh", example = "cchihohofad")
    private String csbh;
    @ApiModelProperty(value = "场所名称")
    private String csmc;
    @ApiModelProperty(value = "场所地点")
    private String csdd;
    @ApiModelProperty(value = "场所概述")
    private String csgs;
    @ApiModelProperty(value = "场所概况图,图片url")
    private String csgkt;
    @ApiModelProperty(value = "场所部署图,图片url")
    private String csbst;
    @ApiModelProperty(value = "数字化预案,文件地址")
    private String szhya;
    @ApiModelProperty(value = "关联单位")
    private InnerGldw gldw;
    @ApiModelProperty(value = "经度，精确的到小数点后6位")
    private Double jd;
    @ApiModelProperty(value = "纬度")
    private Double wd;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "显示顺序")
    private int xssx;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "数据监测,1.检测结果：（0：正常 1：异常）")
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
    @ApiModelProperty(value = "更新时间")
    private String gxsj;
    @ApiModelProperty(value = "元素形状")
    private InnerShape shape;

    public String getHdbh() {
        return hdbh;
    }

    public void setHdbh(String hdbh) {
        this.hdbh = hdbh;
    }

    public String getCsbh() {
        return csbh;
    }

    public void setCsbh(String csbh) {
        this.csbh = csbh;
    }

    public String getCsmc() {
        return csmc;
    }

    public void setCsmc(String csmc) {
        this.csmc = csmc;
    }

    public String getCsdd() {
        return csdd;
    }

    public void setCsdd(String csdd) {
        this.csdd = csdd;
    }

    public String getCsgs() {
        return csgs;
    }

    public void setCsgs(String csgs) {
        this.csgs = csgs;
    }

    public String getCsgkt() {
        return csgkt;
    }

    public void setCsgkt(String csgkt) {
        this.csgkt = csgkt;
    }

    public String getCsbst() {
        return csbst;
    }

    public void setCsbst(String csbst) {
        this.csbst = csbst;
    }

    public String getSzhya() {
        return szhya;
    }

    public void setSzhya(String szhya) {
        this.szhya = szhya;
    }

    public InnerGldw getGldw() {
        return gldw;
    }

    public void setGldw(InnerGldw gldw) {
        this.gldw = gldw;
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

    public int getXssx() {
        return xssx;
    }

    public void setXssx(int xssx) {
        this.xssx = xssx;
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