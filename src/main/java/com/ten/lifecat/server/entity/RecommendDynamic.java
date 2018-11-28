package com.ten.lifecat.server.entity;

/**
 * 推荐动态表
 */
public class RecommendDynamic {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 推荐ID
     */
    private String recommendId;
    /**
     * 动态ID
     */
    private String dynamicId;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    @Override
    public String toString() {
        return "RecommendDynamic{" +
                "id=" + id +
                ", recommendId='" + recommendId + '\'' +
                ", dynamicId='" + dynamicId + '\'' +
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

    public String getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(String recommendId) {
        this.recommendId = recommendId;
    }

    public String getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
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
