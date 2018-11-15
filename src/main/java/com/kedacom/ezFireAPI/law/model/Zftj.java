package com.kedacom.ezFireAPI.law.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:执法统计信息
 */
@ApiModel(value="执法统计信息",description="执法统计信息对象")
public class Zftj {
    @ApiModelProperty(value="统计编号",name="tjbh",example="623")
    private String tjbh;            //统计编号
    @ApiModelProperty(value="统计日期")
    private String tjrq;            //统计日期
    @ApiModelProperty(value="统计来源")
    private String tjly;            //统计来源
    @ApiModelProperty(value="检查对象")
    private List<InnerJcdx> jcdx;   //检查对象
    @ApiModelProperty(value="检查结果")
    private List<InnerJcjg> jcjg;   //检查结果
    @ApiModelProperty(value="备注信息")
    private String bzxx;            //备注信息
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;//所在地消防机构
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;//所在地行政区划
    @ApiModelProperty(value="数据来源")
    private String sjly;         //数据来源
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;      //数据监测
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;   //检索内容
    @ApiModelProperty(value="记录状态, 0：废弃 1：正常",example = "1")
    private String jlzt;         //记录状态
    @ApiModelProperty(value="入库人员")
    private String rkry;         //入库人员
    @ApiModelProperty(value="入库时间")
    private String rksj;         //入库时间
    @ApiModelProperty(value="更新人员")
    private String gxry;         //更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj;         //更新时间

    public List<InnerJcdx> getJcdx() {
        return jcdx;
    }

    public void setJcdx(List<InnerJcdx> jcdx) {
        this.jcdx = jcdx;
    }

    public List<InnerJcjg> getJcjg() {
        return jcjg;
    }

    public void setJcjg(List<InnerJcjg> jcjg) {
        this.jcjg = jcjg;
    }

    public String getTjbh() {
        return tjbh;
    }

    public void setTjbh(String tjbh) {
        this.tjbh = tjbh;
    }

    public String getTjrq() {
        return tjrq;
    }

    public void setTjrq(String tjrq) {
        this.tjrq = tjrq;
    }

    public String getTjly() {
        return tjly;
    }

    public void setTjly(String tjly) {
        this.tjly = tjly;
    }

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
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
