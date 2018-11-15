package com.kedacom.ezFireAPI.ez.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "操作单位",description = "操作单位对象")
public class InnerCzdw {
    @ApiModelProperty(value = "单位编号")
    private String dwbh;
    @ApiModelProperty(value = "单位名称")
    private String dwmc;
    @ApiModelProperty(value = "单位简称")
    private String dwjc;
    @ApiModelProperty(value = "单位内部编码")
    private String dwnbbm;

    public String getDwbh() {
        return dwbh;
    }

    public void setDwbh(String dwbh) {
        this.dwbh = dwbh;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getDwjc() {
        return dwjc;
    }

    public void setDwjc(String dwjc) {
        this.dwjc = dwjc;
    }

    public String getDwnbbm() {
        return dwnbbm;
    }

    public void setDwnbbm(String dwnbbm) {
        this.dwnbbm = dwnbbm;
    }
}
