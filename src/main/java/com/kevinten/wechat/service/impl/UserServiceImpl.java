package com.kevinten.wechat.service.impl;

import com.kevinten.wechat.dto.Code;
import com.kevinten.wechat.dto.Result;
import com.kevinten.wechat.dto.UserDTO;
import com.kevinten.wechat.entity.UserDO;
import com.kevinten.wechat.mapper.UserMapper;
import com.kevinten.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public Result<List<UserDTO>> getUserList() {
        // user table
        List<UserDO> users = userMapper.queryUserList();

        // user 模块数据
        List<UserDTO> userList = new ArrayList<UserDTO>(16);

        // create userDTO
        for (int i = 0; i < 1; i++) {
            UserDO user = users.get(i);

            UserDTO userDTO = new UserDTO();
            userDTO.setUserDO(user);

            userList.add(userDTO);
        }

        Result<List<UserDTO>> result = new Result<List<UserDTO>>();
        result.setSuccess(true);
        result.setCode(Code.SUCCESS_200);
        result.setJsonData(userList);

        return result;
    }
}
