package com.ten.utils;

import com.ten.exception.impl.RequestDataFormatException;
import com.ten.exception.impl.RequestDataNullException;
import com.ten.exception.impl.ResourceExecuteException;
import com.ten.exception.impl.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * Check controller function and throwing exception to the ExceptionController
 *
 * @author Administrator
 */
@Component
public class ControllerCheckUtil {
    /**
     * request data is Null
     *
     * @param obj request parameter
     * @throws RequestDataNullException request data is null
     */
    public static void checkRequestDataNotNull(Object obj) {
        if (obj == null) {
            throw new RequestDataNullException();
        }
    }

    /**
     * request data's format is int
     *
     * @param string suchas id property
     * @throws RequestDataFormatException string data is not int
     */
    public static void checkRequestDataFormatInt(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new RequestDataFormatException("parameter format must be number");
        }
    }

    /**
     * check result : result = 0 is failure
     *
     * @param result SQL执行影响的行数
     */
    public static void checkExecuteResultSuccess(int result) {
        if (result < 1) {
            throw new ResourceExecuteException("execute is failure");
        }
    }

    /**
     * 检查资源
     *
     * @param resource 资源对象
     */
    public static void checkResourceNotNull(Object resource) {
        if (resource == null) {
            throw new ResourceNotFoundException();
        }
    }

    /**
     * 检查资源
     *
     * @param resource 资源对象
     * @param errorMsg 异常信息
     */
    public static void checkResourceNotNull(Object resource, String errorMsg) {
        if (resource == null) {
            throw new ResourceNotFoundException(errorMsg);
        }
    }

}
