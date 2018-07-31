package com.ten.entity;

import com.ten.MyBuilder;
import com.ten.vo.AlbumVO;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Locale;

/**
 * c_album
 *
 * @author Administrator
 */
@Table(name = "c_album")
public class AlbumDO {
    @Id
    private Integer albumId;
    private Integer userId;
    private String albumName;
    private String albumDesc;
    private String albumCoverUrl;
    private Integer deleted;
    private String albumGmtCreate;
    private String albumGmtModified;

    /**
     * constructor
     */
    public AlbumDO() {
    }

    public AlbumDO(AlbumVO albumVO) {
        this.albumId = albumVO.getAlbumId();
        this.userId = albumVO.getUserId();
        this.albumName = albumVO.getAlbumName();
        this.albumDesc = albumVO.getAlbumDesc();
        this.albumCoverUrl = albumVO.getAlbumCoverUrl();
        this.albumGmtCreate = albumVO.getAlbumGmtCreate();
        this.albumGmtModified = albumVO.getAlbumGmtModified();
    }

    private AlbumDO(Builder b) {
        this(b.albumVO);
        userId = b.userId;
        deleted = b.deleted;
    }

    /**
     * builder
     */
    public static class Builder implements MyBuilder<AlbumDO> {
        private AlbumVO albumVO = null;
        private Integer userId = null;
        private Integer deleted = null;

        public Builder albumVO(AlbumVO albumVO) {
            this.albumVO = albumVO;
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
        public AlbumDO build() {
            return new AlbumDO(this);
        }
    }

    @Override
    public String toString() {
        return "c_album@{" +
                "album_id:" + albumId +
                ",user_id:" + userId +
                ",album_name:" + albumName +
                ",album_desc:" + albumDesc +
                ",album_cover_url:" + albumCoverUrl +
                ",is_deleted:" + deleted +
                ",album_gmt_create:" + albumGmtCreate +
                ",album_gmt_modified:" + albumGmtModified +
                "}";
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

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumDesc() {
        return albumDesc;
    }

    public void setAlbumDesc(String albumDesc) {
        this.albumDesc = albumDesc;
    }

    public String getAlbumCoverUrl() {
        return albumCoverUrl;
    }

    public void setAlbumCoverUrl(String albumCoverUrl) {
        this.albumCoverUrl = albumCoverUrl;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getAlbumGmtCreate() {
        return albumGmtCreate;
    }

    public void setAlbumGmtCreate(String albumGmtCreate) {
        this.albumGmtCreate = albumGmtCreate;
    }

    public String getAlbumGmtModified() {
        return albumGmtModified;
    }

    public void setAlbumGmtModified(String albumGmtModified) {
        this.albumGmtModified = albumGmtModified;
    }
}
