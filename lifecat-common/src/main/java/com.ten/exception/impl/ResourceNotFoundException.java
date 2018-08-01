package com.ten.exception.impl;

/**
 * resource not found
 * <p>
 * where :
 * .  mapper query
 * .  autowired null
 * when :
 * .  query result is null
 * .  autowired error
 *
 * @author Administrator
 * @call service
 * @call controller
 */
public class ResourceNotFoundException extends RuntimeException {

    private String errorMsg;

    public ResourceNotFoundException() {
        this.errorMsg = "resource not found";
    }

    public ResourceNotFoundException(String msg) {
        this.errorMsg = "resource not found :" + msg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public String toString() {
        return errorMsg;
    }
}
