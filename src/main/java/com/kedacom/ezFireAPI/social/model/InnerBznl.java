package com.kedacom.ezFireAPI.social.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author:wangmingsai
 * @date:2018/5/29
 * @desc:保障能力
 */
@ApiModel(value="保障能力",description="保障能力对象")
public class InnerBznl {
    @ApiModelProperty(value="对象类型")
    private String DXLX; //对象类型
    @ApiModelProperty(value="对象名称")
    private String DXMC; //对象名称
    @ApiModelProperty(value="对象概述")
    private String DXGS; //对象概述
    @ApiModelProperty(value="混合比例")
    private String HHBL; //混合比例
    @ApiModelProperty(value="储存方式")
    private String CCFS; //储存方式
    @ApiModelProperty(value="库存数量")
    private Double KCSL; //库存数量
    @ApiModelProperty(value="日保障能力")
    private Double RBZNL;//日保障能力

    public String getDXLX() {
        return DXLX;
    }

    public void setDXLX(String DXLX) {
        this.DXLX = DXLX;
    }

    public String getDXMC() {
        return DXMC;
    }

    public void setDXMC(String DXMC) {
        this.DXMC = DXMC;
    }

    public String getDXGS() {
        return DXGS;
    }

    public void setDXGS(String DXGS) {
        this.DXGS = DXGS;
    }

    public String getHHBL() {
        return HHBL;
    }

    public void setHHBL(String HHBL) {
        this.HHBL = HHBL;
    }

    public String getCCFS() {
        return CCFS;
    }

    public void setCCFS(String CCFS) {
        this.CCFS = CCFS;
    }

    public Double getKCSL() {
        return KCSL;
    }

    public void setKCSL(Double KCSL) {
        this.KCSL = KCSL;
    }

    public Double getRBZNL() {
        return RBZNL;
    }

    public void setRBZNL(Double RBZNL) {
        this.RBZNL = RBZNL;
    }
}
