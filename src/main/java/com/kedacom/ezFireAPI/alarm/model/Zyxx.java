package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlb;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjgext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @program: ezFireAPI
 * @description: 增员信息
 * @author: wangjinbo
 * @create: 2018-05-28 15:43
 */
@ApiModel(value="增员信息",description="增员信息对象")
public class Zyxx {
    @ApiModelProperty(value="灾情编号",name="zqbh",example="123")
    private String zqbh;        //灾情编号
    @ApiModelProperty(value="请求编号")
    private String qqbh;        //请求编号
    @ApiModelProperty(value="请求单位")
    private String qqdw;        //请求单位
    @ApiModelProperty(value="请求机构")
    private InnerXfjgext qqjg;     //请求机构
    @ApiModelProperty(value="请求类型")
    private InnerDxlb qqlx;     //请求类型
    @ApiModelProperty(value="请求时间")
    private String qqsj;        //请求时间
    @ApiModelProperty(value="请求事由")
    private String qqsy;        //请求事由
    @ApiModelProperty(value="接收单位")
    private String jsdw;        //接收单位
    @ApiModelProperty(value="接收机构")
    private InnerXfjgext jsjg;     //接收机构
    @ApiModelProperty(value="接应地点")
    private String jydd;        //接应地点
    @ApiModelProperty(value="接应时间")
    private String jysj;        //接应时间
    @ApiModelProperty(value="灾情编号")
    private String lxry;        //联系人员
    @ApiModelProperty(value="联系电话")
    private String lxdh;        //联系电话
    @ApiModelProperty(value="请求车辆")
    private InnerCl qqcl;       //请求车辆
    @ApiModelProperty(value="请求装备")
    private InnerZb qqzb;       //请求装备
    @ApiModelProperty(value="请求概述")
    private String qqgs;        //请求概述
    @ApiModelProperty(value="是否处理")
    private String sfcl;        //是否处理
    @ApiModelProperty(value="信息类型")
    private String xxlx;        //信息类型
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
    @ApiModelProperty(value="更新人员")
    private String gxry;        //更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj;        //更新时间

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getQqbh() {
        return qqbh;
    }

    public void setQqbh(String qqbh) {
        this.qqbh = qqbh;
    }

    public String getQqdw() {
        return qqdw;
    }

    public void setQqdw(String qqdw) {
        this.qqdw = qqdw;
    }

    public InnerXfjgext getQqjg() {
        return qqjg;
    }

    public void setQqjg(InnerXfjgext qqjg) {
        this.qqjg = qqjg;
    }

    public InnerDxlb getQqlx() {
        return qqlx;
    }

    public void setQqlx(InnerDxlb qqlx) {
        this.qqlx = qqlx;
    }

    public String getQqsj() {
        return qqsj;
    }

    public void setQqsj(String qqsj) {
        this.qqsj = qqsj;
    }

    public String getQqsy() {
        return qqsy;
    }

    public void setQqsy(String qqsy) {
        this.qqsy = qqsy;
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

    public String getJydd() {
        return jydd;
    }

    public void setJydd(String jydd) {
        this.jydd = jydd;
    }

    public String getJysj() {
        return jysj;
    }

    public void setJysj(String jysj) {
        this.jysj = jysj;
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

    public InnerCl getQqcl() {
        return qqcl;
    }

    public void setQqcl(InnerCl qqcl) {
        this.qqcl = qqcl;
    }

    public InnerZb getQqzb() {
        return qqzb;
    }

    public void setQqzb(InnerZb qqzb) {
        this.qqzb = qqzb;
    }

    public String getQqgs() {
        return qqgs;
    }

    public void setQqgs(String qqgs) {
        this.qqgs = qqgs;
    }

    public String getSfcl() {
        return sfcl;
    }

    public void setSfcl(String sfcl) {
        this.sfcl = sfcl;
    }

    public String getXxlx() {
        return xxlx;
    }

    public void setXxlx(String xxlx) {
        this.xxlx = xxlx;
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
