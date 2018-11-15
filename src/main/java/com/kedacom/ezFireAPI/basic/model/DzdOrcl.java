package com.kedacom.ezFireAPI.basic.model;

import com.kedacom.ezFireAPI.outfire.model.InnerDxlb;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjg;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: 从oracle中获取的地震带信息
 * @author: hanshuhao
 * @Date: 2018/6/26
 */
public class DzdOrcl {
    @ApiModelProperty(value="地震带名称")
    private String dzdmc;

    @ApiModelProperty(value="分布区域概述")
    private String fbqygs;

    @ApiModelProperty(value="历史灾情概述")
    private String lszqgs;

    @ApiModelProperty(value="所在地行政区划编号")
    private String xzqhbh;

    public String getDzdmc() {
        return dzdmc;
    }

    public void setDzdmc(String dzdmc) {
        this.dzdmc = dzdmc;
    }

    public String getFbqygs() {
        return fbqygs;
    }

    public void setFbqygs(String fbqygs) {
        this.fbqygs = fbqygs;
    }

    public String getLszqgs() {
        return lszqgs;
    }

    public void setLszqgs(String lszqgs) {
        this.lszqgs = lszqgs;
    }

    public String getXzqhbh() {
        return xzqhbh;
    }

    public void setXzqhbh(String xzqhbh) {
        this.xzqhbh = xzqhbh;
    }
}
