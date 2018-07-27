package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_user_permission
 *
 * @author Administrator
 */
@Table(name = "c_user_permission")
public class UserPermissionDO {
    @Id
    private Integer upId;
    private Integer userId;
    private Integer permissionId;
    private String upGmtCreate;
    private String upGmtModified;

    @Override
    public String toString() {
        return "c_user_permission@{" +
                "up_id:" + upId +
                ",user_id:" + userId +
                ",permission_id:" + permissionId +
                ",up_gmt_create:" + upGmtCreate +
                ",up_gmt_modified:" + upGmtModified +
                "}";
    }

    public Integer getUpId() {
        return upId;
    }

    public void setUpId(Integer upId) {
        this.upId = upId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getUpGmtCreate() {
        return upGmtCreate;
    }

    public void setUpGmtCreate(String upGmtCreate) {
        this.upGmtCreate = upGmtCreate;
    }

    public String getUpGmtModified() {
        return upGmtModified;
    }

    public void setUpGmtModified(String upGmtModified) {
        this.upGmtModified = upGmtModified;
    }
}
