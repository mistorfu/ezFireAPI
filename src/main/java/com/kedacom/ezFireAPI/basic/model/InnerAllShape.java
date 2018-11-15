package com.kedacom.ezFireAPI.basic.model;

import java.util.List;

/**
 * @ClassName InnerAllShape
 * @Date 2018/5/29 14:51
 * @Author zhaomeng
 */
public class InnerAllShape {
    private List<List<List<Double>>> coordinates;   //坐标
    private String type;    //类型

    public List<List<List<Double>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}