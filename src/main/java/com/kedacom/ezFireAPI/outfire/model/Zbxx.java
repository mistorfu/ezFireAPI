package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.*;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Zbxx  装备信息 特种装备
 * @Date 2018/5/29 15:48
 * @Author zhaomeng
 */
@ApiModel(value = "装备信息(特种装备)",description = "装备信息(特种装备)对象")
public class Zbxx {
    @ApiModelProperty(value = "信息编号")
    private String xxbh;
    @ApiModelProperty(value = "装备编号")
    private String zbbh;
    @ApiModelProperty(value = "装备名称")
    private String zbmc;
    @ApiModelProperty(value = "装备类型")
    private InnerDxlbext zblx;
    @ApiModelProperty(value = "装备性能")
    private String zbxn;
    @ApiModelProperty(value = "规格型号")
    private String ggxh;
    @ApiModelProperty(value = "计量单位")
    private String jldw;
    @ApiModelProperty(value = "生产厂家")
    private String sccj;
    @ApiModelProperty(value = "售后服务单位")
    private String shfwdw;
    @ApiModelProperty(value = "所属资产编号")
    private String sszcbh;
    @ApiModelProperty(value = "存放单位")
    private String cfdw;
    @ApiModelProperty(value = "存放地点")
    private String cfdd;
    @ApiModelProperty(value = "装备总数")
    private Double zbzs;
    @ApiModelProperty(value = "库存数量")
    private Double kcsl;
    @ApiModelProperty(value = "领用数量")
    private Double lysl;
    @ApiModelProperty(value = "装载数量")
    private Double zzsl;
    @ApiModelProperty(value = "维修数量")
    private Double wxsl;
    @ApiModelProperty(value = "在途数量")
    private Double ztsl;
    @ApiModelProperty(value="是否装配 0：否 1：是")
    private String sfzp;
    @ApiModelProperty(value="是否用于训练 0：否 1：是")
    private String sfyyxl;
    @ApiModelProperty(value="是否支队跨区域增援 0：否 1：是")
    private String sfzhdkqyzy;
    @ApiModelProperty(value="是否总队跨区域怎管 0：否 1：是")
    private String sfzodkqyzy;
    @ApiModelProperty(value = "联系人员")
    private String lxry;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
    @ApiModelProperty(value = "经度")
    private Double jd;
    @ApiModelProperty(value = "纬度")
    private Double wd;
    @ApiModelProperty(value = "备注信息")
    private String bzxx;
    @ApiModelProperty(value = "所属消防队站")
    private InnerXfdz ssxfdz;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjgext szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value="记录状态 0：废弃 1：正常")
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

    public String getXxbh() {
        return xxbh;
    }

    public void setXxbh(String xxbh) {
        this.xxbh = xxbh;
    }

    public String getZbbh() {
        return zbbh;
    }

    public void setZbbh(String zbbh) {
        this.zbbh = zbbh;
    }

    public String getZbmc() {
        return zbmc;
    }

    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }

    public InnerDxlbext getZblx() {
        return zblx;
    }

    public void setZblx(InnerDxlbext zblx) {
        this.zblx = zblx;
    }

    public String getZbxn() {
        return zbxn;
    }

    public void setZbxn(String zbxn) {
        this.zbxn = zbxn;
    }

    public String getGgxh() {
        return ggxh;
    }

    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getSccj() {
        return sccj;
    }

    public void setSccj(String sccj) {
        this.sccj = sccj;
    }

    public String getShfwdw() {
        return shfwdw;
    }

    public void setShfwdw(String shfwdw) {
        this.shfwdw = shfwdw;
    }

    public String getSszcbh() {
        return sszcbh;
    }

    public void setSszcbh(String sszcbh) {
        this.sszcbh = sszcbh;
    }

    public String getCfdw() {
        return cfdw;
    }

    public void setCfdw(String cfdw) {
        this.cfdw = cfdw;
    }

    public String getCfdd() {
        return cfdd;
    }

    public void setCfdd(String cfdd) {
        this.cfdd = cfdd;
    }

    public Double getZbzs() {
        return zbzs;
    }

    public void setZbzs(Double zbzs) {
        this.zbzs = zbzs;
    }

    public Double getKcsl() {
        return kcsl;
    }

    public void setKcsl(Double kcsl) {
        this.kcsl = kcsl;
    }

    public Double getLysl() {
        return lysl;
    }

    public void setLysl(Double lysl) {
        this.lysl = lysl;
    }

    public Double getZzsl() {
        return zzsl;
    }

    public void setZzsl(Double zzsl) {
        this.zzsl = zzsl;
    }

    public Double getWxsl() {
        return wxsl;
    }

    public void setWxsl(Double wxsl) {
        this.wxsl = wxsl;
    }

    public Double getZtsl() {
        return ztsl;
    }

    public void setZtsl(Double ztsl) {
        this.ztsl = ztsl;
    }

    public String getSfzp() {
        return sfzp;
    }

    public void setSfzp(String sfzp) {
        this.sfzp = sfzp;
    }

    public String getSfyyxl() {
        return sfyyxl;
    }

    public void setSfyyxl(String sfyyxl) {
        this.sfyyxl = sfyyxl;
    }

    public String getSfzhdkqyzy() {
        return sfzhdkqyzy;
    }

    public void setSfzhdkqyzy(String sfzhdkqyzy) {
        this.sfzhdkqyzy = sfzhdkqyzy;
    }

    public String getSfzodkqyzy() {
        return sfzodkqyzy;
    }

    public void setSfzodkqyzy(String sfzodkqyzy) {
        this.sfzodkqyzy = sfzodkqyzy;
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

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
    }

    public InnerXfdz getSsxfdz() {
        return ssxfdz;
    }

    public void setSsxfdz(InnerXfdz ssxfdz) {
        this.ssxfdz = ssxfdz;
    }

    public InnerXfjgext getSzdxfjg() {
        return szdxfjg;
    }

    public void setSzdxfjg(InnerXfjgext szdxfjg) {
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

    public InnerShape getShape() {
        return shape;
    }

    public void setShape(InnerShape shape) {
        this.shape = shape;
    }
}