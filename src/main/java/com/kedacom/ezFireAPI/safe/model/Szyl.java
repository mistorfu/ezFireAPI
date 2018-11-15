package com.kedacom.ezFireAPI.safe.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * create by liangliang on 2018/5/28
 * @ClassName Szyl 实战演练
 */
@ApiModel(value = "实战演练", description = "实战演练对象")
public class Szyl{
    @ApiModelProperty(value = "演练编号", name = "ylbh", example = "abcd")
    private String ylbh;
    @ApiModelProperty(value = "演练名称")
    private String ylmc;
    @ApiModelProperty(value = "演练单位")
    private String yldw;
    @ApiModelProperty(value = "演练内容")
    private String ylnr;
    @ApiModelProperty(value = "演练地点")
    private String yldd;
    @ApiModelProperty(value = "演练单位")
    private List<InnerYlwj> ylwj;
    @ApiModelProperty(value = "演练概述")
    private String ylgs;
    @ApiModelProperty(value = "开始时间,格式：yyyy-MM-dd HH:mm:ss",example = "2018-05-28 17:32:36")
    private String kssj;
    @ApiModelProperty(value = "结束时间,格式：yyyy-MM-dd HH:mm:ss",example = "2018-05-28 17:32:36")
    private String jssj;
    @ApiModelProperty(value = "主办单位")
    private String zbdw;
    @ApiModelProperty(value = "参与单位")
    private String cydw;
    @ApiModelProperty(value = "经度,精确到小数点后6位")
    private Double jd;
    @ApiModelProperty(value = "纬度,精确到小数点后6位")
    private Double wd;
    @ApiModelProperty(value = "重大安保活动")
    private InnerZdabhd zdabhd;
    @ApiModelProperty(value = "所在地消防机构")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
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

    public String getYlbh() {
        return ylbh;
    }

    public void setYlbh(String ylbh) {
        this.ylbh = ylbh;
    }

    public String getYlmc() {
        return ylmc;
    }

    public void setYlmc(String ylmc) {
        this.ylmc = ylmc;
    }

    public String getYldw() {
        return yldw;
    }

    public void setYldw(String yldw) {
        this.yldw = yldw;
    }

    public String getYlnr() {
        return ylnr;
    }

    public void setYlnr(String ylnr) {
        this.ylnr = ylnr;
    }

    public String getYldd() {
        return yldd;
    }

    public void setYldd(String yldd) {
        this.yldd = yldd;
    }

    public List<InnerYlwj> getYlwj() {
        return ylwj;
    }

    public void setYlwj(List<InnerYlwj> ylwj) {
        this.ylwj = ylwj;
    }

    public String getYlgs() {
        return ylgs;
    }

    public void setYlgs(String ylgs) {
        this.ylgs = ylgs;
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
    }

    public String getZbdw() {
        return zbdw;
    }

    public void setZbdw(String zbdw) {
        this.zbdw = zbdw;
    }

    public String getCydw() {
        return cydw;
    }

    public void setCydw(String cydw) {
        this.cydw = cydw;
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

    public InnerZdabhd getZdabhd() {
        return zdabhd;
    }

    public void setZdabhd(InnerZdabhd zdabhd) {
        this.zdabhd = zdabhd;
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
}