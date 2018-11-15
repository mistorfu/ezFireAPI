package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author  zhaomeng
 * @create  2018/5/23
 **/
@ApiModel(value="车辆底盘",description="车辆底盘对象")
public class Cldp {
    @ApiModelProperty(value="车辆编号")
    private String clbh;
    @ApiModelProperty(value="车牌号码")
    private String cphm;
    @ApiModelProperty(value="发动机转速")
    private Double fdjzs;
    @ApiModelProperty(value="水温")
    private Double sw;
    @ApiModelProperty(value="车速")
    private Double cs;
    @ApiModelProperty(value="机油压力")
    private Double jyyl;
    @ApiModelProperty(value="燃油可用时间")
    private Double rykysj;
    @ApiModelProperty(value="燃油使用总量")
    private Double rlsyzl;
    @ApiModelProperty(value="瞬时油耗")
    private Double ssyh;
    @ApiModelProperty(value="平均油耗")
    private Double pjyh;
    @ApiModelProperty(value="剩余燃油百分比")
    private Double syrybfb;
    @ApiModelProperty(value="总里程")
    private Double zlc;
    @ApiModelProperty(value="蓄电池电压")
    private Double xdcdy;
    @ApiModelProperty(value="油门踏板位置")
    private Double ymtbwz;
    @ApiModelProperty(value="发动机工作小时")
    private Double fdjgzxs;
    @ApiModelProperty(value="机油温度")
    private Double jywd;
    @ApiModelProperty(value="燃油温度")
    private Double rywd;
    @ApiModelProperty(value="气压表1")
    private Double qyb_1;
    @ApiModelProperty(value="气压表2")
    private Double qyb_2;
    @ApiModelProperty(value="消防机构")
    private String xfjg;
    @ApiModelProperty(value="灾情编号")
    private String zqbh;
    @ApiModelProperty(value="采集时间")
    private String cjsj;
    @ApiModelProperty(value="更新时间")
    private String gxsj;

    public String getClbh() {
        return clbh;
    }

    public void setClbh(String clbh) {
        this.clbh = clbh;
    }

    public String getCphm() {
        return cphm;
    }

    public void setCphm(String cphm) {
        this.cphm = cphm;
    }

    public Double getFdjzs() {
        return fdjzs;
    }

    public void setFdjzs(Double fdjzs) {
        this.fdjzs = fdjzs;
    }

    public Double getSw() {
        return sw;
    }

    public void setSw(Double sw) {
        this.sw = sw;
    }

    public Double getCs() {
        return cs;
    }

    public void setCs(Double cs) {
        this.cs = cs;
    }

    public Double getJyyl() {
        return jyyl;
    }

    public void setJyyl(Double jyyl) {
        this.jyyl = jyyl;
    }

    public Double getRykysj() {
        return rykysj;
    }

    public void setRykysj(Double rykysj) {
        this.rykysj = rykysj;
    }

    public Double getRlsyzl() {
        return rlsyzl;
    }

    public void setRlsyzl(Double rlsyzl) {
        this.rlsyzl = rlsyzl;
    }

    public Double getSsyh() {
        return ssyh;
    }

    public void setSsyh(Double ssyh) {
        this.ssyh = ssyh;
    }

    public Double getPjyh() {
        return pjyh;
    }

    public void setPjyh(Double pjyh) {
        this.pjyh = pjyh;
    }

    public Double getSyrybfb() {
        return syrybfb;
    }

    public void setSyrybfb(Double syrybfb) {
        this.syrybfb = syrybfb;
    }

    public Double getZlc() {
        return zlc;
    }

    public void setZlc(Double zlc) {
        this.zlc = zlc;
    }

    public Double getXdcdy() {
        return xdcdy;
    }

    public void setXdcdy(Double xdcdy) {
        this.xdcdy = xdcdy;
    }

    public Double getYmtbwz() {
        return ymtbwz;
    }

    public void setYmtbwz(Double ymtbwz) {
        this.ymtbwz = ymtbwz;
    }

    public Double getFdjgzxs() {
        return fdjgzxs;
    }

    public void setFdjgzxs(Double fdjgzxs) {
        this.fdjgzxs = fdjgzxs;
    }

    public Double getJywd() {
        return jywd;
    }

    public void setJywd(Double jywd) {
        this.jywd = jywd;
    }

    public Double getRywd() {
        return rywd;
    }

    public void setRywd(Double rywd) {
        this.rywd = rywd;
    }

    public Double getQyb_1() {
        return qyb_1;
    }

    public void setQyb_1(Double qyb_1) {
        this.qyb_1 = qyb_1;
    }

    public Double getQyb_2() {
        return qyb_2;
    }

    public void setQyb_2(Double qyb_2) {
        this.qyb_2 = qyb_2;
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
