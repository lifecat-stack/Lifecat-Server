package com.ten.exception.impl;

import com.ten.exception.RequestException;

/**
 * request parameter format is error
 *
 * @author Administrator
 * @call controller
 */
public class RequestDataFormatException extends RuntimeException implements RequestException {

    private String errorMsg;

    public RequestDataFormatException() {
        this.errorMsg = "request's format is not available";
    }

    public RequestDataFormatException(String errorMsg) {
        this.errorMsg = "request's format is not available :" + errorMsg;
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