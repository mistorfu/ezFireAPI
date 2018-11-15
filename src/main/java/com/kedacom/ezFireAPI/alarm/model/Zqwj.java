package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;


/**
 * @author luping
 * @date 2018/5/28 13:39
 */
@ApiModel(value = "灾情文件",description = "灾情文件对象")
public class Zqwj {
    @ApiModelProperty(value = "灾情编号",name = "zqbh",example = "110_44030020")
    private String zqbh;
    @ApiModelProperty(value = "文件编号",name = "wjbh",example = "04a5cdc0")
    private String wjbh;
    @ApiModelProperty(value = "文件类型 1：视频 2：图片 3：文档 9：其他",name = "wjlx",example = "3")
    private String wjlx;
    @ApiModelProperty(value = "文件用途 1：战评资料 9：其他资料",name = "wjyt",example = "1")
    private String wjyt;
    @ApiModelProperty(value = "文件名称",name = "wjmc",example = "4181136_23.jpg")
    private String wjmc;
    @ApiModelProperty(value = "缩略图片 Url地址（http）",name = "sltp",example = "../avatar/jqzh-zp-file-n.png")
    private String sltp;
    @ApiModelProperty(value = "网络路径 Url地址（http）",name = "wllj",example = "http://172.16.233.198:8090/a725-ce91f.jpg")
    private String wllj;
    @ApiModelProperty(value = "存储路径 共享或本地路径",name = "cclj",example = "\\\\172.16.233.198Other\\04a5cdc0.jpg")
    private String cclj;
    @ApiModelProperty(value = "显示顺序",name = "xssx",example = "7")
    private Integer xssx;
    @ApiModelProperty(value = "文件概述",name = "wjgs",example = "佛山火灾图片")
    private String wjgs;
    @ApiModelProperty(value = "数据来源",name = "sjly",example = "接处警数据库")
    private String sjly;
    @ApiModelProperty(value = "数据监测",name = "sjjc")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容",name = "jsnr")
    private List<String> jsnr;
    @ApiModelProperty(value = "记录状态 0：废弃 1：正常",name = "jlzt",example = "1")
    private String jlzt;
    @ApiModelProperty(value = "入库人员",name = "rkry",example = "系统管理员")
    private String rkry;
    @ApiModelProperty(value = "入库时间",name = "rksj",example = "2018-05-29 10:34:24")
    private String rksj;
    @ApiModelProperty(value = "更新人员",name = "gxry",example = "系统管理员")
    private String gxry;
    @ApiModelProperty(value = "更新时间",name = "gxsj",example = "2018-05-29 10:34:24")
    private String gxsj;

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getWjbh() {
        return wjbh;
    }

    public void setWjbh(String wjbh) {
        this.wjbh = wjbh;
    }

    public String getWjlx() {
        return wjlx;
    }

    public void setWjlx(String wjlx) {
        this.wjlx = wjlx;
    }

    public String getWjyt() {
        return wjyt;
    }

    public void setWjyt(String wjyt) {
        this.wjyt = wjyt;
    }

    public String getWjmc() {
        return wjmc;
    }

    public void setWjmc(String wjmc) {
        this.wjmc = wjmc;
    }

    public String getSltp() {
        return sltp;
    }

    public void setSltp(String sltp) {
        this.sltp = sltp;
    }

    public String getWllj() {
        return wllj;
    }

    public void setWllj(String wllj) {
        this.wllj = wllj;
    }

    public String getCclj() {
        return cclj;
    }

    public void setCclj(String cclj) {
        this.cclj = cclj;
    }

    public Integer getXssx() {
        return xssx;
    }

    public void setXssx(Integer xssx) {
        this.xssx = xssx;
    }

    public String getWjgs() {
        return wjgs;
    }

    public void setWjgs(String wjgs) {
        this.wjgs = wjgs;
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
}
