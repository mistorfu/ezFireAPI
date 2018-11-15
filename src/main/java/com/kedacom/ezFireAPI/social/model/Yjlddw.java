package com.kedacom.ezFireAPI.social.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:应急联动单位
 *
 */
@ApiModel(value="应急联动单位",description="应急联动单位对象")
public class Yjlddw {
    @ApiModelProperty(value="单位编号",name="dwbh",example="23")
    private String dwbh;            //单位编号
    @ApiModelProperty(value="单位名称")
    private String dwmc;            //单位名称
    @ApiModelProperty(value="单位地址")
    private String dwdz;            //单位地址
    @ApiModelProperty(value="单位类别")
    private InnerDxlbext dwlb;      //单位类别
    @ApiModelProperty(value="单位传真")
    private String dwcz;            //单位传真
    @ApiModelProperty(value="单位概述")
    private String dwgs;            //单位概述
    @ApiModelProperty(value="单位图片")
    private String dwtp;            //单位图片
    @ApiModelProperty(value="联系人员")
    private String lxry;            //联系人员
    @ApiModelProperty(value="联系电话")
    private String lxdh;            //联系电话
    @ApiModelProperty(value="经度")
    private Double jd;              //经度
    @ApiModelProperty(value="纬度")
    private Double wd;              //纬度
    @ApiModelProperty(value="应急服务内容")
    private String yjfwnr;          //应急服务内容
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;   //所在地消防机构
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;   //所在地行政区划
    @ApiModelProperty(value="数据来源")
    private String sjly;            //数据来源
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;         //数据监测
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;      //检索内容
    @ApiModelProperty(value="记录状态, 0：废弃 1：正常",example = "1")
    private String jlzt;              //记录状态
    @ApiModelProperty(value="入库人员")
    private String rkry;              //入库人员
    @ApiModelProperty(value="入库时间")
    private String rksj;              //入库时间
    @ApiModelProperty(value="更新人员")
    private String gxry;              //更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj;              //更新时间
    @ApiModelProperty(value="元素形状")
    private InnerShape shape;         //元素形状

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

    public String getDwdz() {
        return dwdz;
    }

    public void setDwdz(String dwdz) {
        this.dwdz = dwdz;
    }

    public InnerDxlbext getDwlb() {
        return dwlb;
    }

    public void setDwlb(InnerDxlbext dwlb) {
        this.dwlb = dwlb;
    }

    public String getDwcz() {
        return dwcz;
    }

    public void setDwcz(String dwcz) {
        this.dwcz = dwcz;
    }

    public String getDwgs() {
        return dwgs;
    }

    public void setDwgs(String dwgs) {
        this.dwgs = dwgs;
    }

    public String getDwtp() {
        return dwtp;
    }

    public void setDwtp(String dwtp) {
        this.dwtp = dwtp;
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

    public Double getJd() {
        return jd;
    }

    public void setJd(Double jd) {
        this.jd = jd;
    }

    public Double getWd() {
        return wd;
    }

    public void setWd(Double wd) {
        this.wd = wd;
    }

    public String getYjfwnr() {
        return yjfwnr;
    }

    public void setYjfwnr(String yjfwnr) {
        this.yjfwnr = yjfwnr;
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

























