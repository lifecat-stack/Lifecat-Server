package com.ten;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ten.mapper")
public class LcWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(LcWebApplication.class, args);
    }
}
