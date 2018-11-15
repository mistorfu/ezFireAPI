package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerMhylqk  灭火演练情况
 * @Date 2018/5/25 11:10
 * @Author zhaomeng
 */
@ApiModel(value = "灭火演练情况",description = "灭火演练情况对象")
public class InnerMhylqk {
    @ApiModelProperty(value = "演练时间 格式：yyyy-MM-dd")
    private String ylsj;
    @ApiModelProperty(value = "演练地点")
    private String yldd;
    @ApiModelProperty(value = "演练概述")
    private String ylgs;
    @ApiModelProperty(value = "演练文件")
    private String ylwj;

    public String getYlsj() {
        return ylsj;
    }

    public void setYlsj(String ylsj) {
        this.ylsj = ylsj;
    }

    public String getYldd() {
        return yldd;
    }

    public void setYldd(String yldd) {
        this.yldd = yldd;
    }

    public String getYlgs() {
        return ylgs;
    }

    public void setYlgs(String ylgs) {
        this.ylgs = ylgs;
    }

    public String getYlwj() {
        return ylwj;
    }

    public void setYlwj(String ylwj) {
        this.ylwj = ylwj;
    }
}