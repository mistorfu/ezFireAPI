package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName Ryxx 人员信息
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="人员信息",description="人员信息对象")
public class Ryxx {
    @ApiModelProperty(value="人员编号")
    private String rybh;
    @ApiModelProperty(value="身份证号")
    private String sfzh;
    @ApiModelProperty(value="姓名")
    private String xm;
    @ApiModelProperty(value="性别")
    private InnerDxlb xb;
    @ApiModelProperty(value="民族")
    private InnerDxlb mz;
    @ApiModelProperty(value="籍贯")
    private String jg;
    @ApiModelProperty(value="岗位")
    private InnerDxlbext gw;
    @ApiModelProperty(value="职务")
    private InnerDxlbext zw;
    @ApiModelProperty(value="照片")
    private String zp;
    @ApiModelProperty(value="出生日期 格式：yyyy-MM-dd")
    private String csrq;
    @ApiModelProperty(value="联系电话")
    private String lxdh;
    @ApiModelProperty(value="个人微信")
    private String grwx;
    @ApiModelProperty(value="企业微信")
    private String qywx;
    @ApiModelProperty(value="平台账号")
    private String ptzh;
    @ApiModelProperty(value="人员类别")
    private InnerDxlbext rylb;
    @ApiModelProperty(value="人员状况")
    private InnerDxlbext ryzk;
    @ApiModelProperty(value="在位情况")
    private InnerDxlb zwqk;
    @ApiModelProperty(value="是否专家")
    private String sfzj;
    @ApiModelProperty(value="是否执勤")
    private String sfzq;
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
    @ApiModelProperty(value="记录状态")
    private String jlzt;
    @ApiModelProperty(value="入库人员")
    private String rkry;
    @ApiModelProperty(value="入库时间")
    private String rksj;
    @ApiModelProperty(value="更新人员")
    private String gxry;
    @ApiModelProperty(value="更新时间")
    private String gxsj;

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

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

    public InnerDxlb getMz() {
        return mz;
    }

    public void setMz(InnerDxlb mz) {
        this.mz = mz;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public InnerDxlbext getGw() {
        return gw;
    }

    public void setGw(InnerDxlbext gw) {
        this.gw = gw;
    }

    public InnerDxlbext getZw() {
        return zw;
    }

    public void setZw(InnerDxlbext zw) {
        this.zw = zw;
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

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getGrwx() {
        return grwx;
    }

    public void setGrwx(String grwx) {
        this.grwx = grwx;
    }

    public String getQywx() {
        return qywx;
    }

    public void setQywx(String qywx) {
        this.qywx = qywx;
    }

    public String getPtzh() {
        return ptzh;
    }

    public void setPtzh(String ptzh) {
        this.ptzh = ptzh;
    }

    public InnerDxlbext getRylb() {
        return rylb;
    }

    public void setRylb(InnerDxlbext rylb) {
        this.rylb = rylb;
    }

    public InnerDxlbext getRyzk() {
        return ryzk;
    }

    public void setRyzk(InnerDxlbext ryzk) {
        this.ryzk = ryzk;
    }

    public InnerDxlb getZwqk() {
        return zwqk;
    }

    public void setZwqk(InnerDxlb zwqk) {
        this.zwqk = zwqk;
    }

    public String getSfzj() {
        return sfzj;
    }

    public void setSfzj(String sfzj) {
        this.sfzj = sfzj;
    }

    public String getSfzq() {
        return sfzq;
    }

    public void setSfzq(String sfzq) {
        this.sfzq = sfzq;
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
