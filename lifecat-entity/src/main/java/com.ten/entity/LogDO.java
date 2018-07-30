package com.ten.entity;

import com.ten.vo.LogVO;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_log
 *
 * @author Administrator
 */
@Table(name = "c_log")
public class LogDO {
    @Id
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
    public LogDO() {
    }

    public LogDO(LogVO logVO) {
        this.logId = logVO.getLogId();
        this.userId = logVO.getUserId();
        this.userRoleId = logVO.getUserRoleId();
        this.userIp = logVO.getUserIp();
        this.userAddress = logVO.getUserAddress();
        this.userSource = logVO.getUserSource();
        this.logRecordTime = logVO.getLogRecordTime();
    }

    @Override
    public String toString() {
        return "c_log@{" +
                "log_id:" + logId +
                ",user_id:" + userId +
                ",user_role_id:" + userRoleId +
                ",user_ip:" + userIp +
                ",user_address:" + userAddress +
                ",user_source:" + userSource +
                ",log_record_time:" + logRecordTime +
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
