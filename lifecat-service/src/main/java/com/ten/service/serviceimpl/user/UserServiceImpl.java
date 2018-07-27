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
    public List<UserVO> list(UserDO entity) {
        return null;
    }

    @Override
    public UserVO get(UserDO entity) {
        return null;
    }

    @Override
    public int post(UserDO entity) {
        return 0;
    }

    @Override
    public int put(UserDO entity) {
        return 0;
    }

    @Override
    public int delete(UserDO entity) {
        return 0;
    }
}
