package com.ten.utils;

import com.ten.exception.impl.RequestDataNullException;
import org.springframework.stereotype.Component;

/**
 * Check service paramaters and make them allowable
 *
 * @author Administrator
 */
@Component
public class ServiceCheckUtil {
    /**
     * 检查传入对象的参数 Not Null
     *
     * @param property parameter property
     */
    public static void checkObjectDataNotNull(Object property, Object defalutValue) {
        if (property == null) {
            property = defalutValue;
        }
    }

    /**
     * 检查传入对象的参数 Is Null
     *
     * @param property parameter property
     */
    public static void checkObjectDataIsNull(Object property) {
        if (property != null) {
            property = null;
        }
    }
}
