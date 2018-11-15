package com.kedacom.ezFireAPI.alarm.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author luping
 * @date 2018/5/28 14:10
 */
@ApiModel(value = "处置过程确认",description = "处置过程确认对象")
public class InnerCzgcqr {
    @ApiModelProperty(value = "是否确认（0：否 1：是）",name = "sfgr",example = "1")
    private String sfqr;
    @ApiModelProperty(value = "确认人员（人员名称）",name = "grry",example = "admin")
    private String qrry;
    @ApiModelProperty(value = "确认单位（单位名称）",name = "grdw",example = "广州消防支队")
    private String qrdw;
    @ApiModelProperty(value = "确认时间",name = "grsj",example = "2016-01-26 14:49:19")
    private String qrsj;

    public String getSfqr() {
        return sfqr;
    }

    public void setSfqr(String sfqr) {
        this.sfqr = sfqr;
    }

    public String getQrry() {
        return qrry;
    }

    public void setQrry(String qrry) {
        this.qrry = qrry;
    }

    public String getQrdw() {
        return qrdw;
    }

    public void setQrdw(String qrdw) {
        this.qrdw = qrdw;
    }

    public String getQrsj() {
        return qrsj;
    }

    public void setQrsj(String qrsj) {
        this.qrsj = qrsj;
    }
}
