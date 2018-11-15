package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by fudapeng on 2018/7/12.
 */
@ApiModel(value = "前指信息", description = "前指设备信息对象")
public class Qzxx {
    @ApiModelProperty(value = "灾情编号")
    private String zqbh;
    @ApiModelProperty(value = "前指编号")
    private String qzbh;
    @ApiModelProperty(value = "前指系统名称")
    private String qzmc;
    @ApiModelProperty(value = "前指地址")
    private String qzdz;
    @ApiModelProperty(value = "前指视频 虚拟视频的国标编号")
    private String qzsp;
    @ApiModelProperty(value = "前指状态 0：已下线 1：已上线")
    private String qzzt;
    @ApiModelProperty(value = "联系人员")
    private String lxry;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
    @ApiModelProperty(value = "设立机构")
    private InnerXfjg sljg;
    @ApiModelProperty(value = "经度")
    private double jd;
    @ApiModelProperty(value = "纬度")
    private double wd;
    @ApiModelProperty(value = "数据来源", name = "sjly", example = "接警处数据库")
    private String sjly;
    @ApiModelProperty(value = "数据监测", name = "sjjc")
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
    @ApiModelProperty(value = "元素形状", name = "shape")
    private InnerShape shape;

    public String getQzmc() {
        return qzmc;
    }

    public void setQzmc(String qzmc) {
        this.qzmc = qzmc;
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

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getQzbh() {
        return qzbh;
    }

    public void setQzbh(String qzbh) {
        this.qzbh = qzbh;
    }

    public String getQzdz() {
        return qzdz;
    }

    public void setQzdz(String qzdz) {
        this.qzdz = qzdz;
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

    public InnerXfjg getSljg() {
        return sljg;
    }

    public void setSljg(InnerXfjg sljg) {
        this.sljg = sljg;
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

    public InnerShape getShape() {
        return shape;
    }

    public void setShape(InnerShape shape) {
        this.shape = shape;
    }

    public String getQzsp() {
        return qzsp;
    }

    public void setQzsp(String qzsp) {
        this.qzsp = qzsp;
    }

    public String getQzzt() {
        return qzzt;
    }

    public void setQzzt(String qzzt) {
        this.qzzt = qzzt;
    }
}