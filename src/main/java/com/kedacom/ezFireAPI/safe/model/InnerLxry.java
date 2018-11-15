package com.kedacom.ezFireAPI.safe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "联系人员", description = "联系人员对象")
public class InnerLxry {
    @ApiModelProperty(value = "人员职称")
    private String ryzc;
    @ApiModelProperty(value = "人员姓名")
    private String ryxm;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;

    public String getRyzc() {
        return ryzc;
    }

    public void setRyzc(String ryzc) {
        this.ryzc = ryzc;
    }

    public String getRyxm() {
        return ryxm;
    }

    public void setRyxm(String ryxm) {
        this.ryxm = ryxm;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }
}
