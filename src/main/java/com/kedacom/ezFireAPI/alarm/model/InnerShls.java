package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 审核历史
 * @author: wangjinbo
 * @create: 2018-05-28 17:20
 */
@ApiModel(value="审核历史",description="审核历史对象")
public class InnerShls {
    @ApiModelProperty(value="审核人员")
    private String shry;    //审核人员
    @ApiModelProperty(value="审核单位")
    private String shdw;    //审核单位
    @ApiModelProperty(value="审核时间")
    private String shsj;    //审核时间
    @ApiModelProperty(value="审核意见")
    private String shyj;    //审核意见
    @ApiModelProperty(value="审核结果")
    private String shjg;    //审核结果

    public String getShry() {
        return shry;
    }

    public void setShry(String shry) {
        this.shry = shry;
    }

    public String getShdw() {
        return shdw;
    }

    public void setShdw(String shdw) {
        this.shdw = shdw;
    }

    public String getShsj() {
        return shsj;
    }

    public void setShsj(String shsj) {
        this.shsj = shsj;
    }

    public String getShyj() {
        return shyj;
    }

    public void setShyj(String shyj) {
        this.shyj = shyj;
    }

    public String getShjg() {
        return shjg;
    }

    public void setShjg(String shjg) {
        this.shjg = shjg;
    }
}
