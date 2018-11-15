package com.kedacom.ezFireAPI.person.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by fudapeng on 2018/5/27.
 * @ClassName Life 人员生命体征
 */
@ApiModel(value="人员生命体征",description="人员生命体征对象")
public class Life {
    @ApiModelProperty(value="人员编号")
    private String rybh; // 人员编号
    @ApiModelProperty(value="人员姓名")
    private String ryxm; // 人员姓名
    @ApiModelProperty(value="体温 单位 ℃")
    private double tw; // 体温 单位 ℃
    @ApiModelProperty(value="脉搏 单位 次/分钟")
    private int mb; // 脉搏 单位 次/分钟
    @ApiModelProperty(value="呼吸 单位 次/分钟")
    private int hx; // 呼吸 单位 次/分钟
    @ApiModelProperty(value="心率 单位 次/分钟")
    private int xl; // 心率 单位 次/分钟
    @ApiModelProperty(value="收缩压 单位 mmHg")
    private int ssy; // 收缩压 单位 mmHg
    @ApiModelProperty(value="舒张压 单位 mmHg")
    private int szy; // 舒张压 单位 mmHg
    @ApiModelProperty(value="血氧饱和度 单位 %")
    private double xybhd; // 血氧饱和度 单位 %
    @ApiModelProperty(value="体征状态 0:正常 1:警戒 2:危险")
    private String tzzt; //  体征状态 0:正常 1:警戒 2:危险
    @ApiModelProperty(value="采集设备")
    private String cjsb; // 采集设备
    @ApiModelProperty(value="消防机构")
    private String xfjg; // 消防机构
    @ApiModelProperty(value="灾情编号")
    private String zqbh; // 灾情编号
    @ApiModelProperty(value="采集时间")
    private String cjsj; // 采集时间
    @ApiModelProperty(value="更新时间")
    private String gxsj; // 更新时间

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

    public double getTw() {
        return tw;
    }

    public void setTw(double tw) {
        this.tw = tw;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        this.mb = mb;
    }

    public int getHx() {
        return hx;
    }

    public void setHx(int hx) {
        this.hx = hx;
    }

    public int getXl() {
        return xl;
    }

    public void setXl(int xl) {
        this.xl = xl;
    }

    public int getSsy() {
        return ssy;
    }

    public void setSsy(int ssy) {
        this.ssy = ssy;
    }

    public int getSzy() {
        return szy;
    }

    public void setSzy(int szy) {
        this.szy = szy;
    }

    public double getXybhd() {
        return xybhd;
    }

    public void setXybhd(double xybhd) {
        this.xybhd = xybhd;
    }

    public String getTzzt() {
        return tzzt;
    }

    public void setTzzt(String tzzt) {
        this.tzzt = tzzt;
    }

    public String getCjsb() {
        return cjsb;
    }

    public void setCjsb(String cjsb) {
        this.cjsb = cjsb;
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
