package com.ten.lifecat.server.entity;

/**
 * 分组-权限关联表
 */
public class AGroupPermission {
    /**
     * 主键ID Auto
     */
    private Integer id;
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 权限ID
     */
    private Integer permissionId;

    private String createTime;
    private String updateTime;
    private Integer isDeleted;
}
