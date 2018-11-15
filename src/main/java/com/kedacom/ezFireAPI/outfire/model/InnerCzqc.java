package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerCzqc 车载器材
 * Created by fudapeng on 2018/7/16.
 */
@ApiModel(value="车载器材",description="车载器材对象")
public class InnerCzqc {
    @ApiModelProperty(value="器材编号")
    private String qcbh;
    @ApiModelProperty(value="器材名称")
    private String qcmc;
    @ApiModelProperty(value="器材类型")
    private String qclx;
    @ApiModelProperty(value="器材数量")
    private double qcsl;

    public String getQcbh() {
        return qcbh;
    }

    public void setQcbh(String qcbh) {
        this.qcbh = qcbh;
    }

    public String getQcmc() {
        return qcmc;
    }

    public void setQcmc(String qcmc) {
        this.qcmc = qcmc;
    }

    public String getQclx() {
        return qclx;
    }

    public void setQclx(String qclx) {
        this.qclx = qclx;
    }

    public double getQcsl() {
        return qcsl;
    }

    public void setQcsl(double qcsl) {
        this.qcsl = qcsl;
    }
}
