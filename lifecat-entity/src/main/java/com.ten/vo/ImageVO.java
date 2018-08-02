package com.ten.vo;

import com.ten.entity.ImageDO;

/**
 * album
 *
 * @author Administrator
 */
public class ImageVO {

    private Integer imageId;
    private Integer albumId;
    private String imageType;
    private String imageName;
    private String imageDesc;
    private String imageUrl;
    private String imageGmtCreate;
    private String imageGmtModified;

    /**
     * constructor
     */
    public ImageVO() {
    }

    public ImageVO(ImageDO imageDO) {
        this.imageId = imageDO.getImageId();
        this.albumId = imageDO.getAlbumId();
        this.imageType = imageDO.getImageType();
        this.imageName = imageDO.getImageName();
        this.imageDesc = imageDO.getImageDesc();
        this.imageUrl = imageDO.getImageUrl();
        this.imageGmtCreate = imageDO.getImageGmtCreate();
        this.imageGmtModified = imageDO.getImageGmtModified();
    }

    @Override
    public String toString() {
        return "VO:album@{" +
                "imageid:" + imageId +
                ",albumid:" + albumId +
                ",imagetype:" + imageType +
                ",imagename:" + imageName +
                ",imagedesc:" + imageDesc +
                ",imageurl:" + imageUrl +
                ",imagegmtcreate:" + imageGmtCreate +
                ",imagegmtmodified:" + imageGmtModified +
                "}";
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
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
