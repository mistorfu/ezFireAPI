package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.InnerDxlb;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: 地震带
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
@ApiModel(value="地震带",description="地震带对象")
public class Dzd {
    @ApiModelProperty(value="地震带编号")
    private String dzdbh;

    @ApiModelProperty(value="地震带名称")
    private String dzdmc;

    @ApiModelProperty(value="地震带分类 0：互联网地震带（23条） 1：地震、断裂带（N条）")
    private String dzdfl;

    @ApiModelProperty(value="地震概况图")
    private String dzgkt;

    @ApiModelProperty(value="分布区域图")
    private String fbqyt;

    @ApiModelProperty(value="分布区域概述")
    private String fbqygs;

    @ApiModelProperty(value="地震危害等级")
    private InnerDxlb dzwhdj;

    @ApiModelProperty(value="地震影响区域")
    private String dzyxqy;

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

    public String getDzdbh() {
        return dzdbh;
    }

    public void setDzdbh(String dzdbh) {
        this.dzdbh = dzdbh;
    }

    public String getDzdmc() {
        return dzdmc;
    }

    public void setDzdmc(String dzdmc) {
        this.dzdmc = dzdmc;
    }

    public String getDzdfl() {
        return dzdfl;
    }

    public void setDzdfl(String dzdfl) {
        this.dzdfl = dzdfl;
    }

    public String getDzgkt() {
        return dzgkt;
    }

    public void setDzgkt(String dzgkt) {
        this.dzgkt = dzgkt;
    }

    public String getFbqyt() {
        return fbqyt;
    }

    public void setFbqyt(String fbqyt) {
        this.fbqyt = fbqyt;
    }

    public String getFbqygs() {
        return fbqygs;
    }

    public void setFbqygs(String fbqygs) {
        this.fbqygs = fbqygs;
    }

    public InnerDxlb getDzwhdj() {
        return dzwhdj;
    }

    public void setDzwhdj(InnerDxlb dzwhdj) {
        this.dzwhdj = dzwhdj;
    }

    public String getDzyxqy() {
        return dzyxqy;
    }

    public void setDzyxqy(String dzyxqy) {
        this.dzyxqy = dzyxqy;
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
