package com.kedacom.ezFireAPI.law.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:
 */
@ApiModel(value="检查对象",description="检查对象")
public class InnerJcdx {
    @ApiModelProperty(value="对象类型,1：人员密集场所,2：高层公共建筑\n" +
                                     "3：高层居住建筑,4：地下建筑\n" +
                                     "5：在建工程施工工地,6：节能综合工程施工现场\n" +
                                     "7：消防控制室,8：排查建筑、单位、场所总数\n")
    private String dxlx; //对象类型
    @ApiModelProperty(value="统计数量")
    private Double tjsl;//统计数量

    public String getDxlx() {
        return dxlx;
    }

    public void setDxlx(String dxlx) {
        this.dxlx = dxlx;
    }

    public Double getTjsl() {
        return tjsl;
    }

    public void setTjsl(Double tjsl) {
        this.tjsl = tjsl;
    }
}
