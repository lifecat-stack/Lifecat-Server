package com.ten.entity;

/**
 * c_record_post
 *
 * @author Administrator
 */
public class RecordPostDO {

    private Integer postId;
    private String postTitle;
    private String postContent;
    private String postImageUrl;

    @Override
    public String toString() {
        return "c_record_post@{" +
                "post_id:" + postId +
                ",post_title:" + postTitle +
                ",post_content:" + postContent +
                ",post_image_url:" + postImageUrl +
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
