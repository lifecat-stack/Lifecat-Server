package com.ten.vo;

/**
 * c_info :info_level
 *
 * @author Administrator
 */
public enum InfoLevel {
    /**
     * info  1
     * alert 2
     * warn  3
     * read  4
     */
    info(1, "info"),
    alert(2, "alert"),
    warn(3, "warn"),
    read(4, "read");

    InfoLevel(int i, String info) {
    }
}
