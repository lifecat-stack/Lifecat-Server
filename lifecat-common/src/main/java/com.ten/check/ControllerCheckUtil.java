package com.ten.check;

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
     * request data is Null
     *
     * @param objs request parameters
     * @throws RequestDataNullException request data is null
     */
    public static void checkRequestDataNotNull(Object... objs) {
        for (Object obj : objs) {
            if (obj == null) {
                throw new RequestDataNullException();
            }
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
     * 检查日期格式
     *
     * @param datetime 日期对象
     */
    public static void checkDateTime(String datetime) {
        // TODO
    }

    /**
     * 检查手机号码格式
     *
     * @param phone 号码对象
     */
    public static void checkPhone(String phone) {
        // TODO
    }

    /**
     * 检查URL格式
     *
     * @param url 号码对象
     */
    public static void checkUrl(String url) {
        // TODO
    }

    /**
     * 检查邮箱格式
     *
     * @param email 号码对象
     */
    public static void checkEmail(String email) {
        // TODO
    }
}
