package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfdz;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: 公路隧道
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@ApiModel(value="公路隧道",description="公路隧道对象")
public class Glsd {
    @ApiModelProperty(value="隧道编号")
    private String sdbh;

    @ApiModelProperty(value="隧道名称")
    private String sdmc;

    @ApiModelProperty(value="隧道位置")
    private String sdwz;

    @ApiModelProperty(value="隧道起点")
    private String sdqd;

    @ApiModelProperty(value="隧道终点")
    private String sdzd;

    @ApiModelProperty(value="隧道形式")
    private String sdxs;

    @ApiModelProperty(value="隧道间距")
    private double sdjj;

    @ApiModelProperty(value="隧道长度")
    private double sdcd;

    @ApiModelProperty(value="隧道净高")
    private double sdjg;

    @ApiModelProperty(value="隧道净宽")
    private double sdjk;

    @ApiModelProperty(value="隧道走向")
    private String sdzx;

    @ApiModelProperty(value="隧道出口")
    private List<InnerSdck> sdck;

    @ApiModelProperty(value="车道宽度")
    private double cdkd;

    @ApiModelProperty(value="平均海拔")
    private double pjhb;

    @ApiModelProperty(value="平均温度")
    private double pjwd;

    @ApiModelProperty(value="最低温度")
    private double zdwd;

    @ApiModelProperty(value="最高温度")
    private double zgwd;

    @ApiModelProperty(value="主导风向")
    private String zdfx;

    @ApiModelProperty(value="开建日期 格式：yyyy-MM-dd")
    private String kjrq;

    @ApiModelProperty(value="开通日期 格式：yyyy-MM-dd")
    private String ktrq;

    @ApiModelProperty(value="联系人员")
    private String lxry;

    @ApiModelProperty(value="联系电话")
    private String lxdh;

    @ApiModelProperty(value="隧道概述")
    private String sdgs;

    @ApiModelProperty(value="隧道概况图")
    private String sdgkt;

    @ApiModelProperty(value="消防设施情况")
    private List<InnerXfssqk> xfssqk;

    @ApiModelProperty(value="消防设施概述")
    private String xfssgs;

    @ApiModelProperty(value="周边毗邻概述")
    private String zbplgs;

    @ApiModelProperty(value="图片信息")
    private List<InnerTpxx> tpxx;

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

    public String getSdbh() {
        return sdbh;
    }

    public void setSdbh(String sdbh) {
        this.sdbh = sdbh;
    }

    public String getSdmc() {
        return sdmc;
    }

    public void setSdmc(String sdmc) {
        this.sdmc = sdmc;
    }

    public String getSdwz() {
        return sdwz;
    }

    public void setSdwz(String sdwz) {
        this.sdwz = sdwz;
    }

    public String getSdqd() {
        return sdqd;
    }

    public void setSdqd(String sdqd) {
        this.sdqd = sdqd;
    }

    public String getSdzd() {
        return sdzd;
    }

    public void setSdzd(String sdzd) {
        this.sdzd = sdzd;
    }

    public String getSdxs() {
        return sdxs;
    }

    public void setSdxs(String sdxs) {
        this.sdxs = sdxs;
    }

    public double getSdjj() {
        return sdjj;
    }

    public void setSdjj(double sdjj) {
        this.sdjj = sdjj;
    }

    public double getSdcd() {
        return sdcd;
    }

    public void setSdcd(double sdcd) {
        this.sdcd = sdcd;
    }

    public double getSdjg() {
        return sdjg;
    }

    public void setSdjg(double sdjg) {
        this.sdjg = sdjg;
    }

    public double getSdjk() {
        return sdjk;
    }

    public void setSdjk(double sdjk) {
        this.sdjk = sdjk;
    }

    public String getSdzx() {
        return sdzx;
    }

    public void setSdzx(String sdzx) {
        this.sdzx = sdzx;
    }

    public List<InnerSdck> getSdck() {
        return sdck;
    }

    public void setSdck(List<InnerSdck> sdck) {
        this.sdck = sdck;
    }

    public double getCdkd() {
        return cdkd;
    }

    public void setCdkd(double cdkd) {
        this.cdkd = cdkd;
    }

    public double getPjhb() {
        return pjhb;
    }

    public void setPjhb(double pjhb) {
        this.pjhb = pjhb;
    }

    public double getPjwd() {
        return pjwd;
    }

    public void setPjwd(double pjwd) {
        this.pjwd = pjwd;
    }

    public double getZdwd() {
        return zdwd;
    }

    public void setZdwd(double zdwd) {
        this.zdwd = zdwd;
    }

    public double getZgwd() {
        return zgwd;
    }

    public void setZgwd(double zgwd) {
        this.zgwd = zgwd;
    }

    public String getZdfx() {
        return zdfx;
    }

    public void setZdfx(String zdfx) {
        this.zdfx = zdfx;
    }

    public String getKjrq() {
        return kjrq;
    }

    public void setKjrq(String kjrq) {
        this.kjrq = kjrq;
    }

    public String getKtrq() {
        return ktrq;
    }

    public void setKtrq(String ktrq) {
        this.ktrq = ktrq;
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

    public String getSdgs() {
        return sdgs;
    }

    public void setSdgs(String sdgs) {
        this.sdgs = sdgs;
    }

    public String getSdgkt() {
        return sdgkt;
    }

    public void setSdgkt(String sdgkt) {
        this.sdgkt = sdgkt;
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

    public String getZbplgs() {
        return zbplgs;
    }

    public void setZbplgs(String zbplgs) {
        this.zbplgs = zbplgs;
    }

    public List<InnerTpxx> getTpxx() {
        return tpxx;
    }

    public void setTpxx(List<InnerTpxx> tpxx) {
        this.tpxx = tpxx;
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
