package com.kedacom.ezFireAPI.law.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:检查结果
 */
@ApiModel(value="检查结果",description="检查结果对象")
public class InnerJcjg {
    @ApiModelProperty(value="（结果）对象类型")
    private String jglx; //（结果）对象类型
    @ApiModelProperty(value="统计数量")
    private Integer tjsl;//统计数量

    public String getJglx() {
        return jglx;
    }

    public void setJglx(String jglx) {
        this.jglx = jglx;
    }

    public Integer getTjsl() {
        return tjsl;
    }

    public void setTjsl(Integer tjsl) {
        this.tjsl = tjsl;
    }
}
