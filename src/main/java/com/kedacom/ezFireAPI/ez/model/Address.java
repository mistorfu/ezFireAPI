package com.kedacom.ezFireAPI.ez.model;

import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by fudapeng on 2018/8/28.
 */
@ApiModel(value = "门址门牌号",description = "门址门牌号对象")
public class Address {
    @ApiModelProperty(value = "住址编号")
    private String zzbh;
    @ApiModelProperty(value = "住址详址")
    private String zzxz;
    @ApiModelProperty(value = "住址大类")
    private String zzdl;
    @ApiModelProperty(value = "住址中类")
    private String zzzl;
    @ApiModelProperty(value = "住址小类")
    private String zzxl;
    @ApiModelProperty(value = "住址状态 0：失效 1：有效")
    private String zzzt;
    @ApiModelProperty(value = "社会单位名称")
    private String shdwmc;
    @ApiModelProperty(value = "周边标志建筑")
    private String zbbzjz;
    @ApiModelProperty(value = "关联住址编号")
    private String glzzbh;
    @ApiModelProperty(value = "街路巷ID")
    private String jlx;
    @ApiModelProperty(value = "街路巷名称")
    private String jlxmc;
    @ApiModelProperty(value = "门牌号")
    private String mph;
    @ApiModelProperty(value = "门牌号码")
    private Integer mphm;
    @ApiModelProperty(value = "门牌前缀")
    private String mpqz;
    @ApiModelProperty(value = "门派后缀")
    private String mphz;
    @ApiModelProperty(value = "副号")
    private String fh;
    @ApiModelProperty(value = "副号后缀")
    private String fhhz;
    @ApiModelProperty(value = "幢楼号")
    private String zlh;
    @ApiModelProperty(value = "幢楼前缀")
    private String zlqz;
    @ApiModelProperty(value = "幢楼后缀")
    private String zlhz;
    @ApiModelProperty(value = "单元号")
    private String dyh;
    @ApiModelProperty(value = "室号")
    private String sh;
    @ApiModelProperty(value = "室号后缀")
    private String shhz;
    @ApiModelProperty(value = "门楼详址")
    private String mlxz;
    @ApiModelProperty(value = "所属社区")
    private String sssq;
    @ApiModelProperty(value = "居村委会")
    private String jwh;
    @ApiModelProperty(value = "警务责任区")
    private String jwzrq;
    @ApiModelProperty(value = "地址属性")
    private String dzsx;
    @ApiModelProperty(value = "地址用途")
    private String dzyt;
    @ApiModelProperty(value = "联系人员")
    private String lxry;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;
    @ApiModelProperty(value = "住址组编号")
    private String zbh;
    @ApiModelProperty(value = "承租人及其关系人数")
    private Integer gxczrs;
    @ApiModelProperty(value = "产权人及其关系人数")
    private Integer gxcqrs;
    @ApiModelProperty(value = "经度 X坐标")
    private Double jd;
    @ApiModelProperty(value = "纬度 Y坐标")
    private Double wd;
    @ApiModelProperty(value = "Z坐标")
    private Double z;
    @ApiModelProperty(value = "中心X坐标")
    private Double dx;
    @ApiModelProperty(value = "中心Y坐标")
    private Double dy;
    @ApiModelProperty(value = "中心Z坐标")
    private Double dz;
    @ApiModelProperty(value = "所在地行政区划")
    private InnerXzqh szdxzqh;
    @ApiModelProperty(value = "数据来源")
    private String sjly;
    @ApiModelProperty(value = "检索内容")
    private List jsnr;
    @ApiModelProperty(value = "检索内容 区划名称")
    private List jsnr_xzqhmc;
    @ApiModelProperty(value = "检索内容 住址详址")
    private List jsnr_zzxz;
    @ApiModelProperty(value = "记录状态 0：废弃 1：正常")
    private String jlzt;
    @ApiModelProperty(value = "创建用户")
    private String cjyh;
    @ApiModelProperty(value = "创建人员")
    private String cjry;
    @ApiModelProperty(value = "创建单位")
    private String cjdw;
    @ApiModelProperty(value = "创建时间")
    private String cjsj;
    @ApiModelProperty(value = "更新用户")
    private String gxyh;
    @ApiModelProperty(value = "更新人员")
    private String gxry;
    @ApiModelProperty(value = "更新单位")
    private String gxdw;
    @ApiModelProperty(value = "更新时间")
    private String gxsj;
    @ApiModelProperty(value = "元素形状")
    private InnerShape shape;

    public String getZzbh() {
        return zzbh;
    }

    public void setZzbh(String zzbh) {
        this.zzbh = zzbh;
    }

    public String getZzxz() {
        return zzxz;
    }

    public void setZzxz(String zzxz) {
        this.zzxz = zzxz;
    }

    public String getZzdl() {
        return zzdl;
    }

    public void setZzdl(String zzdl) {
        this.zzdl = zzdl;
    }

    public String getZzzl() {
        return zzzl;
    }

    public void setZzzl(String zzzl) {
        this.zzzl = zzzl;
    }

    public String getZzxl() {
        return zzxl;
    }

    public void setZzxl(String zzxl) {
        this.zzxl = zzxl;
    }

    public String getZzzt() {
        return zzzt;
    }

    public void setZzzt(String zzzt) {
        this.zzzt = zzzt;
    }

