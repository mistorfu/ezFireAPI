package com.kedacom.ezFireAPI.alarm.model;

import com.kedacom.ezFireAPI.basic.model.InnerSjjc;
import com.kedacom.ezFireAPI.outfire.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @program: ezFireAPI
 * @description: 典型案例
 * @author: wangjinbo
 * @create: 2018-05-28 15:44
 */
@ApiModel(value="典型案例",description="典型案例对象")
public class Dxal {
    @ApiModelProperty(value="灾情编号",name="zqbh",example="123")
    private String zqbh;           //灾情编号
    @ApiModelProperty(value="关联编号")
    private String glbh;           //关联编号
    @ApiModelProperty(value="增援编号")
    private String zybh;           //增援编号
    @ApiModelProperty(value="灾情分类")
    private String zqfl;           //灾情分类
    @ApiModelProperty(value="灾情名称")
    private String zqmc;           //灾情名称
    @ApiModelProperty(value="灾情全称")
    private String zqqc;           //灾情全称
    @ApiModelProperty(value="灾情地点")
    private String zqdd;           //灾情地点
    @ApiModelProperty(value="灾情类型")
    private InnerDxlbext zqlx;        //灾情类型
    @ApiModelProperty(value="灾情等级")
    private InnerDxlb zqdj;        //灾情等级
    @ApiModelProperty(value="灾情状态")
    private InnerDxlb zqzt;        //灾情状态
    @ApiModelProperty(value="灾情对象")
    private InnerZqdx zqdx;        //灾情对象
    @ApiModelProperty(value="灾情文件")
    private List<InnerZqwj> zqwj;  //灾情文件
    @ApiModelProperty(value="灾情概述")
    private String zqgs;           //灾情概述
    @ApiModelProperty(value="灾情标识")
    private String zqbs;           //灾情标识
    @ApiModelProperty(value="燃烧楼层")
    private String rslc;           //燃烧楼层
    @ApiModelProperty(value="经度")
    private double jd;             //经度
    @ApiModelProperty(value="纬度")
    private double wd;             //纬度
    @ApiModelProperty(value="报警人员")
    private String bjry;           //报警人员
    @ApiModelProperty(value="报警电话")
    private String bjdh;           //报警电话
    @ApiModelProperty(value="报警方式")
    private String bjfs;           //报警方式
    @ApiModelProperty(value="报警时间")
    private String bjsj;           //报警时间
    @ApiModelProperty(value="立案时间")
    private String lasj;           //立案时间
    @ApiModelProperty(value="结案时间")
    private String jasj;           //结案时间
    @ApiModelProperty(value="接受命令时间")
    private String jsmlsj;         //接受命令时间
    @ApiModelProperty(value="出动警力时间")
    private String cdjlsj;         //出动警力时间
    @ApiModelProperty(value="到达现场时间")
    private String ddxcsj;         //到达现场时间
    @ApiModelProperty(value="战斗展开时间")
    private String zdzksj;         //战斗展开时间
    @ApiModelProperty(value="到场出水时间")
    private String dccssj;         //到场出水时间
    @ApiModelProperty(value="火势控制时间")
    private String hskzsj;         //火势控制时间
    @ApiModelProperty(value="基本扑灭时间")
    private String jbpmsj;         //基本扑灭时间
    @ApiModelProperty(value="警力归队时间")
    private String jlgdsj;         //警力归队时间
    @ApiModelProperty(value="群众伤亡情况")
    private String qzswqk;         //群众伤亡情况
    @ApiModelProperty(value="官兵伤亡情况")
    private String gbswqk;         //官兵伤亡情况
    @ApiModelProperty(value="现场指挥人员")
    private InnerXczhry xczhry;    //现场指挥人员
    @ApiModelProperty(value="所在地消防机构")
    private InnerXfjg szdxfjg;     //所在地消防机构
    @ApiModelProperty(value="所在地行政区划")
    private InnerXzqh szdxzqh;     //所在地行政区划
    @ApiModelProperty(value="数据来源")
    private String sjly;           //数据来源
    @ApiModelProperty(value="数据监测")
    private InnerSjjc sjjc;        //数据监测
    @ApiModelProperty(value="检索内容")
    private List<String> jsnr;     //检索内容
    @ApiModelProperty(value="检索内容（名称）")
    private List<String> jsnr_mc;  //检索内容（名称）
    @ApiModelProperty(value="检索内容（地址）")
    private List<String> jsnr_dz;  //检索内容（地址）
    @ApiModelProperty(value="检索内容（区划）")
    private List<String> jsnr_qh;  //检索内容（区划）
    @ApiModelProperty(value="记录状态")
    private String jlzt;           //记录状态
    @ApiModelProperty(value="审核状态")
    private String shzt;           //审核状态
    @ApiModelProperty(value="审核历史")
    private List<InnerShls> shls;  //审核历史
    @ApiModelProperty(value="入库人员")
    private String rkry;           //入库人员
    @ApiModelProperty(value="入库时间")
    private String rksj;           //入库时间
    @ApiModelProperty(value="更新人员")
    private String gxry;           //更新人员
    @ApiModelProperty(value="更新时间")
    private String gxsj;           //更新时间
    @ApiModelProperty(value="元素形状")
    private InnerShape shape;      //元素形状

