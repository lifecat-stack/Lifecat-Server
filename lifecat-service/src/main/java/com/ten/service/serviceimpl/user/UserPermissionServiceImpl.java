package com.ten.service.serviceimpl.user;

import com.ten.entity.AlbumDO;
import com.ten.entity.UserDO;
import com.ten.entity.UserPermissionDO;
import com.ten.service.service.image.AlbumService;
import com.ten.service.service.user.UserPermissionService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.AlbumVO;
import com.ten.vo.UserPermissionVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPermissionServiceImpl extends BaseServiceImpl<UserPermissionVO, UserPermissionDO> implements UserPermissionService {

    @Override
    public List<UserPermissionVO> list(UserPermissionDO entity) {
        return null;
    }

    @Override
    public UserPermissionVO get(UserPermissionDO entity) {
        return null;
    }

    @Override
    public int post(UserPermissionDO entity) {
        return 0;
    }

    @Override
    public int put(UserPermissionDO entity) {
        return 0;
    }

    @Override
    public int delete(UserPermissionDO entity) {
        return 0;
    }
}
