package com.kedacom.ezFireAPI.social.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:灭火救援专家
 *
 */
@ApiModel(value="灭火救援专家",description="灭火救援专家对象")
public class Mhjyzj {
    @ApiModelProperty(value="身份证号",name="sfzh",example="2341335198909092345")
    private String sfzh;              //身份证号
    @ApiModelProperty(value="姓名")
    private String xm;                //姓名
    @ApiModelProperty(value="性别")
    private InnerDxlb xb;             //性别
    @ApiModelProperty(value="学历")
    private InnerDxlb xl;             //学历
    @ApiModelProperty(value="职务")
    private String zw;                //职务
    @ApiModelProperty(value="籍贯")
    private String jg;                //籍贯
    @ApiModelProperty(value="照片")
    private String zp;                //照片
    @ApiModelProperty(value="出生日期")
    private String csrq;              //出生日期
    @ApiModelProperty(value="居住地址")
    private String jzdz;              //居住地址
    @ApiModelProperty(value="通信地址")
    private String txdz;              //通信地址
    @ApiModelProperty(value="邮政编码")
    private String yzbm;              //邮政编码
    @ApiModelProperty(value="联系电话")
    private String lxdh;              //联系电话
    @ApiModelProperty(value="家庭电话")
    private String jtdh;              //家庭电话
    @ApiModelProperty(value="办公电话")
    private String bgdh;              //办公电话
    @ApiModelProperty(value="所在单位")
    private String szdw;              //所在单位
    @ApiModelProperty(value="备注信息")
    private String bzxx;              //备注信息
    @ApiModelProperty(value="经度")
    private Double jd;                //经度
    @ApiModelProperty(value="纬度")
    private Double wd;                //纬度
    @ApiModelProperty(value="专家领域分类")
    private List<InnerDxlbext> zjlyfl;     //专家领域分类
    @ApiModelProperty(value="是否部队内部专家")
    private String sfbdnbzj;          //是否部队内部专家
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjgext szdxfjg;     //所在地消防机构
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;     //所在地行政区划
    @ApiModelProperty(value="显示顺序")
    private int xssx;                 //显示顺序
    @ApiModelProperty(value="数据来源")
    private String sjly;              //数据来源
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;           //数据监测
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;        //检索内容
    @ApiModelProperty(value="记录状态, 0：废弃 1：正常",example = "1")
    private String jlzt;              //记录状态
    @ApiModelProperty(value="入库人员")
    private String rkry;              //入库人员
    @ApiModelProperty(value="入库时间")
    private String rksj;              //入库时间
    @ApiModelProperty(value="更新人员")
    private String gxry;              //更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj;              //更新时间
    @ApiModelProperty(value="元素形状")
    private InnerShape shape;         //元素形状

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public InnerDxlb getXb() {
        return xb;
    }

    public void setXb(InnerDxlb xb) {
        this.xb = xb;
    }

    public InnerDxlb getXl() {
        return xl;
    }

    public void setXl(InnerDxlb xl) {
        this.xl = xl;
    }

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getJzdz() {
        return jzdz;
    }

    public void setJzdz(String jzdz) {
        this.jzdz = jzdz;
    }

    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getJtdh() {
        return jtdh;
    }

    public void setJtdh(String jtdh) {
        this.jtdh = jtdh;
    }

    public String getBgdh() {
        return bgdh;
    }

    public void setBgdh(String bgdh) {
        this.bgdh = bgdh;
    }

    public String getSzdw() {
        return szdw;
    }

    public void setSzdw(String szdw) {
        this.szdw = szdw;
    }

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
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

    public List<InnerDxlbext> getZjlyfl() {
        return zjlyfl;
    }

    public void setZjlyfl(List<InnerDxlbext> zjlyfl) {
        this.zjlyfl = zjlyfl;
    }

    public String getSfbdnbzj() {
        return sfbdnbzj;
    }

    public void setSfbdnbzj(String sfbdnbzj) {
        this.sfbdnbzj = sfbdnbzj;
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

    public int getXssx() {
        return xssx;
    }

    public void setXssx(int xssx) {
        this.xssx = xssx;
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
