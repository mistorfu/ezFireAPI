package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerShape;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author luping
 * @date 2018/6/12
 */
@ApiModel(value = "灾情位置",description = "灾情位置对象")
public class Zqwz {
    @ApiModelProperty(value = "灾情编号",name = "zqbh",example = "123")
    private String zqbh;
    @ApiModelProperty(value = "位置编号",name = "wzbh",example = "123")
    private String wzbh;
    @ApiModelProperty(value = "位置类型 0：受灾位置 1：车辆集结地 2：物资集结地 3：特种装备集结地 9：其他",name = "wzlx",example = "0")
    private String wzlx;
    @ApiModelProperty(value = "位置序号 1、2、3等依次类推",name = "wzxh",example = "1")
    private Integer wzxh;
    @ApiModelProperty(value = "经度 精确到小数点后6位",name = "jd",example = "2.112233")
    private Double jd;
    @ApiModelProperty(value = "纬度 精确到小数点后6位",name = "wd",example = "1.112233")
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

    public String getWzbh() {
        return wzbh;
    }

    public void setWzbh(String wzbh) {
        this.wzbh = wzbh;
    }

    public String getWzlx() {
        return wzlx;
    }

    public void setWzlx(String wzlx) {
        this.wzlx = wzlx;
    }

    public Integer getWzxh() {
        return wzxh;
    }

    public void setWzxh(Integer wzxh) {
        this.wzxh = wzxh;
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
