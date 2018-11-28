package com.ten.lifecat.server.entity;

/**
 * 登录日志
 */
public class Log {
    /**
     * 主键ID Auto
     */
    private Integer id;
    /**
     * 日志ID
     */
    private String logId;
    /**
     * 日志主体用户ID
     */
    private String userId;
    /**
     * 登录IP地址
     */
    private String userIp;
    /**
     * 登录地点
     */
    private String userAddress;
    /**
     * 登录设备
     */
    private String userSource;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", logId='" + logId + '\'' +
                ", userId='" + userId + '\'' +
                ", userIp='" + userIp + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userSource='" + userSource + '\'' +
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

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
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
