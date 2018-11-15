package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName InnerShape 元素形状
 * Created by fudapeng on 2018/5/25.
 */
@ApiModel(value = "元素形状",description = "元素形状对象")
public class InnerShape {
    @ApiModelProperty(value = "坐标")
    private List<Object> coordinates;
    @ApiModelProperty(value = "类型")
    private String type;

    public List<Object> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Object> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
