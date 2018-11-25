package com.ten.lifecat.common.exception.impl;

import com.ten.lifecat.common.exception.RequestException;

/**
 * request necessary parameter is null
 *
 * @author Administrator
 * @call service
 */
public class NecessaryParameterIsNullException extends RuntimeException implements RequestException {

    private String errorMsg;

    public NecessaryParameterIsNullException() {
        this.errorMsg = "request's parameter is null";
    }

    public NecessaryParameterIsNullException(String errorMsg) {
        this.errorMsg = "request's parameter is null :" + errorMsg;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public String toString() {
        return errorMsg;
    }
}
