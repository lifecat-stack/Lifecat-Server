package com.ten.service.serviceimpl.user;

import com.ten.entity.UserDO;
import com.ten.service.service.user.UserPropertyService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.UserPropertyVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPropertyServiceImpl extends BaseServiceImpl<UserPropertyVO, UserDO> implements UserPropertyService {

    @Override
    public List<UserPropertyVO> list(UserPropertyVO entity) {
        return null;
    }

    @Override
    public UserPropertyVO get(UserPropertyVO entity) {
        return null;
    }

    @Override
    public int post(UserPropertyVO entity) {
        return 0;
    }

    @Override
    public int put(UserPropertyVO entity) {
        return 0;
    }

    @Override
    public int delete(UserPropertyVO entity) {
        return 0;
    }
}
