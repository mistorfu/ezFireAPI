package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 调派器材
 * @author: wangjinbo
 * @create: 2018-05-28 16:26
 */
@ApiModel(value="调派器材",description="调派器材对象")
public class InnerDpqc {
    @ApiModelProperty(value="器材编号")
    private String qcbh;  //器材编号
    @ApiModelProperty(value="器材名称")
    private String qcmc;  //器材名称
    @ApiModelProperty(value="器材类型")
    private String qclx;  //器材类型
    @ApiModelProperty(value="器材数量")
    private Integer qcsl; //器材数量
    @ApiModelProperty(value="开始时间")
    private String kssj;  //开始时间
    @ApiModelProperty(value="结束时间")
    private String jssj;  //结束时间

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

    public Integer getQcsl() {
        return qcsl;
    }

    public void setQcsl(Integer qcsl) {
        this.qcsl = qcsl;
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
    }
}
