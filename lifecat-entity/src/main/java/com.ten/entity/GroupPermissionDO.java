package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_group_permission
 *
 * @author Administrator
 */
@Table(name = "c_group_permission")
public class GroupPermissionDO {
    @Id
    private Integer gpId;
    private Integer groupId;
    private Integer permissionId;
    private String gpGmtCreate;
    private String gpGmtModified;

    @Override
    public String toString() {
        return "c_group_permission@{" +
                "gp_id:" + gpId +
                ",group_id:" + groupId +
                ",permisson_id:" + permissionId +
                ",gp_gmt_create:" + gpGmtCreate +
                ",gp_gmt_modified:" + gpGmtModified +
                "}";
    }

    public Integer getGpId() {
        return gpId;
    }

    public void setGpId(Integer gpId) {
        this.gpId = gpId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getGpGmtCreate() {
        return gpGmtCreate;
    }

    public void setGpGmtCreate(String gpGmtCreate) {
        this.gpGmtCreate = gpGmtCreate;
    }

    public String getGpGmtModified() {
        return gpGmtModified;
    }

    public void setGpGmtModified(String gpGmtModified) {
        this.gpGmtModified = gpGmtModified;
    }
}
