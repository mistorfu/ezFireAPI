package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @description: 消防机构
 * Created by fudapeng on 2018/5/29.
 */
@ApiModel(value="消防机构",description="消防机构对象")
public class InnerXfjg {
    @ApiModelProperty(value="消防机构编号")
    private String  xfjgbh;    //消防机构编号
    @ApiModelProperty(value="消防机构名称")
    private String  xfjgmc;    //消防机构名称
    @ApiModelProperty(value="消防机构简称")
    private String  xfjgjc;    //消防机构简称
    @ApiModelProperty(value="消防机构内部编码")
    private String  xfjgnbbm;  //消防机构内部编码

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

    public String getXfjgjc() {
        return xfjgjc;
    }

    public void setXfjgjc(String xfjgjc) {
        this.xfjgjc = xfjgjc;
    }

    public String getXfjgnbbm() {
        return xfjgnbbm;
    }

    public void setXfjgnbbm(String xfjgnbbm) {
        this.xfjgnbbm = xfjgnbbm;
    }
}
