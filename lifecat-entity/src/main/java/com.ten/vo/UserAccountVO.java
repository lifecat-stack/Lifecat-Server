package com.ten.vo;

import com.ten.entity.UserDO;

/**
 * user account
 *
 * @author Administrator
 */
public class UserAccountVO {

    private Integer userId;
    private String userAccountName;
    private String userAccountPassword;

    /**
     * constructor
     */
    public UserAccountVO() {
    }

    public UserAccountVO(UserDO userDO) {
        this.userId = userDO.getUserId();
        this.userAccountName = userDO.getUserAccountName();
        this.userAccountPassword = userDO.getUserAccountPassword();
    }

    @Override
    public String toString() {
        return "VO:userAccount@{" +
                "userid:" + userId +
                ",useraccountname:" + userAccountName +
                ",useraccountpassword:" + userAccountPassword +
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
}
