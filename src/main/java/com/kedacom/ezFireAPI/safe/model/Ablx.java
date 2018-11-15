package com.kedacom.ezFireAPI.safe.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by fudapeng on 2018/8/14.
 */
@ApiModel(value = "安保路线", description = "安保路线对象")
public class Ablx {
    @ApiModelProperty(value = "活动编号 关联的安保活动编号")
    private String hdbh;
    @ApiModelProperty(value = "路线编号 主键")
    private String lxbh;
    @ApiModelProperty(value = "路线名称")
    private String lxmc;
    @ApiModelProperty(value = "路线说明")
    private String lxsm;
    @ApiModelProperty(value = "路线示意图 Url地址")
    private String lxsyt;
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

    public String getLxbh() {
        return lxbh;
    }

    public void setLxbh(String lxbh) {
        this.lxbh = lxbh;
    }

    public String getLxmc() {
        return lxmc;
    }

    public void setLxmc(String lxmc) {
        this.lxmc = lxmc;
    }

    public String getLxsm() {
        return lxsm;
    }

    public void setLxsm(String lxsm) {
        this.lxsm = lxsm;
    }

    public String getLxsyt() {
        return lxsyt;
    }

    public void setLxsyt(String lxsyt) {
        this.lxsyt = lxsyt;
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