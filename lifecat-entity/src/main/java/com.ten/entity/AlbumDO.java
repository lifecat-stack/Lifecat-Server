package com.ten.entity;

/**
 * c_album
 *
 * @author Administrator
 */
public class AlbumDO {

    private Integer albumId;
    private Integer userId;
    private String albumName;
    private String albumDesc;
    private String albumCoverUrl;
    private Integer deleted;
    private String albumGmtCreate;
    private String albumGmtModified;

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
