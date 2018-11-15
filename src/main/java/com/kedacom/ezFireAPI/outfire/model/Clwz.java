package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *  @ClassName Clwz 车辆位置
 * Created by fudapeng on 2018/8/27.
 */
@ApiModel(value="车辆位置",description="车辆位置对象")
public class Clwz {
    @ApiModelProperty(value="车辆编号")
    private String sbbh;
    @ApiModelProperty(value="车牌号码")
    private String sbmc;
    @ApiModelProperty(value="车辆类型 设备类型字典项值")
    private String sblx;
    @ApiModelProperty(value="所属辖区")
    private String ssxq;
    @ApiModelProperty(value="设备经度")
    private String sbjd;
    @ApiModelProperty(value="设备纬度")
    private String sbwd;
    @ApiModelProperty(value="设备使用者")
    private String sbsyz;
    @ApiModelProperty(value="方向")
    private String fx;
    @ApiModelProperty(value="速度")
    private String sd;
    @ApiModelProperty(value="更新时间")
    private String gxsj;

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh;
    }

    public String getSbmc() {
        return sbmc;
    }

    public void setSbmc(String sbmc) {
        this.sbmc = sbmc;
    }

    public String getSblx() {
        return sblx;
    }

    public void setSblx(String sblx) {
        this.sblx = sblx;
    }

    public String getSsxq() {
        return ssxq;
    }

    public void setSsxq(String ssxq) {
        this.ssxq = ssxq;
    }

    public String getSbjd() {
        return sbjd;
    }

    public void setSbjd(String sbjd) {
        this.sbjd = sbjd;
    }

    public String getSbwd() {
        return sbwd;
    }

    public void setSbwd(String sbwd) {
        this.sbwd = sbwd;
    }

    public String getSbsyz() {
        return sbsyz;
    }

    public void setSbsyz(String sbsyz) {
        this.sbsyz = sbsyz;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}
