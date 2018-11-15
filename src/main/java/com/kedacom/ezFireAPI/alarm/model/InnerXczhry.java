package com.kedacom.ezFireAPI.alarm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: ezFireAPI
 * @description: 现场指挥人员
 * @author: wangjinbo
 * @create: 2018-05-28 17:23
 */
@ApiModel(value="现场指挥人员",description="现场指挥人员对象")
public class InnerXczhry {
    @ApiModelProperty(value="人员姓名")
    private String ryxm;    //人员姓名
    @ApiModelProperty(value="岗位职责")
    private String gwzz;    //岗位职责
    @ApiModelProperty(value="联系电话")
    private String lxdh;    //联系电话
    @ApiModelProperty(value="显示顺序")
    private String xssx;    //显示顺序

    public String getRyxm() {
        return ryxm;
    }

    public void setRyxm(String ryxm) {
        this.ryxm = ryxm;
    }

    public String getGwzz() {
        return gwzz;
    }

    public void setGwzz(String gwzz) {
        this.gwzz = gwzz;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getXssx() {
        return xssx;
    }

    public void setXssx(String xssx) {
        this.xssx = xssx;
    }
}
