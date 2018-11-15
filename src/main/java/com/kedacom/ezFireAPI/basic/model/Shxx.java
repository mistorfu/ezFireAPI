package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: 石化信息
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@ApiModel(value="石化信息",description="石化信息对象")
public class Shxx {
    @ApiModelProperty(value="单位编号")
    private String dwbh;

    @ApiModelProperty(value="单位名称")
    private String dwmc;

    @ApiModelProperty(value="单位地址")
    private String dwdz;

    @ApiModelProperty(value="单位概述")
    private String dwgs;

    @ApiModelProperty(value="单位概况图")
    private String dwgkt;

    @ApiModelProperty(value="单位性质")
    private InnerDxlbext dwxz;

    @ApiModelProperty(value="单位类别")
    private InnerDxlb dwlb;

    @ApiModelProperty(value="单位成立时间 格式：yyyy-MM-dd")
    private String dwclsj;

    @ApiModelProperty(value="防火单位编号")
    private String fhdwbh;

    @ApiModelProperty(value="灭火单位编号")
    private String mhdwbh;

    @ApiModelProperty(value="经度")
    private double jd;

    @ApiModelProperty(value="纬度")
    private double wd;

    @ApiModelProperty(value="生产工艺")
    private String scgy;

    @ApiModelProperty(value="主要原料")
    private String zyyl;

    @ApiModelProperty(value="中间成品")
    private String zjcp;

    @ApiModelProperty(value="主要产品")
    private String zycp;

    @ApiModelProperty(value="储存罐数量")
    private int ccgsl;

    @ApiModelProperty(value="储存罐信息")
    private InnerCcgxx ccgxx;

    @ApiModelProperty(value="最大生产量")
    private double zdscl;

    @ApiModelProperty(value="最大存储量")
    private double zdccl;

    @ApiModelProperty(value="主要危害")
    private InnerZywh zywh;

    @ApiModelProperty(value="内部专家")
    private InnerNbzj nbzj;

    @ApiModelProperty(value="负责人员")
    private List<InnerFzry> fzry;

    @ApiModelProperty(value="图片信息")
    private InnerTpxx tpxx;

    @ApiModelProperty(value="文本预案")
    private List<InnerWbya> wbya;

    @ApiModelProperty(value="结构化预案")
    private List<InnerJghya> jghya;

    @ApiModelProperty(value="数字化预案")
    private List<InnerSzhya> szhya;

    @ApiModelProperty(value="安全注意事项")
    private String aqzysx;

    @ApiModelProperty(value="周边毗邻情况")
    private InnerZbplqk zbplqk;

    @ApiModelProperty(value="周边毗邻概述")
    private String zbplgs;

    @ApiModelProperty(value="灭火演练情况")
    private InnerMhylqk mhylqk;

    @ApiModelProperty(value="灭火演练概述")
    private String mhylgs;

    @ApiModelProperty(value="灭火逃生疏散预案")
    private InnerMhtsya mhtsya;

    @ApiModelProperty(value="消防设施情况")
    private InnerXfssqk xfssqk;

    @ApiModelProperty(value="消防设施概述")
    private String xfssgs;

    @ApiModelProperty(value="执法监督情况")
    private InnerZfjdqk zfjdqk;

    @ApiModelProperty(value="执法监督概述")
    private String zfjdgs;

    @ApiModelProperty(value="历史灾情情况")
    private InnerLszqqk lszqqk;

    @ApiModelProperty(value="历史灾情概述")
    private String lszqgs;

    @ApiModelProperty(value="灾情处置对策")
    private InnerZqczdc zqczdc;

    @ApiModelProperty(value="灾情处置概述")
    private String zqczgs;

    @ApiModelProperty(value="消防队站")
    private InnerXfdz xfdz;

    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;

    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;

    @ApiModelProperty(value="数据来源")
    private String sjly;

    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;

    @ApiModelProperty(value="排序条件")
    private String pxtj;

    @ApiModelProperty(value="加载条件")
    private List<String> jztj;

    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;

    @ApiModelProperty(value="记录状态")
    private String jlzt;

    @ApiModelProperty(value="入库人员")
    private String rkry;

    @ApiModelProperty(value="入库时间 格式：yyyy-MM-dd HH:mm:ss")
    private String rksj;

    @ApiModelProperty(value="更新人员")
    private String gxry;

    @ApiModelProperty(value="更新时间 格式：yyyy-MM-dd HH:mm:ss")
    private String gxsj;

    @ApiModelProperty(value="元素形状")
    private InnerShape shape;

    @ApiModelProperty(value="元素形状")
    private InnerAllShape allshape;

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

    public String getDwdz() {
        return dwdz;
    }

    public void setDwdz(String dwdz) {
        this.dwdz = dwdz;
    }

    public String getDwgs() {
        return dwgs;
    }

    public void setDwgs(String dwgs) {
        this.dwgs = dwgs;
    }

    public String getDwgkt() {
        return dwgkt;
    }

    public void setDwgkt(String dwgkt) {
        this.dwgkt = dwgkt;
    }

    public InnerDxlbext getDwxz() {
        return dwxz;
    }

    public void setDwxz(InnerDxlbext dwxz) {
        this.dwxz = dwxz;
    }

    public InnerDxlb getDwlb() {
        return dwlb;
    }

    public void setDwlb(InnerDxlb dwlb) {
        this.dwlb = dwlb;
    }

    public String getDwclsj() {
        return dwclsj;
    }

    public void setDwclsj(String dwclsj) {
        this.dwclsj = dwclsj;
    }

    public String getFhdwbh() {
        return fhdwbh;
    }

    public void setFhdwbh(String fhdwbh) {
        this.fhdwbh = fhdwbh;
    }

