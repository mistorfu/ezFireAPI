package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjgext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author luping
 * @date 2018/5/28 13:39
 */
@ApiModel(value = "灾情微信",description = "灾情微信对象")
public class Zqwx {
    @ApiModelProperty(value = "灾情编号",name = "zqbh",example = "123")
    private String zqbh;
    @ApiModelProperty(value = "信息编号",name = "xxbh",example = "234")
    private String xxbh;
    @ApiModelProperty(value = "信息主题",name = "xxzt",example = "火灾")
    private String xxzt;
    @ApiModelProperty(value = "信息类型 1：文本 2：语音 3：图片 4：视频",name = "xxlx",example = "1")
    private String xxlx;
    @ApiModelProperty(value = "信息内容",name = "xxnr",example = "广州火灾")
    private String xxnr;
    @ApiModelProperty(value = "文件资料 文件Url",name = "wjzl",example = "http://10.200.117.83:88/ChatFiles/738.jpg")
    private String wjzl;
    @ApiModelProperty(value = "发送人员",name = "fsry",example = "admin")
    private String fsry;
    @ApiModelProperty(value = "发送时间",name = "fssj",example = "2018-03-28 21:19:42")
    private String fssj;
    @ApiModelProperty(value = "发送机构",name = "fsjg")
    private InnerXfjgext fsjg;
    @ApiModelProperty(value = "联系电话",name = "lxdh",example = "23456781")
    private String lxdh;
    @ApiModelProperty(value = "经度 精确到小数点后6位",name = "jd",example = "23.221211")
    private Double jd;
    @ApiModelProperty(value = "纬度 精确到小数点后6位",name = "wd",example = "12.221133")
    private Double wd;
    @ApiModelProperty(value = "数据来源",name = "sjly",example = "接警处数据库")
    private String sjly;
    @ApiModelProperty(value = "数据监测",name = "sjjc")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容",name = "jsnr")
    private List<String> jsnr;
    @ApiModelProperty(value = "记录状态 0：废弃 1：正常",name = "jlzt",example = "1")
    private String jlzt;
    @ApiModelProperty(value = "入库人员",name = "rkry",example = "admin")
    private String rkry;
    @ApiModelProperty(value = "入库时间",name = "rksj",example = "2018-03-28 21:19:42")
    private String rksj;
    @ApiModelProperty(value = "更新人员",name = "gxry",example = "admin")
    private String gxry;
    @ApiModelProperty(value = "更新时间",name = "gxsj",example = "2018-03-28 21:19:42")
    private String gxsj;
    @ApiModelProperty(value = "元素形状",name = "shape")
    private InnerShape shape;


    public InnerXfjgext getFsjg() {
        return fsjg;
    }

    public void setFsjg(InnerXfjgext fsjg) {
        this.fsjg = fsjg;
    }

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getXxbh() {
        return xxbh;
    }

    public void setXxbh(String xxbh) {
        this.xxbh = xxbh;
    }

    public String getXxzt() {
        return xxzt;
    }

    public void setXxzt(String xxzt) {
        this.xxzt = xxzt;
    }

    public String getXxlx() {
        return xxlx;
    }

    public void setXxlx(String xxlx) {
        this.xxlx = xxlx;
    }

    public String getXxnr() {
        return xxnr;
    }

    public void setXxnr(String xxnr) {
        this.xxnr = xxnr;
    }

    public String getWjzl() {
        return wjzl;
    }

    public void setWjzl(String wjzl) {
        this.wjzl = wjzl;
    }

    public String getFsry() {
        return fsry;
    }

    public void setFsry(String fsry) {
        this.fsry = fsry;
    }

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
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
