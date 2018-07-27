package com.ten.service.serviceimpl.user;

import com.ten.entity.AlbumDO;
import com.ten.entity.UserDO;
import com.ten.service.service.image.AlbumService;
import com.ten.service.service.user.UserAccountService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.AlbumVO;
import com.ten.vo.UserAccountVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl extends BaseServiceImpl<UserAccountVO, UserDO> implements UserAccountService {
    @Override
    public List<UserAccountVO> list(UserDO entity) {
        return null;
    }

    @Override
    public UserAccountVO get(UserDO entity) {
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
