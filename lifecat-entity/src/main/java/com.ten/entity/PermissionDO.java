package com.ten.entity;

public class PermissionDO {
    private Integer albumId;
    private Integer userId;
    private String albumName;
    private String albumDesc;
    private String albumCoverUrl;
    private boolean deleted;
    private String albumGmtCreate;
    private String albumGmtModified;

    @Override
    public String toString() {
        return "c_album@{" +
                "album_id:" + albumId +
                ",user_id:" + userId +
                ",album_name:" + albumName +
                ",album_desc:" + albumDesc +
    }

}
