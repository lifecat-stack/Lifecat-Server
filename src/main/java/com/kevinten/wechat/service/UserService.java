package com.kevinten.wechat.service;

import com.kevinten.wechat.dto.Result;
import com.kevinten.wechat.dto.UserDTO;

import java.util.List;

public interface UserService {
    public Result<List<UserDTO>> getUserList();
}
