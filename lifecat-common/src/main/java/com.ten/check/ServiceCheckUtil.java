package com.ten.check;

import com.ten.exception.impl.NecessaryParameterIsNullException;
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
