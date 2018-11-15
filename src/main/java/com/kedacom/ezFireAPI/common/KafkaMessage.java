package com.kedacom.ezFireAPI.common;

/**
 * Created by fudapeng on 2018/5/24.
 */
public class KafkaMessage {
    public static final String OPERA_ADD = "1";								//1. 新增操作
    public static final String OPERA_DEL = "2";								//2. 删除操作
    public static final String OPERA_MOD = "3";								//3. 修改操作
    public static final String OPERA_COVER = "4";							//4. 存在修改，否则添加

    private String xxbh;
    private String xxlb;
    private String xxdx;
    private String xxnr;
    private String xxly;
    private String zdysj;
    private String czlx;
    private String czyh;
    private String czdw;
    private String czsj;

    public String getXxbh() {
        return xxbh;
    }

    public void setXxbh(String xxbh) {
        this.xxbh = xxbh;
    }

    public String getXxlb() {
        return xxlb;
    }

    public void setXxlb(String xxlb) {
        this.xxlb = xxlb;
    }

    public String getXxdx() {
        return xxdx;
    }

    public void setXxdx(String xxdx) {
        this.xxdx = xxdx;
    }

    public String getXxnr() {
        return xxnr;
    }

    public void setXxnr(String xxnr) {
        this.xxnr = xxnr;
    }

    public String getXxly() {
        return xxly;
    }

    public void setXxly(String xxly) {
        this.xxly = xxly;
    }

    public String getZdysj() {
        return zdysj;
    }

    public void setZdysj(String zdysj) {
        this.zdysj = zdysj;
    }

    public String getCzlx() {
        return czlx;
    }

    public void setCzlx(String czlx) {
        this.czlx = czlx;
    }

    public String getCzyh() {
        return czyh;
    }

    public void setCzyh(String czyh) {
        this.czyh = czyh;
    }

    public String getCzdw() {
        return czdw;
    }

    public void setCzdw(String czdw) {
        this.czdw = czdw;
    }

    public String getCzsj() {
        return czsj;
    }

    public void setCzsj(String czsj) {
        this.czsj = czsj;
    }
}
