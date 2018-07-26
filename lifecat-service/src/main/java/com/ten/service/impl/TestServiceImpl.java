package com.ten.service.impl;

import com.ten.mapper.UserMapper;
import com.ten.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {

    private final UserMapper userMapper;

    @Autowired
    public TestServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String test(String arg) {
        String result = userMapper.getTest("testMapper");
        return "test service recive:" +arg + ",mybatis result is:"+result;
    }
}
