package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Fhdw  防火单位  灭火单位
 * @Date 2018/5/25 10:43
 * @Author zhaomeng
 */
@ApiModel(value="防火单位(防火单位)",description="防火单位（灭火单位）对象")
public class Fhdw {
    @ApiModelProperty(value="单位编号",example="123")
    private String dwbh;
    @ApiModelProperty(value="单位名称")
    private String dwmc;
    @ApiModelProperty(value="单位地址")
    private String dwdz;
    @ApiModelProperty(value="单位类别")
    private InnerDxlb dwlb;
    @ApiModelProperty(value="单位属性")
    private List<InnerDxlbext> dwsx;
    @ApiModelProperty(value="单位概述")
    private String dwgs;
    @ApiModelProperty(value="单位概况图")
    private String dwgkt;
    @ApiModelProperty(value="火灾危害性")
    private InnerDxlb hzwhx;
    @ApiModelProperty(value="火灾隐患性")
    private InnerDxlb hzyhx;
    @ApiModelProperty(value="经度")
    private Double jd;
    @ApiModelProperty(value="纬度")
    private Double wd;
    @ApiModelProperty(value="单位成立时间 格式：yyyy-MM-dd")
    private String dwclsj;
    @ApiModelProperty(value="通过消防验收时间 格式：yyyy-MM-dd")
    private String tgxfyssj;
    @ApiModelProperty(value="主要危害")
    private List<InnerZywh> zywh;
    @ApiModelProperty(value="负责人员")
    private List<InnerFzry> fzry;
    @ApiModelProperty(value="分管等级")
    private InnerDxlb fgdj;
    @ApiModelProperty(value="图片信息")
    private List<InnerTpxx> tpxx;
    @ApiModelProperty(value="文本预案")
    private List<InnerWbya> wbya;
    @ApiModelProperty(value="结构化预案")
    private List<InnerJghya> jghya;
    @ApiModelProperty(value="数字化预案")
    private List<InnerJghya> szhya;
    @ApiModelProperty(value="内部建筑情况")
    private List<InnerNbjzqk> nbjzqk;
    @ApiModelProperty(value="内部建筑概述")
    private String nbjzgs;
    @ApiModelProperty(value="周边毗邻情况")
    private List<InnerZbplqk> zbplqk;
    @ApiModelProperty(value="周边毗邻概述")
    private String zbplgs;
    @ApiModelProperty(value="灭火演练情况")
    private List<InnerMhylqk> mhylqk;
    @ApiModelProperty(value="灭火演练概述")
    private String mhyags;
    @ApiModelProperty(value="灭火逃生疏散预案")
    private List<InnerMhtsya> mhtsya;
    @ApiModelProperty(value="消防设施情况")
    private List<InnerXfssqk> xfssqk;
    @ApiModelProperty(value="消防设施概述")
    private String xfssgs;
    @ApiModelProperty(value="执法监督情况")
    private List<InnerZfjdqk> zfjdqk;
    @ApiModelProperty(value="执法监督概述")
    private String zfjdgs;
    @ApiModelProperty(value="历史灾情情况")
    private List<InnerLszqqk> lszqqk;
    @ApiModelProperty(value="历史灾情概述")
    private String lszqgs;
    @ApiModelProperty(value="灾情处置对策")
    private List<InnerZqczdc> zqczdc;
    @ApiModelProperty(value="灾情处置概述")
    private String zqczgs;
    @ApiModelProperty(value="消防队站")
    private List<InnerXfdz> xfdz;
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value="数据来源")
    private String sjly;
    @ApiModelProperty(value="数据质量")
    private InnerSjzl sjzl;
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value="排序条件")
    private String pxtj;
    @ApiModelProperty(value="加载条件")
    private List<String> jztj;
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value="检索内容(名称)")
    private List<String> jsnr_mc;
    @ApiModelProperty(value="检索内容(地址)")
    private List<String> jsnr_dz;
    @ApiModelProperty(value="检索内容(区划)")
    private List<String> jsnr_qh;
    @ApiModelProperty(value="记录状态 0：废弃 1：正常")
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

    public InnerDxlb getDwlb() {
        return dwlb;
    }

    public void setDwlb(InnerDxlb dwlb) {
        this.dwlb = dwlb;
    }

    public List<InnerDxlbext> getDwsx() {
        return dwsx;
    }

    public void setDwsx(List<InnerDxlbext> dwsx) {
        this.dwsx = dwsx;
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

    public InnerDxlb getHzwhx() {
        return hzwhx;
    }

    public void setHzwhx(InnerDxlb hzwhx) {
        this.hzwhx = hzwhx;
    }

    public InnerDxlb getHzyhx() {
        return hzyhx;
    }

    public void setHzyhx(InnerDxlb hzyhx) {
        this.hzyhx = hzyhx;
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

    public String getDwclsj() {
        return dwclsj;
    }

    public void setDwclsj(String dwclsj) {
        this.dwclsj = dwclsj;
    }

    public String getTgxfyssj() {
        return tgxfyssj;
    }

    public void setTgxfyssj(String tgxfyssj) {
        this.tgxfyssj = tgxfyssj;
    }

    public List<InnerZywh> getZywh() {
        return zywh;
    }

    public void setZywh(List<InnerZywh> zywh) {
        this.zywh = zywh;
    }

    public List<InnerFzry> getFzry() {
        return fzry;
    }

    public void setFzry(List<InnerFzry> fzry) {
        this.fzry = fzry;
    }

    public InnerDxlb getFgdj() {
        return fgdj;
    }

    public void setFgdj(InnerDxlb fgdj) {
        this.fgdj = fgdj;
    }

    public List<InnerTpxx> getTpxx() {
        return tpxx;
    }

    public void setTpxx(List<InnerTpxx> tpxx) {
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

    public List<InnerJghya> getSzhya() {
        return szhya;
    }

    public void setSzhya(List<InnerJghya> szhya) {
        this.szhya = szhya;
    }

    public List<InnerNbjzqk> getNbjzqk() {
        return nbjzqk;
    }

    public void setNbjzqk(List<InnerNbjzqk> nbjzqk) {
        this.nbjzqk = nbjzqk;
    }

    public String getNbjzgs() {
        return nbjzgs;
    }

    public void setNbjzgs(String nbjzgs) {
        this.nbjzgs = nbjzgs;
    }

    public List<InnerZbplqk> getZbplqk() {
        return zbplqk;
    }

    public void setZbplqk(List<InnerZbplqk> zbplqk) {
        this.zbplqk = zbplqk;
    }

    public String getZbplgs() {
        return zbplgs;
    }

    public void setZbplgs(String zbplgs) {
        this.zbplgs = zbplgs;
    }

    public List<InnerMhylqk> getMhylqk() {
        return mhylqk;
    }

    public void setMhylqk(List<InnerMhylqk> mhylqk) {
        this.mhylqk = mhylqk;
    }

    public String getMhyags() {
        return mhyags;
    }

    public void setMhyags(String mhyags) {
        this.mhyags = mhyags;
    }

    public List<InnerMhtsya> getMhtsya() {
        return mhtsya;
    }

    public void setMhtsya(List<InnerMhtsya> mhtsya) {
        this.mhtsya = mhtsya;
    }

    public List<InnerXfssqk> getXfssqk() {
        return xfssqk;
    }

    public void setXfssqk(List<InnerXfssqk> xfssqk) {
        this.xfssqk = xfssqk;
    }

    public String getXfssgs() {
        return xfssgs;
    }

    public void setXfssgs(String xfssgs) {
        this.xfssgs = xfssgs;
    }

    public List<InnerZfjdqk> getZfjdqk() {
        return zfjdqk;
    }

    public void setZfjdqk(List<InnerZfjdqk> zfjdqk) {
        this.zfjdqk = zfjdqk;
    }

    public String getZfjdgs() {
        return zfjdgs;
    }

    public void setZfjdgs(String zfjdgs) {
        this.zfjdgs = zfjdgs;
    }

    public List<InnerLszqqk> getLszqqk() {
        return lszqqk;
    }

    public void setLszqqk(List<InnerLszqqk> lszqqk) {
        this.lszqqk = lszqqk;
    }

    public String getLszqgs() {
        return lszqgs;
    }

    public void setLszqgs(String lszqgs) {
        this.lszqgs = lszqgs;
    }

    public List<InnerZqczdc> getZqczdc() {
        return zqczdc;
    }

    public void setZqczdc(List<InnerZqczdc> zqczdc) {
        this.zqczdc = zqczdc;
    }

    public String getZqczgs() {
        return zqczgs;
    }

    public void setZqczgs(String zqczgs) {
        this.zqczgs = zqczgs;
    }

    public List<InnerXfdz> getXfdz() {
        return xfdz;
    }

    public void setXfdz(List<InnerXfdz> xfdz) {
        this.xfdz = xfdz;
    }

//    public InnerSzdxfjg getSzdxfjg() {
//        return szdxfjg;
//    }
//
//    public void setSzdxfjg(InnerSzdxfjg szdxfjg) {
//        this.szdxfjg = szdxfjg;
//    }


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

    public List<String> getJsnr_mc() {
        return jsnr_mc;
    }

    public void setJsnr_mc(List<String> jsnr_mc) {
        this.jsnr_mc = jsnr_mc;
    }

    public List<String> getJsnr_dz() {
        return jsnr_dz;
    }

    public void setJsnr_dz(List<String> jsnr_dz) {
        this.jsnr_dz = jsnr_dz;
    }

    public List<String> getJsnr_qh() {
        return jsnr_qh;
    }

    public void setJsnr_qh(List<String> jsnr_qh) {
        this.jsnr_qh = jsnr_qh;
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