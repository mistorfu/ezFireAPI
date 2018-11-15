package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfdz;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: 水电站
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@ApiModel(value="水电站",description="水电站对象")
public class Sdz {
    @ApiModelProperty(value="水电站编号")
    private String sdzbh;

    @ApiModelProperty(value="水电站名称")
    private String sdzmc;

    @ApiModelProperty(value="水电站地址")
    private String sdzdz;

    @ApiModelProperty(value="水电站分类")
    private String sdzfl;

    @ApiModelProperty(value="水电站概述")
    private String sdzgs;

    @ApiModelProperty(value="水电站概况图")
    private String sdzgkt;

    @ApiModelProperty(value="建成日期 格式：yyyy-MM-dd")
    private String jcrq;

    @ApiModelProperty(value="经度")
    private double jd;

    @ApiModelProperty(value="纬度")
    private double wd;

    @ApiModelProperty(value="水库总库容")
    private double skzkr;

    @ApiModelProperty(value="正常蓄水位")
    private double zcxsw;

    @ApiModelProperty(value="装机容量")
    private double zjrl;

    @ApiModelProperty(value="内部专家")
    private List<InnerNbzj> nbzj;

    @ApiModelProperty(value="负责人员")
    private List<InnerFzry> fzry;

    @ApiModelProperty(value="图片信息")
    private List<InnerTpxx> tpxx;

    @ApiModelProperty(value="文本预案")
    private List<InnerWbya> wbya;

    @ApiModelProperty(value="结构化预案")
    private InnerJghya jghya;

    @ApiModelProperty(value="数字化预案")
    private List<InnerSzhya> szhya;

    @ApiModelProperty(value="安全注意事项")
    private String aqzysx;

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

    public String getSdzbh() {
        return sdzbh;
    }

    public void setSdzbh(String sdzbh) {
        this.sdzbh = sdzbh;
    }

    public String getSdzmc() {
        return sdzmc;
    }

    public void setSdzmc(String sdzmc) {
        this.sdzmc = sdzmc;
    }

    public String getSdzdz() {
        return sdzdz;
    }

    public void setSdzdz(String sdzdz) {
        this.sdzdz = sdzdz;
    }

    public String getSdzfl() {
        return sdzfl;
    }

    public void setSdzfl(String sdzfl) {
        this.sdzfl = sdzfl;
    }

    public String getSdzgs() {
        return sdzgs;
    }

    public void setSdzgs(String sdzgs) {
        this.sdzgs = sdzgs;
    }

    public String getSdzgkt() {
        return sdzgkt;
    }

    public void setSdzgkt(String sdzgkt) {
        this.sdzgkt = sdzgkt;
    }

    public String getJcrq() {
        return jcrq;
    }

    public void setJcrq(String jcrq) {
        this.jcrq = jcrq;
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

    public double getSkzkr() {
        return skzkr;
    }

    public void setSkzkr(double skzkr) {
        this.skzkr = skzkr;
    }

    public double getZcxsw() {
        return zcxsw;
    }

    public void setZcxsw(double zcxsw) {
        this.zcxsw = zcxsw;
    }

    public double getZjrl() {
        return zjrl;
    }

    public void setZjrl(double zjrl) {
        this.zjrl = zjrl;
    }

    public List<InnerNbzj> getNbzj() {
        return nbzj;
    }

    public void setNbzj(List<InnerNbzj> nbzj) {
        this.nbzj = nbzj;
    }

    public List<InnerFzry> getFzry() {
        return fzry;
    }

    public void setFzry(List<InnerFzry> fzry) {
        this.fzry = fzry;
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

    public InnerJghya getJghya() {
        return jghya;
    }

    public void setJghya(InnerJghya jghya) {
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
