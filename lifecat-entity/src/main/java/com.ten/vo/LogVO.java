package com.ten.vo;

import com.ten.entity.LogDO;

/**
 * log
 *
 * @author Administrator
 */
public class LogVO {

    private Integer logId;
    private Integer userId;
    private Integer userRoleId;
    private String userIp;
    private String userAddress;
    private String userSource;
    private String logRecordTime;

    /**
     * constructor
     */
    public LogVO() {
    }

    public LogVO(LogDO logDO) {
        this.logId = logDO.getLogId();
        this.userId = logDO.getUserId();
        this.userRoleId = logDO.getUserRoleId();
        this.userIp = logDO.getUserIp();
        this.userAddress = logDO.getUserAddress();
        this.userSource = logDO.getUserSource();
        this.logRecordTime = logDO.getLogRecordTime();
    }

    @Override
    public String toString() {
        return "VO:log@{" +
                "logid:" + logId +
                ",userid:" + userId +
                ",userroleid:" + userRoleId +
                ",userip:" + userIp +
                ",useraddress:" + userAddress +
                ",usersource:" + userSource +
                ",logrecordtime:" + logRecordTime +
                "}";
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
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

    public String getLogRecordTime() {
        return logRecordTime;
    }

    public void setLogRecordTime(String logRecordTime) {
        this.logRecordTime = logRecordTime;
    }
}
