package com.kedacom.ezFireAPI.emergency.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName ydcl 运单车辆
 * Created by fudapeng on 2018/8/28.
 */
@ApiModel(value = "运单车辆",description = "运单车辆对象")
public class Ydcl {
    @ApiModelProperty(value = "信息编号")
    private String xxbh;
    @ApiModelProperty(value = "运单编号")
    private String ydbh;
    @ApiModelProperty(value = "车辆编号")
    private String clbh;
    @ApiModelProperty(value = "车牌号码")
    private String cphm;
    @ApiModelProperty(value = "归属地区")
    private String gsdq;
    @ApiModelProperty(value = "是否满载 0：否 1：是")
    private String sfmz;
    @ApiModelProperty(value = "运输物质")
    private List<InnerYswz> yswz;
    @ApiModelProperty(value = "运输物质概述")
    private String yswzgs;
    @ApiModelProperty(value = "运输开始时间")
    private String yskssj;
    @ApiModelProperty(value = "运输结束时间")
    private String ysjssj;
    @ApiModelProperty(value = "起点行政区划")
    private InnerXzqh qdxzqh;
    @ApiModelProperty(value = "终点行政区划")
    private InnerXzqh zdxzqh;
    @ApiModelProperty(value = "联系人")
    private String lxr;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
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

    public String getXxbh() {
        return xxbh;
    }

    public void setXxbh(String xxbh) {
        this.xxbh = xxbh;
    }

    public String getYdbh() {
        return ydbh;
    }

    public void setYdbh(String ydbh) {
        this.ydbh = ydbh;
    }

    public String getClbh() {
        return clbh;
    }

    public void setClbh(String clbh) {
        this.clbh = clbh;
    }

    public String getCphm() {
        return cphm;
    }

    public void setCphm(String cphm) {
        this.cphm = cphm;
    }

    public String getGsdq() {
        return gsdq;
    }

    public void setGsdq(String gsdq) {
        this.gsdq = gsdq;
    }

    public String getSfmz() {
        return sfmz;
    }

    public void setSfmz(String sfmz) {
        this.sfmz = sfmz;
    }

    public List<InnerYswz> getYswz() {
        return yswz;
    }

    public void setYswz(List<InnerYswz> yswz) {
        this.yswz = yswz;
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

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
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

    public InnerXzqh getQdxzqh() {
        return qdxzqh;
    }

    public void setQdxzqh(InnerXzqh qdxzqh) {
        this.qdxzqh = qdxzqh;
    }

    public InnerXzqh getZdxzqh() {
        return zdxzqh;
    }

    public void setZdxzqh(InnerXzqh zdxzqh) {
        this.zdxzqh = zdxzqh;
    }
}