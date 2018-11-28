package com.ten.lifecat.server.controller;

import com.ten.lifecat.server.common.exception.RequestException;
import com.ten.lifecat.server.dto.ResponseCode;
import com.ten.lifecat.server.dto.ResultModel;
import com.ten.lifecat.server.common.exception.impl.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Exception Controller
 *
 * @author Administrator
 */
@ControllerAdvice
public class ExceptionController {

    /**
     * request请求出错
     * <p>
     * code :400
     */
    @ResponseBody
    @ExceptionHandler({
            RequestDataNullException.class,
            RequestDataFormatException.class,
            NecessaryParameterIsNullException.class})
    public ResultModel requestError(RequestException e) {
        return new ResultModel(ResponseCode.CLIENT_ERROR, e.getErrorMsg());
    }

    /**
     * resource is null
     * <p>
     * code :404
     */
    @ResponseBody
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResultModel resourceNotFoundError(ResourceNotFoundException e) {
        return new ResultModel(ResponseCode.CLIENT_ERROR, e.getErrorMsg());
    }

    /**
     * 增加、修改、删除失败 conflict
     * <p>
     * code:409
     */
    @ResponseBody
    @ExceptionHandler(ResourceExecuteException.class)
    public ResultModel resourceExecuteError(ResourceExecuteException e) {
        return new ResultModel(ResponseCode.SERVER_ERROR, e.getErrorMsg());
    }

}
