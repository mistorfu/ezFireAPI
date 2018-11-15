package com.kedacom.ezFireAPI.emergency.model;

/**
 * @Author: sky
 * @Description: 预案文件
 * @Data: create in 13:20 2018/5/29
 * @Mod By:
 */
public class InnerYawj {
    private String wjlx;
    private String wjmc;
    private String sltp;
    private String wllj;
    private String cclj;

    public String getCclj() {
        return cclj;
    }

    public void setCclj(String cclj) {
        this.cclj = cclj;
    }

    /** 1：视频 2：图片 3：文档 9：其他 */
    private int xssx;

    public String getWjlx() {
        return wjlx;
    }

    public void setWjlx(String wjlx) {
        this.wjlx = wjlx;
    }

    public String getWjmc() {
        return wjmc;
    }

    public void setWjmc(String wjmc) {
        this.wjmc = wjmc;
    }

    public String getSltp() {
        return sltp;
    }

    public void setSltp(String sltp) {
        this.sltp = sltp;
    }

    public String getWllj() {
        return wllj;
    }

    public void setWllj(String wllj) {
        this.wllj = wllj;
    }

    public int getXssx() {
        return xssx;
    }

    public void setXssx(int xssx) {
        this.xssx = xssx;
    }
}
