package com.kedacom.ezFireAPI.detection.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 检验规则
 * @author zhanghao
 */
@ApiModel(value = "校验规则",description = "校验规则对象")
public class BFireJygz implements Serializable {
    @ApiModelProperty(value="规则名称")
    private String gzmc;

    @ApiModelProperty(value="错误提示")
    private String cwts;

    @ApiModelProperty(value="规则编号")
    private String gzbh;

    @ApiModelProperty(value="规则描述")
    private String gzms;

    @ApiModelProperty(value="规则类型")
    private String gzlx;

    @ApiModelProperty(value="规则格式")
    private String gzgs;

    private String rkry;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date rksj;

    private String gxry;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gxsj;

    private String ylzd1;

    private String ylzd2;

    private String ylzd3;

    private static final long serialVersionUID = 1L;

    public String getGzbh() {
        return gzbh;
    }

    public void setGzbh(String gzbh) {
        this.gzbh = gzbh;
    }

    public String getGzmc() {
        return gzmc;
    }

    public void setGzmc(String gzmc) {
        this.gzmc = gzmc;
    }

    public String getGzlx() {
        return gzlx;
    }

    public void setGzlx(String gzlx) {
        this.gzlx = gzlx;
    }

    public String getGzgs() {
        return gzgs;
    }

    public void setGzgs(String gzgs) {
        this.gzgs = gzgs;
    }

    public String getGzms() {
        return gzms;
    }

    public void setGzms(String gzms) {
        this.gzms = gzms;
    }

    public String getCwts() {
        return cwts;
    }

    public void setCwts(String cwts) {
        this.cwts = cwts;
    }

    public String getRkry() {
        return rkry;
    }

    public void setRkry(String rkry) {
        this.rkry = rkry;
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    public String getGxry() {
        return gxry;
    }

    public void setGxry(String gxry) {
        this.gxry = gxry;
    }

    public Date getGxsj() {
        return gxsj;
    }

    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }

    public String getYlzd1() {
        return ylzd1;
    }

    public void setYlzd1(String ylzd1) {
        this.ylzd1 = ylzd1;
    }

    public String getYlzd2() {
        return ylzd2;
    }

    public void setYlzd2(String ylzd2) {
        this.ylzd2 = ylzd2;
    }

    public String getYlzd3() {
        return ylzd3;
    }

    public void setYlzd3(String ylzd3) {
        this.ylzd3 = ylzd3;
    }
}