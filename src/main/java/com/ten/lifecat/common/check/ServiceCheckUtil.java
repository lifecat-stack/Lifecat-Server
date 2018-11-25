package com.ten.lifecat.common.check;

import com.ten.lifecat.common.exception.impl.NecessaryParameterIsNullException;
import org.springframework.stereotype.Component;

/**
 * Check service paramaters and make them allowable
 *
 * @author Administrator
 */
@Component
public class ServiceCheckUtil {
    /**
     * check necessary parameter is not null
     *
     * @param property parameter property
     * @throws NecessaryParameterIsNullException necessary parameter is null
     */
    public static void checkNecessaryParameterNotNull(Object property) {
        if (property == null) {
            throw new NecessaryParameterIsNullException();
        }
    }
}
