package com.ten.entity;

/**
 * c_record_comment
 *
 * @author Administrator
 */
public class RecordCommentDO {

    private Integer commentId;
    private Integer commentRecordId;
    private Integer commentCustomerId;
    private String commentContent;
    private Integer deleted;
    private String commentGmtCreate;
    private String commentGmtModified;

    @Override
    public String toString() {
        return "c_record_comment@{" +
                "comment_id:" + commentId +
                ",comment_record_id:" + commentRecordId +
                ",comment_customer_id:" + commentCustomerId +
                ",comment_content:" + commentContent +
                ",is_deleted:" + deleted +
                ",comment_gmt_create:" + commentGmtCreate +
                ",comment_gmt_modified:" + commentGmtModified +
                "}";
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentRecordId() {
        return commentRecordId;
    }

    public void setCommentRecordId(Integer commentRecordId) {
        this.commentRecordId = commentRecordId;
    }

    public Integer getCommentCustomerId() {
        return commentCustomerId;
    }

    public void setCommentCustomerId(Integer commentCustomerId) {
        this.commentCustomerId = commentCustomerId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCommentGmtCreate() {
        return commentGmtCreate;
    }

    public void setCommentGmtCreate(String commentGmtCreate) {
        this.commentGmtCreate = commentGmtCreate;
    }

    public String getCommentGmtModified() {
        return commentGmtModified;
    }

    public void setCommentGmtModified(String commentGmtModified) {
        this.commentGmtModified = commentGmtModified;
    }
}
