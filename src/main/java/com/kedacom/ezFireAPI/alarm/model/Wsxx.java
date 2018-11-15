package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjgext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @program: ezFireAPI
 * @description: 文书信息
 * @author: wangjinbo
 * @create: 2018-05-28 15:43
 */
@ApiModel(value="文书信息",description="文书信息对象")
public class Wsxx {
    @ApiModelProperty(value="灾情编号",name="zqbh",example="123")
    private String zqbh;  //灾情编号
    @ApiModelProperty(value="文书编号")
    private String wsbh;  //文书编号
    @ApiModelProperty(value="文书类型")
    private String wslx;  //文书类型
    @ApiModelProperty(value="文书主题")
    private String wszt;  //文书主题
    @ApiModelProperty(value="文书内容")
    private String wsnr;  //文书内容
    @ApiModelProperty(value="记录人员")
    private String jlry;  //记录人员
    @ApiModelProperty(value="记录时间")
    private String jlsj;  //记录时间
    @ApiModelProperty(value="反馈人员")
    private String fkry;  //反馈人员
    @ApiModelProperty(value="反馈单位")
    private String fkdw;  //反馈单位
    @ApiModelProperty(value="反馈机构")
    private InnerXfjgext fkjg;  //反馈机构
    @ApiModelProperty(value="反馈时间")
    private String fksj;  //反馈时间
    @ApiModelProperty(value="数据来源")
    private String sjly;  //数据来源
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;  //数据监测
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;  //检索内容
    @ApiModelProperty(value="记录状态")
    private String jlzt;  //记录状态
    @ApiModelProperty(value="入库人员")
    private String rkry;  //入库人员
    @ApiModelProperty(value="入库时间")
    private String rksj;  //入库时间
    @ApiModelProperty(value="更新人员")
    private String gxry;  //更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj;  //更新时间

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getWsbh() {
        return wsbh;
    }

    public void setWsbh(String wsbh) {
        this.wsbh = wsbh;
    }

    public String getWslx() {
        return wslx;
    }

    public void setWslx(String wslx) {
        this.wslx = wslx;
    }

    public String getWszt() {
        return wszt;
    }

    public void setWszt(String wszt) {
        this.wszt = wszt;
    }

    public String getWsnr() {
        return wsnr;
    }

    public void setWsnr(String wsnr) {
        this.wsnr = wsnr;
    }

    public String getJlry() {
        return jlry;
    }

    public void setJlry(String jlry) {
        this.jlry = jlry;
    }

    public String getJlsj() {
        return jlsj;
    }

    public void setJlsj(String jlsj) {
        this.jlsj = jlsj;
    }

    public String getFkry() {
        return fkry;
    }

    public void setFkry(String fkry) {
        this.fkry = fkry;
    }

    public String getFkdw() {
        return fkdw;
    }

    public void setFkdw(String fkdw) {
        this.fkdw = fkdw;
    }

    public InnerXfjgext getFkjg() {
        return fkjg;
    }

    public void setFkjg(InnerXfjgext fkjg) {
        this.fkjg = fkjg;
    }

    public String getFksj() {
        return fksj;
    }

    public void setFksj(String fksj) {
        this.fksj = fksj;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public InnerSjjc getSjjc() {
        return sjjc;
    }

    public void setSjjc(InnerSjjc sjjc) {
        this.sjjc = sjjc;
    }

    public List<String> getJsnr() {
        return jsnr;
    }

    public void setJsnr(List<String> jsnr) {
        this.jsnr = jsnr;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }

    public String getRkry() {
        return rkry;
    }

    public void setRkry(String rkry) {
        this.rkry = rkry;
    }

    public String getRksj() {
        return rksj;
    }

    public void setRksj(String rksj) {
        this.rksj = rksj;
    }

    public String getGxry() {
        return gxry;
    }

    public void setGxry(String gxry) {
        this.gxry = gxry;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }
}
