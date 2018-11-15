package com.kedacom.ezFireAPI.outfire.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName InnerZyqk 增援情况
 * Created by fudapeng on 2018/5/31.
 */
@ApiModel(value="增援情况",description="增援情况对象")
public class InnerZyqk {
    @ApiModelProperty(value="集结地点")
    private String jjdd;
    @ApiModelProperty(value="集结时间 单位：分钟")
    private int jjsj;
    @ApiModelProperty(value="增援方向")
    private String zyfx;
    @ApiModelProperty(value="行驶路线")
    private String xslx;
    @ApiModelProperty(value="到达时间 单位：分钟")
    private int ddsj;

    public String getJjdd() {
        return jjdd;
    }

    public void setJjdd(String jjdd) {
        this.jjdd = jjdd;
    }

    public int getJjsj() {
        return jjsj;
    }

    public void setJjsj(int jjsj) {
        this.jjsj = jjsj;
    }

    public String getZyfx() {
        return zyfx;
    }

    public void setZyfx(String zyfx) {
        this.zyfx = zyfx;
    }

    public String getXslx() {
        return xslx;
    }

    public void setXslx(String xslx) {
        this.xslx = xslx;
    }

    public int getDdsj() {
        return ddsj;
    }

    public void setDdsj(int ddsj) {
        this.ddsj = ddsj;
    }
}
