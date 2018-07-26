package com.ten.vo.utils;

/**
 * user role
 *
 * @author Administrator
 */
public enum Role {
    /**
     * permisson
     */
    SUPER("permission:crud"),
    ADMIN("permission:crud"),
    VVIP("permission:crud"),
    VIP("permission:crud"),
    USER("permission:crud"),
    TOURIST("permission:just query");

    private String desc;

    Role(String val) {
        this.desc = val;
    }

    public String getDesc() {
        return desc;
    }
}
