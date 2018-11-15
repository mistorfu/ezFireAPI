package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerDxlb 对象类别
 * Created by fudapeng on 2018/5/25.
 */
@ApiModel(value="对象类别",description="对象类别对象")
public class InnerDxlb {
    @ApiModelProperty(value="类别编号")
    private String id;
    @ApiModelProperty(value="类别内容")
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