    public String getZqbh() {
        return zqbh;
    }

    public void setZqbh(String zqbh) {
        this.zqbh = zqbh;
    }

    public String getGlbh() {
        return glbh;
    }

    public void setGlbh(String glbh) {
        this.glbh = glbh;
    }

    public String getZybh() {
        return zybh;
    }

    public void setZybh(String zybh) {
        this.zybh = zybh;
    }

    public String getZqfl() {
        return zqfl;
    }

    public void setZqfl(String zqfl) {
        this.zqfl = zqfl;
    }

    public String getZqmc() {
        return zqmc;
    }

    public void setZqmc(String zqmc) {
        this.zqmc = zqmc;
    }

    public String getZqqc() {
        return zqqc;
    }

    public void setZqqc(String zqqc) {
        this.zqqc = zqqc;
    }

    public String getZqdd() {
        return zqdd;
    }

    public void setZqdd(String zqdd) {
        this.zqdd = zqdd;
    }

    public InnerDxlbext getZqlx() {
        return zqlx;
    }

    public void setZqlx(InnerDxlbext zqlx) {
        this.zqlx = zqlx;
    }

    public InnerDxlb getZqdj() {
        return zqdj;
    }

    public void setZqdj(InnerDxlb zqdj) {
        this.zqdj = zqdj;
    }

    public InnerDxlb getZqzt() {
        return zqzt;
    }

    public void setZqzt(InnerDxlb zqzt) {
        this.zqzt = zqzt;
    }

    public InnerZqdx getZqdx() {
        return zqdx;
    }

    public void setZqdx(InnerZqdx zqdx) {
        this.zqdx = zqdx;
    }

    public List<InnerZqwj> getZqwj() {
        return zqwj;
    }

    public void setZqwj(List<InnerZqwj> zqwj) {
        this.zqwj = zqwj;
    }

    public String getZqgs() {
        return zqgs;
    }

    public void setZqgs(String zqgs) {
        this.zqgs = zqgs;
    }

    public String getZqbs() {
        return zqbs;
    }

    public void setZqbs(String zqbs) {
        this.zqbs = zqbs;
    }

    public String getRslc() {
        return rslc;
    }

    public void setRslc(String rslc) {
        this.rslc = rslc;
    }

    public double getJd() {
        return jd;
    }

    public void setJd(double jd) {
        this.jd = jd;
    }

    public double getWd() {
        return wd;
    }

    public void setWd(double wd) {
        this.wd = wd;
    }

    public String getBjry() {
        return bjry;
    }

    public void setBjry(String bjry) {
        this.bjry = bjry;
    }

    public String getBjdh() {
        return bjdh;
    }

