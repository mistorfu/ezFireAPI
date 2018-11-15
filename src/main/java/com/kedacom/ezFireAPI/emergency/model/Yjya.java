package com.kedacom.ezFireAPI.emergency.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlb;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Author: sky
 * @Description: 应急预案
 * @Data: create in 13:15 2018/5/29
 * @Mod By:
 */
@ApiModel(value = "应急预案",description = "应急预案对象")
public class Yjya {
    @ApiModelProperty(value="数据来源")
    private String sjly;

    @ApiModelProperty(value="预案内容")
    private String yanr;

    @ApiModelProperty(value="预案编号")
    private String yabh;

    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;

    @ApiModelProperty(value="制作人员")
    private String zzry;

    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;

    @ApiModelProperty(value="预案文件")
    private InnerYawj yawj;

    @ApiModelProperty(value="预案种类")
    private String yazl;

    @ApiModelProperty(value="预案对象")
    private InnerYadx yadx;

    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;

    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;

    @ApiModelProperty(value="预案名称")
    private String yamc;

    @ApiModelProperty(value="制作单位")
    private String zzdw;

    @ApiModelProperty(value="预案类型")
    private InnerDxlb yalx;

    @ApiModelProperty(value="预案概述")
    private String yags;

    @ApiModelProperty(value="制作时间")
    private String zzsj;

    @ApiModelProperty(value="记录状态")
    private String jlzt;
    private String rkry;
    private String rksj;
    private String gxry;
    private String gxsj;

    public String getYabh() {
        return yabh;
    }

    public void setYabh(String yabh) {
        this.yabh = yabh;
    }

    public String getYamc() {
        return yamc;
    }

    public void setYamc(String yamc) {
        this.yamc = yamc;
    }

    public String getYazl() {
        return yazl;
    }

    public void setYazl(String yazl) {
        this.yazl = yazl;
    }

    public InnerDxlb getYalx() {
        return yalx;
    }

    public void setYalx(InnerDxlb yalx) {
        this.yalx = yalx;
    }

    public String getYanr() {
        return yanr;
    }

    public void setYanr(String yanr) {
        this.yanr = yanr;
    }

    public InnerYawj getYawj() {
        return yawj;
    }

    public void setYawj(InnerYawj yawj) {
        this.yawj = yawj;
    }

    public InnerYadx getYadx() {
        return yadx;
    }

    public void setYadx(InnerYadx yadx) {
        this.yadx = yadx;
    }

    public String getYags() {
        return yags;
    }

    public void setYags(String yags) {
        this.yags = yags;
    }

    public String getZzsj() {
        return zzsj;
    }

    public void setZzsj(String zzsj) {
        this.zzsj = zzsj;
    }

    public String getZzry() {
        return zzry;
    }

    public void setZzry(String zzry) {
        this.zzry = zzry;
    }

    public String getZzdw() {
        return zzdw;
    }

    public void setZzdw(String zzdw) {
        this.zzdw = zzdw;
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
}
