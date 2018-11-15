package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName InnerSjjc  数据监测
 * @Date 2018/5/25 13:12
 * @Author zhaomeng
 */
@ApiModel(value = "数据监测",description = "数据监测对象")
public class InnerSjjc {
    @ApiModelProperty(value = "检测结果 0：正常 1：异常")
    private String jcjg;
    @ApiModelProperty(value = "检测得分")
    private double jcdf;
    @ApiModelProperty(value = "检测时间 格式：yyyy-MM-dd HH:mm:ss")
    private String jcsj;
    @ApiModelProperty(value = "异常数据：字段标识，规则编号，所在行数")
    private List<String> ycsj;

    public String getJcjg() {
        return jcjg;
    }

    public void setJcjg(String jcjg) {
        this.jcjg = jcjg;
    }

    public double getJcdf() {
        return jcdf;
    }

    public void setJcdf(double jcdf) {
        this.jcdf = jcdf;
    }

    public String getJcsj() {
        return jcsj;
    }

    public void setJcsj(String jcsj) {
        this.jcsj = jcsj;
    }

    public List<String> getYcsj() {
        return ycsj;
    }

    public void setYcsj(List<String> ycsj) {
        this.ycsj = ycsj;
    }
}