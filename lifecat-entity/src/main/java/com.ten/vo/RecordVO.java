package com.ten.vo;

import com.ten.MyBuilder;
import com.ten.entity.RecordDO;

import java.util.List;

/**
 * record
 *
 * @author Administrator
 */
public class RecordVO {

    private Integer recordId;
    private Integer userId;
    private Integer postId;
    private String recordGmtCreate;
    private String recordGmtModified;
    /**
     * post
     */
    private RecordPostVO post;
    /**
     * comment list
     */
    private List<RecordCommentVO> comments;

    /**
     * constructor
     */
    public RecordVO() {
    }

    public RecordVO(RecordDO recordDO) {
        this.recordId = recordDO.getRecordId();
        this.userId = recordDO.getUserId();
        this.postId = recordDO.getPostId();
        this.recordGmtCreate = recordDO.getRecordGmtCreate();
        this.recordGmtModified = recordDO.getRecordGmtModified();
    }

    private RecordVO(Builder b) {
        this(b.recordDO);
        post = b.post;
        comments = b.comments;
    }

    /**
     * builder
     */
    public static class Builder implements MyBuilder<RecordVO> {
        private RecordDO recordDO = null;
        private RecordPostVO post = null;
        private List<RecordCommentVO> comments = null;

        public Builder recordDO(RecordDO recordDO) {
            this.recordDO = recordDO;
            return this;
        }

        public Builder commentRecordId(RecordPostVO post) {
            this.post = post;
            return this;
        }

        public Builder deleted(List<RecordCommentVO> comments) {
            this.comments = comments;
            return this;
        }

        @Override
        public RecordVO build() {
            return new RecordVO(this);
        }
    }

    @Override
    public String toString() {
        return "VO:record@{" +
                "recordid:" + recordId +
                "userid:" + userId +
                "postid:" + postId +
                ",recordgmtcreate:" + recordGmtCreate +
                ",recordgmtmodified:" + recordGmtModified +
                ",commentsize:" + comments.size() +
                "}";
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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

    public RecordPostVO getPost() {
        return post;
    }

    public void setPost(RecordPostVO post) {
        this.post = post;
    }

    public List<RecordCommentVO> getComments() {
        return comments;
    }

    public void setComments(List<RecordCommentVO> comments) {
        this.comments = comments;
    }
}
