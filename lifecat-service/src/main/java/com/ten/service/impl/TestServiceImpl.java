package com.ten.service.impl;

import com.ten.mapper.UserMapper;
import com.ten.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private  UserMapper userMapper;

    @Override
    public String test(String arg) {
        String result = userMapper.getTest("testMapper");
        return "test service recive:" +arg + ",mybatis result is:"+result;
    }
}
