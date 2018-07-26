package com.ten.entity;

/**
 * c_image
 *
 * @author Administrator
 */
public class ImageDO {

    private Integer imageId;
    private Integer albumId;
    private Integer userId;
    private String imageType;
    private String imageName;
    private String imageDesc;
    private String imageUrl;
    private Integer deleted;
    private String imageGmtCreate;
    private String imageGmtModified;

    @Override
    public String toString() {
        return "c_image@{" +
                "image_id:" + imageId +
                ",album_id:" + albumId +
                ",user_id:" + userId +
                ",image_type:" + imageType +
                ",image_name:" + imageName +
                ",image_desc:" + imageDesc +
                ",image_url:" + imageUrl +
                ",is_deleted:" + deleted +
                ",image_gmt_create:" + imageGmtCreate +
                ",image_gmt_modified:" + imageGmtModified +
                "}";
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getImageGmtCreate() {
        return imageGmtCreate;
    }

    public void setImageGmtCreate(String imageGmtCreate) {
        this.imageGmtCreate = imageGmtCreate;
    }

    public String getImageGmtModified() {
        return imageGmtModified;
    }

    public void setImageGmtModified(String imageGmtModified) {
        this.imageGmtModified = imageGmtModified;
    }
}
