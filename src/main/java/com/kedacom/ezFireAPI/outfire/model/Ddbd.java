package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Ddbd 调度编队
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="调度编队",description="调度编队对象")
public class Ddbd {
    @ApiModelProperty(value="队伍编号",name="dwbh",example="123")
    private String dwbh;
    @ApiModelProperty(value="队伍名称",example="二级险情")
    private String dwmc;
    @ApiModelProperty(value="队伍简称")
    private String dwjc;
    @ApiModelProperty(value="队伍类别")
    private InnerDxlb dwlb;
    @ApiModelProperty(value="队伍职责")
    private String dwzz;
    @ApiModelProperty(value="队伍概述")
    private String dwgs;
    @ApiModelProperty(value="队伍人数")
    private int dwrs;
    @ApiModelProperty(value="队伍车数")
    private int dwcs;
    @ApiModelProperty(value="人员职务")
    private String ryzw;
    @ApiModelProperty(value="联系人员")
    private String lxry;
    @ApiModelProperty(value="联系电话")
    private String lxdh;
    @ApiModelProperty(value="应对级别")
    private String ydjb;
    @ApiModelProperty(value="应对场景")
    private String ydcj;
    @ApiModelProperty(value="应对时段")
    private String ydsd;
    @ApiModelProperty(value="调度形式，1：按微型编队调度 2：按车辆编队调度", example="1")
    private String ddxs;
    @ApiModelProperty(value="微型编队情况")
    private List<InnerBdqk> wxbdqk;
    @ApiModelProperty(value="微型编队概述")
    private String wxbdgs;
    @ApiModelProperty(value="消防车辆情况")
    private List<InnerClqkext> xfclqk;
    @ApiModelProperty(value="消防车辆概述")
    private String xfclgs;
    @ApiModelProperty(value="消防装备情况")
    private InnerZbqk xfzbqk;
    @ApiModelProperty(value="消防装备概述")
    private String xfzbgs;
    @ApiModelProperty(value="经度")
    private double jd;
    @ApiModelProperty(value="纬度")
    private double wd;
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value="数据来源")
    private String sjly;
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value="记录状态 0：废弃 1：正常")
    private String jlzt;
    @ApiModelProperty(value="入库人员")
    private String rkry;
    @ApiModelProperty(value="入库时间")
    private String rksj;
    @ApiModelProperty(value="更新人员")
    private String gxry;
    @ApiModelProperty(value="更新时间")
    private String gxsj;
    @ApiModelProperty(value="元素形状")
    private InnerShape shape;

    public String getDwbh() {
        return dwbh;
    }

    public void setDwbh(String dwbh) {
        this.dwbh = dwbh;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getDwjc() {
        return dwjc;
    }

    public void setDwjc(String dwjc) {
        this.dwjc = dwjc;
    }

    public InnerDxlb getDwlb() {
        return dwlb;
    }

    public void setDwlb(InnerDxlb dwlb) {
        this.dwlb = dwlb;
    }

    public String getDwzz() {
        return dwzz;
    }

    public void setDwzz(String dwzz) {
        this.dwzz = dwzz;
    }

    public String getDwgs() {
        return dwgs;
    }

    public void setDwgs(String dwgs) {
        this.dwgs = dwgs;
    }

    public int getDwrs() {
        return dwrs;
    }

    public void setDwrs(int dwrs) {
        this.dwrs = dwrs;
    }

    public int getDwcs() {
        return dwcs;
    }

    public void setDwcs(int dwcs) {
        this.dwcs = dwcs;
    }

    public String getRyzw() {
        return ryzw;
    }

    public void setRyzw(String ryzw) {
        this.ryzw = ryzw;
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

    public String getYdjb() {
        return ydjb;
    }

    public void setYdjb(String ydjb) {
        this.ydjb = ydjb;
    }

    public String getYdcj() {
        return ydcj;
    }

    public void setYdcj(String ydcj) {
        this.ydcj = ydcj;
    }

    public String getYdsd() {
        return ydsd;
    }

    public void setYdsd(String ydsd) {
        this.ydsd = ydsd;
    }

    public String getDdxs() {
        return ddxs;
    }

    public void setDdxs(String ddxs) {
        this.ddxs = ddxs;
    }

    public List<InnerBdqk> getWxbdqk() {
        return wxbdqk;
    }

    public void setWxbdqk(List<InnerBdqk> wxbdqk) {
        this.wxbdqk = wxbdqk;
    }

    public String getWxbdgs() {
        return wxbdgs;
    }

    public void setWxbdgs(String wxbdgs) {
        this.wxbdgs = wxbdgs;
    }

    public List<InnerClqkext> getXfclqk() {
        return xfclqk;
    }

    public void setXfclqk(List<InnerClqkext> xfclqk) {
        this.xfclqk = xfclqk;
    }

    public String getXfclgs() {
        return xfclgs;
    }

    public void setXfclgs(String xfclgs) {
        this.xfclgs = xfclgs;
    }

    public InnerZbqk getXfzbqk() {
        return xfzbqk;
    }

    public void setXfzbqk(InnerZbqk xfzbqk) {
        this.xfzbqk = xfzbqk;
    }

    public String getXfzbgs() {
        return xfzbgs;
    }

    public void setXfzbgs(String xfzbgs) {
        this.xfzbgs = xfzbgs;
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
