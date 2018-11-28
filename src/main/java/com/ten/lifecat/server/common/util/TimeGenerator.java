package com.ten.lifecat.server.common.util;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class TimeGenerator {

    public String currentTime() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return String.valueOf(timestamp);
    }
}
