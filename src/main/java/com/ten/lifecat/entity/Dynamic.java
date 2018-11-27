package com.ten.lifecat.entity;

/**
 * 用户动态信息
 */
public class Dynamic {
    /**
     * 主键ID Auto
     */
    private Integer id;
    /**
     * 动态ID
     */
    private String dynamicId;
    /**
     * 所属用户ID
     */
    private String userId;
    /**
     * 动态内容
     */
    private String dynamicContent;

    /**
     * 动态图片数目
     */
    private Integer imageCount;
    /**
     * 点赞数目
     */
    private Integer favoriteCount;
    /**
     * 评论数目
     */
    private Integer commentCount;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    public Dynamic() {
    }

    @Override
    public String toString() {
        return "Dynamic{" +
                "id=" + id +
                ", dynamicId='" + dynamicId + '\'' +
                ", userId='" + userId + '\'' +
                ", dynamicContent='" + dynamicContent + '\'' +
                ", imageCount=" + imageCount +
                ", favoriteCount=" + favoriteCount +
                ", commentCount=" + commentCount +
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

    public String getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDynamicContent() {
        return dynamicContent;
    }

    public void setDynamicContent(String dynamicContent) {
        this.dynamicContent = dynamicContent;
    }

    public Integer getImageCount() {
        return imageCount;
    }

    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
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
