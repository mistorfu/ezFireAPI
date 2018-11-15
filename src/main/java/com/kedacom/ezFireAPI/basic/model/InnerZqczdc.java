package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerZqczdc 灾情处置对策
 * @Date 2018/5/25 11:17
 * @Author zhaomeng
 */
@ApiModel(value = "灾情处置对策",description = "灾情处置对策对象")
public class InnerZqczdc {
    @ApiModelProperty(value = "灾情类别")
    private String zqlb;
    @ApiModelProperty(value = "灾情名称")
    private String zqmc;
    @ApiModelProperty(value = "对策概述")
    private String dcgs;
    @ApiModelProperty(value = "对策文件")
    private String dcwj;

    public String getZqlb() {
        return zqlb;
    }

    public void setZqlb(String zqlb) {
        this.zqlb = zqlb;
    }

    public String getZqmc() {
        return zqmc;
    }

    public void setZqmc(String zqmc) {
        this.zqmc = zqmc;
    }

    public String getDcgs() {
        return dcgs;
    }

    public void setDcgs(String dcgs) {
        this.dcgs = dcgs;
    }

    public String getDcwj() {
        return dcwj;
    }

    public void setDcwj(String dcwj) {
        this.dcwj = dcwj;
    }
}