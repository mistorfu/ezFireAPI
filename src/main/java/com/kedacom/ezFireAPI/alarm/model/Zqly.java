package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author luping
 * @date 2018/5/28 13:39
 */
@ApiModel(value = "灾情录音",description = "灾情录音对象")
public class Zqly {
    @ApiModelProperty(value = "灾情编号",name = "zqbh",example = "37e1f8f")
    private String zqbh;
    @ApiModelProperty(value = "录音编号",name = "lybh",example = "20142003")
    private String lybh;
    @ApiModelProperty(value = "主叫号码",name = "zjhm",example = "83335237")
    private String zjhm;
    @ApiModelProperty(value = "被叫号码",name = "bjhm",example = "72100400")
    private String bjhm;
    @ApiModelProperty(value = "录音文件",name = "lywj")
    private InnerLywj lywj;
    @ApiModelProperty(value = "录音开始时间",name = "lykssj",example = "2014-04-20 03:40:55")
    private String lykssj;
    @ApiModelProperty(value = "录音结束时间",name = "lyjssj",example = "2014-04-20 03:41:55")
    private String lyjssj;
    @ApiModelProperty(value = "报警开始时间",name = "bjkssj",example = "2014-04-20 03:40:55")
    private String bjkssj;
    @ApiModelProperty(value = "报警结束时间",name = "bjjssj",example = "2014-04-20 03:41:55")
    private String bjjssj;
    @ApiModelProperty(value = "是否下发 0：否 1：是",name = "sfxf",example = "1")
    private String sfxf;
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
    @ApiModelProperty(value = "入库时间",name = "rksj",example = "2014-04-21 03:41:55")
    private String rksj;
    @ApiModelProperty(value = "更新人员",name = "gxry",example = "系统管理员")
    private String gxry;
    @ApiModelProperty(value = "更新时间",name = "gxsj",example = "2014-04-21 03:41:55")
    private String gxsj;

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getLybh() {
        return lybh;
    }

    public void setLybh(String lybh) {
        this.lybh = lybh;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getBjhm() {
        return bjhm;
    }

    public void setBjhm(String bjhm) {
        this.bjhm = bjhm;
    }

    public InnerLywj getLywj() {
        return lywj;
    }

    public void setLywj(InnerLywj lywj) {
        this.lywj = lywj;
    }

    public String getLykssj() {
        return lykssj;
    }

    public void setLykssj(String lykssj) {
        this.lykssj = lykssj;
    }

    public String getLyjssj() {
        return lyjssj;
    }

    public void setLyjssj(String lyjssj) {
        this.lyjssj = lyjssj;
    }

    public String getBjkssj() {
        return bjkssj;
    }

    public void setBjkssj(String bjkssj) {
        this.bjkssj = bjkssj;
    }

    public String getBjjssj() {
        return bjjssj;
    }

    public void setBjjssj(String bjjssj) {
        this.bjjssj = bjjssj;
    }

    public String getSfxf() {
        return sfxf;
    }

    public void setSfxf(String sfxf) {
        this.sfxf = sfxf;
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
