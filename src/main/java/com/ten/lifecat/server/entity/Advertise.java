package com.ten.lifecat.server.entity;

/**
 * 广告推送
 */
public class Advertise {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 广告ID
     */
    private String advertiseId;
    /**
     * 主题
     */
    private String title;
    /**
     * 文本内容
     */
    private String text;
    /**
     * 点击链接
     */
    private String url;
    /**
     * 图片链接
     */
    private String image;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    @Override
    public String toString() {
        return "Advertise{" +
                "id=" + id +
                ", advertiseId='" + advertiseId + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvertiseId() {
        return advertiseId;
    }

    public void setAdvertiseId(String advertiseId) {
        this.advertiseId = advertiseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
