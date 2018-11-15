package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName Clsz 车辆上装
 * @Date 2018/5/23 16:48
 * @Author zhaomeng
 */
@ApiModel(value="车辆上装",description="车辆上装对象")
public class Clsz {
    @ApiModelProperty(value="车辆编号")
    private String clbh;
    @ApiModelProperty(value="车牌号码")
    private String cphm;
    @ApiModelProperty(value="水流量")
    private Double sll;
    @ApiModelProperty(value="水使用总量")
    private Double ssyzl;
    @ApiModelProperty(value="水罐液位")
    private Double sgyw;
    @ApiModelProperty(value="泡沫流量")
    private Double pmll;
    @ApiModelProperty(value="泡沫比例")
    private Double pmbl;
    @ApiModelProperty(value="泡沫罐液位")
    private Double pmgyw;
    @ApiModelProperty(value="水泵工作时间")
    private Double sbgzsj;
    @ApiModelProperty(value="泵转速")
    private Double bzs;
    @ApiModelProperty(value="取力器温度")
    private Double qlqwd;
    @ApiModelProperty(value="消防水泵出口压力")
    private Double xfsbckyl;
    @ApiModelProperty(value="消防水泵入口压力")
    private Double xfsbrkyl;
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

    public Double getSll() {
        return sll;
    }

    public void setSll(Double sll) {
        this.sll = sll;
    }

    public Double getSsyzl() {
        return ssyzl;
    }

    public void setSsyzl(Double ssyzl) {
        this.ssyzl = ssyzl;
    }

    public Double getSgyw() {
        return sgyw;
    }

    public void setSgyw(Double sgyw) {
        this.sgyw = sgyw;
    }

    public Double getPmll() {
        return pmll;
    }

    public void setPmll(Double pmll) {
        this.pmll = pmll;
    }

    public Double getPmbl() {
        return pmbl;
    }

    public void setPmbl(Double pmbl) {
        this.pmbl = pmbl;
    }

    public Double getPmgyw() {
        return pmgyw;
    }

    public void setPmgyw(Double pmgyw) {
        this.pmgyw = pmgyw;
    }

    public Double getSbgzsj() {
        return sbgzsj;
    }

    public void setSbgzsj(Double sbgzsj) {
        this.sbgzsj = sbgzsj;
    }

    public Double getBzs() {
        return bzs;
    }

    public void setBzs(Double bzs) {
        this.bzs = bzs;
    }

    public Double getQlqwd() {
        return qlqwd;
    }

    public void setQlqwd(Double qlqwd) {
        this.qlqwd = qlqwd;
    }

    public Double getXfsbckyl() {
        return xfsbckyl;
    }

    public void setXfsbckyl(Double xfsbckyl) {
        this.xfsbckyl = xfsbckyl;
    }

    public Double getXfsbrkyl() {
        return xfsbrkyl;
    }

    public void setXfsbrkyl(Double xfsbrkyl) {
        this.xfsbrkyl = xfsbrkyl;
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