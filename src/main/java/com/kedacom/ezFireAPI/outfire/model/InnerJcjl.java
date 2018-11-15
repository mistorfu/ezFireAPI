package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerJcjl 检查记录
 * @Date 2018/5/30 13:25
 * @Author zhaomeng
 */
@ApiModel(value = "检查记录",description = "检查记录对象")
public class InnerJcjl {
    @ApiModelProperty(value = "检查时间")
    private String jcsj;
    @ApiModelProperty(value = "检查人员")
    private String jcry;
    @ApiModelProperty(value = "检查结果")
    private String jcjg;

    public String getJcsj() {
        return jcsj;
    }

    public void setJcsj(String jcsj) {
        this.jcsj = jcsj;
    }

    public String getJcry() {
        return jcry;
    }

    public void setJcry(String jcry) {
        this.jcry = jcry;
    }

    public String getJcjg() {
        return jcjg;
    }

    public void setJcjg(String jcjg) {
        this.jcjg = jcjg;
    }
}