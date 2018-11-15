package com.kedacom.ezFireAPI.qj.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhanghao
 */
@ApiModel(value = "功能明细",description = "功能明细对象")
public class BQjGnmx implements Serializable {

    @ApiModelProperty("功能编号")
    private String gnbh;

    @ApiModelProperty("功能名称")
    private String gnmc;

    @ApiModelProperty("功能描述")
    private String gnms;

    @ApiModelProperty("功能类型")
    private String gnlx;

    @ApiModelProperty("功能页面")
    private String gnym;

    @ApiModelProperty("功能链接")
    private String gnlj;

    @ApiModelProperty("功能参数")
    private String gncs;

    @ApiModelProperty("版本类型")
    private String bblx;

    @ApiModelProperty("版本信息")
    private String bbxx;

    @ApiModelProperty("所属功能组")
    private String ssgnz;

    @ApiModelProperty("功能优先级")
    private Long gnyxj;

    @ApiModelProperty("开发厂商")
    private String kfcs;

    @ApiModelProperty("联系人员")
    private String lxry;

    @ApiModelProperty("联系电话")
    private String lxdh;

    @ApiModelProperty("维护厂商")
    private String whcs;

    @ApiModelProperty("维护人员")
    private String whry;

    @ApiModelProperty("维护电话")
    private String whdh;

    @ApiModelProperty("显示屏幕")
    private Long xspm;

    @ApiModelProperty("启用状态")
    private String qyzt;

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

    public String getGnbh() {
        return gnbh;
    }

    public void setGnbh(String gnbh) {
        this.gnbh = gnbh;
    }

    public String getGnmc() {
        return gnmc;
    }

    public void setGnmc(String gnmc) {
        this.gnmc = gnmc;
    }

    public String getGnms() {
        return gnms;
    }

    public void setGnms(String gnms) {
        this.gnms = gnms;
    }

    public String getGnlx() {
        return gnlx;
    }

    public void setGnlx(String gnlx) {
        this.gnlx = gnlx;
    }

    public String getGnym() {
        return gnym;
    }

    public void setGnym(String gnym) {
        this.gnym = gnym;
    }

    public String getGnlj() {
        return gnlj;
    }

    public void setGnlj(String gnlj) {
        this.gnlj = gnlj;
    }

    public String getGncs() {
        return gncs;
    }

    public void setGncs(String gncs) {
        this.gncs = gncs;
    }

    public String getBblx() {
        return bblx;
    }

    public void setBblx(String bblx) {
        this.bblx = bblx;
    }

    public String getBbxx() {
        return bbxx;
    }

    public void setBbxx(String bbxx) {
        this.bbxx = bbxx;
    }

    public String getSsgnz() {
        return ssgnz;
    }

    public void setSsgnz(String ssgnz) {
        this.ssgnz = ssgnz;
    }

    public Long getGnyxj() {
        return gnyxj;
    }

    public void setGnyxj(Long gnyxj) {
        this.gnyxj = gnyxj;
    }

    public String getKfcs() {
        return kfcs;
    }

