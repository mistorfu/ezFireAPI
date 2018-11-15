package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerXzqh 行政区划
 * Created by fudapeng on 2018/5/25.
 */
@ApiModel(value="行政区划",description="行政区划对象")
public class InnerXzqh {
    @ApiModelProperty(value="行政区划编号")
    private String xzqhbh;    //行政区划编号
    @ApiModelProperty(value="行政区划名称")
    private String xzqhmc;    //行政区划名称
    @ApiModelProperty(value="行政区划内部编码")
    private String xzqhnbbm;  //行政区划内部编码

    public String getXzqhbh() {
        return xzqhbh;
    }

    public void setXzqhbh(String xzqhbh) {
        this.xzqhbh = xzqhbh;
    }

    public String getXzqhmc() {
        return xzqhmc;
    }

    public void setXzqhmc(String xzqhmc) {
        this.xzqhmc = xzqhmc;
    }

    public String getXzqhnbbm() {
        return xzqhnbbm;
    }

    public void setXzqhnbbm(String xzqhnbbm) {
        this.xzqhnbbm = xzqhnbbm;
    }
}
