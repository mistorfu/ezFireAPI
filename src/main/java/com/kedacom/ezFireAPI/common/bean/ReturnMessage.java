package com.kedacom.ezFireAPI.common.bean;

/**
 * Created by fudapeng on 2018/10/15.
 */
public class ReturnMessage {
    private String errorCode = "0";
    private String errorDesc = "OK";

    public ReturnMessage () {

    }

    public ReturnMessage(String errorCode, String errorDesc) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }
}