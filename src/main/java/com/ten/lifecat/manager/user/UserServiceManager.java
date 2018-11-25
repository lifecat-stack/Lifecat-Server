package com.ten.lifecat.manager.user;

import com.ten.lifecat.entity.entity.UserDO;
import com.ten.lifecat.entity.vo.UserAccountVO;
import com.ten.lifecat.entity.vo.UserPropertyVO;
import com.ten.lifecat.entity.vo.UserVO;

import java.util.List;

/**
 * User模块管理器
 *
 * @author Administrator
 */
public interface UserServiceManager {

    /* **********************************/
    /* *********** account **************/
    /* **********************************/

    List<UserAccountVO> getAllUserAccount();

    UserAccountVO getUserAccountByEntity(UserAccountVO entity);

    UserAccountVO createUserAccountAndReturn(UserAccountVO entity);

    int deleteUserByPrimaryKey(Integer userId);

    UserAccountVO updateUserPasswordAndReturn(UserAccountVO entity);

    /* **********************************/
    /* *********** property *************/
    /* **********************************/

    List<UserPropertyVO> getAllUserProperty();

    UserPropertyVO getUserPropertyByEntity(UserPropertyVO entity);

    UserPropertyVO createUserPropertyAndReturn(UserPropertyVO entity);

    UserPropertyVO updateUserPropertyAndReturn(UserPropertyVO entity);

    int deleteUserPropertyByPrimaryKey(Integer userId);

    UserPropertyVO getUserPropertyByUserId(Integer userId);
}
