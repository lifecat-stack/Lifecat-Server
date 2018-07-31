package com.ten.manager.user;

import com.ten.vo.UserAccountVO;
import com.ten.vo.UserPropertyVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceManagerImpl implements UserServiceManager {
    @Override
    public List<UserAccountVO> getAllUserAccount() {
        return null;
    }

    @Override
    public UserAccountVO getUserAccountByEntity(UserAccountVO entity) {
        return null;
    }

    @Override
    public UserAccountVO createUserAccount(UserAccountVO entity) {
        return null;
    }

    @Override
    public int deleteUserByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public UserAccountVO updateUserPassword(UserAccountVO entity) {
        return null;
    }

    @Override
    public List<UserPropertyVO> getAllUserProperty() {
        return null;
    }

    @Override
    public UserPropertyVO getUserPropertyByEntity(UserPropertyVO entity) {
        return null;
    }

    @Override
    public UserPropertyVO createUserProperty(UserPropertyVO entity) {
        return null;
    }

    @Override
    public UserPropertyVO updateUserProperty(UserPropertyVO entity) {
        return null;
    }

    @Override
    public int deleteUserPropertyByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public UserPropertyVO getUserPropertyByUserId(Integer userId) {
        return null;
    }
}
