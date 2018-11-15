package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerDxlbext;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjgext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author luping
 * @date 2018/5/28 13:39
 */
@ApiModel(value = "灾情人员",description = "灾情人员对象")
public class Zqry {
    @ApiModelProperty(value = "灾情编号",name = "zqbh",example = "6667f7f434b")
    private String zqbh;
    @ApiModelProperty(value = "人员编号",name = "rybh",example = "61a46167ae")
    private String rybh;
    @ApiModelProperty(value = "人员姓名",name = "ryxm",example = "admin")
    private String ryxm;
    @ApiModelProperty(value = "人员职务",name = "ryzw")
    private InnerDxlbext ryzw;
    @ApiModelProperty(value = "作战类型 1：参战（需出动，移动终端）2：观战（不出动，移动终端） 3：作战（需出动，前指终端）",name = "zzlx",example = "2")
    private String zzlx;
    @ApiModelProperty(value = "作战形式", name = "zzxs")
    private InnerDxlbext zzxs;
    @ApiModelProperty(value = "作战状态 0：已退出 1：作战中",name = "zzzt",example = "1")
    private String zzzt;
    @ApiModelProperty(value = "消防机构",name = "xfjg")
    private InnerXfjgext xfjg;
    @ApiModelProperty(value = "操作时间",name = "czsj",example = "2018-03-25 16:15:38")
    private String czsj;
    @ApiModelProperty(value = "数据来源",name = "sjly",example = "接处警数据库")
    private String sjly;
    @ApiModelProperty(value = "数据监测",name = "sjjc")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容",name = "jsnr")
    private List<String> jsnr;
    @ApiModelProperty(value = "记录状态 0：废弃 1：正常",name = "jlzt",example = "1")
    private String jlzt;
    @ApiModelProperty(value = "入库人员",name = "rkry",example = "系统管理员")
    private String rkry;
    @ApiModelProperty(value = "入库时间",name = "rksj",example = "2018-03-25 16:15:38")
    private String rksj;
    @ApiModelProperty(value = "更新人员",name = "gxry",example = "系统管理员")
    private String gxry;
    @ApiModelProperty(value = "更新时间",name = "gxsj",example = "2018-03-25 16:15:38")
    private String gxsj;

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    public String getRyxm() {
        return ryxm;
    }

    public void setRyxm(String ryxm) {
        this.ryxm = ryxm;
    }

    public InnerDxlbext getRyzw() {
        return ryzw;
    }

    public void setRyzw(InnerDxlbext ryzw) {
        this.ryzw = ryzw;
    }

    @Deprecated
    public String getZzlx() {
        return zzlx;
    }

    @Deprecated
    public void setZzlx(String zzlx) {
        this.zzlx = zzlx;
    }

    public String getZzzt() {
        return zzzt;
    }

    public void setZzzt(String zzzt) {
        this.zzzt = zzzt;
    }

    public InnerXfjgext getXfjg() {
        return xfjg;
    }

    public void setXfjg(InnerXfjgext xfjg) {
        this.xfjg = xfjg;
    }

    public String getCzsj() {
        return czsj;
    }

    public void setCzsj(String czsj) {
        this.czsj = czsj;
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

    public InnerDxlbext getZzxs() {
        return zzxs;
    }

    public void setZzxs(InnerDxlbext zzxs) {
        this.zzxs = zzxs;
    }
}
