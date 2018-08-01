package com.ten.exception.impl;

/**
 * mapper execute error
 * where :
 * .  insert
 * .  update
 * .  delete
 * when :
 * .  affectice row result < 1
 *
 * @author Administrator
 * @call service
 */
public class ResourceExecuteException extends RuntimeException {

    private String errorMsg;

    public ResourceExecuteException() {
        this.errorMsg = "resource execute failure";
    }

    public ResourceExecuteException(String errorMsg) {
        this.errorMsg = "resource execute failure : " + errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public String toString() {
        return errorMsg;
    }
}
