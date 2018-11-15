package com.kedacom.ezFireAPI.detection.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 检测对象
 * @author zhanghao
 */
@ApiModel(value = "检测对象",description = "检测对象对象")
public class BFireJcdx{
    @ApiModelProperty(value="数据索引名")
    private String sjsym;

    @ApiModelProperty(value="节点类型")
    private String jdlx;

    @ApiModelProperty(value="内部条链")
    private String nbtl;

    @ApiModelProperty(value="显示顺序")
    private Long xssx;

    @ApiModelProperty(value="对象名称")
    private String dxmc;

    @ApiModelProperty(value="对象形式")
    private String dxxs;

    @ApiModelProperty(value="匹配条件")
    private String pptj;

    @ApiModelProperty(value="父级对象")
    private String fjdx;

    @ApiModelProperty(value="对象编号")
    private String dxbh;

    @ApiModelProperty(value="对象描述")
    private String dxms;

    @ApiModelProperty(value="对象层级")
    private Long dxcj;

    @ApiModelProperty(value="数据类型名")
    private String sjlxm;

    private String rkry;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date rksj;

    private String gxry;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gxsj;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date jcsj;

    private String ylzd1;

    private String ylzd2;

    private String ylzd3;

    private static final long serialVersionUID = 1L;

    public String getDxbh() {
        return dxbh;
    }

    public void setDxbh(String dxbh) {
        this.dxbh = dxbh;
    }

    public String getDxmc() {
        return dxmc;
    }

    public void setDxmc(String dxmc) {
        this.dxmc = dxmc;
    }

    public Long getDxcj() {
        return dxcj;
    }

    public void setDxcj(Long dxcj) {
        this.dxcj = dxcj;
    }

    public String getDxms() {
        return dxms;
    }

    public void setDxms(String dxms) {
        this.dxms = dxms;
    }

    public String getDxxs() {
        return dxxs;
    }

    public void setDxxs(String dxxs) {
        this.dxxs = dxxs;
    }

    public String getSjsym() {
        return sjsym;
    }

    public void setSjsym(String sjsym) {
        this.sjsym = sjsym;
    }

    public String getSjlxm() {
        return sjlxm;
    }

    public void setSjlxm(String sjlxm) {
        this.sjlxm = sjlxm;
    }

    public String getPptj() {
        return pptj;
    }

    public void setPptj(String pptj) {
        this.pptj = pptj;
    }

    public String getFjdx() {
        return fjdx;
    }

    public void setFjdx(String fjdx) {
        this.fjdx = fjdx;
    }

    public String getNbtl() {
        return nbtl;
    }

    public void setNbtl(String nbtl) {
        this.nbtl = nbtl;
    }

    public String getJdlx() {
        return jdlx;
    }

