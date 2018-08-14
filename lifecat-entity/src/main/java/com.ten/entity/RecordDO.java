package com.ten.entity;

import com.ten.MyBuilder;
import com.ten.vo.RecordVO;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_record
 *
 * @author Administrator
 */
@Table(name = "c_record")
public class RecordDO {
    @Id
    private Integer recordId;
    private Integer userId;
    private Integer postId;
    private Integer isDeleted;
    private String recordGmtCreate;
    private String recordGmtModified;

    /**
     * constructor
     */
    public RecordDO() {
    }

    public RecordDO(RecordVO recordVO) {
        this.recordId = recordVO.getRecordId();
        this.userId = recordVO.getUserId();
        this.postId = recordVO.getPostId();
        this.recordGmtCreate = recordVO.getRecordGmtCreate();
        this.recordGmtModified = recordVO.getRecordGmtModified();
    }

    private RecordDO(Builder b) {
        this(b.recordVO);
        postId = b.postId;
        isDeleted = b.deleted;
    }

    /**
     * builder
     */
    public static class Builder implements MyBuilder<RecordDO> {
        private RecordVO recordVO = null;
        private Integer postId = null;
        private Integer deleted = null;

        public Builder recordVO(RecordVO recordVO) {
            this.recordVO = recordVO;
            return this;
        }

        public Builder postId(Integer postId) {
            this.postId = postId;
            return this;
        }

        public Builder deleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }

        @Override
        public RecordDO build() {
            return new RecordDO(this);
        }
    }

    @Override
    public String toString() {
        return "c_record@{" +
                "record_id:" + recordId +
                ",user_id:" + userId +
                ",post_id:" + postId +
                ",is_deleted:" + isDeleted +
                ",record_gmt_create:" + recordGmtCreate +
                ",record_gmt_modified:" + recordGmtModified +
                "}";
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRecordGmtCreate() {
        return recordGmtCreate;
    }

    public void setRecordGmtCreate(String recordGmtCreate) {
        this.recordGmtCreate = recordGmtCreate;
    }

    public String getRecordGmtModified() {
        return recordGmtModified;
    }

    public void setRecordGmtModified(String recordGmtModified) {
        this.recordGmtModified = recordGmtModified;
    }
}
