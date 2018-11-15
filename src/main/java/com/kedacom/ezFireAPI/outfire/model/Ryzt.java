package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName Ryzt 人员状态
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="人员状态",description="人员状态对象")
public class Ryzt {
    @ApiModelProperty(value="人员编号")
    private String rybh;
    @ApiModelProperty(value="人员姓名")
    private String ryxm;
    @ApiModelProperty(value="人员状态")
    private String ryzt;
    @ApiModelProperty(value="消防机构")
    private String xfjg;
    @ApiModelProperty(value="灾情编号")
    private String zqbh;
    @ApiModelProperty(value="采集时间")
    private String cjsj;
    @ApiModelProperty(value="更新时间")
    private String gxsj;

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    public String getRyxm() {
        return ryxm;
    }

    public void setRyxm(String ryxm) {
        this.ryxm = ryxm;
    }

    public String getRyzt() {
        return ryzt;
    }

    public void setRyzt(String ryzt) {
        this.ryzt = ryzt;
    }

    public String getXfjg() {
        return xfjg;
    }

    public void setXfjg(String xfjg) {
        this.xfjg = xfjg;
    }

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}
