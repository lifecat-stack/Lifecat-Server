package com.ten.vo.constant;

/**
 * c_info :info_level
 *
 * @author Administrator
 */
public enum INFOLEVEL {
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

    INFOLEVEL(int i, String val) {
        this.num = i;
        this.desc = val;
    }

    public int getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return getDesc();
    }
}