    public void setBjdh(String bjdh) {
        this.bjdh = bjdh;
    }

    public String getBjfs() {
        return bjfs;
    }

    public void setBjfs(String bjfs) {
        this.bjfs = bjfs;
    }

    public String getBjsj() {
        return bjsj;
    }

    public void setBjsj(String bjsj) {
        this.bjsj = bjsj;
    }

    public String getLasj() {
        return lasj;
    }

    public void setLasj(String lasj) {
        this.lasj = lasj;
    }

    public String getJasj() {
        return jasj;
    }

    public void setJasj(String jasj) {
        this.jasj = jasj;
    }

    public String getJsmlsj() {
        return jsmlsj;
    }

    public void setJsmlsj(String jsmlsj) {
        this.jsmlsj = jsmlsj;
    }

    public String getCdjlsj() {
        return cdjlsj;
    }

    public void setCdjlsj(String cdjlsj) {
        this.cdjlsj = cdjlsj;
    }

    public String getDdxcsj() {
        return ddxcsj;
    }

    public void setDdxcsj(String ddxcsj) {
        this.ddxcsj = ddxcsj;
    }

    public String getZdzksj() {
        return zdzksj;
    }

    public void setZdzksj(String zdzksj) {
        this.zdzksj = zdzksj;
    }

    public String getDccssj() {
        return dccssj;
    }

    public void setDccssj(String dccssj) {
        this.dccssj = dccssj;
    }

    public String getHskzsj() {
        return hskzsj;
    }

    public void setHskzsj(String hskzsj) {
        this.hskzsj = hskzsj;
    }

    public String getJbpmsj() {
        return jbpmsj;
    }

    public void setJbpmsj(String jbpmsj) {
        this.jbpmsj = jbpmsj;
    }

    public String getJlgdsj() {
        return jlgdsj;
    }

    public void setJlgdsj(String jlgdsj) {
        this.jlgdsj = jlgdsj;
    }

    public String getQzswqk() {
        return qzswqk;
    }

    public void setQzswqk(String qzswqk) {
        this.qzswqk = qzswqk;
    }

    public String getGbswqk() {
        return gbswqk;
    }

    public void setGbswqk(String gbswqk) {
        this.gbswqk = gbswqk;
    }

    public InnerXczhry getXczhry() {
        return xczhry;
    }

    public void setXczhry(InnerXczhry xczhry) {
        this.xczhry = xczhry;
    }

    public InnerXfjg getSzdxfjg() {
        return szdxfjg;
    }

    public void setSzdxfjg(InnerXfjg szdxfjg) {
        this.szdxfjg = szdxfjg;
    }

    public InnerXzqh getSzdxzqh() {
        return szdxzqh;
    }

    public void setSzdxzqh(InnerXzqh szdxzqh) {
        this.szdxzqh = szdxzqh;
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

    public List<String> getJsnr_mc() {
        return jsnr_mc;
    }

    public void setJsnr_mc(List<String> jsnr_mc) {
        this.jsnr_mc = jsnr_mc;
    }

    public List<String> getJsnr_dz() {
        return jsnr_dz;
    }

    public void setJsnr_dz(List<String> jsnr_dz) {
        this.jsnr_dz = jsnr_dz;
    }

    public List<String> getJsnr_qh() {
        return jsnr_qh;
    }

    public void setJsnr_qh(List<String> jsnr_qh) {
        this.jsnr_qh = jsnr_qh;
    }

    public String getJlzt() {
        return jlzt;
    }

    public void setJlzt(String jlzt) {
        this.jlzt = jlzt;
    }

    public String getShzt() {
        return shzt;
    }

    public void setShzt(String shzt) {
        this.shzt = shzt;
    }

    public List<InnerShls> getShls() {
        return shls;
    }

    public void setShls(List<InnerShls> shls) {
        this.shls = shls;
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

    public InnerShape getShape() {
        return shape;
    }  

    public void setShape(InnerShape shape) {
        this.shape = shape;
    }

}
