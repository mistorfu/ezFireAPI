package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 调派人员
 * @author: wangjinbo
 * @create: 2018-05-28 16:24
 */
@ApiModel(value="调派人员",description="调派人员对象")
public class InnerDpry {
    @ApiModelProperty(value="人员编号")
    private String rybh;    //人员编号
    @ApiModelProperty(value="身份证号")
    private String sfzh;    //身份证号
    @ApiModelProperty(value="人员姓名")
    private String ryxm;    //人员姓名
    @ApiModelProperty(value="联系电话")
    private String lxdh;    //联系电话
    @ApiModelProperty(value="所属岗位")
    private String ssgw;    //所属岗位
    @ApiModelProperty(value="所属单位（单位编号）")
    private String ssdw;    //所属单位（单位编号）
    @ApiModelProperty(value="开始时间")
    private String kssj;    //开始时间
    @ApiModelProperty(value="结束时间")
    private String jssj;    //结束时间

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getRyxm() {
        return ryxm;
    }

    public void setRyxm(String ryxm) {
        this.ryxm = ryxm;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getSsgw() {
        return ssgw;
    }

    public void setSsgw(String ssgw) {
        this.ssgw = ssgw;
    }

    public String getSsdw() {
        return ssdw;
    }

    public void setSsdw(String ssdw) {
        this.ssdw = ssdw;
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
    }
}
