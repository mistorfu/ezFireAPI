package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerBdqk 编队情况
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="编队情况",description="编队情况对象")
public class InnerBdqk {
    @ApiModelProperty(value="编队名称")
    private String bdmc;
    @ApiModelProperty(value="编队数量")
    private int bdsl;
    @ApiModelProperty(value="编队人数")
    private int bdrs;
    @ApiModelProperty(value="编队车数")
    private int bdcs;

    public String getBdmc() {
        return bdmc;
    }

    public void setBdmc(String bdmc) {
        this.bdmc = bdmc;
    }

    public int getBdsl() {
        return bdsl;
    }

    public void setBdsl(int bdsl) {
        this.bdsl = bdsl;
    }

    public int getBdrs() {
        return bdrs;
    }

    public void setBdrs(int bdrs) {
        this.bdrs = bdrs;
    }

    public int getBdcs() {
        return bdcs;
    }

    public void setBdcs(int bdcs) {
        this.bdcs = bdcs;
    }
}
