package com.ten.entity;

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
    private Integer deleted;
    private String recordGmtCreate;
    private String recordGmtModified;

    @Override
    public String toString() {
        return "c_record@{" +
                "record_id:" + recordId +
                ",user_id:" + userId +
                ",post_id:" + postId +
                ",is_deleted:" + deleted +
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

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
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
