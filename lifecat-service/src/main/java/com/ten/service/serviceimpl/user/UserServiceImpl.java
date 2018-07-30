package com.ten.service.serviceimpl.user;

import com.ten.entity.UserDO;
import com.ten.service.service.user.UserService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserVO, UserDO> implements UserService {

    @Override
    public List<UserVO> list(UserVO entity) {
        return null;
    }

    @Override
    public UserVO get(UserVO entity) {
        return null;
    }

    @Override
    public int post(UserVO entity) {
        return 0;
    }

    @Override
    public int put(UserVO entity) {
        return 0;
    }

    @Override
    public int delete(UserVO entity) {
        return 0;
    }
}
