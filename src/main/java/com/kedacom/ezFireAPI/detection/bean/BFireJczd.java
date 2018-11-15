package com.kedacom.ezFireAPI.detection.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 *  检测字段
 * @author zhanghao
 *
 */
@ApiModel(value = "校验字段",description = "校验字段对象")
public class BFireJczd extends BFireJczdKey implements Serializable {
    @ApiModelProperty(value="校验规则")
    private String jygz;

    @ApiModelProperty(value="字段名称")
    private String zdmc;

    @ApiModelProperty(value="显示顺序")
    private Long xssx;

    @ApiModelProperty(value="显示字段")
    private String xszd;

    @ApiModelProperty(value="错误提示")
    private String cwts;

    @ApiModelProperty(value="字段描述")
    private String zdms;

    @ApiModelProperty(value="字段类型")
    private String zdlx;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date rksj;

    private String rkry;
    private String gxry;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gxsj;

    private String ylzd1;

    private String ylzd2;

    private String ylzd3;



    private static final long serialVersionUID = 1L;

    public String getZdmc() {
        return zdmc;
    }

    public void setZdmc(String zdmc) {
        this.zdmc = zdmc;
    }

    public String getZdlx() {
        return zdlx;
    }

    public void setZdlx(String zdlx) {
        this.zdlx = zdlx;
    }

    public String getZdms() {
        return zdms;
    }

    public void setZdms(String zdms) {
        this.zdms = zdms;
    }

    public String getJygz() {
        return jygz;
    }

    public void setJygz(String jygz) {
        this.jygz = jygz;
    }

    public String getXszd() {
        return xszd;
    }

    public void setXszd(String xszd) {
        this.xszd = xszd;
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

    public String getCwts() {
        return cwts;
    }

    public void setCwts(String cwts) {
        this.cwts = cwts;
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
        BFireJczd other = (BFireJczd) that;
        return (this.getDxbh() == null ? other.getDxbh() == null : this.getDxbh().equals(other.getDxbh()))
            && (this.getZdbs() == null ? other.getZdbs() == null : this.getZdbs().equals(other.getZdbs()))
            && (this.getZdmc() == null ? other.getZdmc() == null : this.getZdmc().equals(other.getZdmc()))
            && (this.getZdlx() == null ? other.getZdlx() == null : this.getZdlx().equals(other.getZdlx()))
            && (this.getZdms() == null ? other.getZdms() == null : this.getZdms().equals(other.getZdms()))
            && (this.getJygz() == null ? other.getJygz() == null : this.getJygz().equals(other.getJygz()))
            && (this.getXszd() == null ? other.getXszd() == null : this.getXszd().equals(other.getXszd()))
            && (this.getXssx() == null ? other.getXssx() == null : this.getXssx().equals(other.getXssx()))
            && (this.getRkry() == null ? other.getRkry() == null : this.getRkry().equals(other.getRkry()))
            && (this.getRksj() == null ? other.getRksj() == null : this.getRksj().equals(other.getRksj()))
            && (this.getGxry() == null ? other.getGxry() == null : this.getGxry().equals(other.getGxry()))
            && (this.getGxsj() == null ? other.getGxsj() == null : this.getGxsj().equals(other.getGxsj()))
            && (this.getYlzd1() == null ? other.getYlzd1() == null : this.getYlzd1().equals(other.getYlzd1()))
            && (this.getYlzd2() == null ? other.getYlzd2() == null : this.getYlzd2().equals(other.getYlzd2()))
            && (this.getYlzd3() == null ? other.getYlzd3() == null : this.getYlzd3().equals(other.getYlzd3()))
            && (this.getCwts() == null ? other.getCwts() == null : this.getCwts().equals(other.getCwts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDxbh() == null) ? 0 : getDxbh().hashCode());
        result = prime * result + ((getZdbs() == null) ? 0 : getZdbs().hashCode());
        result = prime * result + ((getZdmc() == null) ? 0 : getZdmc().hashCode());
        result = prime * result + ((getZdlx() == null) ? 0 : getZdlx().hashCode());
        result = prime * result + ((getZdms() == null) ? 0 : getZdms().hashCode());
        result = prime * result + ((getJygz() == null) ? 0 : getJygz().hashCode());
        result = prime * result + ((getXszd() == null) ? 0 : getXszd().hashCode());
        result = prime * result + ((getXssx() == null) ? 0 : getXssx().hashCode());
        result = prime * result + ((getRkry() == null) ? 0 : getRkry().hashCode());
        result = prime * result + ((getRksj() == null) ? 0 : getRksj().hashCode());
        result = prime * result + ((getGxry() == null) ? 0 : getGxry().hashCode());
        result = prime * result + ((getGxsj() == null) ? 0 : getGxsj().hashCode());
        result = prime * result + ((getYlzd1() == null) ? 0 : getYlzd1().hashCode());
        result = prime * result + ((getYlzd2() == null) ? 0 : getYlzd2().hashCode());
        result = prime * result + ((getYlzd3() == null) ? 0 : getYlzd3().hashCode());
        result = prime * result + ((getCwts() == null) ? 0 : getCwts().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", zdmc=").append(zdmc);
        sb.append(", zdlx=").append(zdlx);
        sb.append(", zdms=").append(zdms);
        sb.append(", jygz=").append(jygz);
        sb.append(", xszd=").append(xszd);
        sb.append(", xssx=").append(xssx);
        sb.append(", rkry=").append(rkry);
        sb.append(", rksj=").append(rksj);
        sb.append(", gxry=").append(gxry);
        sb.append(", gxsj=").append(gxsj);
        sb.append(", ylzd1=").append(ylzd1);
        sb.append(", ylzd2=").append(ylzd2);
        sb.append(", ylzd3=").append(ylzd3);
        sb.append(", cwts=").append(cwts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}