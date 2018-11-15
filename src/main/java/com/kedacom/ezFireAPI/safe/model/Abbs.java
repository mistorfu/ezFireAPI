package com.kedacom.ezFireAPI.safe.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * create by liangliang on 2018/5/28
 * @ClassName Abbs 安保部署
 */
@ApiModel(value="安保部署",description="安保部署对象")
public class Abbs{
    @ApiModelProperty(value="活动编号",name="hdbh",example="abc")
    private String hdbh;
    @ApiModelProperty(value="部署编号",name="bsbh",example="xyz")
    private String bsbh;
    @ApiModelProperty(value="部署名称",name="bsmc",example="一号部署")
    private String bsmc;
    @ApiModelProperty(value="部署地点")
    private String bsdd;
    @ApiModelProperty(value="部署说明")
    private String bssm;
    @ApiModelProperty(value="部署概述")
    private String bsgs;
    @ApiModelProperty(value="部署概况图,图片url")
    private String bsgkt;
    @ApiModelProperty(value="配备车辆")
    private int pbcl;
    @ApiModelProperty(value="执勤车辆")
    private int zqcl;
    @ApiModelProperty(value="配备人数")
    private int pbrs;
    @ApiModelProperty(value="执勤人数")
    private int zqrs;
    @ApiModelProperty(value="联系人员")
    private List<InnerLxry> lxry;
    @ApiModelProperty(value="经度,精确度到小数点后6位")
    private Double jd;
    @ApiModelProperty(value="纬度,精确度到小数点后6位")
    private Double wd;
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value="显示顺序")
    private int xssx;
    @ApiModelProperty(value="数据来源")
    private String sjly;
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value="记录状态,0：废弃 1：正常",example = "1")
    private String jlzt;
    @ApiModelProperty(value="入库人员")
    private String rkry;
    @ApiModelProperty(value="入库时间,格式：yyyy-MM-dd HH:mm:ss",example = "2018-05-28 17:32:36")
    private String rksj;
    @ApiModelProperty(value="更新人员")
    private String gxry;
    @ApiModelProperty(value="更新时间,格式：yyyy-MM-dd HH:mm:ss",example = "2018-05-28 17:32:36")
    private String gxsj;
    @ApiModelProperty(value="元素形状")
    private InnerShape shape;

    public String getHdbh() {
        return hdbh;
    }

    public void setHdbh(String hdbh) {
        this.hdbh = hdbh;
    }

    public String getBsbh() {
        return bsbh;
    }

    public void setBsbh(String bsbh) {
        this.bsbh = bsbh;
    }

    public String getBsmc() {
        return bsmc;
    }

    public void setBsmc(String bsmc) {
        this.bsmc = bsmc;
    }

    public String getBsdd() {
        return bsdd;
    }

    public void setBsdd(String bsdd) {
        this.bsdd = bsdd;
    }

    public String getBssm() {
        return bssm;
    }

    public void setBssm(String bssm) {
        this.bssm = bssm;
    }

    public String getBsgs() {
        return bsgs;
    }

    public void setBsgs(String bsgs) {
        this.bsgs = bsgs;
    }

    public String getBsgkt() {
        return bsgkt;
    }

    public void setBsgkt(String bsgkt) {
        this.bsgkt = bsgkt;
    }

    public int getPbcl() {
        return pbcl;
    }

    public void setPbcl(int pbcl) {
        this.pbcl = pbcl;
    }

    public int getZqcl() {
        return zqcl;
    }

    public void setZqcl(int zqcl) {
        this.zqcl = zqcl;
    }

    public int getPbrs() {
        return pbrs;
    }

    public void setPbrs(int pbrs) {
        this.pbrs = pbrs;
    }

    public int getZqrs() {
        return zqrs;
    }

    public void setZqrs(int zqrs) {
        this.zqrs = zqrs;
    }

    public List<InnerLxry> getLxry() {
        return lxry;
    }

    public void setLxry(List<InnerLxry> lxry) {
        this.lxry = lxry;
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

    public InnerXfjg getSzdxfjg() {
        return szdxfjg;
    }

    public void setSzdxfjg(InnerXfjg szdxfjg) {
        this.szdxfjg = szdxfjg;
    }



    public int getXssx() {
        return xssx;
    }

    public void setXssx(int xssx) {
        this.xssx = xssx;
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

    public InnerXzqh getSzdxzqh() {
        return szdxzqh;
    }

    public void setSzdxzqh(InnerXzqh szdxzqh) {
        this.szdxzqh = szdxzqh;
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