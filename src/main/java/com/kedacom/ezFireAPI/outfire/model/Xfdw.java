package com.kedacom.ezFireAPI.outfire.model;

import java.util.List;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.basic.model.InnerSjzl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName Xfdw 消防单位
 * Created by fudapeng on 2018/5/25.
 */
@ApiModel(value = "消防单位",description = "消防单位对象")
public class Xfdw {
    @ApiModelProperty(value = "单位编号")
    private String dwbh;
    @ApiModelProperty(value = "单位名称")
    private String dwmc;
    @ApiModelProperty(value = "单位缩写")
    private String dwsx;
    @ApiModelProperty(value = "单位级别 0: 部局 1: 总队 2: 支队 3: 大队 4: 中队", example = "1")
    private String dwjb;
    @ApiModelProperty(value = "单位类别")
    private InnerDxlb dwlb;
    @ApiModelProperty(value = "单位地址")
    private String dwdz;
    @ApiModelProperty(value = "单位描述")
    private String dwms;
    @ApiModelProperty(value = "隶属关系 父级单位编号")
    private String lsgx;
    @ApiModelProperty(value = "单位内部编码")
    private String dwnbbm;
    @ApiModelProperty(value = "联系人员")
    private String lxry;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
    @ApiModelProperty(value = "经度")
    private double jd;
    @ApiModelProperty(value = "纬度")
    private double wd;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "显示顺序")
    private Integer xssx;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "数据质量")
    private InnerSjzl sjzl;
    @ApiModelProperty(value = "数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value = "记录状态")
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

    public String getDwsx() {
        return dwsx;
    }

    public void setDwsx(String dwsx) {
        this.dwsx = dwsx;
    }

    public String getDwjb() {
        return dwjb;
    }

    public void setDwjb(String dwjb) {
        this.dwjb = dwjb;
    }

    public InnerDxlb getDwlb() {
        return dwlb;
    }

    public void setDwlb(InnerDxlb dwlb) {
        this.dwlb = dwlb;
    }

    public String getDwdz() {
        return dwdz;
    }

    public void setDwdz(String dwdz) {
        this.dwdz = dwdz;
    }

    public String getDwms() {
        return dwms;
    }

    public void setDwms(String dwms) {
        this.dwms = dwms;
    }

    public String getLsgx() {
        return lsgx;
    }

    public void setLsgx(String lsgx) {
        this.lsgx = lsgx;
    }

    public String getDwnbbm() {
        return dwnbbm;
    }

    public void setDwnbbm(String dwnbbm) {
        this.dwnbbm = dwnbbm;
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

    public InnerSjzl getSjzl() {
        return sjzl;
    }

    public void setSjzl(InnerSjzl sjzl) {
        this.sjzl = sjzl;
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

    public Integer getXssx() {
        return xssx;
    }

    public void setXssx(Integer xssx) {
        this.xssx = xssx;
    }
}
