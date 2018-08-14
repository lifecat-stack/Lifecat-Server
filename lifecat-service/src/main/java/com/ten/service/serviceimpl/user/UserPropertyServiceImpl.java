package com.ten.service.serviceimpl.user;

import com.ten.entity.UserDO;
import com.ten.service.service.user.UserPropertyService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.UserPropertyVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * user property
 *
 * @author Administrator
 * @table c_user
 */
@Service
public class UserPropertyServiceImpl extends BaseServiceImpl<UserPropertyVO, UserDO> implements UserPropertyService {

    /**
     * selete all user property :
     */
    @Override
    public List<UserPropertyVO> all() {
        List<UserDO> userDOS = exeQueryAll();
        List<UserPropertyVO> userPropertyVOS = new ArrayList<>(32);
        for (UserDO userDO : userDOS) {
            UserPropertyVO userPropertyVO = new UserPropertyVO(userDO);
            userPropertyVOS.add(userPropertyVO);
        }
        return userPropertyVOS;
    }

    /**
     * selete user property :
     * where columns = values
     */
    @Override
    public List<UserPropertyVO> list(UserPropertyVO entity) {
        UserDO user = new UserDO(entity);
        List<UserDO> userDOS = exeQueryList(user);
        List<UserPropertyVO> userPropertyVOS = new ArrayList<>(32);
        for (UserDO userDO : userDOS) {
            UserPropertyVO userPropertyVO = new UserPropertyVO(userDO);
            userPropertyVOS.add(userPropertyVO);
        }
        return userPropertyVOS;

    }

    /**
     * selete user property :
     * by user_id
     */
    @Override
    public UserPropertyVO get(UserPropertyVO entity) {
        UserDO userDO = new UserDO();
        userDO.setUserId(entity.getUserId());
        UserDO user = exeQuery(userDO);
        if (user == null) {
            return new UserPropertyVO();
        }
        return new UserPropertyVO(user);
    }

    /**
     * create user property:
     * update properties to user
     * by user_id
     * set modified
     */
    @Override
    public int create(UserPropertyVO entity) {
        UserDO userDO = new UserDO(entity);
        // set modified time
        String currentTime = dateTimeUtil.getCurrentTime();
        userDO.setUserGmtModified(currentTime);
        userDO.setUserLastLogin(currentTime);
        // set properties
        userDO.setUserAccountName(null);
        userDO.setUserGmtCreate(null);
        userDO.setUserLoginCount(null);
        return exeUpdate(userDO);
    }

    /**
     * update user property :
     * by user_id
     * set modified
     */
    @Override
    public int update(UserPropertyVO entity) {
        UserDO userDO = new UserDO(entity);
        // set modified time
        String currentTime = dateTimeUtil.getCurrentTime();
        userDO.setUserGmtModified(currentTime);
        return exeUpdate(userDO);
    }

    /**
     * delete user property :
     * set is_user_deleted = 1
     * by user_id
     * set modified
     */
    @Override
    public int delete(UserPropertyVO entity) {
        UserDO userDO = new UserDO();
        userDO.setUserId(entity.getUserId());
        userDO.setIsUserDeleted(1);
        // set modified time
        String currentTime = dateTimeUtil.getCurrentTime();
        userDO.setUserGmtModified(currentTime);
        return exeUpdate(userDO);
    }
}
