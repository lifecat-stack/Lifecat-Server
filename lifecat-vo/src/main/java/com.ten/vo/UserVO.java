package com.ten.vo;

/**
 * user
 *
 * @author Administrator
 */
public class UserVO {

    private Integer userId;
    private String userAccountName;
    private String userAccountPassword;
    private String userName;
    private Integer userSex;
    private String userBirthday;
    private String userEmail;
    private String userLocation;
    private String userPhoneNumber;
    private String userIconUrl;
    private String userGmtCreate;
    private String userGmtModified;
    private String userLastLogin;
    private Integer userLoginCount;

    @Override
    public String toString() {
        return "VO:user@{" +
                "userid:" + userId +
                ",useraccountname:" + userAccountName +
                ",useraccountpassword:" + userAccountPassword +
                ",username:" + userName +
                ",usersex:" + userSex +
                ",userbirthday:" + userBirthday +
                ",useremail:" + userEmail +
                ",userlocation:" + userLocation +
                ",userphonenumber:" + userPhoneNumber +
                ",usericonurl:" + userIconUrl +
                ",usergmtcreate:" + userGmtCreate +
                ",usergmtmodified:" + userGmtModified +
                ",userlastlogin:" + userLastLogin +
                ",userlogincount:" + userLoginCount +
                "}";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccountName() {
        return userAccountName;
    }

    public void setUserAccountName(String userAccountName) {
        this.userAccountName = userAccountName;
    }

    public String getUserAccountPassword() {
        return userAccountPassword;
    }

    public void setUserAccountPassword(String userAccountPassword) {
        this.userAccountPassword = userAccountPassword;
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

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserIconUrl() {
        return userIconUrl;
    }

    public void setUserIconUrl(String userIconUrl) {
        this.userIconUrl = userIconUrl;
    }

    public String getUserGmtCreate() {
        return userGmtCreate;
    }

    public void setUserGmtCreate(String userGmtCreate) {
        this.userGmtCreate = userGmtCreate;
    }

    public String getUserGmtModified() {
        return userGmtModified;
    }

    public void setUserGmtModified(String userGmtModified) {
        this.userGmtModified = userGmtModified;
    }

    public String getUserLastLogin() {
        return userLastLogin;
    }

    public void setUserLastLogin(String userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    public Integer getUserLoginCount() {
        return userLoginCount;
    }

    public void setUserLoginCount(Integer userLoginCount) {
        this.userLoginCount = userLoginCount;
    }
}