    public void setKfcs(String kfcs) {
        this.kfcs = kfcs;
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

    public String getWhcs() {
        return whcs;
    }

    public void setWhcs(String whcs) {
        this.whcs = whcs;
    }

    public String getWhry() {
        return whry;
    }

    public void setWhry(String whry) {
        this.whry = whry;
    }

    public String getWhdh() {
        return whdh;
    }

    public void setWhdh(String whdh) {
        this.whdh = whdh;
    }

    public Long getXspm() {
        return xspm;
    }

    public void setXspm(Long xspm) {
        this.xspm = xspm;
    }

    public String getQyzt() {
        return qyzt;
    }

    public void setQyzt(String qyzt) {
        this.qyzt = qyzt;
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
        BQjGnmx other = (BQjGnmx) that;
        return (this.getGnbh() == null ? other.getGnbh() == null : this.getGnbh().equals(other.getGnbh()))
            && (this.getGnmc() == null ? other.getGnmc() == null : this.getGnmc().equals(other.getGnmc()))
            && (this.getGnms() == null ? other.getGnms() == null : this.getGnms().equals(other.getGnms()))
            && (this.getGnlx() == null ? other.getGnlx() == null : this.getGnlx().equals(other.getGnlx()))
            && (this.getGnym() == null ? other.getGnym() == null : this.getGnym().equals(other.getGnym()))
            && (this.getGnlj() == null ? other.getGnlj() == null : this.getGnlj().equals(other.getGnlj()))
            && (this.getGncs() == null ? other.getGncs() == null : this.getGncs().equals(other.getGncs()))
            && (this.getBblx() == null ? other.getBblx() == null : this.getBblx().equals(other.getBblx()))
            && (this.getBbxx() == null ? other.getBbxx() == null : this.getBbxx().equals(other.getBbxx()))
            && (this.getSsgnz() == null ? other.getSsgnz() == null : this.getSsgnz().equals(other.getSsgnz()))
            && (this.getGnyxj() == null ? other.getGnyxj() == null : this.getGnyxj().equals(other.getGnyxj()))
            && (this.getKfcs() == null ? other.getKfcs() == null : this.getKfcs().equals(other.getKfcs()))
            && (this.getLxry() == null ? other.getLxry() == null : this.getLxry().equals(other.getLxry()))
            && (this.getLxdh() == null ? other.getLxdh() == null : this.getLxdh().equals(other.getLxdh()))
            && (this.getWhcs() == null ? other.getWhcs() == null : this.getWhcs().equals(other.getWhcs()))
            && (this.getWhry() == null ? other.getWhry() == null : this.getWhry().equals(other.getWhry()))
            && (this.getWhdh() == null ? other.getWhdh() == null : this.getWhdh().equals(other.getWhdh()))
            && (this.getXspm() == null ? other.getXspm() == null : this.getXspm().equals(other.getXspm()))
            && (this.getQyzt() == null ? other.getQyzt() == null : this.getQyzt().equals(other.getQyzt()))
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
        result = prime * result + ((getGnbh() == null) ? 0 : getGnbh().hashCode());
        result = prime * result + ((getGnmc() == null) ? 0 : getGnmc().hashCode());
        result = prime * result + ((getGnms() == null) ? 0 : getGnms().hashCode());
        result = prime * result + ((getGnlx() == null) ? 0 : getGnlx().hashCode());
        result = prime * result + ((getGnym() == null) ? 0 : getGnym().hashCode());
        result = prime * result + ((getGnlj() == null) ? 0 : getGnlj().hashCode());
        result = prime * result + ((getGncs() == null) ? 0 : getGncs().hashCode());
        result = prime * result + ((getBblx() == null) ? 0 : getBblx().hashCode());
        result = prime * result + ((getBbxx() == null) ? 0 : getBbxx().hashCode());
        result = prime * result + ((getSsgnz() == null) ? 0 : getSsgnz().hashCode());
        result = prime * result + ((getGnyxj() == null) ? 0 : getGnyxj().hashCode());
        result = prime * result + ((getKfcs() == null) ? 0 : getKfcs().hashCode());
        result = prime * result + ((getLxry() == null) ? 0 : getLxry().hashCode());
        result = prime * result + ((getLxdh() == null) ? 0 : getLxdh().hashCode());
        result = prime * result + ((getWhcs() == null) ? 0 : getWhcs().hashCode());
        result = prime * result + ((getWhry() == null) ? 0 : getWhry().hashCode());
        result = prime * result + ((getWhdh() == null) ? 0 : getWhdh().hashCode());
        result = prime * result + ((getXspm() == null) ? 0 : getXspm().hashCode());
        result = prime * result + ((getQyzt() == null) ? 0 : getQyzt().hashCode());
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
        sb.append(", gnbh=").append(gnbh);
        sb.append(", gnmc=").append(gnmc);
        sb.append(", gnms=").append(gnms);
        sb.append(", gnlx=").append(gnlx);
        sb.append(", gnym=").append(gnym);
        sb.append(", gnlj=").append(gnlj);
        sb.append(", gncs=").append(gncs);
        sb.append(", bblx=").append(bblx);
        sb.append(", bbxx=").append(bbxx);
        sb.append(", ssgnz=").append(ssgnz);
        sb.append(", gnyxj=").append(gnyxj);
        sb.append(", kfcs=").append(kfcs);
        sb.append(", lxry=").append(lxry);
        sb.append(", lxdh=").append(lxdh);
        sb.append(", whcs=").append(whcs);
        sb.append(", whry=").append(whry);
        sb.append(", whdh=").append(whdh);
        sb.append(", xspm=").append(xspm);
        sb.append(", qyzt=").append(qyzt);
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