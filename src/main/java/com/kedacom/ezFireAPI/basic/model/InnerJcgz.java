package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerJcgz  检测规则
 * @Date 2018/5/25 13:10
 * @Author zhaomeng
 */
@ApiModel(value = "检测规则",description = "检测规则对象")
public class InnerJcgz {
    @ApiModelProperty(value = "检测结果")
    private String jcjg;
    @ApiModelProperty(value = "更新时间 格式：yyyy-MM-dd HH:mm:ss")
    private String gxsj;

    public String getJcjg() {
        return jcjg;
    }

    public void setJcjg(String jcjg) {
        this.jcjg = jcjg;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}