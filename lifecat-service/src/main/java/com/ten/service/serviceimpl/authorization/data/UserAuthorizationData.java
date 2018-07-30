package com.ten.service.serviceimpl.authorization.data;

import com.ten.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * user account data
 * user role data
 * user permission data
 *
 * @author Administrator
 */
public class UserAuthorizationData {

    private Map<String, String> userAccountMap;
    private Map<String, String[]> userRolesMap;
    private Map<String, String[]> userPermissionsMap;
    private static volatile UserAuthorizationData INSTANCE = null;

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserPermissionMapper userPermissionMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private RoleMapper roleMapper;

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
        userMapper.
    }

    /**
     * 获取password
     *
     * @param userName username
     * @return password
     */
    public String getPasswordByUserName(String userName) {
        return INSTANCE.userAccountMap.get(userName);
    }

    /**
     * 获取roles
     *
     * @param userName username
     * @return user role set
     */
    public Set<String> getRolesByUserName(String userName) {
        Set<String> userRolesSet = new HashSet<>(4);
        String[] roles = INSTANCE.userRolesMap.get(userName);
        userRolesSet.addAll(Arrays.asList(roles));
        return userRolesSet;
    }

    /**
     * 获取permissions
     *
     * @param userName username
     * @return user permission set
     */
    public Set<String> getPermissionsByUserName(String userName) {
        Set<String> userPermissionsSet = new HashSet<>(8);
        String[] permissions = INSTANCE.userPermissionsMap.get(userName);
        userPermissionsSet.addAll(Arrays.asList(permissions));
        return userPermissionsSet;
    }
}
