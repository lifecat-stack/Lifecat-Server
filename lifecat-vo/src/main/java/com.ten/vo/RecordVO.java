package com.ten.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * record
 *
 * @author Administrator
 */
public class RecordVO {

    private Integer recordId;
    private String recordGmtCreate;
    private String recordGmtModified;
    /**
     * post
     */
    private PostVO post;
    /**
     * comment list
     */
    private List<CommentVO> comments;

    @Override
    public String toString() {
        return "VO:record@{" +
                "recordid:" + recordId +
                ",recordgmtcreate:" + recordGmtCreate +
                ",recordgmtmodified:" + recordGmtModified +
                ",commentsize:" + comments.size() +
                "}";
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

    public PostVO getPost() {
        return post;
    }

    public void setPost(PostVO post) {
        this.post = post;
    }

    public List<CommentVO> getComments() {
        return comments;
    }

    public void setComments(List<CommentVO> comments) {
        this.comments = comments;
    }
}
