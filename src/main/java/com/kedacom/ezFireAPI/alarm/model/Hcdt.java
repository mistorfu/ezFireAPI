package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @program: ezFireAPI
 * @description: 火场动态
 * @author: wangjinbo
 * @create: 2018-05-28 15:44
 */
@ApiModel(value="火场动态",description="火场动态对象")
public class Hcdt {
    @ApiModelProperty(value="灾情编号")
    private String zqbh;        //灾情编号
    @ApiModelProperty(value="信息编号")
    private String xxbh;        //信息编号
    @ApiModelProperty(value="信息主题")
    private String xxzt;        //信息主题
    @ApiModelProperty(value="信息类型")
    private String xxlx;        //信息类型
    @ApiModelProperty(value="信息内容")
    private String xxnr;        //信息内容
    @ApiModelProperty(value="文件资料")
    private String wjzl;        //文件资料
    @ApiModelProperty(value="发送人员")
    private String fsry;        //发送人员
    @ApiModelProperty(value="发送时间")
    private String fssj;        //发送时间
    @ApiModelProperty(value="联系电话")
    private String lxdh;        //联系电话
    @ApiModelProperty(value="经度")
    private double jd;          //经度
    @ApiModelProperty(value="纬度")
    private double wd;          //纬度
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
    @ApiModelProperty(value="元素形状")
    private InnerShape shape;   //元素形状

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getXxbh() {
        return xxbh;
    }

    public void setXxbh(String xxbh) {
        this.xxbh = xxbh;
    }

    public String getXxzt() {
        return xxzt;
    }

    public void setXxzt(String xxzt) {
        this.xxzt = xxzt;
    }

    public String getXxlx() {
        return xxlx;
    }

    public void setXxlx(String xxlx) {
        this.xxlx = xxlx;
    }

    public String getXxnr() {
        return xxnr;
    }

    public void setXxnr(String xxnr) {
        this.xxnr = xxnr;
    }

    public String getWjzl() {
        return wjzl;
    }

    public void setWjzl(String wjzl) {
        this.wjzl = wjzl;
    }

    public String getFsry() {
        return fsry;
    }

    public void setFsry(String fsry) {
        this.fsry = fsry;
    }

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
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
