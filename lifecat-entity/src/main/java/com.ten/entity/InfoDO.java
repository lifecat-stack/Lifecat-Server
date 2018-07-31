package com.ten.entity;

import com.ten.MyBuilder;
import com.ten.vo.InfoVO;
import com.ten.vo.constant.INFOLEVEL;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_info
 *
 * @author Administrator
 */
@Table(name = "c_info")
public class InfoDO {
    @Id
    private Integer infoId;
    private Integer userId;
    private String infoTitle;
    private String infoContent;
    private Integer infoLevel;
    private Integer readed;
    private String infoGmtCreate;
    private String infoGmtModified;

    /**
     * constructor
     */
    public InfoDO() {
    }

    public InfoDO(InfoVO infoVO) {
        this.infoId = infoVO.getInfoId();
        this.userId = infoVO.getUserId();
        this.infoTitle = infoVO.getInfoTitle();
        this.infoContent = infoVO.getInfoContent();
        // boolean => int
        // 0:unread-false 1:read-true
        this.readed = infoVO.getReaded() ? 1 : 0;
        this.infoGmtCreate = infoVO.getInfoGmtCreate();
        this.infoGmtModified = infoVO.getInfoGmtModified();
        // INFOLEVEL => int
        // 1:info 2:alert 3:warn 4:read
        INFOLEVEL infolevel = infoVO.getInfoLevel();
        if (infolevel == INFOLEVEL.INFO) {
            this.infoLevel = 1;
        } else if (infolevel == INFOLEVEL.ALERT) {
            this.infoLevel = 2;
        } else if (infolevel == INFOLEVEL.WARN) {
            this.infoLevel = 3;
        }
    }

    private InfoDO(Builder b) {
        this(b.infoVO);
        userId = b.userId;
    }

    /**
     * builder
     */
    public static class Builder implements MyBuilder<InfoDO> {
        private InfoVO infoVO = null;
        private Integer userId = null;

        public Builder infoVO(InfoVO infoVO) {
            this.infoVO = infoVO;
            return this;
        }

        public Builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        @Override
        public InfoDO build() {
            return new InfoDO(this);
        }
    }

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
