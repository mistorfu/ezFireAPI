package com.kedacom.ezFireAPI.person.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by fudapeng on 2018/8/14.
 */
@ApiModel(value="人员装备信息",description="人员装备信息对象")
public class Device {
    @ApiModelProperty(value="人员编号")
    private String rybh;
    @ApiModelProperty(value="人员姓名")
    private String ryxm;
    @ApiModelProperty(value="装备信息")
    private List<InnerZbxx> zbxx;
    @ApiModelProperty(value="消防机构 所在地消防机构编号")
    private String xfjg;
    @ApiModelProperty(value="灾情编号 当前关联的灾情编号")
    private String zqbh;
    @ApiModelProperty(value="采集时间 格式：yyyy-MM-dd HH:mm:ss")
    private String cjsj;
    @ApiModelProperty(value="更新时间 格式：yyyy-MM-dd HH:mm:ss")
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

    public List<InnerZbxx> getZbxx() {
        return zbxx;
    }

    public void setZbxx(List<InnerZbxx> zbxx) {
        this.zbxx = zbxx;
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