package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerNbjzqk  内部建筑情况
 * @Date 2018/5/25 11:08
 * @Author zhaomeng
 */
@ApiModel(value = "内部建筑情况",description = "内部建筑情况对象")
public class InnerNbjzqk {
    @ApiModelProperty(value = "建筑编号")
    private String jzbh;
    @ApiModelProperty(value = "建筑名称")
    private String jzmc;

    public String getJzbh() {
        return jzbh;
    }

    public void setJzbh(String jzbh) {
        this.jzbh = jzbh;
    }

    public String getJzmc() {
        return jzmc;
    }

    public void setJzmc(String jzmc) {
        this.jzmc = jzmc;
    }
}