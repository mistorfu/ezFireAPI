package com.kedacom.ezFireAPI.basic.model;

/**
 * @Description: 对象类型 数字化预案
 * @author: hanshuhao
 * @Date: 2018/5/28
 */
public class InnerSzhya {
    private String yalx;    //预案类型

    private String yamc;    //预案名称

    private String yawj;   //预案文件  1：URL地址  2：存储地址

    public String getYalx() {
        return yalx;
    }

    public void setYalx(String yalx) {
        this.yalx = yalx;
    }

    public String getYamc() {
        return yamc;
    }

    public void setYamc(String yamc) {
        this.yamc = yamc;
    }

    public String getYawj() {
        return yawj;
    }

    public void setYawj(String yawj) {
        this.yawj = yawj;
    }
}
