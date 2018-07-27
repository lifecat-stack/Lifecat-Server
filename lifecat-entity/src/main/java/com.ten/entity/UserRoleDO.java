package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_user_role
 *
 * @author Administrator
 */
@Table(name = "c_user_role")
public class UserRoleDO {
    @Id
    private Integer urId;
    private Integer userId;
    private Integer roleId;
    private String urGmtCreate;
    private String urGmtModified;

    @Override
    public String toString() {
        return "c_user_role@{" +
                "ur_id:" + urId +
                ",user_id:" + userId +
                ",role_id:" + roleId +
                ",ur_gmt_create:" + urGmtCreate +
                ",ur_gmt_modified:" + urGmtModified +
                "}";
    }

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUrGmtCreate() {
        return urGmtCreate;
    }

    public void setUrGmtCreate(String urGmtCreate) {
        this.urGmtCreate = urGmtCreate;
    }

    public String getUrGmtModified() {
        return urGmtModified;
    }

    public void setUrGmtModified(String urGmtModified) {
        this.urGmtModified = urGmtModified;
    }
}
