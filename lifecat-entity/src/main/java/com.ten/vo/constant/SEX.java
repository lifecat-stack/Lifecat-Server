package com.ten.vo.constant;

/**
 * user sex
 *
 * @author Administrator
 */
public enum SEX {
    /**
     * 0 默认
     * 1 男
     * 2 女
     */
    EMPTY(0),
    MAN(1),
    WOMAN(2);

    public int num;

    SEX(int val) {
        this.num = val;
    }

    public int getNum() {
        return num;
    }
}
