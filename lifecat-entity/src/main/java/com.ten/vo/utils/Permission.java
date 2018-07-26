package com.ten.vo.utils;

/**
 * user permission
 *
 * @author Administrator
 */
public enum Permission {
    /**
     * permisson
     */
    CREATE("query"),
    DELETE("delete"),
    UPDATE("update"),
    QUERY("query");

    private String desc;

    Permission(String val) {
        this.desc = val;
    }

    public String getDesc() {
        return desc;
    }
}