    public String getMhdwbh() {
        return mhdwbh;
    }

    public void setMhdwbh(String mhdwbh) {
        this.mhdwbh = mhdwbh;
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

    public String getScgy() {
        return scgy;
    }

    public void setScgy(String scgy) {
        this.scgy = scgy;
    }

    public String getZyyl() {
        return zyyl;
    }

    public void setZyyl(String zyyl) {
        this.zyyl = zyyl;
    }

    public String getZjcp() {
        return zjcp;
    }

    public void setZjcp(String zjcp) {
        this.zjcp = zjcp;
    }

    public String getZycp() {
        return zycp;
    }

    public void setZycp(String zycp) {
        this.zycp = zycp;
    }

    public int getCcgsl() {
        return ccgsl;
    }

    public void setCcgsl(int ccgsl) {
        this.ccgsl = ccgsl;
    }

    public InnerCcgxx getCcgxx() {
        return ccgxx;
    }

    public void setCcgxx(InnerCcgxx ccgxx) {
        this.ccgxx = ccgxx;
    }

    public double getZdscl() {
        return zdscl;
    }

    public void setZdscl(double zdscl) {
        this.zdscl = zdscl;
    }

    public double getZdccl() {
        return zdccl;
    }

    public void setZdccl(double zdccl) {
        this.zdccl = zdccl;
    }

    public InnerZywh getZywh() {
        return zywh;
    }

    public void setZywh(InnerZywh zywh) {
        this.zywh = zywh;
    }

    public InnerNbzj getNbzj() {
        return nbzj;
    }

    public void setNbzj(InnerNbzj nbzj) {
        this.nbzj = nbzj;
    }

    public List<InnerFzry> getFzry() {
        return fzry;
    }

    public void setFzry(List<InnerFzry> fzry) {
        this.fzry = fzry;
    }

    public InnerTpxx getTpxx() {
        return tpxx;
    }

    public void setTpxx(InnerTpxx tpxx) {
        this.tpxx = tpxx;
    }

    public List<InnerWbya> getWbya() {
        return wbya;
    }

    public void setWbya(List<InnerWbya> wbya) {
        this.wbya = wbya;
    }

    public List<InnerJghya> getJghya() {
        return jghya;
    }

    public void setJghya(List<InnerJghya> jghya) {
        this.jghya = jghya;
    }

    public List<InnerSzhya> getSzhya() {
        return szhya;
    }

    public void setSzhya(List<InnerSzhya> szhya) {
        this.szhya = szhya;
    }

    public String getAqzysx() {
        return aqzysx;
    }

    public void setAqzysx(String aqzysx) {
        this.aqzysx = aqzysx;
    }

    public InnerZbplqk getZbplqk() {
        return zbplqk;
    }

    public void setZbplqk(InnerZbplqk zbplqk) {
        this.zbplqk = zbplqk;
    }

    public String getZbplgs() {
        return zbplgs;
    }

    public void setZbplgs(String zbplgs) {
        this.zbplgs = zbplgs;
    }

    public InnerMhylqk getMhylqk() {
        return mhylqk;
    }

    public void setMhylqk(InnerMhylqk mhylqk) {
        this.mhylqk = mhylqk;
    }

    public String getMhylgs() {
        return mhylgs;
    }

    public void setMhylgs(String mhylgs) {
        this.mhylgs = mhylgs;
    }

    public InnerMhtsya getMhtsya() {
        return mhtsya;
    }

    public void setMhtsya(InnerMhtsya mhtsya) {
        this.mhtsya = mhtsya;
    }

    public InnerXfssqk getXfssqk() {
        return xfssqk;
    }

    public void setXfssqk(InnerXfssqk xfssqk) {
        this.xfssqk = xfssqk;
    }

    public String getXfssgs() {
        return xfssgs;
    }

    public void setXfssgs(String xfssgs) {
        this.xfssgs = xfssgs;
    }

    public InnerZfjdqk getZfjdqk() {
        return zfjdqk;
    }

    public void setZfjdqk(InnerZfjdqk zfjdqk) {
        this.zfjdqk = zfjdqk;
    }

    public String getZfjdgs() {
        return zfjdgs;
    }

    public void setZfjdgs(String zfjdgs) {
        this.zfjdgs = zfjdgs;
    }

    public InnerLszqqk getLszqqk() {
        return lszqqk;
    }

    public void setLszqqk(InnerLszqqk lszqqk) {
        this.lszqqk = lszqqk;
    }

    public String getLszqgs() {
        return lszqgs;
    }

    public void setLszqgs(String lszqgs) {
        this.lszqgs = lszqgs;
    }

    public InnerZqczdc getZqczdc() {
        return zqczdc;
    }

    public void setZqczdc(InnerZqczdc zqczdc) {
        this.zqczdc = zqczdc;
    }

    public String getZqczgs() {
        return zqczgs;
    }

    public void setZqczgs(String zqczgs) {
        this.zqczgs = zqczgs;
    }

    public InnerXfdz getXfdz() {
        return xfdz;
    }

    public void setXfdz(InnerXfdz xfdz) {
        this.xfdz = xfdz;
    }

    public InnerXfjg getSzdxfjg() {
        return szdxfjg;
    }

    public void setSzdxfjg(InnerXfjg szdxfjg) {
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

    public String getPxtj() {
        return pxtj;
    }

    public void setPxtj(String pxtj) {
        this.pxtj = pxtj;
    }

    public List<String> getJztj() {
        return jztj;
    }

    public void setJztj(List<String> jztj) {
        this.jztj = jztj;
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

    public InnerAllShape getAllshape() {
        return allshape;
    }

    public void setAllshape(InnerAllShape allshape) {
        this.allshape = allshape;
    }
}
