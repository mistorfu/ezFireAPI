package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerJjgk 集结概况
 * Created by fudapeng on 2018/5/30.
 */
@ApiModel(value = "集结概况",description = "集结概况对象")
public class InnerJjgk {
    @ApiModelProperty(value = "集结所需时间 单位 分钟")
    private int jjsxsj;
    @ApiModelProperty(value = "集结队伍数量")
    private int jjdwsl;
    @ApiModelProperty(value = "集结队伍概述")
    private String jjdwgs;

    public int getJjsxsj() {
        return jjsxsj;
    }

    public void setJjsxsj(int jjsxsj) {
        this.jjsxsj = jjsxsj;
    }

    public int getJjdwsl() {
        return jjdwsl;
    }

    public void setJjdwsl(int jjdwsl) {
        this.jjdwsl = jjdwsl;
    }

    public String getJjdwgs() {
        return jjdwgs;
    }

    public void setJjdwgs(String jjdwgs) {
        this.jjdwgs = jjdwgs;
    }
}
