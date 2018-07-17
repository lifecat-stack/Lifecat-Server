package com.kevinten.wechat.mapper;

import com.kevinten.wechat.entity.UserDO;

import java.util.List;

public interface UserMapper {
    List<UserDO> queryUserList();
}
