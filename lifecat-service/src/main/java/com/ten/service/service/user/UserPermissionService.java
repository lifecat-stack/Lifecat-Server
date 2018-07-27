package com.ten.service.service.user;

import com.ten.entity.UserPermissionDO;
import com.ten.service.service.BaseService;
import com.ten.vo.UserPermissionVO;

/**
 * list   :获取所有用户permission信息集合
 * get    :获取某位用户的permission信息
 * post   :注册用户permission信息
 * put    :更新用户permission信息
 * delete :删除用户permission信息
 *
 * @author Administrator
 */
public interface UserPermissionService extends BaseService<UserPermissionVO, UserPermissionDO> {
}
