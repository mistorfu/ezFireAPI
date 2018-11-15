package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Clxx 车辆信息
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="车辆信息",description="车辆信息对象")
public class Clxx {
    @ApiModelProperty(value="车辆编号")
    private String clbh;
    @ApiModelProperty(value="车辆名称")
    private String clmc;
    @ApiModelProperty(value="车牌号码")
    private String cphm;
    @ApiModelProperty(value="车辆类型")
    private InnerDxlbext cllx;
    @ApiModelProperty(value="车辆状态")
    private InnerDxlbext clzt;
    @ApiModelProperty(value="车架号")
    private String cjh;
    @ApiModelProperty(value="发动机号")
    private String fdjh;
    @ApiModelProperty(value="GPS编号")
    private String gpsid;
    @ApiModelProperty(value="SIM卡号")
    private String simid;
    @ApiModelProperty(value="定位类型")
    private InnerDxlb dwlx;
    @ApiModelProperty(value="定位来源")
    private InnerDxlb dwly;
    @ApiModelProperty(value="规格型号")
    private String ggxh;
    @ApiModelProperty(value="装载水容量")
    private double zzsrl;
    @ApiModelProperty(value="装载泡沫量")
    private double zzpml;
    @ApiModelProperty(value="生产厂家")
    private String sccj;
    @ApiModelProperty(value="售后服务单位")
    private String shfwdw;
    @ApiModelProperty(value="出厂日期 格式：yyyy-MM-dd")
    private String ccrq;
    @ApiModelProperty(value="装备日期 格式：yyyy-MM-dd")
    private String zbrq;
    @ApiModelProperty(value="报废日期 格式：yyyy-MM-dd")
    private String bfrq;
    @ApiModelProperty(value="是否支队跨区域增援 0：否 1：是")
    private String sfzhdkqyzy;
    @ApiModelProperty(value="是否总队跨区域增援 0：否 1：是")
    private String sfzodkqyzy;
    @ApiModelProperty(value="联系人员")
    private String lxry;
    @ApiModelProperty(value="联系电话")
    private String lxdh;
    @ApiModelProperty(value="所属消防队站")
    private InnerXfdz ssxfdz;
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjgext szdxfjg;
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value="数据来源")
    private String sjly;
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;
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

    public String getClbh() {
        return clbh;
    }

    public void setClbh(String clbh) {
        this.clbh = clbh;
    }

    public String getClmc() {
        return clmc;
    }

    public void setClmc(String clmc) {
        this.clmc = clmc;
    }

    public String getCphm() {
        return cphm;
    }

    public void setCphm(String cphm) {
        this.cphm = cphm;
    }

    public InnerDxlbext getCllx() {
        return cllx;
    }

    public void setCllx(InnerDxlbext cllx) {
        this.cllx = cllx;
    }

    public InnerDxlbext getClzt() {
        return clzt;
    }

    public void setClzt(InnerDxlbext clzt) {
        this.clzt = clzt;
    }

    public String getCjh() {
        return cjh;
    }

    public void setCjh(String cjh) {
        this.cjh = cjh;
    }

    public String getFdjh() {
        return fdjh;
    }

    public void setFdjh(String fdjh) {
        this.fdjh = fdjh;
    }

    public String getGpsid() {
        return gpsid;
    }

    public void setGpsid(String gpsid) {
        this.gpsid = gpsid;
    }

    public String getSimid() {
        return simid;
    }

    public void setSimid(String simid) {
        this.simid = simid;
    }

    public InnerDxlb getDwlx() {
        return dwlx;
    }

    public void setDwlx(InnerDxlb dwlx) {
        this.dwlx = dwlx;
    }

    public InnerDxlb getDwly() {
        return dwly;
    }

    public void setDwly(InnerDxlb dwly) {
        this.dwly = dwly;
    }

    public String getGgxh() {
        return ggxh;
    }

    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }

    public double getZzsrl() {
        return zzsrl;
    }

    public void setZzsrl(double zzsrl) {
        this.zzsrl = zzsrl;
    }

    public double getZzpml() {
        return zzpml;
    }

    public void setZzpml(double zzpml) {
        this.zzpml = zzpml;
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

    public String getCcrq() {
        return ccrq;
    }

    public void setCcrq(String ccrq) {
        this.ccrq = ccrq;
    }

    public String getZbrq() {
        return zbrq;
    }

    public void setZbrq(String zbrq) {
        this.zbrq = zbrq;
    }

    public String getBfrq() {
        return bfrq;
    }

    public void setBfrq(String bfrq) {
        this.bfrq = bfrq;
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
}
