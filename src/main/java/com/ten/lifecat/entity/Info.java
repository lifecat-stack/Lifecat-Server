package com.ten.lifecat.entity;

/**
 * 通知信息
 */
public class Info {
    /**
     * 主键ID Auto
     */
    private Integer id;
    /**
     * 信息ID
     */
    private String infoId;
    /**
     * 信息所属用户ID
     */
    private String userId;
    /**
     * 信息标题
     */
    private String infoTitle;
    /**
     * 信息内容
     */
    private String infoContent;
    /**
     * 信息警示等级 0正常 1警示 ...
     */
    private Integer infoLevel;
    /**
     * 信息阅读标记
     */
    private Integer isReaded;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", infoId='" + infoId + '\'' +
                ", userId='" + userId + '\'' +
                ", infoTitle='" + infoTitle + '\'' +
                ", infoContent='" + infoContent + '\'' +
                ", infoLevel=" + infoLevel +
                ", isReaded=" + isReaded +
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

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent;
    }

    public Integer getInfoLevel() {
        return infoLevel;
    }

    public void setInfoLevel(Integer infoLevel) {
        this.infoLevel = infoLevel;
    }

    public Integer getIsReaded() {
        return isReaded;
    }

    public void setIsReaded(Integer isReaded) {
        this.isReaded = isReaded;
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
