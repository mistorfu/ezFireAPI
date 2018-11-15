package com.kedacom.ezFireAPI.ez.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by fudapeng on 2018/8/28.
 */
@ApiModel(value = "行政区域",description = "行政区域对象")
public class Xzqy {
    @ApiModelProperty(value = "行政编码")
    private String xzbm;
    @ApiModelProperty(value = "行政名称")
    private String xzmc;
    @ApiModelProperty(value = "行政缩写")
    private String xzsx;
    @ApiModelProperty(value = "行政简称")
    private String xzjc;
    @ApiModelProperty(value = "行政级别")
    private Integer xzjb;
    @ApiModelProperty(value = "显示级别")
    private Integer xsjb;
    @ApiModelProperty(value = "显示顺序")
    private Integer xssx;
    @ApiModelProperty(value = "行政父编码")
    private String xzfbm;
    @ApiModelProperty(value = "行政内部编码")
    private String xznbbm;
    @ApiModelProperty(value = "中心坐标X")
    private Double xcenter;
    @ApiModelProperty(value = "中心坐标Y")
    private Double ycenter;
    @ApiModelProperty(value = "最小坐标X")
    private Double xmin;
    @ApiModelProperty(value = "最大坐标X")
    private Double xmax;
    @ApiModelProperty(value = "最小坐标Y")
    private Double ymin;
    @ApiModelProperty(value = "最大坐标Y")
    private Double ymax;
    @ApiModelProperty(value = "GEO数据集")
    private Object esrigeo;
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

    public String getXzbm() {
        return xzbm;
    }

    public void setXzbm(String xzbm) {
        this.xzbm = xzbm;
    }

    public String getXzmc() {
        return xzmc;
    }

    public void setXzmc(String xzmc) {
        this.xzmc = xzmc;
    }

    public String getXzsx() {
        return xzsx;
    }

    public void setXzsx(String xzsx) {
        this.xzsx = xzsx;
    }

    public String getXzjc() {
        return xzjc;
    }

    public void setXzjc(String xzjc) {
        this.xzjc = xzjc;
    }

    public Integer getXzjb() {
        return xzjb;
    }

    public void setXzjb(Integer xzjb) {
        this.xzjb = xzjb;
    }

    public Integer getXsjb() {
        return xsjb;
    }

    public void setXsjb(Integer xsjb) {
        this.xsjb = xsjb;
    }

    public Integer getXssx() {
        return xssx;
    }

    public void setXssx(Integer xssx) {
        this.xssx = xssx;
    }

    public String getXzfbm() {
        return xzfbm;
    }

    public void setXzfbm(String xzfbm) {
        this.xzfbm = xzfbm;
    }

    public String getXznbbm() {
        return xznbbm;
    }

    public void setXznbbm(String xznbbm) {
        this.xznbbm = xznbbm;
    }

    public Double getXcenter() {
        return xcenter;
    }

    public void setXcenter(Double xcenter) {
        this.xcenter = xcenter;
    }

    public Double getYcenter() {
        return ycenter;
    }

    public void setYcenter(Double ycenter) {
        this.ycenter = ycenter;
    }

    public Double getXmin() {
        return xmin;
    }

    public void setXmin(Double xmin) {
        this.xmin = xmin;
    }

    public Double getXmax() {
        return xmax;
    }

    public void setXmax(Double xmax) {
        this.xmax = xmax;
    }

    public Double getYmin() {
        return ymin;
    }

    public void setYmin(Double ymin) {
        this.ymin = ymin;
    }

    public Double getYmax() {
        return ymax;
    }

    public void setYmax(Double ymax) {
        this.ymax = ymax;
    }

    public Object getEsrigeo() {
        return esrigeo;
    }

    public void setEsrigeo(Object esrigeo) {
        this.esrigeo = esrigeo;
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