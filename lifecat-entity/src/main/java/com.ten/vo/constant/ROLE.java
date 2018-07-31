package com.ten.vo.constant;

/**
 * user role
 *
 * @author Administrator
 */
public enum ROLE {
    /**
     * role
     */
    SUPER("permission:crud"),
    ADMIN("permission:crud"),
    VVIP("permission:crud"),
    VIP("permission:crud"),
    USER("permission:crud"),
    TOURIST("permission:just query");

    private String desc;

    ROLE(String val) {
        this.desc = val;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return getDesc();
    }
}
