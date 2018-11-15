package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.InnerDxlb;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: 危险区信息
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@ApiModel(value="危险区信息",description="危险区信息对象")
public class Wxq {
    @ApiModelProperty(value="危险区编号")
    private String wxqbh;

    @ApiModelProperty(value="危险区名称")
    private String wxqmc;

    @ApiModelProperty(value="危险区年份 格式：yyyy")
    private String wxqnf;

    @ApiModelProperty(value="危险区类别")
    private InnerDxlb wxqlb;

    @ApiModelProperty(value="危险区概述")
    private String wxqgs;

    @ApiModelProperty(value="危险区概况图")
    private String wxqgkt;

    @ApiModelProperty(value="主要影响区域")
    private String zyyxqy;

    @ApiModelProperty(value="周边毗邻情况")
    private List<InnerZbplqk> zbplqk;

    @ApiModelProperty(value="周边毗邻概述")
    private String zbplgs;

    @ApiModelProperty(value="历史灾情情况")
    private List<InnerLszqqk> lszqqk;

    @ApiModelProperty(value="历史灾情概述")
    private String lszqgs;

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

    public String getWxqbh() {
        return wxqbh;
    }

    public void setWxqbh(String wxqbh) {
        this.wxqbh = wxqbh;
    }

    public String getWxqmc() {
        return wxqmc;
    }

    public void setWxqmc(String wxqmc) {
        this.wxqmc = wxqmc;
    }

    public String getWxqnf() {
        return wxqnf;
    }

    public void setWxqnf(String wxqnf) {
        this.wxqnf = wxqnf;
    }

    public InnerDxlb getWxqlb() {
        return wxqlb;
    }

    public void setWxqlb(InnerDxlb wxqlb) {
        this.wxqlb = wxqlb;
    }

    public String getWxqgs() {
        return wxqgs;
    }

    public void setWxqgs(String wxqgs) {
        this.wxqgs = wxqgs;
    }

    public String getWxqgkt() {
        return wxqgkt;
    }

    public void setWxqgkt(String wxqgkt) {
        this.wxqgkt = wxqgkt;
    }

    public String getZyyxqy() {
        return zyyxqy;
    }

    public void setZyyxqy(String zyyxqy) {
        this.zyyxqy = zyyxqy;
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
