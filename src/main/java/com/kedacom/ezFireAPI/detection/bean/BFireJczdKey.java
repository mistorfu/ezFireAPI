package com.kedacom.ezFireAPI.detection.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 检测字段的两个主键
 * @author zhanghao
 */
public class BFireJczdKey implements Serializable {
    @ApiModelProperty(value="对象编号")
    private String dxbh;

    @ApiModelProperty(value="字段标识")
    private String zdbs;
    private static final long serialVersionUID = 1L;

    public String getDxbh() {
        return dxbh;
    }

    public void setDxbh(String dxbh) {
        this.dxbh = dxbh;
    }

    public String getZdbs() {
        return zdbs;
    }

    public void setZdbs(String zdbs) {
        this.zdbs = zdbs;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BFireJczdKey other = (BFireJczdKey) that;
        return (this.getDxbh() == null ? other.getDxbh() == null : this.getDxbh().equals(other.getDxbh()))
            && (this.getZdbs() == null ? other.getZdbs() == null : this.getZdbs().equals(other.getZdbs()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDxbh() == null) ? 0 : getDxbh().hashCode());
        result = prime * result + ((getZdbs() == null) ? 0 : getZdbs().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dxbh=").append(dxbh);
        sb.append(", zdbs=").append(zdbs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}