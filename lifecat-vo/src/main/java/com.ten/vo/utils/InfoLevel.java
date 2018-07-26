package com.ten.vo.utils;

/**
 * c_info :info_level
 *
 * @author Administrator
 */
public enum InfoLevel {
    /**
     * INFO  1
     * alert 2
     * warn  3
     */
    INFO(1, "info"),
    ALERT(2, "alert"),
    WARN(3, "warn");

    private int num;
    private String desc;

    InfoLevel(int i, String val) {
        this.num = i;
        this.desc = val;
    }

    public int getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }
}
