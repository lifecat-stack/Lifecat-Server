package com.ten.lifecat.server.entity;

/**
 * 用户资料表
 */
public class User {
    /**
     * 主键ID Auto
     */
    private Integer id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户账号 Unique
     */
    private String userName;

    /* 用户资料信息 */

    /**
     * 性别 0空 1男 2女
     */
    private Integer userSex;
    /**
     * 生日
     */
    private String userBirthday;
    /**
     * 邮箱
     */
    private String userEmail;
    /**
     * 住址
     */
    private String userLocation;
    /**
     * 手机号
     */
    private String userPhone;
    /**
     * 用户头像链接
     */
    private String userIconUrl;
    /**
     * 用户来源(用于推荐功能)
     */
    private String source;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBirthday='" + userBirthday + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userLocation='" + userLocation + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userIconUrl='" + userIconUrl + '\'' +
                ", source='" + source + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserIconUrl() {
        return userIconUrl;
    }

    public void setUserIconUrl(String userIconUrl) {
        this.userIconUrl = userIconUrl;
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
