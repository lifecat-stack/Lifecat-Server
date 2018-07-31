package com.ten.vo;

import com.ten.entity.LogDO;
import com.ten.entity.RecordCommentDO;

/**
 * record comment
 *
 * @author Administrator
 */
public class RecordCommentVO {

    private Integer commentId;
    private Integer commentRecordId;
    private Integer commentCustomerId;
    private String commentContent;
    private String commentGmtCreate;
    private String commentGmtModified;

    /**
     * constructor
     */
    public RecordCommentVO() {
    }

    public RecordCommentVO(RecordCommentDO recordCommentDO) {
        this.commentId = recordCommentDO.getCommentId();
        this.commentRecordId = recordCommentDO.getCommentRecordId();
        this.commentCustomerId = recordCommentDO.getCommentCustomerId();
        this.commentContent = recordCommentDO.getCommentContent();
        this.commentGmtCreate = recordCommentDO.getCommentGmtCreate();
        this.commentGmtModified = recordCommentDO.getCommentGmtModified();
    }

    @Override
    public String toString() {
        return "VO:comment@{" +
                "commenid:" + commentId +
                "commentRecordId:" + commentRecordId +
                ",commencustomeid:" + commentCustomerId +
                ",commencontent:" + commentContent +
                ",commengmcreate:" + commentGmtCreate +
                ",commengmmodified:" + commentGmtModified +
                "}";
    }

    public Integer getCommentRecordId() {
        return commentRecordId;
    }

    public void setCommentRecordId(Integer commentRecordId) {
        this.commentRecordId = commentRecordId;
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
