package com.kedacom.ezFireAPI.qj.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhanghao
 */
@ApiModel(value = "功能分组",description = "功能分组对象")
public class BQjGnfz implements Serializable {

    @ApiModelProperty("分组编号")
    private String fzbh;

    @ApiModelProperty("分组名称")
    private String fzmc;

    @ApiModelProperty("分组级别")
    private Long fzjb;

    @ApiModelProperty("分组形式")
    private String fzxs;

    @ApiModelProperty("分组描述")
    private String fzms;

    @ApiModelProperty("父级分组编号")
    private String fjfzbh;

    @ApiModelProperty("分组内部编码")
    private String fznbbm;

    @ApiModelProperty("显示顺序")
    private Long xssx;

    private String rkry;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date rksj;

    private String gxry;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gxsj;

    private String ylzd1;

    private String ylzd2;

    private String ylzd3;

    private static final long serialVersionUID = 1L;

    public String getFzbh() {
        return fzbh;
    }

    public void setFzbh(String fzbh) {
        this.fzbh = fzbh;
    }

    public String getFzmc() {
        return fzmc;
    }

    public void setFzmc(String fzmc) {
        this.fzmc = fzmc;
    }

    public Long getFzjb() {
        return fzjb;
    }

    public void setFzjb(Long fzjb) {
        this.fzjb = fzjb;
    }

    public String getFzxs() {
        return fzxs;
    }

    public void setFzxs(String fzxs) {
        this.fzxs = fzxs;
    }

    public String getFzms() {
        return fzms;
    }

    public void setFzms(String fzms) {
        this.fzms = fzms;
    }

    public String getFjfzbh() {
        return fjfzbh;
    }

    public void setFjfzbh(String fjfzbh) {
        this.fjfzbh = fjfzbh;
    }

    public String getFznbbm() {
        return fznbbm;
    }

    public void setFznbbm(String fznbbm) {
        this.fznbbm = fznbbm;
    }

    public Long getXssx() {
        return xssx;
    }

    public void setXssx(Long xssx) {
        this.xssx = xssx;
    }

    public String getRkry() {
        return rkry;
    }

    public void setRkry(String rkry) {
        this.rkry = rkry;
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    public String getGxry() {
        return gxry;
    }

    public void setGxry(String gxry) {
        this.gxry = gxry;
    }

    public Date getGxsj() {
        return gxsj;
    }

    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }

    public String getYlzd1() {
        return ylzd1;
    }

    public void setYlzd1(String ylzd1) {
        this.ylzd1 = ylzd1;
    }

    public String getYlzd2() {
        return ylzd2;
    }

    public void setYlzd2(String ylzd2) {
        this.ylzd2 = ylzd2;
    }

    public String getYlzd3() {
        return ylzd3;
    }

    public void setYlzd3(String ylzd3) {
        this.ylzd3 = ylzd3;
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
        BQjGnfz other = (BQjGnfz) that;
        return (this.getFzbh() == null ? other.getFzbh() == null : this.getFzbh().equals(other.getFzbh()))
            && (this.getFzmc() == null ? other.getFzmc() == null : this.getFzmc().equals(other.getFzmc()))
            && (this.getFzjb() == null ? other.getFzjb() == null : this.getFzjb().equals(other.getFzjb()))
            && (this.getFzxs() == null ? other.getFzxs() == null : this.getFzxs().equals(other.getFzxs()))
            && (this.getFzms() == null ? other.getFzms() == null : this.getFzms().equals(other.getFzms()))
            && (this.getFjfzbh() == null ? other.getFjfzbh() == null : this.getFjfzbh().equals(other.getFjfzbh()))
            && (this.getFznbbm() == null ? other.getFznbbm() == null : this.getFznbbm().equals(other.getFznbbm()))
            && (this.getXssx() == null ? other.getXssx() == null : this.getXssx().equals(other.getXssx()))
            && (this.getRkry() == null ? other.getRkry() == null : this.getRkry().equals(other.getRkry()))
            && (this.getRksj() == null ? other.getRksj() == null : this.getRksj().equals(other.getRksj()))
            && (this.getGxry() == null ? other.getGxry() == null : this.getGxry().equals(other.getGxry()))
            && (this.getGxsj() == null ? other.getGxsj() == null : this.getGxsj().equals(other.getGxsj()))
            && (this.getYlzd1() == null ? other.getYlzd1() == null : this.getYlzd1().equals(other.getYlzd1()))
            && (this.getYlzd2() == null ? other.getYlzd2() == null : this.getYlzd2().equals(other.getYlzd2()))
            && (this.getYlzd3() == null ? other.getYlzd3() == null : this.getYlzd3().equals(other.getYlzd3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFzbh() == null) ? 0 : getFzbh().hashCode());
        result = prime * result + ((getFzmc() == null) ? 0 : getFzmc().hashCode());
        result = prime * result + ((getFzjb() == null) ? 0 : getFzjb().hashCode());
        result = prime * result + ((getFzxs() == null) ? 0 : getFzxs().hashCode());
        result = prime * result + ((getFzms() == null) ? 0 : getFzms().hashCode());
        result = prime * result + ((getFjfzbh() == null) ? 0 : getFjfzbh().hashCode());
        result = prime * result + ((getFznbbm() == null) ? 0 : getFznbbm().hashCode());
        result = prime * result + ((getXssx() == null) ? 0 : getXssx().hashCode());
        result = prime * result + ((getRkry() == null) ? 0 : getRkry().hashCode());
        result = prime * result + ((getRksj() == null) ? 0 : getRksj().hashCode());
        result = prime * result + ((getGxry() == null) ? 0 : getGxry().hashCode());
        result = prime * result + ((getGxsj() == null) ? 0 : getGxsj().hashCode());
        result = prime * result + ((getYlzd1() == null) ? 0 : getYlzd1().hashCode());
        result = prime * result + ((getYlzd2() == null) ? 0 : getYlzd2().hashCode());
        result = prime * result + ((getYlzd3() == null) ? 0 : getYlzd3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fzbh=").append(fzbh);
        sb.append(", fzmc=").append(fzmc);
        sb.append(", fzjb=").append(fzjb);
        sb.append(", fzxs=").append(fzxs);
        sb.append(", fzms=").append(fzms);
        sb.append(", fjfzbh=").append(fjfzbh);
        sb.append(", fznbbm=").append(fznbbm);
        sb.append(", xssx=").append(xssx);
        sb.append(", rkry=").append(rkry);
        sb.append(", rksj=").append(rksj);
        sb.append(", gxry=").append(gxry);
        sb.append(", gxsj=").append(gxsj);
        sb.append(", ylzd1=").append(ylzd1);
        sb.append(", ylzd2=").append(ylzd2);
        sb.append(", ylzd3=").append(ylzd3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}