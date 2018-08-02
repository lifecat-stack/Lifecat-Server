package com.ten.service.serviceimpl.user;

import com.ten.entity.UserDO;
import com.ten.service.service.user.UserAccountService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.UserAccountVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * user account
 *
 * @author Administrator
 * @table c_user
 */
@Service
public class UserAccountServiceImpl extends BaseServiceImpl<UserAccountVO, UserDO> implements UserAccountService {

    /**
     * select all user accout
     */
    @Override
    public List<UserAccountVO> all() {
        List<UserDO> userList = exeQueryAll();
        List<UserAccountVO> userAccounts = new ArrayList<>(32);
        for (UserDO user : userList) {
            UserAccountVO userAccountVO = new UserAccountVO(user);
            userAccounts.add(userAccountVO);
        }
        return userAccounts;
    }

    /**
     * select all user accont :
     * where is_user_deleted = 0
     */
    @Override
    public List<UserAccountVO> list(UserAccountVO entity) {
        UserDO userDO = new UserDO();
        userDO.setIsUserDeleted(0);
        List<UserDO> userList = exeQueryList(userDO);
        List<UserAccountVO> userAccounts = new ArrayList<>(32);
        for (UserDO user : userList) {
            UserAccountVO userAccountVO = new UserAccountVO(user);
            userAccounts.add(userAccountVO);
        }
        return userAccounts;
    }

    /**
     * get user account :
     * by user_id
     */
    @Override
    public UserAccountVO get(UserAccountVO entity) {
        UserDO userDO = new UserDO(entity);
        return new UserAccountVO(exeQuery(userDO));
    }

    /**
     * 注册用户账号
     * <p>
     * create user account :
     * user_id :auto
     * user_name
     * user_password
     * is_user_deleted
     * user_gmt_create
     * user_gmt_modified
     */
    @Override
    public int create(UserAccountVO entity) {
        UserDO userDO = new UserDO(entity);
        userDO.setUserId(null);
        userDO.setIsUserDeleted(0);
        // set create and modified
        String currentTime = dateTimeUtil.getCurrentTime();
        userDO.setUserGmtCreate(currentTime);
        userDO.setUserGmtModified(currentTime);
        return exeInsert(userDO);
    }

    /**
     * update user account :
     * user_id
     * user_account_name
     * user_account_password
     */
    @Override
    public int update(UserAccountVO entity) {
        UserDO userDO = new UserDO(entity);
        // set modified
        String currentTime = dateTimeUtil.getCurrentTime();
        userDO.setUserGmtModified(currentTime);
        return exeUpdate(userDO);
    }

    /**
     * delete user account :
     * set is_user_deleted = 1
     */
    @Override
    public int delete(UserAccountVO entity) {
        UserDO userDO = new UserDO(entity);
        userDO.setIsUserDeleted(1);
        // set modified
        String currentTime = dateTimeUtil.getCurrentTime();
        userDO.setUserGmtModified(currentTime);
        return exeUpdate(userDO);
    }
}
