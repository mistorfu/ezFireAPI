package com.kedacom.ezFireAPI.ez.model;

import com.kedacom.ezFireAPI.outfire.model.InnerDxlb;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "通用日志",description = "通用日志对象")
public class Log {
    @ApiModelProperty(value = "日志编号")
    private String rzbh;
    @ApiModelProperty(value = "日志类型 01：操作日志\n" +
            "02：系统日志\n" +
            "99：其他日志\n")
    private InnerDxlb rzlx;
    @ApiModelProperty(value = "日志级别 01：DEBUG级别\n" +
            "02：INFO级别\n" +
            "03：WARN级别\n" +
            "04：ERROR级别\n" +
            "05：FATAL级别\n")
    private InnerDxlb rzjb;
    @ApiModelProperty(value = "日志描述")
    private String rzms;
    @ApiModelProperty(value = "操作模块")
    private InnerDxlbext czmk;
    @ApiModelProperty(value = "操作对象")
    private InnerDxlb czdx;
    @ApiModelProperty(value = "操作类型")
    private InnerDxlb czlx;
    @ApiModelProperty(value = "操作终端")
    private InnerCzzd czzd;
    @ApiModelProperty(value = "操作用户")
    private InnerCzyh czyh;
    @ApiModelProperty(value = "操作单位")
    private InnerCzdw czdw;
    @ApiModelProperty(value = "操作时间")
    private String czsj;
    @ApiModelProperty(value = "操作参数")
    private String czcs;
    @ApiModelProperty(value = "操作结果")
    private String czjg;
    @ApiModelProperty(value = "预留内容")
    private String ylnr;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "检索内容")
    private List jsnr;
    @ApiModelProperty(value = "记录状态  0：废弃 1：正常")
    private String jlzt;
    @ApiModelProperty(value = "入库人员")
    private String rkry;
    @ApiModelProperty(value = "入库时间")
    private String rksj;
    @ApiModelProperty(value = "更新人员")
    private String gxry;
    @ApiModelProperty(value = "更新时间")
    private String gxsj;

    public String getRzbh() {
        return rzbh;
    }

    public void setRzbh(String rzbh) {
        this.rzbh = rzbh;
    }

    public InnerDxlb getRzlx() {
        return rzlx;
    }

    public void setRzlx(InnerDxlb rzlx) {
        this.rzlx = rzlx;
    }

    public InnerDxlb getRzjb() {
        return rzjb;
    }

    public void setRzjb(InnerDxlb rzjb) {
        this.rzjb = rzjb;
    }

    public String getRzms() {
        return rzms;
    }

    public void setRzms(String rzms) {
        this.rzms = rzms;
    }

    public InnerDxlbext getCzmk() {
        return czmk;
    }

    public void setCzmk(InnerDxlbext czmk) {
        this.czmk = czmk;
    }

    public InnerDxlb getCzdx() {
        return czdx;
    }

    public void setCzdx(InnerDxlb czdx) {
        this.czdx = czdx;
    }

    public InnerDxlb getCzlx() {
        return czlx;
    }

    public void setCzlx(InnerDxlb czlx) {
        this.czlx = czlx;
    }

    public InnerCzzd getCzzd() {
        return czzd;
    }

    public void setCzzd(InnerCzzd czzd) {
        this.czzd = czzd;
    }

    public InnerCzyh getCzyh() {
        return czyh;
    }

    public void setCzyh(InnerCzyh czyh) {
        this.czyh = czyh;
    }

    public InnerCzdw getCzdw() {
        return czdw;
    }

    public void setCzdw(InnerCzdw czdw) {
        this.czdw = czdw;
    }

    public String getCzsj() {
        return czsj;
    }

    public void setCzsj(String czsj) {
        this.czsj = czsj;
    }

    public String getCzcs() {
        return czcs;
    }

    public void setCzcs(String czcs) {
        this.czcs = czcs;
    }

    public String getCzjg() {
        return czjg;
    }

    public void setCzjg(String czjg) {
        this.czjg = czjg;
    }

    public String getYlnr() {
        return ylnr;
    }

    public void setYlnr(String ylnr) {
        this.ylnr = ylnr;
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
}
