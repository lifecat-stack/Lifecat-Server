package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_permission
 *
 * @author Administrator
 */
@Table(name = "c_permission")
public class PermissionDO {
    @Id
    private Integer permissionId;
    private Integer permissionParentId;
    private String permissionName;
    private String permissionDesc;
    private String permissionGmtCreate;
    private String permissionGmtModified;

    @Override
    public String toString() {
        return "c_permission@{" +
                "permission_id:" + permissionId +
                ",permission_parent_id:" + permissionParentId +
                ",permission_name:" + permissionName +
                ",permission_desc:" + permissionDesc +
                ",permission_gmt_create:" + permissionGmtCreate +
                ",permission_gmt_modified:" + permissionGmtModified +
                "}";
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getPermissionParentId() {
        return permissionParentId;
    }

    public void setPermissionParentId(Integer permissionParentId) {
        this.permissionParentId = permissionParentId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionDesc() {
        return permissionDesc;
    }

    public void setPermissionDesc(String permissionDesc) {
        this.permissionDesc = permissionDesc;
    }

    public String getPermissionGmtCreate() {
        return permissionGmtCreate;
    }

    public void setPermissionGmtCreate(String permissionGmtCreate) {
        this.permissionGmtCreate = permissionGmtCreate;
    }

    public String getPermissionGmtModified() {
        return permissionGmtModified;
    }

    public void setPermissionGmtModified(String permissionGmtModified) {
        this.permissionGmtModified = permissionGmtModified;
    }
}
