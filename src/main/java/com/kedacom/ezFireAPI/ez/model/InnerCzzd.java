package com.kedacom.ezFireAPI.ez.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "操作终端", description = "操作终端对象")
public class InnerCzzd {
    @ApiModelProperty(value = "终端ip")
    private String ip;
    @ApiModelProperty(value = "终端MAC（MAC大写）")
    private String MAC;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }
}
