package com.kedacom.ezFireAPI.ez.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "操作用户",description = "操作用户对象")
public class InnerCzyh {
    @ApiModelProperty(value = "用户名")
    private String yhm;
    @ApiModelProperty(value = "用户编号")
    private String yhbh;
    @ApiModelProperty(value = "用户姓名")
    private String yhxm;
    @ApiModelProperty(value = "身份证号")
    private String sfzh;

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String yhm) {
        this.yhm = yhm;
    }

    public String getYhbh() {
        return yhbh;
    }

    public void setYhbh(String yhbh) {
        this.yhbh = yhbh;
    }

    public String getYhxm() {
        return yhxm;
    }

    public void setYhxm(String yhxm) {
        this.yhxm = yhxm;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }
}
