package com.ten.vo.constant;

/**
 * user permission
 *
 * @author Administrator
 */
public enum PERMISSION {
    /**
     * permisson
     */
    CREATE("query"),
    DELETE("delete"),
    UPDATE("update"),
    QUERY("query");

    private String desc;

    PERMISSION(String val) {
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
