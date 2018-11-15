package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerLszqqk  历史灾情情况
 * @Date 2018/5/25 11:15
 * @Author zhaomeng
 */
@ApiModel(value = "历史灾情情况",description = "历史灾情情况对象")
public class InnerLszqqk {
    @ApiModelProperty(value = "灾情编号")
    private String zqbh;
    @ApiModelProperty(value = "发生时间 格式：yyyy-MM-dd HH:mm:ss")
    private String fssj;
    @ApiModelProperty(value = "灾情概述")
    private String zqgs;
    @ApiModelProperty(value = "处置概述")
    private String czgs;
    @ApiModelProperty(value = "处置文件")
    private String czwj;

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getZqgs() {
        return zqgs;
    }

    public void setZqgs(String zqgs) {
        this.zqgs = zqgs;
    }

    public String getCzgs() {
        return czgs;
    }

    public void setCzgs(String czgs) {
        this.czgs = czgs;
    }

    public String getCzwj() {
        return czwj;
    }

    public void setCzwj(String czwj) {
        this.czwj = czwj;
    }
}