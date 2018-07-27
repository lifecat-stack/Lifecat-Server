package com.ten.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_group
 *
 * @author Administrator
 */
@Table(name = "c_group")
public class GroupDO {
    @Id
    private Integer groupId;
    private Integer groupParentId;
    private String groupName;
    private String groupDesc;
    private String groupGmtCreate;
    private String groupGmtModified;

    @Override
    public String toString() {
        return "c_group@{" +
                "group_id:" + groupId +
                ",group_parent_id:" + groupParentId +
                ",group_name:" + groupName +
                ",group_desc:" + groupDesc +
                ",group_gmt_create:" + groupGmtCreate +
                ",group_gmt_modified:" + groupGmtModified +
                "}";
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getGroupParentId() {
        return groupParentId;
    }

    public void setGroupParentId(Integer groupParentId) {
        this.groupParentId = groupParentId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getGroupGmtCreate() {
        return groupGmtCreate;
    }

    public void setGroupGmtCreate(String groupGmtCreate) {
        this.groupGmtCreate = groupGmtCreate;
    }

    public String getGroupGmtModified() {
        return groupGmtModified;
    }

    public void setGroupGmtModified(String groupGmtModified) {
        this.groupGmtModified = groupGmtModified;
    }
}
