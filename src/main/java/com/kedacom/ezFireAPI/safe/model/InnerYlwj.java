package com.kedacom.ezFireAPI.safe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "演练文件", description = "演练文件对象")
public class InnerYlwj {
    @ApiModelProperty(value = "文件类型")
    private String wjlx;
    @ApiModelProperty(value = "文件名称")
    private String wjmc;
    @ApiModelProperty(value = "缩略图片")
    private String sltp;
    @ApiModelProperty(value = "网络路径")
    private String wllj;
    @ApiModelProperty(value = "存储路径")
    private String cclj;
    @ApiModelProperty(value = "")
    private int xssx;

    public String getWjlx() {
        return wjlx;
    }

    public void setWjlx(String wjlx) {
        this.wjlx = wjlx;
    }

    public String getWjmc() {
        return wjmc;
    }

    public void setWjmc(String wjmc) {
        this.wjmc = wjmc;
    }

    public String getSltp() {
        return sltp;
    }

    public void setSltp(String sltp) {
        this.sltp = sltp;
    }

    public String getWllj() {
        return wllj;
    }

    public void setWllj(String wllj) {
        this.wllj = wllj;
    }

    public String getCclj() {
        return cclj;
    }

    public void setCclj(String cclj) {
        this.cclj = cclj;
    }

    public int getXssx() {
        return xssx;
    }

    public void setXssx(int xssx) {
        this.xssx = xssx;
    }
}
