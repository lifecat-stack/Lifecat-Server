package com.ten.vo;

/**
 * image
 *
 * @author Administrator
 */
public class ImageVO {

    private Integer imageId;
    private String imageType;
    private String imageName;
    private String imageDesc;
    private String imageUrl;
    private String imageGmtCreate;
    private String imageGmtModified;

    @Override
    public String toString() {
        return "VO:image@{" +
                "imageid:" + imageId +
                ",imagetype:" + imageType +
                ",imagename:" + imageName +
                ",imagedesc:" + imageDesc +
                ",imageurl:" + imageUrl +
                ",imagegmtcreate:" + imageGmtCreate +
                ",imagegmtmodified:" + imageGmtModified +
                "}";
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
