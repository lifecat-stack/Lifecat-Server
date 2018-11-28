package com.ten.lifecat.server.common.exception.impl;

import com.ten.lifecat.server.common.exception.RequestException;

/**
 * request parameter is null
 *
 * @author Administrator
 * @call controller
 */
public class RequestDataNullException extends RuntimeException implements RequestException {

    private String errorMsg;

    public RequestDataNullException() {
        this.errorMsg = "request's data is null";
    }

    public RequestDataNullException(String errorMsg) {
        this.errorMsg = "request's data is null :" + errorMsg;
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
