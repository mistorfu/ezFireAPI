package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author luping
 * @date 2018/5/28 13:55
 */
@ApiModel(value = "灾情位置",description = "灾情位置对象")
public class InnerZqwz {
    @ApiModelProperty(value = "序号(1,2,3...)",name = "sx",example = "1")
    private Integer sx;
    @ApiModelProperty(value = "经度(精确到小数点后6位)",name = "jd",example = "12.221122")
    private Double jd;
    @ApiModelProperty(value = "纬度(精确到小数点后6位)",name = "wd",example = "21.221122")
    private Double wd;

    public Integer getSx() {
        return sx;
    }

    public void setSx(Integer sx) {
        this.sx = sx;
    }

    public Double getJd() {
        return jd;
    }

    public void setJd(Double jd) {
        this.jd = jd;
    }

    public Double getWd() {
        return wd;
    }

    public void setWd(Double wd) {
        this.wd = wd;
    }
}
