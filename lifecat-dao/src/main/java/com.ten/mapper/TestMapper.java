package com.ten.mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository(value = "testMapper")
public interface TestMapper {
    String getTest(String test);
}
