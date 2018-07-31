package com.ten.vo;

import com.ten.entity.AlbumDO;

import java.util.ArrayList;
import java.util.List;

/**
 * album
 *
 * @author Administrator
 */
public class AlbumVO {

    private Integer albumId;
    private Integer userId;
    private String albumName;
    private String albumDesc;
    private String albumCoverUrl;
    private String albumGmtCreate;
    private String albumGmtModified;
    /**
     * imageVO list
     */
    private List<ImageVO> albumImageList;

    /**
     * constructor
     */
    public AlbumVO() {
    }

    public AlbumVO(AlbumDO albumDO) {
        this.albumId = albumDO.getAlbumId();
        this.userId = albumDO.getUserId();
        this.albumName = albumDO.getAlbumName();
        this.albumDesc = albumDO.getAlbumDesc();
        this.albumCoverUrl = albumDO.getAlbumCoverUrl();
        this.albumGmtCreate = albumDO.getAlbumGmtCreate();
        this.albumGmtModified = albumDO.getAlbumGmtModified();
    }

    @Override
    public String toString() {
        return "VO:album@{" +
                "albumid:" + albumId +
                "userid:" + userId +
                ",albumname:" + albumName +
                ",albumdesc:" + albumDesc +
                ",albumcoverurl:" + albumCoverUrl +
                ",albumgmtcreate:" + albumGmtCreate +
                ",albumgmtmodified:" + albumGmtModified +
                ",albumsize:" + albumImageList.size() +
                "}";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<ImageVO> getAlbumImageList() {
        return albumImageList;
    }

    public void setAlbumImageList(List<ImageVO> albumImageList) {
        this.albumImageList = albumImageList;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
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
