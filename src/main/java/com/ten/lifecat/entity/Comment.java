package com.ten.lifecat.entity;

/**
 * 评论信息
 */
public class Comment {
    /**
     * 主键ID Auto
     */
    private Integer id;
    /**
     * 评论ID Unique
     */
    private String commentId;
    /**
     * 评论所属动态ID
     */
    private String dynamicId;
    /**
     * 评论主体用户ID
     */
    private String commentHostId;
    /**
     * 评论客体用户ID
     */
    private String commentUserId;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentId='" + commentId + '\'' +
                ", dynamicId='" + dynamicId + '\'' +
                ", commentHostId='" + commentHostId + '\'' +
                ", commentUserId='" + commentUserId + '\'' +
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

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
    }

    public String getCommentHostId() {
        return commentHostId;
    }

    public void setCommentHostId(String commentHostId) {
        this.commentHostId = commentHostId;
    }

    public String getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(String commentUserId) {
        this.commentUserId = commentUserId;
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