    public void setJdlx(String jdlx) {
        this.jdlx = jdlx;
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

    public Date getJcsj() {
        return jcsj;
    }

    public void setJcsj(Date jcsj) {
        this.jcsj = jcsj;
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
        BFireJcdx other = (BFireJcdx) that;
        return (this.getDxbh() == null ? other.getDxbh() == null : this.getDxbh().equals(other.getDxbh()))
            && (this.getDxmc() == null ? other.getDxmc() == null : this.getDxmc().equals(other.getDxmc()))
            && (this.getDxcj() == null ? other.getDxcj() == null : this.getDxcj().equals(other.getDxcj()))
            && (this.getDxms() == null ? other.getDxms() == null : this.getDxms().equals(other.getDxms()))
            && (this.getDxxs() == null ? other.getDxxs() == null : this.getDxxs().equals(other.getDxxs()))
            && (this.getSjsym() == null ? other.getSjsym() == null : this.getSjsym().equals(other.getSjsym()))
            && (this.getSjlxm() == null ? other.getSjlxm() == null : this.getSjlxm().equals(other.getSjlxm()))
            && (this.getPptj() == null ? other.getPptj() == null : this.getPptj().equals(other.getPptj()))
            && (this.getFjdx() == null ? other.getFjdx() == null : this.getFjdx().equals(other.getFjdx()))
            && (this.getNbtl() == null ? other.getNbtl() == null : this.getNbtl().equals(other.getNbtl()))
            && (this.getJdlx() == null ? other.getJdlx() == null : this.getJdlx().equals(other.getJdlx()))
            && (this.getXssx() == null ? other.getXssx() == null : this.getXssx().equals(other.getXssx()))
            && (this.getRkry() == null ? other.getRkry() == null : this.getRkry().equals(other.getRkry()))
            && (this.getRksj() == null ? other.getRksj() == null : this.getRksj().equals(other.getRksj()))
            && (this.getGxry() == null ? other.getGxry() == null : this.getGxry().equals(other.getGxry()))
            && (this.getGxsj() == null ? other.getGxsj() == null : this.getGxsj().equals(other.getGxsj()))
            && (this.getJcsj() == null ? other.getJcsj() == null : this.getJcsj().equals(other.getJcsj()))
            && (this.getYlzd1() == null ? other.getYlzd1() == null : this.getYlzd1().equals(other.getYlzd1()))
            && (this.getYlzd2() == null ? other.getYlzd2() == null : this.getYlzd2().equals(other.getYlzd2()))
            && (this.getYlzd3() == null ? other.getYlzd3() == null : this.getYlzd3().equals(other.getYlzd3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDxbh() == null) ? 0 : getDxbh().hashCode());
        result = prime * result + ((getDxmc() == null) ? 0 : getDxmc().hashCode());
        result = prime * result + ((getDxcj() == null) ? 0 : getDxcj().hashCode());
        result = prime * result + ((getDxms() == null) ? 0 : getDxms().hashCode());
        result = prime * result + ((getDxxs() == null) ? 0 : getDxxs().hashCode());
        result = prime * result + ((getSjsym() == null) ? 0 : getSjsym().hashCode());
        result = prime * result + ((getSjlxm() == null) ? 0 : getSjlxm().hashCode());
        result = prime * result + ((getPptj() == null) ? 0 : getPptj().hashCode());
        result = prime * result + ((getFjdx() == null) ? 0 : getFjdx().hashCode());
        result = prime * result + ((getNbtl() == null) ? 0 : getNbtl().hashCode());
        result = prime * result + ((getJdlx() == null) ? 0 : getJdlx().hashCode());
        result = prime * result + ((getXssx() == null) ? 0 : getXssx().hashCode());
        result = prime * result + ((getRkry() == null) ? 0 : getRkry().hashCode());
        result = prime * result + ((getRksj() == null) ? 0 : getRksj().hashCode());
        result = prime * result + ((getGxry() == null) ? 0 : getGxry().hashCode());
        result = prime * result + ((getGxsj() == null) ? 0 : getGxsj().hashCode());
        result = prime * result + ((getJcsj() == null) ? 0 : getJcsj().hashCode());
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
        sb.append(", dxbh=").append(dxbh);
        sb.append(", dxmc=").append(dxmc);
        sb.append(", dxcj=").append(dxcj);
        sb.append(", dxms=").append(dxms);
        sb.append(", dxxs=").append(dxxs);
        sb.append(", sjsym=").append(sjsym);
        sb.append(", sjlxm=").append(sjlxm);
        sb.append(", pptj=").append(pptj);
        sb.append(", fjdx=").append(fjdx);
        sb.append(", nbtl=").append(nbtl);
        sb.append(", jdlx=").append(jdlx);
        sb.append(", xssx=").append(xssx);
        sb.append(", rkry=").append(rkry);
        sb.append(", rksj=").append(rksj);
        sb.append(", gxry=").append(gxry);
        sb.append(", gxsj=").append(gxsj);
        sb.append(", jcsj=").append(jcsj);
        sb.append(", ylzd1=").append(ylzd1);
        sb.append(", ylzd2=").append(ylzd2);
        sb.append(", ylzd3=").append(ylzd3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}