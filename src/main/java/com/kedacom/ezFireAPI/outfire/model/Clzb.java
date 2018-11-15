package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 *  @ClassName Clzb 车辆装备
 * Created by fudapeng on 2018/7/16.
 */
@ApiModel(value="车辆装备",description="车辆装备对象")
public class Clzb {
    @ApiModelProperty(value="车辆编号")
    private String clbh;
    @ApiModelProperty(value="车牌号码")
    private String cphm;
    @ApiModelProperty(value="车载器材")
    private List<InnerCzqc> czqc;
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

    public List<InnerCzqc> getCzqc() {
        return czqc;
    }

    public void setCzqc(List<InnerCzqc> czqc) {
        this.czqc = czqc;
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
