package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerSjzl 数据质量
 * Created by fudapeng on 2018/5/25.
 */
@ApiModel(value = "数据质量",description = "数据质量对象")
public class InnerSjzl {
    @ApiModelProperty(value = "检测规则1")
    private String rule1;
    @ApiModelProperty(value = "检测规则2")
    private String rule2;
    @ApiModelProperty(value = "检测规则3")
    private String rule3;

    public String getRule1() {
        return rule1;
    }

    public void setRule1(String rule1) {
        this.rule1 = rule1;
    }

    public String getRule2() {
        return rule2;
    }

    public void setRule2(String rule2) {
        this.rule2 = rule2;
    }

    public String getRule3() {
        return rule3;
    }

    public void setRule3(String rule3) {
        this.rule3 = rule3;
    }
}
