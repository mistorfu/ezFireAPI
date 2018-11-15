package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerRule 检测规则
 * Created by fudapeng on 2018/5/25.
 */
@ApiModel(value = "检测规则",description = "检测规则对象")
public class InnerRule {
    @ApiModelProperty(value = "检测结果")
    private String jcjg;
    @ApiModelProperty(value = "更新时间")
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
