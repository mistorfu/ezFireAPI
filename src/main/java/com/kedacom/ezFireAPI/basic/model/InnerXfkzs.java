package com.kedacom.ezFireAPI.basic.model;

/**
 * @Description: 对象类型 消防控制室（地下）
 * @author: hanshuhao
 * @Date: 2018/5/28
 */
public class InnerXfkzs {
    private String sfcz;    //是否存在

    private String wzxx;    //位置信息

    private String lxry;    //联系人员

    private String lxdh;    //联系电话

    public String getSfcz() {
        return sfcz;
    }

    public void setSfcz(String sfcz) {
        this.sfcz = sfcz;
    }

    public String getWzxx() {
        return wzxx;
    }

    public void setWzxx(String wzxx) {
        this.wzxx = wzxx;
    }

    public String getLxry() {
        return lxry;
    }

    public void setLxry(String lxry) {
        this.lxry = lxry;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }
}
