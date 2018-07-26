package com.ten.entity;

/**
 * c_info
 *
 * @author Administrator
 */
public class InfoDO {

    private Integer infoId;
    private Integer userId;
    private String infoTitle;
    private String infoContent;
    private Integer infoLevel;
    private Integer readed;
    private String infoGmtCreate;
    private String infoGmtModified;

    @Override
    public String toString() {
        return "c_info@{" +
                "info_id:" + infoId +
                ",user_id:" + userId +
                ",info_title:" + infoTitle +
                ",info_content:" + infoContent +
                ",info_level:" + infoLevel +
                ",is_readed:" + readed +
                ",info_gmt_create:" + infoGmtCreate +
                ",info_gmt_finish:" + infoGmtModified +
                "}";
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    public Integer getReaded() {
        return readed;
    }

    public void setReaded(Integer readed) {
        this.readed = readed;
    }

    public String getInfoGmtCreate() {
        return infoGmtCreate;
    }

    public void setInfoGmtCreate(String infoGmtCreate) {
        this.infoGmtCreate = infoGmtCreate;
    }

    public String getInfoGmtModified() {
        return infoGmtModified;
    }

    public void setInfoGmtModified(String infoGmtModified) {
        this.infoGmtModified = infoGmtModified;
    }
}
