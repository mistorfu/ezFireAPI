package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author luping
 * @date 2018/5/28 14:01
 */
@ApiModel(value = "跨区域增援信息",description = "跨区域增援信息对象")
public class InnerKqyzyxx {
    @ApiModelProperty(value = "跨区域等级 1：总队 2：支队 3：大队 4：中队",name = "kqydj",example = "2")
    private Integer kqydj;
    @ApiModelProperty(value = "跨区机构编号",name = "kqjgbh",example = "1234")
    private String kqjgbh;
    @ApiModelProperty(value = "跨区机构名称",name = "kqjgmc",example = "清远市公安消防支队")
    private String kqjgmc;
    @ApiModelProperty(value = "跨区机构简称",name = "kqjgjc",example = "清远支队")
    private String kqjgjc;
    @ApiModelProperty(value = "跨区机构内部编码",name = "kqjgnbbm",example = "1.44010.441820")
    private String kqjgnbbm;
    @ApiModelProperty(value = "跨区区划编号",name = "kqqhbh",example = "2134")
    private String kqqhbh;
    @ApiModelProperty(value = "跨区区划名称",name = "kqqhmc",example = "清远市")
    private String kqqhmc;
    @ApiModelProperty(value = "跨区区划内部编码",name = "kqqhnbbm",example = "1.440000.441800")
    private String kqqhnbbm;
    @ApiModelProperty(value = "消防机构编号",name = "xfjgbh",example = "1234")
    private String xfjgbh;
    @ApiModelProperty(value = "消防机构名称",name = "xfjgmc",example = "清远市公安消防支队")
    private String xfjgmc;
    @ApiModelProperty(value = "消防机构简称",name = "xfjgjc",example = "清远支队")
    private String xfjgjc;
    @ApiModelProperty(value = "消防机构内部编码",name = "xfjgnbbm",example = "1.44010.441820")
    private String xfjgnbbm;
    @ApiModelProperty(value = "行政区划编号",name = "xzqhbh",example = "2134")
    private String xzqhbh;
    @ApiModelProperty(value = "行政区划名称",name = "xzqhmc",example = "清远市")
    private String xzqhmc;
    @ApiModelProperty(value = "行政区划内部编码",name = "xzqhnbbm",example = "1.440000.441800")
    private String xzqhnbbm;

    public Integer getKqydj() {
        return kqydj;
    }

    public void setKqydj(Integer kqydj) {
        this.kqydj = kqydj;
    }

    public String getXfjgbh() {
        return xfjgbh;
    }

    public void setXfjgbh(String xfjgbh) {
        this.xfjgbh = xfjgbh;
    }

    public String getXfjgmc() {
        return xfjgmc;
    }

    public void setXfjgmc(String xfjgmc) {
        this.xfjgmc = xfjgmc;
    }

    public String getXfjgnbbm() {
        return xfjgnbbm;
    }

    public void setXfjgnbbm(String xfjgnbbm) {
        this.xfjgnbbm = xfjgnbbm;
    }

    public String getXzqhbh() {
        return xzqhbh;
    }

    public void setXzqhbh(String xzqhbh) {
        this.xzqhbh = xzqhbh;
    }

    public String getXzqhmc() {
        return xzqhmc;
    }

    public void setXzqhmc(String xzqhmc) {
        this.xzqhmc = xzqhmc;
    }

    public String getXzqhnbbm() {
        return xzqhnbbm;
    }

    public void setXzqhnbbm(String xzqhnbbm) {
        this.xzqhnbbm = xzqhnbbm;
    }

    public String getKqjgbh() {
        return kqjgbh;
    }

    public void setKqjgbh(String kqjgbh) {
        this.kqjgbh = kqjgbh;
    }

    public String getKqjgmc() {
        return kqjgmc;
    }

    public void setKqjgmc(String kqjgmc) {
        this.kqjgmc = kqjgmc;
    }

    public String getKqjgjc() {
        return kqjgjc;
    }

    public void setKqjgjc(String kqjgjc) {
        this.kqjgjc = kqjgjc;
    }

    public String getKqjgnbbm() {
        return kqjgnbbm;
    }

    public void setKqjgnbbm(String kqjgnbbm) {
        this.kqjgnbbm = kqjgnbbm;
    }

    public String getKqqhbh() {
        return kqqhbh;
    }

    public void setKqqhbh(String kqqhbh) {
        this.kqqhbh = kqqhbh;
    }

    public String getKqqhmc() {
        return kqqhmc;
    }

    public void setKqqhmc(String kqqhmc) {
        this.kqqhmc = kqqhmc;
    }

    public String getKqqhnbbm() {
        return kqqhnbbm;
    }

    public void setKqqhnbbm(String kqqhnbbm) {
        this.kqqhnbbm = kqqhnbbm;
    }

    public String getXfjgjc() {
        return xfjgjc;
    }

    public void setXfjgjc(String xfjgjc) {
        this.xfjgjc = xfjgjc;
    }
}
