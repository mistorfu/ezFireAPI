package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerSswzck  所属物资仓库
 * @Date 2018/5/30 10:42
 * @Author zhaomeng
 */
@ApiModel(value = "所属物资仓库",description = "所属物资仓库对象")
public class InnerSswzck {
    @ApiModelProperty(value = "物资仓库编号")
    private String wzckbh;
    @ApiModelProperty(value = "物资仓库名称")
    private String wzckmc;

    public String getWzckbh() {
        return wzckbh;
    }

    public void setWzckbh(String wzckbh) {
        this.wzckbh = wzckbh;
    }

    public String getWzckmc() {
        return wzckmc;
    }

    public void setWzckmc(String wzckmc) {
        this.wzckmc = wzckmc;
    }
}