package com.ten.lifecat.server.entity;

/**
 * 用户-分组关联表
 */
public class AUserGroup {
    /**
     * 主键ID Auto
     */
    private Integer id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 分组ID
     */
    private Integer groupId;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    public AUserGroup() {
    }

    @Override
    public String toString() {
        return "AUserGroup{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", groupId=" + groupId +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
