package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author luping
 * @date 2018/5/28 16:26
 */
@ApiModel(value = "文件资料",description = "文件资料对象")
public class InnerWjzl {
    @ApiModelProperty(value = "文件名称",name = "wjmc",example = "20140420034021_3.wav")
    private String wjmc;
    @ApiModelProperty(value = "文件后缀(大写)",name = "wjhz",example = "WAV")
    private String wjhz;
    @ApiModelProperty(value = "文件大小(字节)",name = "wjdx",example = "50240")
    private Long wjdx;
    @ApiModelProperty(value = "文件地址(Url)",name = "wjdz",example = "5")
    private String wjdz;
    @ApiModelProperty(value = "缩略图片(Url)",name = "sltp",example = "http://10.43.123.145/20140420034021_3.wav")
    private String sltp;

    public String getWjmc() {
        return wjmc;
    }

    public void setWjmc(String wjmc) {
        this.wjmc = wjmc;
    }

    public String getWjhz() {
        return wjhz;
    }

    public void setWjhz(String wjhz) {
        this.wjhz = wjhz;
    }

    public Long getWjdx() {
        return wjdx;
    }

    public void setWjdx(Long wjdx) {
        this.wjdx = wjdx;
    }

    public String getWjdz() {
        return wjdz;
    }

    public void setWjdz(String wjdz) {
        this.wjdz = wjdz;
    }

    public String getSltp() {
        return sltp;
    }

    public void setSltp(String sltp) {
        this.sltp = sltp;
    }
}
