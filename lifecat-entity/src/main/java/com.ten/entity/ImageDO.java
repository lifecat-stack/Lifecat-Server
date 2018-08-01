package com.ten.entity;

import com.ten.MyBuilder;
import com.ten.vo.AlbumVO;
import com.ten.vo.ImageVO;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_image
 *
 * @author Administrator
 */
@Table(name = "c_image")
public class ImageDO {
    @Id
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

    /**
     * constructor
     */
    public ImageDO() {
    }

    public ImageDO(ImageVO imageVO) {
        this.imageId = imageVO.getImageId();
        this.albumId = imageVO.getAlbumId();
        this.imageType = imageVO.getImageType();
        this.imageName = imageVO.getImageName();
        this.imageDesc = imageVO.getImageDesc();
        this.imageUrl = imageVO.getImageUrl();
        this.imageGmtCreate = imageVO.getImageGmtCreate();
        this.imageGmtModified = imageVO.getImageGmtModified();
    }

    private ImageDO(ImageDO.Builder b) {
        this(b.imageVO);
        albumId = b.albumId;
        userId = b.userId;
        deleted = b.deleted;
    }

    /**
     * builder
     */
    public static class Builder implements MyBuilder<ImageDO> {
        private ImageVO imageVO = null;
        private Integer albumId = null;
        private Integer userId = null;
        private Integer deleted = null;

        public Builder imageVO(ImageVO imageVO) {
            this.imageVO = imageVO;
            return this;
        }

        public Builder albumId(Integer albumId) {
            this.albumId = albumId;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public Builder deleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }

        @Override
        public ImageDO build() {
            return new ImageDO(this);
        }
    }

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
