package com.ten.lifecat.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.ten.lifecat.server.mapper")
public class LifecatServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifecatServerApplication.class, args);
    }
}
