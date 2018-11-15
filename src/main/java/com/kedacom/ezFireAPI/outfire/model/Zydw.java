package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Zydw 专业队伍
 * Created by fudapeng on 2018/5/30.
 */
@ApiModel(value="专业队伍",description="专业队伍对象")
public class Zydw {
    @ApiModelProperty(value="队伍编号",name="dwbh",example="65")
    private String dwbh; // 队伍编号
    @ApiModelProperty(value="队伍名称")
    private String dwmc; // 队伍名称
    @ApiModelProperty(value="队伍简称")
    private String dwjc; // 队伍简称
    @ApiModelProperty(value="队伍形式")
    private InnerDxlb dwxs; // 队伍形式
    @ApiModelProperty(value="队伍类别")
    private InnerDxlb dwlb; // 队伍类别
    @ApiModelProperty(value="队伍地址")
    private String dwdz; // 队伍地址
    @ApiModelProperty(value="队伍概述")
    private String dwgs; // 队伍概述
    @ApiModelProperty(value="成立日期")
    private String clrq; // 成立日期
    @ApiModelProperty(value="管理单位")
    private String gldw; // 管理单位
    @ApiModelProperty(value="人员职务")
    private String ryzw; // 人员职务
    @ApiModelProperty(value="联系人员")
    private String lxry; // 联系人员
    @ApiModelProperty(value="联系电话")
    private String lxdh; // 联系电话
    @ApiModelProperty(value="队伍人数")
    private int dwrs; // 队伍人数
    @ApiModelProperty(value="队伍车数")
    private int dwcs; // 队伍车数
    @ApiModelProperty(value="队伍数量")
    private int dwsl = 1; // 队伍数量
    @ApiModelProperty(value="队伍集结概况")
    private List<InnerJjgk> dwjjgk; // 队伍集结概况
    @ApiModelProperty(value="集结所需时间 单位 分钟")
    private int jjsxsj; // 集结所需时间 单位 分钟
    @ApiModelProperty(value="消防装备情况")
    private InnerZbqk xfzbqk; // 消防装备情况
    @ApiModelProperty(value="消防装备概述")
    private String xfzbgs; // 消防装备概述
    @ApiModelProperty(value="消防装备编配")
    private InnerZbbp xfzbbp; // 消防装备编配
    @ApiModelProperty(value="经度")
    private double jd; // 经度
    @ApiModelProperty(value="纬度")
    private double wd; // 纬度
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg; // 所在地消防机构
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh; // 所在地行政区划
    @ApiModelProperty(value="数据来源")
    private String sjly; // 数据来源
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc; // 数据监测
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr; // 检索内容
    @ApiModelProperty(value="记录状态")
    private String jlzt; // 记录状态
    @ApiModelProperty(value="入库人员")
    private String rkry; // 入库人员
    @ApiModelProperty(value="入库时间")
    private String rksj; // 入库时间
    @ApiModelProperty(value="更新人员")
    private String gxry; // 更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj; // 更新时间
    @ApiModelProperty(value="元素形状")
    private InnerShape shape; // 元素形状

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

    public InnerDxlb getDwxs() {
        return dwxs;
    }

    public void setDwxs(InnerDxlb dwxs) {
        this.dwxs = dwxs;
    }

    public InnerDxlb getDwlb() {
        return dwlb;
    }

    public void setDwlb(InnerDxlb dwlb) {
        this.dwlb = dwlb;
    }

    public String getDwdz() {
        return dwdz;
    }

    public void setDwdz(String dwdz) {
        this.dwdz = dwdz;
    }

    public String getDwgs() {
        return dwgs;
    }

    public void setDwgs(String dwgs) {
        this.dwgs = dwgs;
    }

    public String getClrq() {
        return clrq;
    }

    public void setClrq(String clrq) {
        this.clrq = clrq;
    }

    public String getGldw() {
        return gldw;
    }

    public void setGldw(String gldw) {
        this.gldw = gldw;
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

    public int getDwsl() {
        return dwsl;
    }

    public void setDwsl(int dwsl) {
        this.dwsl = dwsl;
    }

    public List<InnerJjgk> getDwjjgk() {
        return dwjjgk;
    }

    public void setDwjjgk(List<InnerJjgk> dwjjgk) {
        this.dwjjgk = dwjjgk;
    }

    public int getJjsxsj() {
        return jjsxsj;
    }

    public void setJjsxsj(int jjsxsj) {
        this.jjsxsj = jjsxsj;
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

    public InnerZbbp getXfzbbp() {
        return xfzbbp;
    }

    public void setXfzbbp(InnerZbbp xfzbbp) {
        this.xfzbbp = xfzbbp;
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
