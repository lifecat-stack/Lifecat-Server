package com.ten.service.serviceimpl.authorization.data;

import com.ten.entity.*;
import com.ten.mapper.*;
import com.ten.vo.constant.PERMISSION;
import com.ten.vo.constant.ROLE;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * user account data
 * user role data
 * user permission data
 * <p>
 * TODO redis
 *
 * @author Administrator
 */
public class UserAuthorizationData {
    /**
     * user account map:
     * key :user_account_name
     * val :user_account_password
     */
    private Map<String, String> userAccountMap;
    /**
     * user role map:
     * key :user_account_name
     * val :ROLE{SUPER,ADMIN,VVIP,VIP,USER,TOURIST}
     */
    private Map<String, Set<String>> userRolesMap;
    /**
     * user permission map:
     * key :user_account_name
     * val :PERMISSION[]{CREATE,DELETE,UPDATE,QUERY}
     */
    private Map<String, Set<String>> userPermissionsMap;
    /**
     * 与c_role表对应
     * <p>
     * the array of ROLE :
     * <p>
     * ROLE.SUPER
     * ROLE.ADMIN
     * ROLE.VVIP
     * ROLE.VIP
     * ROLE.USER
     * ROLE.TOURIST
     */
    private static final ROLE[] ROLES = {
            null,
            ROLE.SUPER,
            ROLE.ADMIN,
            ROLE.VVIP,
            ROLE.VIP,
            ROLE.USER,
            ROLE.TOURIST
    };
    /**
     * 与c_permission表对应
     * <p>
     * the array of PERMISSION :
     * <p>
     * PERMISSION.CREATE
     * PERMISSION.QUERY
     * PERMISSION.UPDATE
     * PERMISSION.DELETE
     */
    private static final PERMISSION[] PERMISSIONS = {
            null,
            PERMISSION.CREATE,
            PERMISSION.QUERY,
            PERMISSION.UPDATE,
            PERMISSION.DELETE
    };

    private static volatile UserAuthorizationData INSTANCE = null;

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private RolePermissionMapper rolePermissionMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    private UserAuthorizationData() {
        INSTANCE.userAccountMap = new HashMap<>(32);
        INSTANCE.userRolesMap = new HashMap<>(32);
        INSTANCE.userPermissionsMap = new HashMap<>(32);
        INSTANCE.initData();
    }

    /**
     * INSTANCE
     */
    public static UserAuthorizationData getInstance() {
        if (INSTANCE == null) {
            synchronized (UserAuthorizationData.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UserAuthorizationData();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * init data from database
     */
    private void initData() {
        // 1.获取所有user信息
        List<UserDO> users = userMapper.selectAll();
        // 2.获取所有user-account信息 => userAccountMap
        for (UserDO user : users) {
            setUserAccountMap(user);
            setUserRoleMap(user);
            setUserPermissionsMap(user);
        }
    }

    /**
     * set user account map
     *
     * @param user one user
     */
    private void setUserAccountMap(UserDO user) {
        userAccountMap.put(user.getUserAccountName(), user.getUserAccountPassword());
    }

    /**
     * set user role map
     *
     * @param user one user
     */
    private void setUserRoleMap(UserDO user) {
        // 根据user_id获取对应role_id集合
        UserRoleDO userRole = new UserRoleDO();
        userRole.setUserId(user.getUserId());
        List<UserRoleDO> userRoleDOS = userRoleMapper.select(userRole);
        // 根据role_id获取ROLE集合
        Set<String> roles = new HashSet<>(4);
        for (UserRoleDO userRoleDO : userRoleDOS) {
            int roleId = userRoleDO.getRoleId();
            roles.add(PERMISSIONS[roleId].toString());
        }
        // update
        userRolesMap.put(user.getUserAccountName(), roles);
    }

    /**
     * set user permission-set map
     *
     * @param user one user
     */
    private void setUserPermissionsMap(UserDO user) {
        // 根据user_id获取对应role_id集合
        UserRoleDO userRole = new UserRoleDO();
        userRole.setUserId(user.getUserId());
        List<UserRoleDO> userRoleDOS = userRoleMapper.select(userRole);

        Set<String> permissions = new HashSet<>(8);
        for (UserRoleDO userRoleDO : userRoleDOS) {
            int roleId = userRoleDO.getRoleId();

            // 根据role_id获取对应permission_id集合
            RolePermissionDO rolePermissionDO = new RolePermissionDO();
            rolePermissionDO.setRoleId(roleId);
            List<RolePermissionDO> rolePermissionDOS = rolePermissionMapper.select(rolePermissionDO);

            // 根据permission_id获取PERMISSION集合
            for (RolePermissionDO rolePermissionDO1 : rolePermissionDOS) {
                int permissionId = rolePermissionDO1.getPermissionId();
                permissions.add(PERMISSIONS[permissionId].toString());
            }
        }
        // update
        userPermissionsMap.put(user.getUserAccountName(), permissions);
    }

    /**
     * 获取password
     *
     * @param userName username
     * @return password
     */
    public String getPasswordByUserName(String userName) {
        return userAccountMap.get(userName);
    }

    /**
     * 获取role
     *
     * @param userName username
     * @return user role
     */
    public Set<String> getRolesByUserName(String userName) {
        return userRolesMap.get(userName);
    }

    /**
     * 获取permissions
     *
     * @param userName username
     * @return user permission set
     */
    public Set<String> getPermissionsByUserName(String userName) {
        return userPermissionsMap.get(userName);
    }
}
