package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_role_permission
 *
 * @author Administrator
 */
@Table(name = "c_role_permission")
public class RolePermissionDO {
    @Id
    private Integer rpId;
    private Integer roleId;
    private Integer permissionId;
    private String rpGmtCreate;
    private String rpGmtModified;

    @Override
    public String toString() {
        return "c_role_permission@{" +
                "rp_id:" + rpId +
                ",role_id:" + roleId +
                ",permission_id:" + permissionId +
                ",rp_gmt_create:" + rpGmtCreate +
                ",rp_gmt_modified:" + rpGmtModified +
                "}";
    }

    public Integer getRpId() {
        return rpId;
    }

    public void setRpId(Integer rpId) {
        this.rpId = rpId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getRpGmtCreate() {
        return rpGmtCreate;
    }

    public void setRpGmtCreate(String rpGmtCreate) {
        this.rpGmtCreate = rpGmtCreate;
    }

    public String getRpGmtModified() {
        return rpGmtModified;
    }

    public void setRpGmtModified(String rpGmtModified) {
        this.rpGmtModified = rpGmtModified;
    }
}
