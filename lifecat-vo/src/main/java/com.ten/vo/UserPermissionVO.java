package com.ten.vo;

import com.ten.vo.utils.Permission;
import com.ten.vo.utils.Role;

import java.util.List;

/**
 * user permission
 *
 * @author Administrator
 */
public class UserPermissionVO {

    private Integer userId;
    private Role userRole;
    private List<Permission> permissionList;

    @Override
    public String toString() {
        return "cuserpermission@{" +
                "userid:" + userId +
                ",permissionid:" + permissionList +
                "}";
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
}
