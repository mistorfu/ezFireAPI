package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerZfjdqk  执法监督情况
 * @Date 2018/5/25 11:14
 * @Author zhaomeng
 */
@ApiModel(value = "执法监督情况",description = "执法监督情况对象")
public class InnerZfjdqk {
    @ApiModelProperty(value = "监督时间 格式：yyyy-MM-dd")
    private String jdsj;
    @ApiModelProperty(value = "监督概述")
    private String jdgs;
    @ApiModelProperty(value = "监督文件")
    private String jdwj;

    public String getJdsj() {
        return jdsj;
    }

    public void setJdsj(String jdsj) {
        this.jdsj = jdsj;
    }

    public String getJdgs() {
        return jdgs;
    }

    public void setJdgs(String jdgs) {
        this.jdgs = jdgs;
    }

    public String getJdwj() {
        return jdwj;
    }

    public void setJdwj(String jdwj) {
        this.jdwj = jdwj;
    }
}