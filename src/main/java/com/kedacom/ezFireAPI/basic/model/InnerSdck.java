package com.kedacom.ezFireAPI.basic.model;

/**
 * @Description: 对象类型 隧道出口
 * @author: hanshuhao
 * @Date: 2018/5/29
 */
public class InnerSdck {
    private String ckmc;    //出口名称
    private String ckwz;    //出口位置
    private String ckms;    //出口描述

    public String getCkmc() {
        return ckmc;
    }

    public void setCkmc(String ckmc) {
        this.ckmc = ckmc;
    }

    public String getCkwz() {
        return ckwz;
    }

    public void setCkwz(String ckwz) {
        this.ckwz = ckwz;
    }

    public String getCkms() {
        return ckms;
    }

    public void setCkms(String ckms) {
        this.ckms = ckms;
    }
}
