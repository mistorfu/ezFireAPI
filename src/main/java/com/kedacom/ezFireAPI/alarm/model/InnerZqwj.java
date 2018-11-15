package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 灾情文件
 * @author: wangjinbo
 * @create: 2018-05-28 17:14
 */
@ApiModel(value="灾情文件",description="灾情文件对象")
public class InnerZqwj {
    @ApiModelProperty(value="文件类型")
    private String wjlx;    //文件类型
    @ApiModelProperty(value="文件名称")
    private String wjmc;    //文件名称
    @ApiModelProperty(value="缩略图片（http）")
    private String sltp;    //缩略图片（http）
    @ApiModelProperty(value="网络路径（http）")
    private String wltj;    //网络路径（http）
    @ApiModelProperty(value="存储路径（共享或本地路径）")
    private String cclj;    //存储路径（共享或本地路径）
    @ApiModelProperty(value="显示顺序")
    private String xxsx;    //显示顺序

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

    public String getWltj() {
        return wltj;
    }

    public void setWltj(String wltj) {
        this.wltj = wltj;
    }

    public String getCclj() {
        return cclj;
    }

    public void setCclj(String cclj) {
        this.cclj = cclj;
    }

    public String getXxsx() {
        return xxsx;
    }

    public void setXxsx(String xxsx) {
        this.xxsx = xxsx;
    }
}
