package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_user_group
 *
 * @author Administrator
 */
@Table(name = "c_user_group")
public class UserGroupDO {
    @Id
    private Integer ugId;
    private Integer userId;
    private Integer groupId;
    private String ugGmtCreate;
    private String ugGmtModified;

    @Override
    public String toString() {
        return "c_user_group@{" +
                "ug_id:" + ugId +
                ",user_id:" + userId +
                ",group_id:" + groupId +
                ",ug_gmt_create:" + ugGmtCreate +
                ",ug_gmt_modified:" + ugGmtModified +
                "}";
    }

    public Integer getUgId() {
        return ugId;
    }

    public void setUgId(Integer ugId) {
        this.ugId = ugId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getUgGmtCreate() {
        return ugGmtCreate;
    }

    public void setUgGmtCreate(String ugGmtCreate) {
        this.ugGmtCreate = ugGmtCreate;
    }

    public String getUgGmtModified() {
        return ugGmtModified;
    }

    public void setUgGmtModified(String ugGmtModified) {
        this.ugGmtModified = ugGmtModified;
    }
}
