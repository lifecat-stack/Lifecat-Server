package com.ten.exception.impl;

/**
 * necessary parameter is null in service call
 *
 * @author Administrator
 */
public class NecessaryParameterIsNullException extends RuntimeException {

    private String errorMsg;

    public NecessaryParameterIsNullException() {
        this.errorMsg = "request's parameter is null";
    }

    public NecessaryParameterIsNullException(String errorMsg) {
        this.errorMsg = "request data format error : " + errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
