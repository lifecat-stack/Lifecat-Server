package com.ten.entity;

import com.ten.vo.UserAccountVO;
import com.ten.vo.UserPropertyVO;
import com.ten.vo.UserVO;
import com.ten.vo.constant.SEX;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_user
 *
 * @author Administrator
 */
@Table(name = "c_user")
public class UserDO {
    @Id
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
    private Integer isUserDeleted;
    private String userGmtCreate;
    private String userGmtModified;
    private String userLastLogin;
    private Integer userLoginCount;

    /**
     * constructor
     */
    public UserDO() {
    }

    /**
     * constructor - user account vo
     */

    public UserDO(UserAccountVO userAccountVO) {
        this.userId = userAccountVO.getUserId();
        this.userAccountName = userAccountVO.getUserAccountName();
        this.userAccountPassword = userAccountVO.getUserAccountPassword();
    }

    /**
     * constructor - user vo
     */
    public UserDO(UserVO userVO) {
        this.userId = userVO.getUserId();
        this.userAccountName = userVO.getUserAccountName();
        this.userName = userVO.getUserName();
        this.userSex = userVO.getUserSex();
        this.userBirthday = userVO.getUserBirthday();
        this.userEmail = userVO.getUserEmail();
        this.userLocation = userVO.getUserLocation();
        this.userPhoneNumber = userVO.getUserPhoneNumber();
        this.userIconUrl = userVO.getUserIconUrl();
        this.userGmtCreate = userVO.getUserGmtCreate();
        this.userGmtModified = userVO.getUserGmtModified();
        this.userLastLogin = userVO.getUserLastLogin();
        this.userLoginCount = userVO.getUserLoginCount();
    }

    /**
     * constructor - user property vo
     */
    public UserDO(UserPropertyVO userPropertyVO) {
        this.userId = userPropertyVO.getUserId();
        this.userAccountName = userPropertyVO.getUserAccountName();
        this.userName = userPropertyVO.getUserName();
        this.userSex = userPropertyVO.getUserSex();
        this.userBirthday = userPropertyVO.getUserBirthday();
        this.userEmail = userPropertyVO.getUserEmail();
        this.userLocation = userPropertyVO.getUserLocation();
        this.userPhoneNumber = userPropertyVO.getUserPhoneNumber();
        this.userIconUrl = userPropertyVO.getUserIconUrl();
        this.userGmtCreate = userPropertyVO.getUserGmtCreate();
        this.userGmtModified = userPropertyVO.getUserGmtModified();
        this.userLastLogin = userPropertyVO.getUserLastLogin();
        this.userLoginCount = userPropertyVO.getUserLoginCount();
    }

    @Override
    public String toString() {
        return "c_user@{" +
                "user_id:" + userId +
                ",user_account_name:" + userAccountName +
                ",user_account_password:" + userAccountPassword +
                ",user_name:" + userName +
                ",user_sex:" + userSex +
                ",user_birthday:" + userBirthday +
                ",user_email:" + userEmail +
                ",user_location:" + userLocation +
                ",user_phone_number:" + userPhoneNumber +
                ",user_icon_url:" + userIconUrl +
                ",is_user_deleted:" + isUserDeleted +
                ",user_gmt_create:" + userGmtCreate +
                ",user_gmt_modified:" + userGmtModified +
                ",user_last_login:" + userLastLogin +
                ",user_login_count:" + userLoginCount +
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

    public Integer getIsUserDeleted() {
        return isUserDeleted;
    }

    public void setIsUserDeleted(Integer isUserDeleted) {
        this.isUserDeleted = isUserDeleted;
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
