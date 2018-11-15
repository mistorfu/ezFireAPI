package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerTpxx  图片信息
 * @Date 2018/5/25 11:00
 * @Author zhaomeng
 */
@ApiModel(value = "图片信息",description = "图片信息对象")
public class InnerTpxx {
    @ApiModelProperty(value = "图片ID")
    private String tpid;
    @ApiModelProperty(value = "图片名称")
    private String tpmc;
    @ApiModelProperty(value = "图片后缀 (全部大写)")
    private String tphz;
    @ApiModelProperty(value = "图片描述")
    private String tpms;
    @ApiModelProperty(value = "图片地址URL")
    private String tpdz;
    @ApiModelProperty(value = "图片类型ID")
    private String tplxid;
    @ApiModelProperty(value = "图片类型名称")
    private String tplxmc;

    public String getTpid() {
        return tpid;
    }

    public void setTpid(String tpid) {
        this.tpid = tpid;
    }

    public String getTpmc() {
        return tpmc;
    }

    public void setTpmc(String tpmc) {
        this.tpmc = tpmc;
    }

    public String getTphz() {
        return tphz;
    }

    public void setTphz(String tphz) {
        this.tphz = tphz;
    }

    public String getTpms() {
        return tpms;
    }

    public void setTpms(String tpms) {
        this.tpms = tpms;
    }

    public String getTpdz() {
        return tpdz;
    }

    public void setTpdz(String tpdz) {
        this.tpdz = tpdz;
    }

    public String getTplxid() {
        return tplxid;
    }

    public void setTplxid(String tplxid) {
        this.tplxid = tplxid;
    }

    public String getTplxmc() {
        return tplxmc;
    }

    public void setTplxmc(String tplxmc) {
        this.tplxmc = tplxmc;
    }
}