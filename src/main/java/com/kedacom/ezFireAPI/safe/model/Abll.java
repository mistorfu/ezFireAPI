package com.kedacom.ezFireAPI.safe.model;

import com.kedacom.ezFireAPI.outfire.model.InnerDxlb;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * create by liangliang on 2018/5/28
 * @ClassName Abll 安保力量
 */
@ApiModel(value = "安保力量", description = "安保力量对象")
public class Abll{
    @ApiModelProperty(value = "活动编号")
    private String hdbh;
    @ApiModelProperty(value = "部署编号")
    private String bsbh;
    @ApiModelProperty(value = "力量编号", name = "llbh", example = "dfgsafd0fdsf0c")
    private String llbh;
    @ApiModelProperty(value = "力量名称")
    private String llmc;
    @ApiModelProperty(value = "力量类型,'ID'：数据项值,'VALUE'：数据项内容:1：指挥部,2：安保团队,3：屯兵点")
    private InnerDxlb lllx;
    @ApiModelProperty(value = "力量地点")
    private String lldd;
    @ApiModelProperty(value = "力量说明")
    private String llsm;
    @ApiModelProperty(value = "力量概述")
    private String llgs;
    @ApiModelProperty(value = "力量明细")
    private List<InnerLlmx> llmx;
    @ApiModelProperty(value = "力量概况图")
    private String llgkt;
    @ApiModelProperty(value = "配备车辆")
    private int pbcl;
    @ApiModelProperty(value = "执勤车辆")
    private int zqcl;
    @ApiModelProperty(value = "配备人数")
    private int pbrs;
    @ApiModelProperty(value = "执勤人数")
    private int zqrs;
    @ApiModelProperty(value = "联系人员")
    private List<InnerLxry> lxry;
    @ApiModelProperty(value = "经度,精确到小数点后6位")
    private Double jd;
    @ApiModelProperty(value = "纬度,精确到小数点后6位")
    private Double wd;
    @ApiModelProperty(value = "视频信息")
    private InnerSpxx spxx;
    @ApiModelProperty(value = "备注信息")
    private String bzxx;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "显示顺序")
    private int xssx;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "数据监测")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容")
    private List<String> jsnr;
    @ApiModelProperty(value = "记录状态,0：废弃 1：正常")
    private String jlzt;
    @ApiModelProperty(value = "入库人员")
    private String rkry;
    @ApiModelProperty(value = "入库时间,格式：yyyy-MM-dd HH:mm:ss",example = "2018-05-28 17:32:36")
    private String rksj;
    @ApiModelProperty(value = "更新人员")
    private String gxry;
    @ApiModelProperty(value = "更新时间,格式：yyyy-MM-dd HH:mm:ss",example = "2018-05-28 17:32:36")
    private String gxsj;
    @ApiModelProperty(value = "元素形状")
    private InnerShape shape;

    public String getHdbh() {
        return hdbh;
    }

    public void setHdbh(String hdbh) {
        this.hdbh = hdbh;
    }

    public String getBsbh() {
        return bsbh;
    }

    public void setBsbh(String bsbh) {
        this.bsbh = bsbh;
    }

    public String getLlbh() {
        return llbh;
    }

    public void setLlbh(String llbh) {
        this.llbh = llbh;
    }

    public String getLlmc() {
        return llmc;
    }

    public void setLlmc(String llmc) {
        this.llmc = llmc;
    }

    public InnerDxlb getLllx() {
        return lllx;
    }

    public void setLllx(InnerDxlb lllx) {
        this.lllx = lllx;
    }

    public String getLldd() {
        return lldd;
    }

    public void setLldd(String lldd) {
        this.lldd = lldd;
    }

    public String getLlsm() {
        return llsm;
    }

    public void setLlsm(String llsm) {
        this.llsm = llsm;
    }

    public String getLlgs() {
        return llgs;
    }

    public void setLlgs(String llgs) {
        this.llgs = llgs;
    }

    public List<InnerLlmx> getLlmx() {
        return llmx;
    }

    public void setLlmx(List<InnerLlmx> llmx) {
        this.llmx = llmx;
    }

    public String getLlgkt() {
        return llgkt;
    }

    public void setLlgkt(String llgkt) {
        this.llgkt = llgkt;
    }

    public int getPbcl() {
        return pbcl;
    }

    public void setPbcl(int pbcl) {
        this.pbcl = pbcl;
    }

    public int getZqcl() {
        return zqcl;
    }

    public void setZqcl(int zqcl) {
        this.zqcl = zqcl;
    }

    public int getPbrs() {
        return pbrs;
    }

    public void setPbrs(int pbrs) {
        this.pbrs = pbrs;
    }

    public int getZqrs() {
        return zqrs;
    }

    public void setZqrs(int zqrs) {
        this.zqrs = zqrs;
    }

    public List<InnerLxry> getLxry() {
        return lxry;
    }

    public void setLxry(List<InnerLxry> lxry) {
        this.lxry = lxry;
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

    public InnerSpxx getSpxx() {
        return spxx;
    }

    public void setSpxx(InnerSpxx spxx) {
        this.spxx = spxx;
    }

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
    }

    public InnerXfjg getSzdxfjg() {
        return szdxfjg;
    }

    public void setSzdxfjg(InnerXfjg szdxfjg) {
        this.szdxfjg = szdxfjg;
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

    public InnerXzqh getSzdxzqh() {
        return szdxzqh;
    }

    public void setSzdxzqh(InnerXzqh szdxzqh) {
        this.szdxzqh = szdxzqh;
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