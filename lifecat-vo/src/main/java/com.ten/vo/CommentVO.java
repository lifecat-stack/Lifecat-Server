package com.ten.vo;

/**
 * record comment
 *
 * @author Administrator
 */
public class CommentVO {

    private Integer commentId;
    private Integer commentCustomerId;
    private String commentContent;
    private String commentGmtCreate;
    private String commentGmtModified;

    @Override
    public String toString() {
        return "VO:comment@{" +
                "commenid:" + commentId +
                ",commencustomeid:" + commentCustomerId +
                ",commencontent:" + commentContent +
                ",commengmcreate:" + commentGmtCreate +
                ",commengmmodified:" + commentGmtModified +
                "}";
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
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
