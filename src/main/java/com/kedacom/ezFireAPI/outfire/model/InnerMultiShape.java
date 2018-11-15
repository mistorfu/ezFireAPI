package com.kedacom.ezFireAPI.outfire.model;

import java.util.List;

/**
 * @ClassName InnerMultiShape  复杂多边形
 * @Date 2018/6/6 14:50
 * @Author zhaomeng
 */
public class InnerMultiShape {
    private List<List<List<List<Double>>>> coordinates;
    private String type;

    public List<List<List<List<Double>>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}