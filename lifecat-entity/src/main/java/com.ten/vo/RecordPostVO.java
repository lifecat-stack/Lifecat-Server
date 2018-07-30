package com.ten.vo;

import com.ten.entity.RecordPostDO;

/**
 * record post
 *
 * @author Administrator
 */
public class RecordPostVO {

    private Integer postId;
    private String postTitle;
    private String postContent;
    private String postImageUrl;

    /**
     * constructor
     */
    public RecordPostVO() {
    }

    public RecordPostVO(RecordPostDO recordPostDO) {
        this.postId = recordPostDO.getPostId();
        this.postTitle = recordPostDO.getPostTitle();
        this.postContent = recordPostDO.getPostContent();
        this.postImageUrl = recordPostDO.getPostImageUrl();
    }

    @Override
    public String toString() {
        return "VO:post@{" +
                "postid:" + postId +
                ",posttitle:" + postTitle +
                ",postcontent:" + postContent +
                ",postimageurl:" + postImageUrl +
                "}";
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostImageUrl() {
        return postImageUrl;
    }

    public void setPostImageUrl(String postImageUrl) {
        this.postImageUrl = postImageUrl;
    }
}
