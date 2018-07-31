package com.ten.entity;

import com.ten.MyBuilder;
import com.ten.vo.RecordCommentVO;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_record_comment
 *
 * @author Administrator
 */
@Table(name = "c_record_comment")
public class RecordCommentDO {
    @Id
    private Integer commentId;
    private Integer commentRecordId;
    private Integer commentCustomerId;
    private String commentContent;
    private Integer deleted;
    private String commentGmtCreate;
    private String commentGmtModified;

    /**
     * constructor
     */
    public RecordCommentDO() {
    }

    public RecordCommentDO(RecordCommentVO recordCommentVO) {
        this.commentId = recordCommentVO.getCommentId();
        this.commentRecordId = recordCommentVO.getCommentRecordId();
        this.commentCustomerId = recordCommentVO.getCommentCustomerId();
        this.commentContent = recordCommentVO.getCommentContent();
        this.commentGmtCreate = recordCommentVO.getCommentGmtCreate();
        this.commentGmtModified = recordCommentVO.getCommentGmtModified();
    }

    private RecordCommentDO(Builder b) {
        this(b.recordCommentVO);
        commentRecordId = b.commentRecordId;
        deleted = b.deleted;
    }

    /**
     * builder
     */
    public static class Builder implements MyBuilder<RecordCommentDO> {
        private RecordCommentVO recordCommentVO = null;
        private Integer commentRecordId = null;
        private Integer deleted = null;

        public Builder recordCommentVO(RecordCommentVO recordCommentVO) {
            this.recordCommentVO = recordCommentVO;
            return this;
        }

        public Builder commentRecordId(Integer commentRecordId) {
            this.commentRecordId = commentRecordId;
            return this;
        }

        public Builder deleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }

        @Override
        public RecordCommentDO build() {
            return new RecordCommentDO(this);
        }
    }

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
