package com.kedacom.ezFireAPI.ez.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by fudapeng on 2018/8/28.
 */
@ApiModel(value = "交通站点",description = "交通站点对象")
public class Station {
    @ApiModelProperty(value = "站点编号")
    private String zdbh;
    @ApiModelProperty(value = "站点代号")
    private String zddh;
    @ApiModelProperty(value = "站点名称")
    private String zdmc;
    @ApiModelProperty(value = "站点全称")
    private String zdqc;
    @ApiModelProperty(value = "站点地址")
    private String zddz;
    @ApiModelProperty(value = "站点分类 1：飞机场 2：火车站")
    private String zdfl;
    @ApiModelProperty(value = "站点类型 0：虚拟站点 1：实际站点")
    private String zdlx;
    @ApiModelProperty(value = "站点首字母")
    private String zdszm;
    @ApiModelProperty(value = "经度")
    private Double jd;
    @ApiModelProperty(value = "纬度")
    private Double wd;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "显示顺序")
    private Integer xssx;
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
    @ApiModelProperty(value = "元素形状")
    private InnerShape shape;

    public String getZdbh() {
        return zdbh;
    }

    public void setZdbh(String zdbh) {
        this.zdbh = zdbh;
    }

    public String getZddh() {
        return zddh;
    }

    public void setZddh(String zddh) {
        this.zddh = zddh;
    }

    public String getZdmc() {
        return zdmc;
    }

    public void setZdmc(String zdmc) {
        this.zdmc = zdmc;
    }

    public String getZdqc() {
        return zdqc;
    }

    public void setZdqc(String zdqc) {
        this.zdqc = zdqc;
    }

    public String getZddz() {
        return zddz;
    }

    public void setZddz(String zddz) {
        this.zddz = zddz;
    }

    public String getZdfl() {
        return zdfl;
    }

    public void setZdfl(String zdfl) {
        this.zdfl = zdfl;
    }

    public String getZdlx() {
        return zdlx;
    }

    public void setZdlx(String zdlx) {
        this.zdlx = zdlx;
    }

    public String getZdszm() {
        return zdszm;
    }

    public void setZdszm(String zdszm) {
        this.zdszm = zdszm;
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

    public InnerXzqh getSzdxzqh() {
        return szdxzqh;
    }

    public void setSzdxzqh(InnerXzqh szdxzqh) {
        this.szdxzqh = szdxzqh;
    }

    public Integer getXssx() {
        return xssx;
    }

    public void setXssx(Integer xssx) {
        this.xssx = xssx;
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

    public InnerShape getShape() {
        return shape;
    }

    public void setShape(InnerShape shape) {
        this.shape = shape;
    }
}