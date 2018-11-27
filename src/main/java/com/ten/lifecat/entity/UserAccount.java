package com.ten.lifecat.entity;

/**
 * 用户账号表
 */
public class UserAccount {
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
    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户最近一次登录时间
     */
    private String userLastLogin;
    /**
     * 用户总访问次数
     */
    private Integer userLoginCount;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    public UserAccount() {
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userLastLogin='" + userLastLogin + '\'' +
                ", userLoginCount=" + userLoginCount +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
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
