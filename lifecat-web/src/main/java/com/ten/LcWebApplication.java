package com.ten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"com.ten.mapper","com.ten.controller","com.ten.service"})
public class LcWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(LcWebApplication.class, args);
    }
}
