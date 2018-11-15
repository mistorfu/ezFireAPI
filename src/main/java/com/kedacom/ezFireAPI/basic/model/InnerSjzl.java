package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerSjzl 数据质量
 * @Date 2018/5/28 9:44
 * @Author zhaomeng
 */
@ApiModel(value = "数据质量",description = "数据质量对象")
public class InnerSjzl {
    @ApiModelProperty(value = "检测规则1")
    private InnerJcgz rule1;    //检测规则1
    @ApiModelProperty(value = "检测规则2")
    private InnerJcgz rule2;    //检测规则2
    @ApiModelProperty(value = "检测规则3")
    private InnerJcgz rule3;    //检测规则3

    public InnerJcgz getRule1() {
        return rule1;
    }

    public void setRule1(InnerJcgz rule1) {
        this.rule1 = rule1;
    }

    public InnerJcgz getRule2() {
        return rule2;
    }

    public void setRule2(InnerJcgz rule2) {
        this.rule2 = rule2;
    }

    public InnerJcgz getRule3() {
        return rule3;
    }

    public void setRule3(InnerJcgz rule3) {
        this.rule3 = rule3;
    }
}