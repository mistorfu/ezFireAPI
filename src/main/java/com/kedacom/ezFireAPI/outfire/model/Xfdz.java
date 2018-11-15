package com.kedacom.ezFireAPI.outfire.model;

import java.util.List;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.basic.model.InnerSjzl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName Xfdz 消防队站
 * Created by fudapeng on 2018/5/29.
 */
@ApiModel(value = "消防队站",description = "消防队站对象")
public class Xfdz {
    @ApiModelProperty(value = "队站编号")
    private String dzbh;
    @ApiModelProperty(value = "队站名称")
    private String dzmc;
    @ApiModelProperty(value = "队站简称")
    private String dzjc;
    @ApiModelProperty(value = "队站形式")
    private InnerDxlb dzxs;
    @ApiModelProperty(value = "队站类别")
    private InnerDxlb dzlb;
    @ApiModelProperty(value = "队站地址")
    private String dzdz;
    @ApiModelProperty(value = "队站概述")
    private String dzgs;
    @ApiModelProperty(value = "成立日期")
    private String clrq;
    @ApiModelProperty(value = "管理单位")
    private String gldw;
    @ApiModelProperty(value = "人员职务")
    private String ryzw;
    @ApiModelProperty(value = "联系人员")
    private String lxry;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
    @ApiModelProperty(value = "队站人数")
    private int dzrs;
    @ApiModelProperty(value = "队站车数")
    private int dzcs;
    @ApiModelProperty(value = "是否编制单位")
    private String sfbzdw;
    @ApiModelProperty(value = "是否执勤单位")
    private String sfzqdw;
    @ApiModelProperty(value = "编制干部人数")
    private int bzgbrs;
    @ApiModelProperty(value = "编制士兵人数")
    private int bzsbrs;
    @ApiModelProperty(value = "实有干部人数")
    private int sygbrs;
    @ApiModelProperty(value = "实有士兵人数")
    private int sysbrs;
    @ApiModelProperty(value = "消防装备情况")
    private List<InnerZbqk> xfzbqk;
    @ApiModelProperty(value = "消防装备概述")
    private String  xfzbgs;
    @ApiModelProperty(value = "经度")
    private double jd;
    @ApiModelProperty(value = "纬度")
    private double wd;
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
    @ApiModelProperty(value = "排序条件 地图加载时排序条件 UUID")
    private String pxtj;
    @ApiModelProperty(value = "加载条件 地图层级按需加载时使用")
    private List<String> jztj;
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
    @ApiModelProperty(value = "元素形状")
    private InnerShape shape;

    public String getDzbh() {
        return dzbh;
    }

    public void setDzbh(String dzbh) {
        this.dzbh = dzbh;
    }

    public String getDzmc() {
        return dzmc;
    }

    public void setDzmc(String dzmc) {
        this.dzmc = dzmc;
    }

    public String getDzjc() {
        return dzjc;
    }

    public void setDzjc(String dzjc) {
        this.dzjc = dzjc;
    }

    public InnerDxlb getDzxs() {
        return dzxs;
    }

    public void setDzxs(InnerDxlb dzxs) {
        this.dzxs = dzxs;
    }

    public InnerDxlb getDzlb() {
        return dzlb;
    }

    public void setDzlb(InnerDxlb dzlb) {
        this.dzlb = dzlb;
    }

    public String getDzdz() {
        return dzdz;
    }

    public void setDzdz(String dzdz) {
        this.dzdz = dzdz;
    }

    public String getDzgs() {
        return dzgs;
    }

    public void setDzgs(String dzgs) {
        this.dzgs = dzgs;
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

    public int getDzrs() {
        return dzrs;
    }

    public void setDzrs(int dzrs) {
        this.dzrs = dzrs;
    }

    public int getDzcs() {
        return dzcs;
    }

    public void setDzcs(int dzcs) {
        this.dzcs = dzcs;
    }

    public String getSfbzdw() {
        return sfbzdw;
    }

    public void setSfbzdw(String sfbzdw) {
        this.sfbzdw = sfbzdw;
    }

    public String getSfzqdw() {
        return sfzqdw;
    }

    public void setSfzqdw(String sfzqdw) {
        this.sfzqdw = sfzqdw;
    }

    public int getBzgbrs() {
        return bzgbrs;
    }

    public void setBzgbrs(int bzgbrs) {
        this.bzgbrs = bzgbrs;
    }

    public int getBzsbrs() {
        return bzsbrs;
    }

    public void setBzsbrs(int bzsbrs) {
        this.bzsbrs = bzsbrs;
    }

    public int getSygbrs() {
        return sygbrs;
    }

    public void setSygbrs(int sygbrs) {
        this.sygbrs = sygbrs;
    }

    public int getSysbrs() {
        return sysbrs;
    }

    public void setSysbrs(int sysbrs) {
        this.sysbrs = sysbrs;
    }

    public List<InnerZbqk> getXfzbqk() {
        return xfzbqk;
    }

    public void setXfzbqk(List<InnerZbqk> xfzbqk) {
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

    public String getPxtj() {
        return pxtj;
    }

    public void setPxtj(String pxtj) {
        this.pxtj = pxtj;
    }

    public List<String> getJztj() {
        return jztj;
    }

    public void setJztj(List<String> jztj) {
        this.jztj = jztj;
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
