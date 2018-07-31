package com.ten.vo;

import com.ten.entity.InfoDO;
import com.ten.vo.constant.INFOLEVEL;

/**
 * INFO
 *
 * @author Administrator
 */
public class InfoVO {

    private Integer infoId;
    private Integer userId;
    private String infoTitle;
    private String infoContent;
    private Boolean readed;
    private String infoGmtCreate;
    private String infoGmtModified;
    /**
     * INFO level
     */
    private INFOLEVEL infoLevel;

    /**
     * constructor
     */
    public InfoVO() {
    }

    public InfoVO(InfoDO infoDO) {
        this.infoId = infoDO.getInfoId();
        this.userId = infoDO.getUserId();
        this.infoTitle = infoDO.getInfoTitle();
        this.infoContent = infoDO.getInfoContent();
        // int => boolean
        // 0:unread-false 1:read-true
        this.readed = infoDO.getReaded() >= 1;
        this.infoGmtCreate = infoDO.getInfoGmtCreate();
        this.infoGmtModified = infoDO.getInfoGmtModified();
        // int => INFOLEVEL
        // 1:info 2:alert 3:warn 4:read
        int infolevel = infoDO.getInfoLevel();
        if (infolevel == 1) {
            this.infoLevel = INFOLEVEL.INFO;
        } else if (infolevel == 2) {
            this.infoLevel = INFOLEVEL.ALERT;
        } else if (infolevel == 3) {
            this.infoLevel = INFOLEVEL.WARN;
        }
    }

    @Override
    public String toString() {
        return "VO:INFO@{" +
                "infoid:" + infoId +
                "userid:" + userId +
                ",infotitle:" + infoTitle +
                ",infocontent:" + infoContent +
                ",infolevel:" + infoLevel +
                ",isreaded:" + readed +
                ",infogmtcreate:" + infoGmtCreate +
                ",infogmtfinish:" + infoGmtModified +
                "}";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Boolean getReaded() {
        return readed;
    }

    public void setReaded(Boolean readed) {
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

    public INFOLEVEL getInfoLevel() {
        return infoLevel;
    }

    public void setInfoLevel(INFOLEVEL infoLevel) {
        this.infoLevel = infoLevel;
    }
}
