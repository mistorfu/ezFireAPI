package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: 建筑信息
 * @author: hanshuhao
 * @Date: 2018/5/28
 */
@ApiModel(value="建筑信息",description="建筑信息对象")
public class Jzxx {
    @ApiModelProperty(value="建筑编号")
    private String jzbh;

    @ApiModelProperty(value="建筑名称")
    private String jzmc;

    @ApiModelProperty(value="建筑地址")
    private String jzdz;

    @ApiModelProperty(value="建筑概述")
    private String jzgs;

    @ApiModelProperty(value="建筑概况图")
    private String jzgkt;

    @ApiModelProperty(value="建成日期 格式：yyyy-MM-dd")
    private String jcrq;

    @ApiModelProperty(value="建筑高度")
    private double jzgd;

    @ApiModelProperty(value="建筑深度")
    private double jzsd;

    @ApiModelProperty(value="地上层数")
    private int dscs;

    @ApiModelProperty(value="地下层数")
    private int dxcs;

    @ApiModelProperty(value="建筑面积")
    private double jzmj;

    @ApiModelProperty(value="最大单层面积")
    private double zddcmj;

    @ApiModelProperty(value="是否大型综合体")
    private String sfdxzht;

    @ApiModelProperty(value="建筑结构")
    private InnerDxlb jzjg;

    @ApiModelProperty(value="建筑类别")
    private InnerDxlbext jzlb;

    @ApiModelProperty(value="建筑用途")
    private List<InnerDxlbext> jzyt;

    @ApiModelProperty(value="耐火等级")
    private InnerDxlb nhdj;

    @ApiModelProperty(value="图片信息")
    private List<InnerTpxx> tpxx;

    @ApiModelProperty(value="文本预案")
    private List<InnerWbya> wbya;

    @ApiModelProperty(value="结构化预案")
    private List<InnerJghya> jghya;

    @ApiModelProperty(value="数字化预案")
    private List<InnerSzhya> szhya;

    @ApiModelProperty(value="经度")
    private double jd;

    @ApiModelProperty(value="纬度")
    private double wd;

    @ApiModelProperty(value="外墙保温材料")
    private String wqbwcl;

    @ApiModelProperty(value="保温材料类别")
    private InnerDxlb bwcllb;

    @ApiModelProperty(value="主要危害")
    private List<InnerZywh> zywh;

    @ApiModelProperty(value="负责人员")
    private List<InnerFzry> fzry;

    @ApiModelProperty(value="入驻重点单位")
    private List<InnerRzzddw> rzzddw;

    @ApiModelProperty(value="消防控制室（地下）")
    private List<InnerXfkzs> xfkzs;

    @ApiModelProperty(value="周边毗邻情况")
    private List<InnerZbplqk> zbplqk;

    @ApiModelProperty(value="周边毗邻概述")
    private String zbplgs;

    @ApiModelProperty(value="灭火演练情况")
    private List<InnerMhylqk> mhylqk;

    @ApiModelProperty(value="灭火演练概述")
    private String mhylgs;

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

    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;

    @ApiModelProperty(value="排序条件")
    private String pxtj;

    @ApiModelProperty(value="加载条件")
    private List<String> jztj;

    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;

    @ApiModelProperty(value="检索内容（名称）")
    private List<String> jsnr_mc;

    @ApiModelProperty(value="检索内容（地址）")
    private List<String> jsnr_dz;

    @ApiModelProperty(value="检索内容（区划）")
    private List<String> jsnr_qh;

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
    private InnerAllShape allShape;

    public String getJzbh() {
        return jzbh;
    }

    public void setJzbh(String jzbh) {
        this.jzbh = jzbh;
    }

    public String getJzmc() {
        return jzmc;
    }

    public void setJzmc(String jzmc) {
        this.jzmc = jzmc;
    }

    public String getJzdz() {
        return jzdz;
    }

    public void setJzdz(String jzdz) {
        this.jzdz = jzdz;
    }

    public String getJzgs() {
        return jzgs;
    }

    public void setJzgs(String jzgs) {
        this.jzgs = jzgs;
    }

    public String getJzgkt() {
        return jzgkt;
    }

    public void setJzgkt(String jzgkt) {
        this.jzgkt = jzgkt;
    }

    public String getJcrq() {
        return jcrq;
    }

    public void setJcrq(String jcrq) {
        this.jcrq = jcrq;
    }

    public double getJzgd() {
        return jzgd;
    }

    public void setJzgd(double jzgd) {
        this.jzgd = jzgd;
    }

    public double getJzsd() {
        return jzsd;
    }

    public void setJzsd(double jzsd) {
        this.jzsd = jzsd;
    }

    public int getDscs() {
        return dscs;
    }

    public void setDscs(int dscs) {
        this.dscs = dscs;
    }

    public int getDxcs() {
        return dxcs;
    }

    public void setDxcs(int dxcs) {
        this.dxcs = dxcs;
    }

    public double getJzmj() {
        return jzmj;
    }

    public void setJzmj(double jzmj) {
        this.jzmj = jzmj;
    }

    public double getZddcmj() {
        return zddcmj;
    }

    public InnerDxlb getNhdj() {
        return nhdj;
    }

    public void setZddcmj(double zddcmj) {
        this.zddcmj = zddcmj;
    }

    public List<InnerDxlbext> getJzyt() {
        return jzyt;
    }

    public void setJzyt(List<InnerDxlbext> jzyt) {
        this.jzyt = jzyt;
    }

    public String getSfdxzht() {
        return sfdxzht;
    }

    public void setSfdxzht(String sfdxzht) {
        this.sfdxzht = sfdxzht;
    }

    public InnerDxlb getJzjg() {
        return jzjg;
    }

    public void setJzjg(InnerDxlb jzjg) {
        this.jzjg = jzjg;
    }

    public InnerDxlbext getJzlb() {
        return jzlb;
    }

    public void setJzlb(InnerDxlbext jzlb) {
        this.jzlb = jzlb;
    }

    public void setNhdj(InnerDxlb nhdj) {
        this.nhdj = nhdj;
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

    public List<InnerSzhya> getSzhya() {
        return szhya;
    }

    public void setSzhya(List<InnerSzhya> szhya) {
        this.szhya = szhya;
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

    public String getWqbwcl() {
        return wqbwcl;
    }

    public void setWqbwcl(String wqbwcl) {
        this.wqbwcl = wqbwcl;
    }

    public InnerDxlb getBwcllb() {
        return bwcllb;
    }

    public void setBwcllb(InnerDxlb bwcllb) {
        this.bwcllb = bwcllb;
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

    public List<InnerRzzddw> getRzzddw() {
        return rzzddw;
    }

    public void setRzzddw(List<InnerRzzddw> rzzddw) {
        this.rzzddw = rzzddw;
    }

    public List<InnerXfkzs> getXfkzs() {
        return xfkzs;
    }

    public void setXfkzs(List<InnerXfkzs> xfkzs) {
        this.xfkzs = xfkzs;
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

    public String getMhylgs() {
        return mhylgs;
    }

    public void setMhylgs(String mhylgs) {
        this.mhylgs = mhylgs;
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

    public InnerAllShape getAllShape() {
        return allShape;
    }

    public void setAllShape(InnerAllShape allShape) {
        this.allShape = allShape;
    }
}
