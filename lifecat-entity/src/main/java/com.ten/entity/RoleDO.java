package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_role
 *
 * @author Administrator
 */
@Table(name = "c_role")
public class RoleDO {
    @Id
    private Integer roleId;
    private Integer roleParentId;
    private String roleName;
    private String roleDesc;
    private Integer deleted;
    private String roleGmtCreate;
    private String roleGmtModified;

    @Override
    public String toString() {
        return "c_role@{" +
                "role_id:" + roleId +
                ",role_parent_id:" + roleParentId +
                ",role_name:" + roleName +
                ",role_desc:" + roleDesc +
                ",is_role_deleted:" + deleted +
                ",role_gmt_create:" + roleGmtCreate +
                ",role_gmt_modified:" + roleGmtModified +
                "}";
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleParentId() {
        return roleParentId;
    }

    public void setRoleParentId(Integer roleParentId) {
        this.roleParentId = roleParentId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getRoleGmtCreate() {
        return roleGmtCreate;
    }

    public void setRoleGmtCreate(String roleGmtCreate) {
        this.roleGmtCreate = roleGmtCreate;
    }

    public String getRoleGmtModified() {
        return roleGmtModified;
    }

    public void setRoleGmtModified(String roleGmtModified) {
        this.roleGmtModified = roleGmtModified;
    }
}
