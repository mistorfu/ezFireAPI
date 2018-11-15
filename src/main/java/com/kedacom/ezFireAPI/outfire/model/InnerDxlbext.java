package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerDxlbext 对象类别扩展
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="对象类别扩展",description="对象类别扩展对象")
public class InnerDxlbext extends InnerDxlb {
    @ApiModelProperty(value="类别链")
    private String chain;

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }
}
