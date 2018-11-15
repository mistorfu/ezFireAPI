package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.InnerXfjgext;
import com.kedacom.ezFireAPI.outfire.model.InnerXzqh;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @program: ezFireAPI
 * @description: 调派信息
 * @author: wangjinbo
 * @create: 2018-05-28 15:43
 */
@ApiModel(value="调派信息",description="调派信息对象")
public class Dpxx {
    @ApiModelProperty(value="灾情编号",name="zqbh",example="123")
    private String zqbh;         //灾情编号
    @ApiModelProperty(value="调派编号")
    private String dpbh;         //调派编号
    @ApiModelProperty(value="发送单位")
    private String fsdw;         //发送单位
    @ApiModelProperty(value="发送机构")
    private InnerXfjgext fsjg;      //发送机构
    @ApiModelProperty(value="发送辖区")
    private InnerXzqh fsxq;      //发送机构
    @ApiModelProperty(value="发送时间")
    private String fssj;         //发送时间
    @ApiModelProperty(value="接收单位")
    private String jsdw;         //接收单位
    @ApiModelProperty(value="接收机构")
    private List<InnerXfjgext> jsjg;      //接收机构
    @ApiModelProperty(value="反馈时间")
    private String fksj;         //反馈时间
    @ApiModelProperty(value="调派专家数")
    private Integer dpzjs;       //调派专家数
    @ApiModelProperty(value="队伍简称")
    private InnerDpzj dpzj;      //调派专家
    @ApiModelProperty(value="调派人员数")
    private Integer dprys;       //调派人员数
    @ApiModelProperty(value="调派人员")
    private InnerDpry dpry;      //调派人员
    @ApiModelProperty(value="调派车辆数")
    private Integer dpcls;       //调派车辆数
    @ApiModelProperty(value="调派车辆")
    private List<InnerCl> dpcl;  //调派车辆
    @ApiModelProperty(value="调派器材数")
    private double dpqcs;        //调派器材数
    @ApiModelProperty(value="调派器材")
    private InnerDpqc dpqc;      //调派器材
    @ApiModelProperty(value="数据来源")
    private String sjly;         //数据来源
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;      //数据监测
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;   //检索内容
    @ApiModelProperty(value="记录状态")
    private String jlzt;         //记录状态
    @ApiModelProperty(value="入库人员")
    private String rkry;         //入库人员
    @ApiModelProperty(value="入库时间")
    private String rksj;         //入库时间
    @ApiModelProperty(value="更新人员")
    private String gxry;         //更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj;         //更新时间

    public InnerXzqh getFsxq() {
        return fsxq;
    }

    public void setFsxq(InnerXzqh fsxq) {
        this.fsxq = fsxq;
    }

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getDpbh() {
        return dpbh;
    }

    public void setDpbh(String dpbh) {
        this.dpbh = dpbh;
    }

    public String getFsdw() {
        return fsdw;
    }

    public void setFsdw(String fsdw) {
        this.fsdw = fsdw;
    }

    public InnerXfjgext getFsjg() {
        return fsjg;
    }

    public void setFsjg(InnerXfjgext fsjg) {
        this.fsjg = fsjg;
    }

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getJsdw() {
        return jsdw;
    }

    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    public List<InnerXfjgext> getJsjg() {
        return jsjg;
    }

    public void setJsjg(List<InnerXfjgext> jsjg) {
        this.jsjg = jsjg;
    }

    public String getFksj() {
        return fksj;
    }

    public void setFksj(String fksj) {
        this.fksj = fksj;
    }

    public Integer getDpzjs() {
        return dpzjs;
    }

    public void setDpzjs(Integer dpzjs) {
        this.dpzjs = dpzjs;
    }

    public InnerDpzj getDpzj() {
        return dpzj;
    }

    public void setDpzj(InnerDpzj dpzj) {
        this.dpzj = dpzj;
    }

    public Integer getDprys() {
        return dprys;
    }

    public void setDprys(Integer dprys) {
        this.dprys = dprys;
    }

    public InnerDpry getDpry() {
        return dpry;
    }

    public void setDpry(InnerDpry dpry) {
        this.dpry = dpry;
    }

    public Integer getDpcls() {
        return dpcls;
    }

    public void setDpcls(Integer dpcls) {
        this.dpcls = dpcls;
    }

    public List<InnerCl> getDpcl() {
        return dpcl;
    }

    public void setDpcl(List<InnerCl> dpcl) {
        this.dpcl = dpcl;
    }

    public double getDpqcs() {
        return dpqcs;
    }

    public void setDpqcs(double dpqcs) {
        this.dpqcs = dpqcs;
    }

    public InnerDpqc getDpqc() {
        return dpqc;
    }

    public void setDpqc(InnerDpqc dpqc) {
        this.dpqc = dpqc;
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
