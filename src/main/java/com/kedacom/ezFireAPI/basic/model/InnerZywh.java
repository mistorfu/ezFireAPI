package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerZywh  主要危害
 * @Date 2018/5/25 13:28
 * @Author zhaomeng
 */
@ApiModel(value = "主要危害",description = "主要危害对象")
public class InnerZywh {
    @ApiModelProperty(value = "危害物质")
    private String whwz;
    @ApiModelProperty(value = "危害概述")
    private String whgs;
    @ApiModelProperty(value = "防护要求")
    private String fhyq;
    @ApiModelProperty(value = "存放位置")
    private String cfwz;

    public String getWhwz() {
        return whwz;
    }

    public void setWhwz(String whwz) {
        this.whwz = whwz;
    }

    public String getWhgs() {
        return whgs;
    }

    public void setWhgs(String whgs) {
        this.whgs = whgs;
    }

    public String getFhyq() {
        return fhyq;
    }

    public void setFhyq(String fhyq) {
        this.fhyq = fhyq;
    }

    public String getCfwz() {
        return cfwz;
    }

    public void setCfwz(String cfwz) {
        this.cfwz = cfwz;
    }
}