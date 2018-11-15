package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerFzry  负责人员
 * @Date 2018/5/25 10:58
 * @Author zhaomeng
 */
@ApiModel(value = "负责人员",description = "负责人员对象")
public class InnerFzry {
    @ApiModelProperty(value = "人员类型")
    private String rylx;
    @ApiModelProperty(value = "人员姓名")
    private String ryxm;
    @ApiModelProperty(value = "身份证号")
    private String sfzh;
    @ApiModelProperty(value = "联系电话")
    private String lxdh;

    public String getRylx() {
        return rylx;
    }

    public void setRylx(String rylx) {
        this.rylx = rylx;
    }

    public String getRyxm() {
        return ryxm;
    }

    public void setRyxm(String ryxm) {
        this.ryxm = ryxm;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }
}