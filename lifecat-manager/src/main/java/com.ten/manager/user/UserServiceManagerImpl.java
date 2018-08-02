package com.ten.manager.user;

import com.ten.service.service.user.UserAccountService;
import com.ten.service.service.user.UserPropertyService;
import com.ten.vo.UserAccountVO;
import com.ten.vo.UserPropertyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceManagerImpl implements UserServiceManager {

    private final UserAccountService accountService;
    private final UserPropertyService propertyService;

    @Autowired
    public UserServiceManagerImpl(UserAccountService userAccountService, UserPropertyService userPropertyService) {
        this.accountService = userAccountService;
        this.propertyService = userPropertyService;
    }

    @Override
    public List<UserAccountVO> getAllUserAccount() {
        return accountService.all();
    }

    @Override
    public UserAccountVO getUserAccountByEntity(UserAccountVO entity) {
        return accountService.get(entity);
    }

    @Override
    public UserAccountVO createUserAccountAndReturn(UserAccountVO entity) {
        int result = accountService.create(entity);
        entity = accountService.get(entity);
        if (result > 0) {
            return entity;
        }
        return null;
    }

    @Override
    public int deleteUserByPrimaryKey(Integer userId) {
        UserAccountVO userAccountVO = new UserAccountVO();
        userAccountVO.setUserId(userId);
        return accountService.delete(userAccountVO);
    }

    @Override
    public UserAccountVO updateUserPasswordAndReturn(UserAccountVO entity) {
        int result = accountService.update(entity);
        if (result > 0) {
            return entity;
        }
        return null;
    }

    @Override
    public List<UserPropertyVO> getAllUserProperty() {
        return propertyService.all();
    }

    @Override
    public UserPropertyVO getUserPropertyByEntity(UserPropertyVO entity) {
        return propertyService.get(entity);
    }

    @Override
    public UserPropertyVO createUserPropertyAndReturn(UserPropertyVO entity) {
        int result = propertyService.create(entity);
        if (result > 0) {
            return entity;
        }
        return null;
    }

    @Override
    public UserPropertyVO updateUserPropertyAndReturn(UserPropertyVO entity) {
        int result = propertyService.update(entity);
        if (result > 0) {
            return entity;
        }
        return null;
    }

    @Override
    public int deleteUserPropertyByPrimaryKey(Integer userId) {
        UserPropertyVO userPropertyVO = new UserPropertyVO();
        userPropertyVO.setUserId(userId);
        return propertyService.delete(userPropertyVO);
    }

    @Override
    public UserPropertyVO getUserPropertyByUserId(Integer userId) {
        UserPropertyVO userPropertyVO = new UserPropertyVO();
        userPropertyVO.setUserId(userId);
        return propertyService.get(userPropertyVO);
    }
}
