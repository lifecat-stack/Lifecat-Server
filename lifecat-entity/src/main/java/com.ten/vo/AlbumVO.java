package com.ten.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * album
 *
 * @author Administrator
 */
public class AlbumVO {

    private Integer albumId;
    private String albumName;
    private String albumDesc;
    private String albumCoverUrl;
    private String albumGmtCreate;
    private String albumGmtModified;
    /**
     * imageVO list
     */
    private List<ImageVO> albumImageList;

    @Override
    public String toString() {
        return "VO:album@{" +
                "albumid:" + albumId +
                ",albumname:" + albumName +
                ",albumdesc:" + albumDesc +
                ",albumcoverurl:" + albumCoverUrl +
                ",albumgmtcreate:" + albumGmtCreate +
                ",albumgmtmodified:" + albumGmtModified +
                ",albumsize:" + albumImageList.size() +
                "}";
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
