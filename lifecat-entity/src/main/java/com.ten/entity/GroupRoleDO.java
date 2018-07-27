package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_group_role
 *
 * @author Administrator
 */
@Table(name = "c_group_role")
public class GroupRoleDO {
    @Id
    private Integer grId;
    private Integer groupId;
    private Integer roleId;
    private String grGmtCreate;
    private String grGmtModified;

    @Override
    public String toString() {
        return "c_group_role@{" +
                "gr_id:" + grId +
                ",group_id:" + groupId +
                ",role_id:" + roleId +
                ",gr_gmt_create:" + grGmtCreate +
                ",gt_gmt_modified:" + grGmtModified +
                "}";
    }

    public Integer getGrId() {
        return grId;
    }

    public void setGrId(Integer grId) {
        this.grId = grId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getGrGmtCreate() {
        return grGmtCreate;
    }

    public void setGrGmtCreate(String grGmtCreate) {
        this.grGmtCreate = grGmtCreate;
    }

    public String getGrGmtModified() {
        return grGmtModified;
    }

    public void setGrGmtModified(String grGmtModified) {
        this.grGmtModified = grGmtModified;
    }
}
