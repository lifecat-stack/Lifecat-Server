package com.kevinten.wechat.utils;

import com.kevinten.wechat.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Connection {

    @Autowired
    private UserMapper userMapper;

    public void tryConn(){
        userMapper.queryUserList();
    }


}
