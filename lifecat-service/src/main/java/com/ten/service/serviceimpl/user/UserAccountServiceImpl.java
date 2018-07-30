package com.ten.service.serviceimpl.user;

import com.ten.entity.AlbumDO;
import com.ten.entity.UserDO;
import com.ten.mapper.UserMapper;
import com.ten.service.service.image.AlbumService;
import com.ten.service.service.user.UserAccountService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.AlbumVO;
import com.ten.vo.UserAccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl extends BaseServiceImpl<UserAccountVO, UserDO> implements UserAccountService {

    /**
     * get user account list
     *
     * @param
     */
    @Override
    public List<UserAccountVO> list(UserAccountVO entity) {
        UserDO userDO = new UserDO();
        super.exeQueryList(entity);
    }

    @Override
    public UserAccountVO get(UserAccountVO entity) {
        return null;
    }

    @Override
    public int post(UserAccountVO entity) {
        return 0;
    }

    @Override
    public int put(UserAccountVO entity) {
        return 0;
    }

    @Override
    public int delete(UserAccountVO entity) {
        return 0;
    }
}
