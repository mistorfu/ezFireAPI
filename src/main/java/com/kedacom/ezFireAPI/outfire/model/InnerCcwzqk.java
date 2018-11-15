package com.kedacom.ezFireAPI.outfire.model;

import com.kedacom.ezFireAPI.basic.model.InnerDwsx;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerCcwzqk 存储物资情况
 * @Date 2018/5/30 10:21
 * @Author zhaomeng
 */
@ApiModel(value = "存储物资情况",description = "存储物资情况对象")
public class InnerCcwzqk {
    @ApiModelProperty(value = "物资类型")
    private InnerDwsx wzlx;
    @ApiModelProperty(value = "物资名称")
    private String wzmc;
    @ApiModelProperty(value = "物资总数")
    private Double wzzs;
    @ApiModelProperty(value = "物资概述")
    private String wzgs;

    public InnerDwsx getWzlx() {
        return wzlx;
    }

    public void setWzlx(InnerDwsx wzlx) {
        this.wzlx = wzlx;
    }

    public String getWzmc() {
        return wzmc;
    }

    public void setWzmc(String wzmc) {
        this.wzmc = wzmc;
    }

    public Double getWzzs() {
        return wzzs;
    }

    public void setWzzs(Double wzzs) {
        this.wzzs = wzzs;
    }

    public String getWzgs() {
        return wzgs;
    }

    public void setWzgs(String wzgs) {
        this.wzgs = wzgs;
    }
}