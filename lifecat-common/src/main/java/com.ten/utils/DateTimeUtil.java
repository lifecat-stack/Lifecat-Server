package com.ten.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * get current date-time
 * <p>
 *
 * @author Administrator
 * @model INSTANCE
 */
@Component
public class DateTimeUtil {

    private static volatile DateTimeUtil INSTANCE = null;

    private DateTimeUtil() {
        System.out.println("DateTimeUtil INSTANCE load time:" + this);
    }

    public static DateTimeUtil getInstance() {
        if (INSTANCE == null) {
            synchronized (DateTimeUtil.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DateTimeUtil();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * get current time
     *
     * @return String yyyy-MM-dd HH:mm:ss
     */
    public String getCurrentTime() {
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(dt);
    }

    @Override
    public String toString() {
        return this.getCurrentTime();
    }
}
