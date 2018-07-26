package com.ten.vo;

import com.ten.vo.utils.InfoLevel;

/**
 * INFO
 *
 * @author Administrator
 */
public class InfoVO {

    private Integer infoId;
    private String infoTitle;
    private String infoContent;
    private Integer readed;
    private String infoGmtCreate;
    private String infoGmtModified;
    /**
     * INFO level
     */
    private InfoLevel infoLevel;

    @Override
    public String toString() {
        return "VO:INFO@{" +
                "infoid:" + infoId +
                ",infotitle:" + infoTitle +
                ",infocontent:" + infoContent +
                ",infolevel:" + infoLevel +
                ",isreaded:" + readed +
                ",infogmtcreate:" + infoGmtCreate +
                ",infogmtfinish:" + infoGmtModified +
                "}";
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
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

    public InfoLevel getInfoLevel() {
        return infoLevel;
    }

    public void setInfoLevel(InfoLevel infoLevel) {
        this.infoLevel = infoLevel;
    }
}
