package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @program: ezFireAPI
 * @description: 现场信息
 * @author: wangjinbo
 * @create: 2018-05-28 15:42
 */
@ApiModel(value="现场信息",description="现场信息对象")
public class Xcxx {
    @ApiModelProperty(value="灾情编号",name="zqbh",example="123")
    private String zqbh;        //灾情编号
    @ApiModelProperty(value="信息编号")
    private String xxbh;        //信息编号
    @ApiModelProperty(value="到场人数")
    private Integer dcrs;       //到场人数
    @ApiModelProperty(value="被困人数")
    private Integer bkrs;       //被困人数
    @ApiModelProperty(value="群众受伤人数")
    private Integer qzssrs;     //群众受伤人数
    @ApiModelProperty(value="群众死亡人数")
    private Integer qzswrs;     //群众死亡人数
    @ApiModelProperty(value="群众失踪人数")
    private Integer qzszrs;     //群众失踪人数
    @ApiModelProperty(value="部队受伤人数")
    private Integer bdssrs;     //部队受伤人数
    @ApiModelProperty(value="部队死亡人数")
    private Integer bdswrs;     //部队死亡人数
    @ApiModelProperty(value="部队失踪人数")
    private Integer bdszrs;     //部队失踪人数
    @ApiModelProperty(value="火势情况")
    private String hsqk;        //火势情况
    @ApiModelProperty(value="燃烧物质")
    private String rswz;        //燃烧物质
    @ApiModelProperty(value="燃烧面积")
    private double rsmj;        //燃烧面积
    @ApiModelProperty(value="烟雾情况")
    private String ywqk;        //烟雾情况
    @ApiModelProperty(value="天气情况")
    private String tqqk;        //天气情况
    @ApiModelProperty(value="相对湿度")
    private double xdsd;        //相对湿度
    @ApiModelProperty(value="火场温度")
    private double hcwd;        //火场温度
    @ApiModelProperty(value="气温")
    private double qw;          //气温
    @ApiModelProperty(value="风向")
    private String fx;          //风向
    @ApiModelProperty(value="现场描述")
    private String xcms;        //现场描述
    @ApiModelProperty(value="指挥人员")
    private String zhry;        //指挥人员
    @ApiModelProperty(value="指挥人员")
    private String sjly;        //指挥人员
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

    public String getXxbh() {
        return xxbh;
    }

    public void setXxbh(String xxbh) {
        this.xxbh = xxbh;
    }

    public Integer getDcrs() {
        return dcrs;
    }

    public void setDcrs(Integer dcrs) {
        this.dcrs = dcrs;
    }

    public Integer getBkrs() {
        return bkrs;
    }

    public void setBkrs(Integer bkrs) {
        this.bkrs = bkrs;
    }

    public Integer getQzssrs() {
        return qzssrs;
    }

    public void setQzssrs(Integer qzssrs) {
        this.qzssrs = qzssrs;
    }

    public Integer getQzswrs() {
        return qzswrs;
    }

    public void setQzswrs(Integer qzswrs) {
        this.qzswrs = qzswrs;
    }

    public Integer getQzszrs() {
        return qzszrs;
    }

    public void setQzszrs(Integer qzszrs) {
        this.qzszrs = qzszrs;
    }

    public Integer getBdssrs() {
        return bdssrs;
    }

    public void setBdssrs(Integer bdssrs) {
        this.bdssrs = bdssrs;
    }

    public Integer getBdswrs() {
        return bdswrs;
    }

    public void setBdswrs(Integer bdswrs) {
        this.bdswrs = bdswrs;
    }

    public Integer getBdszrs() {
        return bdszrs;
    }

    public void setBdszrs(Integer bdszrs) {
        this.bdszrs = bdszrs;
    }

    public String getHsqk() {
        return hsqk;
    }

    public void setHsqk(String hsqk) {
        this.hsqk = hsqk;
    }

    public String getRswz() {
        return rswz;
    }

    public void setRswz(String rswz) {
        this.rswz = rswz;
    }

    public double getRsmj() {
        return rsmj;
    }

    public void setRsmj(double rsmj) {
        this.rsmj = rsmj;
    }

    public String getYwqk() {
        return ywqk;
    }

    public void setYwqk(String ywqk) {
        this.ywqk = ywqk;
    }

    public String getTqqk() {
        return tqqk;
    }

    public void setTqqk(String tqqk) {
        this.tqqk = tqqk;
    }

    public double getXdsd() {
        return xdsd;
    }

    public void setXdsd(double xdsd) {
        this.xdsd = xdsd;
    }

    public double getHcwd() {
        return hcwd;
    }

    public void setHcwd(double hcwd) {
        this.hcwd = hcwd;
    }

    public double getQw() {
        return qw;
    }

    public void setQw(double qw) {
        this.qw = qw;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getXcms() {
        return xcms;
    }

    public void setXcms(String xcms) {
        this.xcms = xcms;
    }

    public String getZhry() {
        return zhry;
    }

    public void setZhry(String zhry) {
        this.zhry = zhry;
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
