package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjgext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author luping
 * @date 2018/5/28 13:39
 */
@ApiModel(value = "灾情指令",description = "灾情指令对象")
public class Zqzl {
    @ApiModelProperty(value = "灾情编号",name = "zqbh",example = "123")
    private String zqbh;
    @ApiModelProperty(value = "指令编号",name = "zlbh",example = "233")
    private String zlbh;
    @ApiModelProperty(value = "指令类型 1：本辖区指挥指令 2：跨辖区调度指令",name = "zllx",example = "1")
    private String zllx;
    @ApiModelProperty(value = "信息类型 1：文本 2：语音 3：图片 4：视频 5：文档 6：灾情位置 7：处置对象 9：其他",name = "xxlx",example = "1")
    private String xxlx;
    @ApiModelProperty(value = "信息主题",name = "xxzt",example = "灾情指令")
    private String xxzt;
    @ApiModelProperty(value = "信息内容",name = "xxnr",example = "快速救灾")
    private String xxnr;
    @ApiModelProperty(value = "文件资料",name = "wjzl")
    private InnerWjzl wjzl;
    @ApiModelProperty(value = "发送人员",name = "fsry",example = "admin")
    private String fsry;
    @ApiModelProperty(value = "发送机构",name = "fsjg")
    private InnerXfjgext fsjg;
    @ApiModelProperty(value = "发送时间",name = "fssj",example = "2018-05-02 10:00:49")
    private String fssj;
    @ApiModelProperty(value = "接收人员",name = "jsry",example = "admin")
    private String jsry;
    @ApiModelProperty(value = "接收机构",name = "jsjg")
    private InnerXfjgext jsjg;
    @ApiModelProperty(value = "处理结果",name = "cljg")
    private InnerCljg cljg;
    @ApiModelProperty(value = "是否置顶 0：否 1：是",name = "sfzd",example = "1")
    private String sfzd;
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
    @ApiModelProperty(value = "入库时间",name = "rksj",example = "2018-05-02 10:00:49")
    private String rksj;
    @ApiModelProperty(value = "更新人员",name = "gxry",example = "admin")
    private String gxry;
    @ApiModelProperty(value = "更新时间",name = "gxsj",example = "2018-05-02 10:00:49")
    private String gxsj;

    public InnerXfjgext getJsjg() {
        return jsjg;
    }

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getZlbh() {
        return zlbh;
    }

    public void setZlbh(String zlbh) {
        this.zlbh = zlbh;
    }

    public String getZllx() {
        return zllx;
    }

    public void setZllx(String zllx) {
        this.zllx = zllx;
    }

    public String getXxlx() {
        return xxlx;
    }

    public void setXxlx(String xxlx) {
        this.xxlx = xxlx;
    }

    public String getXxzt() {
        return xxzt;
    }

    public void setXxzt(String xxzt) {
        this.xxzt = xxzt;
    }

    public String getXxnr() {
        return xxnr;
    }

    public void setXxnr(String xxnr) {
        this.xxnr = xxnr;
    }

    public String getSfzd() {
        return sfzd;
    }

    public void setSfzd(String sfzd) {
        this.sfzd = sfzd;
    }

    public InnerWjzl getWjzl() {
        return wjzl;
    }

    public void setWjzl(InnerWjzl wjzl) {
        this.wjzl = wjzl;
    }

    public String getFsry() {
        return fsry;
    }

    public void setFsry(String fsry) {
        this.fsry = fsry;
    }

    public InnerXfjgext getFsjg() {
        return fsjg;
    }

    public void setFsjg(InnerXfjgext fsjg) {
        this.fsjg = fsjg;
    }

    public void setJsjg(InnerXfjgext jsjg) {
        this.jsjg = jsjg;
    }

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getJsry() {
        return jsry;
    }

    public void setJsry(String jsry) {
        this.jsry = jsry;
    }

    public InnerCljg getCljg() {
        return cljg;
    }

    public void setCljg(InnerCljg cljg) {
        this.cljg = cljg;
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
