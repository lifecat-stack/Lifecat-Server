package com.ten.serviceimpl;

import com.ten.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService implements UserService {
    @Override
    public List<UserDO> readUserList() {
        return null;
    }

    @Override
    public UserDO readUserByName(String userName) {
        UserDO userDO = new UserDO();
        userDO.setUserName("return test");
        return userDO;
    }

    @Override
    public int createUser(UserDO userDO) {
        return 0;
    }

    @Override
    public int updateUser(UserDO userDO) {
        return 0;
    }

    @Override
    public int deleteUserById(int userId) {
        return 0;
    }
}
