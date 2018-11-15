package com.kedacom.ezFireAPI.safe.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * create by liangliang on 2018/5/28
 * @ClassName Abld 安保联动
 */
@ApiModel(value = "安保联动", description = "安保联动对象")
public class Abld{
    @ApiModelProperty(value = "活动编号")
    private String hdbh;
    @ApiModelProperty(value = "联动编号", name = "ldbh", example = "ssdd")
    private String ldbh;
    @ApiModelProperty(value = "联动对象,0：现场指挥部 1：社会联动")
    private String lddx;
    @ApiModelProperty(value = "对象名称")
    private String dxmc;
    @ApiModelProperty(value = "联系人员")
    private String lxry;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
    @ApiModelProperty(value = "显示顺序")
    private int  xssx;
    @ApiModelProperty(value = "备注信息")
    private String bzxx;
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

    public String getHdbh() {
        return hdbh;
    }

    public void setHdbh(String hdbh) {
        this.hdbh = hdbh;
    }

    public String getLdbh() {
        return ldbh;
    }

    public void setLdbh(String ldbh) {
        this.ldbh = ldbh;
    }

    public String getLddx() {
        return lddx;
    }

    public void setLddx(String lddx) {
        this.lddx = lddx;
    }

    public String getDxmc() {
        return dxmc;
    }

    public void setDxmc(String dxmc) {
        this.dxmc = dxmc;
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

    public int getXssx() {
        return xssx;
    }

    public void setXssx(int xssx) {
        this.xssx = xssx;
    }

    public String getBzxx() {
        return bzxx;
    }

    public void setBzxx(String bzxx) {
        this.bzxx = bzxx;
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