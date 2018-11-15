package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerClqkext 车辆情况
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="车辆情况扩展",description="车辆情况扩展对象")
public class InnerClqkext extends InnerClqk {
    @ApiModelProperty(value="数量下限")
    private int slxx;
    @ApiModelProperty(value="数量上限")
    private int slsx;
    @ApiModelProperty(value="是否选配 0：否 1：是")
    private String sfxp;

    public int getSlxx() {
        return slxx;
    }

    public void setSlxx(int slxx) {
        this.slxx = slxx;
    }

    public int getSlsx() {
        return slsx;
    }

    public void setSlsx(int slsx) {
        this.slsx = slsx;
    }

    public String getSfxp() {
        return sfxp;
    }

    public void setSfxp(String sfxp) {
        this.sfxp = sfxp;
    }
}
