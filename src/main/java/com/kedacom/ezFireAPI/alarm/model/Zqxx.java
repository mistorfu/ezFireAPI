package com.kedacom.ezFireAPI.alarm.model;



import com.kedacom.ezFireAPI.outfire.model.*;
import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author luping
 * @date 2018/5/28 13:39
 */
@ApiModel(value = "灾情信息",description = "灾情信息对象")
public class Zqxx {
    @ApiModelProperty(value = "灾情编号",name = "zqbh",example = "123")
    private String zqbh;
    @ApiModelProperty(value = "关联编号 关联的灾情编号",name = "glbh",example = "234")
    private String glbh;
    @ApiModelProperty(value = "增援编号 增援的灾情编号",name = "zybh",example = "345")
    private String zybh;
    @ApiModelProperty(value = "灾情分类 0：普通灾情 1：突出灾情",name = "zqfl",example = "1")
    private String zqfl;
    @ApiModelProperty(value = "灾情名称",name = "zqmc",example = "火灾")
    private String zqmc;
    @ApiModelProperty(value = "灾情全称",name = "zqqc",example = "广州火灾")
    private String zqqc;
    @ApiModelProperty(value = "灾情地点",name = "zqdd",example = "广州")
    private String zqdd;
    @ApiModelProperty(value = "灾情类型",name = "zqlx")
    private InnerDxlbext zqlx;
    @ApiModelProperty(value = "灾情等级",name = "zqdj")
    private InnerDxlb zqdj;
    @ApiModelProperty(value = "灾情状态",name = "zqzt")
    private InnerDxlb zqzt;
    @ApiModelProperty(value = "灾情对象 01：重点单位(防火)02：重点单位(灭火) 03：建筑信息 04：油气管线 05：公路隧道 06：石化单位 07：核电站 08：水电站水库\n",name = "zqdx")
    private InnerZqdx zqdx;
    @ApiModelProperty(value = "灾情位置",name = "zqwz")
    private InnerZqwz zqwz;
    @ApiModelProperty(value = "灾情概述",name = "zqgs",example = "火势很大")
    private String zqgs;
    @ApiModelProperty(value = "灾情标识 0：假警 1：真警 2：错位接警 8：关联警情 9：逻辑删除",name = "zqbs",example = "1")
    private String zqbs;
    @ApiModelProperty(value = "突出灾情 0：非突出灾情 1：突出灾情",name = "tczq")
    private InnerTczq tczq;
    @ApiModelProperty(value = "燃烧楼层",name = "rslc",example = "12")
    private Integer rslc;
    @ApiModelProperty(value = "经度 精确到小数点后6位",name = "jd",example = "23.112233")
    private Double jd;
    @ApiModelProperty(value = "纬度 精确到小数点后6位",name = "wd",example = "21.112233")
    private Double wd;
    @ApiModelProperty(value = "报警人员",name = "bjry",example = "admin")
    private String bjry;
    @ApiModelProperty(value = "报警电话",name = "bjhd",example = "1234567")
    private String bjdh;
    @ApiModelProperty(value = "报警方式",name = "bjfs",example = "电话报警")
    private String bjfs;
    @ApiModelProperty(value = "报警时间",name = "bjsj",example = "2016-01-26 14:48:30")
    private String bjsj;
    @ApiModelProperty(value = "立案时间",name = "lasj",example = "2016-01-26 14:48:30")
    private String lasj;
    @ApiModelProperty(value = "结案时间",name = "jasj",example = "2016-01-26 14:48:30")
    private String jasj;
    @ApiModelProperty(value = "接受命令时间",name = "jsmlsj",example = "2016-01-26 14:48:30")
    private String jsmlsj;
    @ApiModelProperty(value = "出动警力时间",name = "cdjlsj",example = "2016-01-26 14:48:30")
    private String cdjlsj;
    @ApiModelProperty(value = "到达现场时间",name = "ddxcsj",example = "2016-01-26 14:48:30")
    private String ddxcsj;
    @ApiModelProperty(value = "战斗展开时间",name = "zdzksj",example = "2016-01-26 14:48:30")
    private String zdzksj;
    @ApiModelProperty(value = "到场出水时间",name = "dccssj",example = "2016-01-26 14:48:30")
    private String dccssj;
    @ApiModelProperty(value = "火势控制时间",name = "hskzsj",example = "2016-01-26 14:48:30")
    private String hskzsj;
    @ApiModelProperty(value = "基本扑灭时间",name = "jbpmsj",example = "2016-01-26 14:48:30")
    private String jbpmsj;
    @ApiModelProperty(value = "警力归队时间",name = "jlgdsj",example = "2016-01-26 14:48:30")
    private String jlgdsj;
    @ApiModelProperty(value = "现场指挥人员",name = "xczhry")
    private List<InnerXczhry> xczhry;
    @ApiModelProperty(value = "是否一次定位 0：否 1：是",name = "sfycdw",example = "0")
    private String sfycdw;
    @ApiModelProperty(value = "一次定位信息",name = "ycdwxx")
    private InnerDwxx ycdwxx;
    @ApiModelProperty(value = "是否二次定位 0：否 1：是",name = "sfecdw",example = "1")
    private String sfecdw;
    @ApiModelProperty(value = "二次定位信息",name = "ecdwxx")
    private InnerDwxx ecdwxx;
    @ApiModelProperty(value = "是否三次定位 0：否 1：是",name = "sfscdw",example = "0")
    private String sfscdw;
    @ApiModelProperty(value = "三次定位信息",name = "scdwxx")
    private InnerDwxx scdwxx;
    @ApiModelProperty(value = "处置过程确认",name = "czgcqr")
    private InnerCzgcqr czgcqr;
    @ApiModelProperty(value = "所在地消防机构",name = "szdxfjg")
    private InnerXfjg szdxfjg;
    @ApiModelProperty(value = "所在地行政区划",name = "szdxzqh")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "跨区域增援信息 1、nest嵌套对象，单值或数组形式 2、跨区域等级说明：1：总队 2：支队 3：大队 4：中队",name = "kqyzyxx")
    private List<InnerKqyzyxx> kqyzyxx;
    @ApiModelProperty(value = "数据来源",name = "sjly",example = "接警处数据库")
    private String sjly;
    @ApiModelProperty(value = "数据监测",name = "sjjc")
    private InnerSjjc sjjc;
    @ApiModelProperty(value = "检索内容",name = "jsnr")
    private List<String> jsnr;
    @ApiModelProperty(value = "检索内容(名称)",name = "jsnr_mc")
    private List<String> jsnr_mc;
    @ApiModelProperty(value = "检索内容(地址)",name = "jsnr_dz")
    private List<String> jsnr_dz;
    @ApiModelProperty(value = "检索内容(区划)",name = "jsnr_qh")
    private List<String> jsnr_qh;
    @ApiModelProperty(value = "记录状态 0：废弃 1：正常",name = "jlzt",example = "1")
    private String jlzt;
    @ApiModelProperty(value = "入库人员",name = "rkry",example = "admin")
    private String rkry;
    @ApiModelProperty(value = "入库时间",name = "rksj",example = "2016-01-26 14:48:30")
    private String rksj;
    @ApiModelProperty(value = "更新人员",name = "gxry",example = "admin")
    private String gxry;
    @ApiModelProperty(value = "更新时间",name = "gxsj",example = "2016-01-26 14:48:30")
    private String gxsj;
    @ApiModelProperty(value = "元素形状",name = "shape")
    private InnerShape shape;

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getGlbh() {
        return glbh;
    }

    public void setGlbh(String glbh) {
        this.glbh = glbh;
    }

    public String getZybh() {
        return zybh;
    }

    public void setZybh(String zybh) {
        this.zybh = zybh;
    }

    public String getZqfl() {
        return zqfl;
    }

    public void setZqfl(String zqfl) {
        this.zqfl = zqfl;
    }

    public String getZqmc() {
        return zqmc;
    }

    public void setZqmc(String zqmc) {
        this.zqmc = zqmc;
    }

    public String getZqqc() {
        return zqqc;
    }

    public void setZqqc(String zqqc) {
        this.zqqc = zqqc;
    }

    public String getZqdd() {
        return zqdd;
    }

    public void setZqdd(String zqdd) {
        this.zqdd = zqdd;
    }

    public InnerDxlbext getZqlx() {
        return zqlx;
    }

    public void setZqlx(InnerDxlbext zqlx) {
        this.zqlx = zqlx;
    }

    public InnerZqdx getZqdx() {
        return zqdx;
    }

    public void setZqdx(InnerZqdx zqdx) {
        this.zqdx = zqdx;
    }

    public InnerZqwz getZqwz() {
        return zqwz;
    }

    public void setZqwz(InnerZqwz zqwz) {
        this.zqwz = zqwz;
    }

    public String getZqgs() {
        return zqgs;
    }

    public void setZqgs(String zqgs) {
        this.zqgs = zqgs;
    }

    public String getZqbs() {
        return zqbs;
    }

    public void setZqbs(String zqbs) {
        this.zqbs = zqbs;
    }

    public Integer getRslc() {
        return rslc;
    }

    public void setRslc(Integer rslc) {
        this.rslc = rslc;
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

    public String getBjry() {
        return bjry;
    }

    public void setBjry(String bjry) {
        this.bjry = bjry;
    }

    public String getBjdh() {
        return bjdh;
    }

    public void setBjdh(String bjdh) {
        this.bjdh = bjdh;
    }

    public String getBjsj() {
        return bjsj;
    }

    public void setBjsj(String bjsj) {
        this.bjsj = bjsj;
    }

    public String getLasj() {
        return lasj;
    }

    public void setLasj(String lasj) {
        this.lasj = lasj;
    }

    public String getJasj() {
        return jasj;
    }

    public void setJasj(String jasj) {
        this.jasj = jasj;
    }

    public String getJsmlsj() {
        return jsmlsj;
    }

    public void setJsmlsj(String jsmlsj) {
        this.jsmlsj = jsmlsj;
    }

    public String getCdjlsj() {
        return cdjlsj;
    }

    public void setCdjlsj(String cdjlsj) {
        this.cdjlsj = cdjlsj;
    }

    public String getDdxcsj() {
        return ddxcsj;
    }

    public void setDdxcsj(String ddxcsj) {
        this.ddxcsj = ddxcsj;
    }

    public String getZdzksj() {
        return zdzksj;
    }

    public void setZdzksj(String zdzksj) {
        this.zdzksj = zdzksj;
    }

    public String getDccssj() {
        return dccssj;
    }

    public void setDccssj(String dccssj) {
        this.dccssj = dccssj;
    }

    public String getHskzsj() {
        return hskzsj;
    }

    public void setHskzsj(String hskzsj) {
        this.hskzsj = hskzsj;
    }

    public String getJbpmsj() {
        return jbpmsj;
    }

    public void setJbpmsj(String jbpmsj) {
        this.jbpmsj = jbpmsj;
    }

    public String getJlgdsj() {
        return jlgdsj;
    }

    public void setJlgdsj(String jlgdsj) {
        this.jlgdsj = jlgdsj;
    }

    public List<InnerXczhry> getXczhry() {
        return xczhry;
    }

    public void setXczhry(List<InnerXczhry> xczhry) {
        this.xczhry = xczhry;
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

    public List<InnerKqyzyxx> getKqyzyxx() {
        return kqyzyxx;
    }

    public void setKqyzyxx(List<InnerKqyzyxx> kqyzyxx) {
        this.kqyzyxx = kqyzyxx;
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

    public void setShape(InnerShape shape) {
        this.shape = shape;
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

    public InnerDxlb getZqdj() {
        return zqdj;
    }

    public void setZqdj(InnerDxlb zqdj) {
        this.zqdj = zqdj;
    }

    public InnerDxlb getZqzt() {
        return zqzt;
    }

    public void setZqzt(InnerDxlb zqzt) {
        this.zqzt = zqzt;
    }

    public InnerTczq getTczq() {
        return tczq;
    }

    public void setTczq(InnerTczq tczq) {
        this.tczq = tczq;
    }

    public String getBjfs() {
        return bjfs;
    }

    public void setBjfs(String bjfs) {
        this.bjfs = bjfs;
    }

    public InnerShape getShape() {
        return shape;
    }

    public List<String> getJsnr_mc() {
        return jsnr_mc;
    }

    public void setJsnr_mc(List<String>jsnr_mc) {
        this.jsnr_mc = jsnr_mc;
    }

    public List<String> getJsnr_dz() {
        return jsnr_dz;
    }

    public void setJsnr_dz(List<String>jsnr_dz) {
        this.jsnr_dz = jsnr_dz;
    }

    public List<String> getJsnr_qh() {
        return jsnr_qh;
    }

    public void setJsnr_qh(List<String> jsnr_qh) {
        this.jsnr_qh = jsnr_qh;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public String getSfycdw() {
        return sfycdw;
    }

    public void setSfycdw(String sfycdw) {
        this.sfycdw = sfycdw;
    }

    public String getSfecdw() {
        return sfecdw;
    }

    public void setSfecdw(String sfecdw) {
        this.sfecdw = sfecdw;
    }

    public String getSfscdw() {
        return sfscdw;
    }

    public void setSfscdw(String sfscdw) {
        this.sfscdw = sfscdw;
    }

    public InnerCzgcqr getCzgcqr() {
        return czgcqr;
    }

    public void setCzgcqr(InnerCzgcqr czgcqr) {
        this.czgcqr = czgcqr;
    }

    public InnerDwxx getYcdwxx() {
        return ycdwxx;
    }

    public void setYcdwxx(InnerDwxx ycdwxx) {
        this.ycdwxx = ycdwxx;
    }

    public InnerDwxx getEcdwxx() {
        return ecdwxx;
    }

    public void setEcdwxx(InnerDwxx ecdwxx) {
        this.ecdwxx = ecdwxx;
    }

    public InnerDwxx getScdwxx() {
        return scdwxx;
    }

    public void setScdwxx(InnerDwxx scdwxx) {
        this.scdwxx = scdwxx;
    }
}
