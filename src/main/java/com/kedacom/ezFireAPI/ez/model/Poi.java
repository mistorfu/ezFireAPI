package com.kedacom.ezFireAPI.ez.model;

import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "社会兴趣点" , description = "社会兴趣点对象")
public class Poi {
    @ApiModelProperty(value = "兴趣点编号")
    private String xqdbh;
    @ApiModelProperty(value = "兴趣点名称")
    private String xqdmc;
    @ApiModelProperty(value = "兴趣点门址")
    private String xqdmz;
    @ApiModelProperty(value = "兴趣点详址")
    private String xqdxz;
    @ApiModelProperty(value = "兴趣点类型")
    private InnerDxlbext xqdlx;
    @ApiModelProperty(value = "兴趣点分级  0：未调查\n" +
            "1：客户关注的重要POI\n" +
            "2：政府类基础设施、金融机构、交通相关设施以及各行业连锁品牌\n" +
            "3：生活类基础设施、公交出行设施等居民关注度高的设施\n" +
            "4：居民关注度较低、使用频率较低设施\n" +
            "5：对居民影响较小、可替代性强的周边设施\n" +
            "6：规模较小、条件较差的POI，用户关注度不高的小门店\n" +
            "备注：存储具体的数值而非内容\n")
    private String xqdfj;
    @ApiModelProperty(value = "经度")
    private double jd;
    @ApiModelProperty(value = "纬度")
    private double wd;
    @ApiModelProperty(value = "联系人员")
    private String lxry;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
    @ApiModelProperty(value = "邮政编码")
    private String yzbm;
    @ApiModelProperty(value = "是否全天营业 0：否 1：是")
    private String sfqtyy;
    @ApiModelProperty(value = "所在道路名称")
    private String szdlmc;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "检索内容")
    private List jsnr;
    @ApiModelProperty(value = "匹配内容")
    private String ppnr;
    @ApiModelProperty(value="记录状态 0：废弃 1：正常")
    private String jlzt;
    @ApiModelProperty(value="入库人员")
    private String rkry;
    @ApiModelProperty(value="入库时间")
    private String rksj;
    @ApiModelProperty(value="更新人员")
    private String gxry;
    @ApiModelProperty(value="更新时间")
    private String gxsj;
    @ApiModelProperty(value="元素形状")
    private InnerShape shape;

    public String getXqdbh() {
        return xqdbh;
    }

    public void setXqdbh(String xqdbh) {
        this.xqdbh = xqdbh;
    }

    public String getXqdmc() {
        return xqdmc;
    }

    public void setXqdmc(String xqdmc) {
        this.xqdmc = xqdmc;
    }

    public String getXqdmz() {
        return xqdmz;
    }

    public void setXqdmz(String xqdmz) {
        this.xqdmz = xqdmz;
    }

    public String getXqdxz() {
        return xqdxz;
    }

    public void setXqdxz(String xqdxz) {
        this.xqdxz = xqdxz;
    }

    public InnerDxlbext getXqdlx() {
        return xqdlx;
    }

    public void setXqdlx(InnerDxlbext xqdlx) {
        this.xqdlx = xqdlx;
    }

    public String getXqdfj() {
        return xqdfj;
    }

    public void setXqdfj(String xqdfj) {
        this.xqdfj = xqdfj;
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

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    public String getSfqtyy() {
        return sfqtyy;
    }

    public void setSfqtyy(String sfqtyy) {
        this.sfqtyy = sfqtyy;
    }

    public String getSzdlmc() {
        return szdlmc;
    }

    public void setSzdlmc(String szdlmc) {
        this.szdlmc = szdlmc;
    }

    public InnerXzqh getSzdxzqh() {
        return szdxzqh;
    }

    public void setSzdxzqh(InnerXzqh szdxzqh) {
        this.szdxzqh = szdxzqh;
    }

    public List getJsnr() {
        return jsnr;
    }

    public void setJsnr(List jsnr) {
        this.jsnr = jsnr;
    }

    public String getPpnr() {
        return ppnr;
    }

    public void setPpnr(String ppnr) {
        this.ppnr = ppnr;
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
