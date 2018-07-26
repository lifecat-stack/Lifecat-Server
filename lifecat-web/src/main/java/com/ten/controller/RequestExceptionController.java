package com.ten.controller;

import com.ten.exception.RequestError;
import com.ten.exception.RequestException;
import com.ten.exception.impl.*;
import com.ten.exception.impl.RequestDataFormatException;
import com.ten.exception.impl.RequestDataNullException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 请求出错 400
 *
 * @author Administrator
 */
@ControllerAdvice
public class RequestExceptionController {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler({
            RequestDataNullException.class,
            RequestDataFormatException.class})
    public RequestError handleExecute(RequestException e) {
        return new RequestError(e.getErrorMsg());
    }
}