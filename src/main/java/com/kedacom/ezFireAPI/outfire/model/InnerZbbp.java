package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerZbbp 装备编配
 * Created by fudapeng on 2018/5/30.
 */
@ApiModel(value="装备编配",description="装备编配对象")
public class InnerZbbp {
    @ApiModelProperty(value="文件名称")
    private String wjmc; // 文件名称
    @ApiModelProperty(value="文件地址")
    private String wjdz; // 文件地址

    public String getWjmc() {
        return wjmc;
    }

    public void setWjmc(String wjmc) {
        this.wjmc = wjmc;
    }

    public String getWjdz() {
        return wjdz;
    }

    public void setWjdz(String wjdz) {
        this.wjdz = wjdz;
    }
}