    public String getShdwmc() {
        return shdwmc;
    }

    public void setShdwmc(String shdwmc) {
        this.shdwmc = shdwmc;
    }

    public String getZbbzjz() {
        return zbbzjz;
    }

    public void setZbbzjz(String zbbzjz) {
        this.zbbzjz = zbbzjz;
    }

    public String getGlzzbh() {
        return glzzbh;
    }

    public void setGlzzbh(String glzzbh) {
        this.glzzbh = glzzbh;
    }

    public String getJlx() {
        return jlx;
    }

    public void setJlx(String jlx) {
        this.jlx = jlx;
    }

    public String getJlxmc() {
        return jlxmc;
    }

    public void setJlxmc(String jlxmc) {
        this.jlxmc = jlxmc;
    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    public Integer getMphm() {
        return mphm;
    }

    public void setMphm(Integer mphm) {
        this.mphm = mphm;
    }

    public String getMpqz() {
        return mpqz;
    }

    public void setMpqz(String mpqz) {
        this.mpqz = mpqz;
    }

    public String getMphz() {
        return mphz;
    }

    public void setMphz(String mphz) {
        this.mphz = mphz;
    }

    public String getFh() {
        return fh;
    }

    public void setFh(String fh) {
        this.fh = fh;
    }

    public String getFhhz() {
        return fhhz;
    }

    public void setFhhz(String fhhz) {
        this.fhhz = fhhz;
    }

    public String getZlh() {
        return zlh;
    }

    public void setZlh(String zlh) {
        this.zlh = zlh;
    }

    public String getZlqz() {
        return zlqz;
    }

    public void setZlqz(String zlqz) {
        this.zlqz = zlqz;
    }

    public String getZlhz() {
        return zlhz;
    }

    public void setZlhz(String zlhz) {
        this.zlhz = zlhz;
    }

    public String getDyh() {
        return dyh;
    }

    public void setDyh(String dyh) {
        this.dyh = dyh;
    }

    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    public String getShhz() {
        return shhz;
    }

    public void setShhz(String shhz) {
        this.shhz = shhz;
    }

    public String getMlxz() {
        return mlxz;
    }

    public void setMlxz(String mlxz) {
        this.mlxz = mlxz;
    }

    public String getSssq() {
        return sssq;
    }

    public void setSssq(String sssq) {
        this.sssq = sssq;
    }

    public String getJwh() {
        return jwh;
    }

    public void setJwh(String jwh) {
        this.jwh = jwh;
    }

    public String getJwzrq() {
        return jwzrq;
    }

    public void setJwzrq(String jwzrq) {
        this.jwzrq = jwzrq;
    }

    public String getDzsx() {
        return dzsx;
    }

    public void setDzsx(String dzsx) {
        this.dzsx = dzsx;
    }

    public String getDzyt() {
        return dzyt;
    }

    public void setDzyt(String dzyt) {
        this.dzyt = dzyt;
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

    public String getZbh() {
        return zbh;
    }

    public void setZbh(String zbh) {
        this.zbh = zbh;
    }

    public Integer getGxczrs() {
        return gxczrs;
    }

    public void setGxczrs(Integer gxczrs) {
        this.gxczrs = gxczrs;
    }

    public Integer getGxcqrs() {
        return gxcqrs;
    }

    public void setGxcqrs(Integer gxcqrs) {
        this.gxcqrs = gxcqrs;
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

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getDx() {
        return dx;
    }

    public void setDx(Double dx) {
        this.dx = dx;
    }

    public Double getDy() {
        return dy;
    }

    public void setDy(Double dy) {
        this.dy = dy;
    }

    public Double getDz() {
        return dz;
    }

    public void setDz(Double dz) {
        this.dz = dz;
    }

    public InnerXzqh getSzdxzqh() {
        return szdxzqh;
    }

    public void setSzdxzqh(InnerXzqh sdzxzqh) {
        this.szdxzqh = sdzxzqh;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public List getJsnr() {
        return jsnr;
    }

    public void setJsnr(List jsnr) {
        this.jsnr = jsnr;
    }

    public List getJsnr_xzqhmc() {
        return jsnr_xzqhmc;
    }

    public void setJsnr_xzqhmc(List jsnr_xzqhmc) {
        this.jsnr_xzqhmc = jsnr_xzqhmc;
    }

    public List getJsnr_zzxz() {
        return jsnr_zzxz;
    }

    public void setJsnr_zzxz(List jsnr_zzxz) {
        this.jsnr_zzxz = jsnr_zzxz;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }

    public String getCjyh() {
        return cjyh;
    }

    public void setCjyh(String cjyh) {
        this.cjyh = cjyh;
    }

    public String getCjry() {
        return cjry;
    }

    public void setCjry(String cjry) {
        this.cjry = cjry;
    }

    public String getCjdw() {
        return cjdw;
    }

    public void setCjdw(String cjdw) {
        this.cjdw = cjdw;
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }

    public String getGxyh() {
        return gxyh;
    }

    public void setGxyh(String gxyh) {
        this.gxyh = gxyh;
    }

    public String getGxry() {
        return gxry;
    }

    public void setGxry(String gxry) {
        this.gxry = gxry;
    }

    public String getGxdw() {
        return gxdw;
    }

    public void setGxdw(String gxdw) {
        this.gxdw = gxdw;
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