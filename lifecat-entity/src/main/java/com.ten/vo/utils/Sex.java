package com.ten.vo.utils;

/**
 * user sex
 *
 * @author Administrator
 */
public enum Sex {
    /**
     * 0 默认
     * 1 男
     * 2 女
     */
    EMPTY(0, "empty"),
    MAN(1, "男"),
    WOMAN(2, "女");

    private int num;
    private String desc;

    Sex(int val, String desc) {
        this.num = val;
        this.desc = desc;
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
