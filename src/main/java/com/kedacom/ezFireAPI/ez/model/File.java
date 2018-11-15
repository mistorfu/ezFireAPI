package com.kedacom.ezFireAPI.ez.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "通用图像信息",description = "通用图像信息对象")
public class File {
    @ApiModelProperty(value = "关联对象 01：灾情信息（灾情编号、灾情名称）02：会议信息（机构编号、机构名称）")
    private InnerGldx gldx;
    @ApiModelProperty(value = "图像编号")
    private String txbh;
    @ApiModelProperty(value = "图像名称")
    private String txmc;
    @ApiModelProperty(value = "图像分类 0：实时视频（联网）\n" +
            "1：历史视频（联网）\n" +
            "2：视频文件（共享）\n" +
            "3：图片文件（共享）\n" +
            "4：音频文件（共享）\n" +
            "9：其它文件\n")
    private String txfl;
    @ApiModelProperty(value = "图像标记 01：道路图像\n" +
            "02：移动图像\n" +
            "03：营区图像\n" +
            "04：会议图像\n" +
            "99：其他图像\n")
    private String txbj;
    @ApiModelProperty(value = "图像地点")
    private String txdd;
    @ApiModelProperty(value = "图像概述")
    private String txgs;
    @ApiModelProperty(value = "图像地址")
    private String txdz;
    @ApiModelProperty(value = "图像预览小图")
    private String txylxt;
    @ApiModelProperty(value = "图像预览大图")
    private String txyldt;
    @ApiModelProperty(value = "关联设备编号")
    private String glsbbh;
    @ApiModelProperty(value = "关联设备名称")
    private String glsbmc;
    @ApiModelProperty(value = "视频校准时间")
    private int spjzsj;
    @ApiModelProperty(value = "视频开始时间")
    private String spkssj;
    @ApiModelProperty(value = "视频结束时间")
    private String spjssj;
    @ApiModelProperty(value = "经度")
    private double jd;
    @ApiModelProperty(value = "纬度")
    private double wd;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "显示顺序")
    private int xssx;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "检索内容")
    private List jsnr;
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

    public InnerGldx getGldx() {
        return gldx;
    }

    public void setGldx(InnerGldx gldx) {
        this.gldx = gldx;
    }

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

    public String getTxbj() {
        return txbj;
    }

    public void setTxbj(String txbj) {
        this.txbj = txbj;
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

    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    public String getTxylxt() {
        return txylxt;
    }

    public void setTxylxt(String txylxt) {
        this.txylxt = txylxt;
    }

    public String getTxyldt() {
        return txyldt;
    }

    public void setTxyldt(String txyldt) {
        this.txyldt = txyldt;
    }

    public String getGlsbbh() {
        return glsbbh;
    }

    public void setGlsbbh(String glsbbh) {
        this.glsbbh = glsbbh;
    }

    public String getGlsbmc() {
        return glsbmc;
    }

    public void setGlsbmc(String glsbmc) {
        this.glsbmc = glsbmc;
    }

    public int getSpjzsj() {
        return spjzsj;
    }

    public void setSpjzsj(int spjzsj) {
        this.spjzsj = spjzsj;
    }

    public String getSpkssj() {
        return spkssj;
    }

    public void setSpkssj(String spkssj) {
        this.spkssj = spkssj;
    }

    public String getSpjssj() {
        return spjssj;
    }

    public void setSpjssj(String spjssj) {
        this.spjssj = spjssj;
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
