package com.kedacom.ezFireAPI.person.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by fudapeng on 2018/8/14.
 */
@ApiModel(value="装备信息",description="装备信息对象")
public class InnerZbxx {
    @ApiModelProperty(value="装备编号")
    private String zbbh;
    @ApiModelProperty(value="装备名称")
    private String zbmc;
    @ApiModelProperty(value="装备类型")
    private String zblx;
    @ApiModelProperty(value="装备状态 0：下线 1：上线 2：撤离 3：告警 9：其他")
    private String zbzt;
    @ApiModelProperty(value="视频编号")
    private String spbh;

    public String getZbbh() {
        return zbbh;
    }

    public void setZbbh(String zbbh) {
        this.zbbh = zbbh;
    }

    public String getZbmc() {
        return zbmc;
    }

    public void setZbmc(String zbmc) {
        this.zbmc = zbmc;
    }

    public String getZblx() {
        return zblx;
    }

    public void setZblx(String zblx) {
        this.zblx = zblx;
    }

    public String getZbzt() {
        return zbzt;
    }

    public void setZbzt(String zbzt) {
        this.zbzt = zbzt;
    }

    public String getSpbh() {
        return spbh;
    }

    public void setSpbh(String spbh) {
        this.spbh = spbh;
    }
}