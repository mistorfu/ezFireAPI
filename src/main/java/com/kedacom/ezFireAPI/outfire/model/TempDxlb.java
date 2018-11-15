package com.kedacom.ezFireAPI.outfire.model;

/**
 * @ClassName TempDxlb  缓存查询的dxlb
 * @Date 2018/6/11 10:44
 * @Author zhaomeng
 */
public class TempDxlb {
    private String key;
    private String id;
    private String value;
    private String chain;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }
}