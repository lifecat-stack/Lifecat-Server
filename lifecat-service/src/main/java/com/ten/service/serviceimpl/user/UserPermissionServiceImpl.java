package com.ten.service.serviceimpl.user;

import com.ten.entity.UserPermissionDO;
import com.ten.service.service.user.UserPermissionService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPermissionServiceImpl extends BaseServiceImpl<UserAuthorizationVO, UserPermissionDO> implements UserPermissionService {

    @Override
    public List<UserAuthorizationVO> list(UserAuthorizationVO entity) {
        return null;
    }

    @Override
    public UserAuthorizationVO get(UserAuthorizationVO entity) {
        return null;
    }

    @Override
    public int post(UserAuthorizationVO entity) {
        return 0;
    }

    @Override
    public int put(UserAuthorizationVO entity) {
        return 0;
    }

    @Override
    public int delete(UserAuthorizationVO entity) {
        return 0;
    }
}
