package com.ten.controller;

import com.ten.exception.RequestError;
import com.ten.exception.impl.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 查询失败 not found 404
 *
 * @author Administrator
 */
@ControllerAdvice
public class ResourceNotFoundController {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    @ExceptionHandler(ResourceNotFoundException.class)
    public RequestError handleNotFound(ResourceNotFoundException e) {
        return new RequestError(e.getErrorMsg());
    }
}
