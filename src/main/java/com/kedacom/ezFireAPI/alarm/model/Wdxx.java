package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjgext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @program: ezFireAPI
 * @description: 文电信息
 * @author: wangjinbo
 * @create: 2018-05-28 15:43
 */
@ApiModel(value="文电信息",description="文电信息对象")
public class Wdxx {
    @ApiModelProperty(value="灾情编号",name="zqbh",example="123")
    private String zqbh;        //灾情编号
    @ApiModelProperty(value="文电编号")
    private String wdbh;        //文电编号
    @ApiModelProperty(value="文电主题")
    private String wdzt;        //文电主题
    @ApiModelProperty(value="文电内容")
    private String wdnr;        //文电内容
    @ApiModelProperty(value="文电附件")
    private String wdfj;        //文电附件
    @ApiModelProperty(value="发送人员")
    private String fsry;        //发送人员
    @ApiModelProperty(value="发送单位")
    private String fsdw;        //发送单位
    @ApiModelProperty(value="发送机构")
    private InnerXfjgext fsjg;     //发送机构
    @ApiModelProperty(value="发送时间")
    private String fssj;        //发送时间
    @ApiModelProperty(value="接收人员")
    private String jsry;        //接收人员
    @ApiModelProperty(value="接收单位")
    private String jsdw;        //接收单位
    @ApiModelProperty(value="接收机构")
    private InnerXfjgext jsjg;     //接收机构
    @ApiModelProperty(value="接收时间")
    private String jssj;        //接收时间
    @ApiModelProperty(value="数据来源")
    private String sjly;        //数据来源
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;     //数据监测
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;  //检索内容
    @ApiModelProperty(value="记录状态")
    private String jlzt;        //记录状态
    @ApiModelProperty(value="入库人员")
    private String rkry;        //入库人员
    @ApiModelProperty(value="入库时间")
    private String rksj;        //入库时间
    @ApiModelProperty(value="更新时间")
    private String gxry;        //更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj;        //更新时间

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getWdbh() {
        return wdbh;
    }

    public void setWdbh(String wdbh) {
        this.wdbh = wdbh;
    }

    public String getWdzt() {
        return wdzt;
    }

    public void setWdzt(String wdzt) {
        this.wdzt = wdzt;
    }

    public String getWdnr() {
        return wdnr;
    }

    public void setWdnr(String wdnr) {
        this.wdnr = wdnr;
    }

    public String getWdfj() {
        return wdfj;
    }

    public void setWdfj(String wdfj) {
        this.wdfj = wdfj;
    }

    public String getFsry() {
        return fsry;
    }

    public void setFsry(String fsry) {
        this.fsry = fsry;
    }

    public String getFsdw() {
        return fsdw;
    }

    public void setFsdw(String fsdw) {
        this.fsdw = fsdw;
    }

    public InnerXfjgext getFsjg() {
        return fsjg;
    }

    public void setFsjg(InnerXfjgext fsjg) {
        this.fsjg = fsjg;
    }

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getJsry() {
        return jsry;
    }

    public void setJsry(String jsry) {
        this.jsry = jsry;
    }

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public InnerXfjgext getJsjg() {
        return jsjg;
    }

    public void setJsjg(InnerXfjgext jsjg) {
        this.jsjg = jsjg;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
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
