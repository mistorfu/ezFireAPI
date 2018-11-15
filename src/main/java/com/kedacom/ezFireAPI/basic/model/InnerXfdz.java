package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerXfdz 消防队站
 * @Date 2018/5/25 11:18
 * @Author zhaomeng
 */
@ApiModel(value = "消防队站",description = "消防队站对象")
public class InnerXfdz {
    @ApiModelProperty(value = "消防队站形式")
    private String xfdzxs;
    @ApiModelProperty(value = "消防队站编号")
    private String xfdzbh;
    @ApiModelProperty(value = "消防队站名称")
    private String xfdzmc;
    @ApiModelProperty(value = "消防队站简称")
    private String xfdzjc;

    public String getXfdzxs() {
        return xfdzxs;
    }

    public void setXfdzxs(String xfdzxs) {
        this.xfdzxs = xfdzxs;
    }

    public String getXfdzbh() {
        return xfdzbh;
    }

    public void setXfdzbh(String xfdzbh) {
        this.xfdzbh = xfdzbh;
    }

    public String getXfdzmc() {
        return xfdzmc;
    }

    public void setXfdzmc(String xfdzmc) {
        this.xfdzmc = xfdzmc;
    }

    public String getXfdzjc() {
        return xfdzjc;
    }

    public void setXfdzjc(String xfdzjc) {
        this.xfdzjc = xfdzjc;
    }
}