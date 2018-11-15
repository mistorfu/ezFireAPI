package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by fudapeng on 2018/7/30.
 */
@ApiModel(value="定位信息",description="定位信息对象")
public class InnerDwxx {
    @ApiModelProperty(value="是否定位 0：否 1：是")
    private String sfdw;
    @ApiModelProperty(value="操作人员")
    private String czry;
    @ApiModelProperty(value="操作时间")
    private String czsj;

    public String getSfdw() {
        return sfdw;
    }

    public void setSfdw(String sfdw) {
        this.sfdw = sfdw;
    }

    public String getCzry() {
        return czry;
    }

    public void setCzry(String czry) {
        this.czry = czry;
    }

    public String getCzsj() {
        return czsj;
    }

    public void setCzsj(String czsj) {
        this.czsj = czsj;
    }
}