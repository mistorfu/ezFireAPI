package com.kedacom.ezFireAPI.basic.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerXfssqk  消防设施情况
 * @Date 2018/5/25 11:13
 * @Author zhaomeng
 */
@ApiModel(value = "消防设施情况",description = "消防设施情况对象")
public class InnerXfssqk {
    @ApiModelProperty(value = "设施名称")
    private String ssmc;
    @ApiModelProperty(value = "设施位置")
    private String sswz;
    @ApiModelProperty(value = "设施数量")
    private String sssl;
    @ApiModelProperty(value = "设施概述")
    private String ssgs;

    public String getSsmc() {
        return ssmc;
    }

    public void setSsmc(String ssmc) {
        this.ssmc = ssmc;
    }

    public String getSswz() {
        return sswz;
    }

    public void setSswz(String sswz) {
        this.sswz = sswz;
    }

    public String getSssl() {
        return sssl;
    }

    public void setSssl(String sssl) {
        this.sssl = sssl;
    }

    public String getSsgs() {
        return ssgs;
    }

    public void setSsgs(String ssgs) {
        this.ssgs = ssgs;
    }
}