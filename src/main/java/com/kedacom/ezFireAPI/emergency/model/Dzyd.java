package com.kedacom.ezFireAPI.emergency.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName dzyd 电子运单
 * Created by fudapeng on 2018/8/28.
 */
@ApiModel(value = "电子运单",description = "电子运单对象")
public class Dzyd {
    @ApiModelProperty(value = "运单编号")
    private String ydbh;
    @ApiModelProperty(value = "运单名称")
    private String ydmc;
    @ApiModelProperty(value = "运单描述")
    private String ydms;
    @ApiModelProperty(value = "运输物质")
    private List<InnerYswz> yswz;
    @ApiModelProperty(value = "运输物质重量 单位 吨")
    private Double yswzzl;
    @ApiModelProperty(value = "运输物质体积 单位 立方米")
    private Double yswztj;
    @ApiModelProperty(value = "运输物质概述")
    private String yswzgs;
    @ApiModelProperty(value = "运输开始时间")
    private String yskssj;
    @ApiModelProperty(value = "运输结束时间")
    private String ysjssj;
    @ApiModelProperty(value = "运输车辆总数")
    private Integer ysclzs;
    @ApiModelProperty(value = "满载车辆总数")
    private Integer mzclzs;
    @ApiModelProperty(value = "运输起点")
    private String ysqd;
    @ApiModelProperty(value = "起点经度")
    private Double qdjd;
    @ApiModelProperty(value = "起点纬度")
    private Double qdwd;
    @ApiModelProperty(value = "起点坐标")
    private InnerShape qdzb;
    @ApiModelProperty(value = "起点消防机构")
    private InnerXfjg qdxfjg;
    @ApiModelProperty(value = "起点行政区划")
    private InnerXzqh qdxzqh;
    @ApiModelProperty(value = "运输终点")
    private String yszd;
    @ApiModelProperty(value = "终点经度")
    private Double zdjd;
    @ApiModelProperty(value = "终点纬度")
    private Double zdwd;
    @ApiModelProperty(value = "终点坐标")
    private InnerShape zdzb;
    @ApiModelProperty(value = "终点消防机构")
    private InnerXfjg zdxfjg;
    @ApiModelProperty(value = "终点行政区划")
    private InnerXzqh zdxzqh;
    @ApiModelProperty(value = "发起单位")
    private String fqdw;
    @ApiModelProperty(value = "发起联系人")
    private String fqlxr;
    @ApiModelProperty(value = "发起联系电话")
    private String fqlxdh;
    @ApiModelProperty(value = "承运单位")
    private String cydw;
    @ApiModelProperty(value = "承运联系人")
    private String cylxr;
    @ApiModelProperty(value = "承运联系电话")
    private String cylxdh;
    @ApiModelProperty(value = "接收单位")
    private String jsdw;
    @ApiModelProperty(value = "接收联系人")
    private String jslxr;
    @ApiModelProperty(value = "接收联系电话")
    private String jslxdh;
    @ApiModelProperty(value = "备注信息")
    private String bzxx;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value="记录状态 0：废弃 1：正常")
    private String jlzt;
    @ApiModelProperty(value = "入库人员")
    private String rkry;
    @ApiModelProperty(value = "入库时间")
    private String rksj;
    @ApiModelProperty(value = "更新人员")
    private String gxry;
    @ApiModelProperty(value = "更新时间")
    private String gxsj;

    public String getYdbh() {
        return ydbh;
    }

    public void setYdbh(String ydbh) {
        this.ydbh = ydbh;
    }

    public String getYdmc() {
        return ydmc;
    }

    public void setYdmc(String ydmc) {
        this.ydmc = ydmc;
    }

    public String getYdms() {
        return ydms;
    }

    public void setYdms(String ydms) {
        this.ydms = ydms;
    }

    public List<InnerYswz> getYswz() {
        return yswz;
    }

    public void setYswz(List<InnerYswz> yswz) {
        this.yswz = yswz;
    }

    public Double getYswzzl() {
        return yswzzl;
    }

    public void setYswzzl(Double yswzzl) {
        this.yswzzl = yswzzl;
    }

    public Double getYswztj() {
        return yswztj;
    }

    public void setYswztj(Double yswztj) {
        this.yswztj = yswztj;
    }

    public String getYswzgs() {
        return yswzgs;
    }

    public void setYswzgs(String yswzgs) {
        this.yswzgs = yswzgs;
    }

    public String getYskssj() {
        return yskssj;
    }

    public void setYskssj(String yskssj) {
        this.yskssj = yskssj;
    }

    public String getYsjssj() {
        return ysjssj;
    }

    public void setYsjssj(String ysjssj) {
        this.ysjssj = ysjssj;
    }

    public Integer getYsclzs() {
        return ysclzs;
    }

    public void setYsclzs(Integer ysclzs) {
        this.ysclzs = ysclzs;
    }

    public Integer getMzclzs() {
        return mzclzs;
    }

    public void setMzclzs(Integer mzclzs) {
        this.mzclzs = mzclzs;
    }

    public String getYsqd() {
        return ysqd;
    }

    public void setYsqd(String ysqd) {
        this.ysqd = ysqd;
    }

    public Double getQdjd() {
        return qdjd;
    }

    public void setQdjd(Double qdjd) {
        this.qdjd = qdjd;
    }

    public Double getQdwd() {
        return qdwd;
    }

    public void setQdwd(Double qdwd) {
        this.qdwd = qdwd;
    }

    public InnerShape getQdzb() {
        return qdzb;
    }

    public void setQdzb(InnerShape qdzb) {
        this.qdzb = qdzb;
    }

    public InnerXfjg getQdxfjg() {
        return qdxfjg;
    }

    public void setQdxfjg(InnerXfjg qdxfjg) {
        this.qdxfjg = qdxfjg;
    }

    public InnerXzqh getQdxzqh() {
        return qdxzqh;
    }

    public void setQdxzqh(InnerXzqh qdxzqh) {
        this.qdxzqh = qdxzqh;
    }

    public String getYszd() {
        return yszd;
    }

    public void setYszd(String yszd) {
        this.yszd = yszd;
    }

    public Double getZdjd() {
        return zdjd;
    }

    public void setZdjd(Double zdjd) {
        this.zdjd = zdjd;
    }

    public Double getZdwd() {
        return zdwd;
    }

    public void setZdwd(Double zdwd) {
        this.zdwd = zdwd;
    }

    public InnerShape getZdzb() {
        return zdzb;
    }

    public void setZdzb(InnerShape zdzb) {
        this.zdzb = zdzb;
    }

    public InnerXfjg getZdxfjg() {
        return zdxfjg;
    }

    public void setZdxfjg(InnerXfjg zdxfjg) {
        this.zdxfjg = zdxfjg;
    }

    public InnerXzqh getZdxzqh() {
        return zdxzqh;
    }

    public void setZdxzqh(InnerXzqh zdxzqh) {
        this.zdxzqh = zdxzqh;
    }

    public String getFqdw() {
        return fqdw;
    }

    public void setFqdw(String fqdw) {
        this.fqdw = fqdw;
    }

    public String getFqlxr() {
        return fqlxr;
    }

    public void setFqlxr(String fqlxr) {
        this.fqlxr = fqlxr;
    }

    public String getFqlxdh() {
        return fqlxdh;
    }

    public void setFqlxdh(String fqlxdh) {
        this.fqlxdh = fqlxdh;
    }

    public String getCydw() {
        return cydw;
    }

    public void setCydw(String cydw) {
        this.cydw = cydw;
    }

    public String getCylxr() {
        return cylxr;
    }

    public void setCylxr(String cylxr) {
        this.cylxr = cylxr;
    }

    public String getCylxdh() {
        return cylxdh;
    }

    public void setCylxdh(String cylxdh) {
        this.cylxdh = cylxdh;
    }

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public String getJslxr() {
        return jslxr;
    }

    public void setJslxr(String jslxr) {
        this.jslxr = jslxr;
    }

    public String getJslxdh() {
        return jslxdh;
    }

    public void setJslxdh(String jslxdh) {
        this.jslxdh = jslxdh;
    }

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
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