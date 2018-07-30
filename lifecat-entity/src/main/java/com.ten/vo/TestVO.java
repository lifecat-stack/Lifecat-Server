package com.ten.vo;

import com.ten.entity.TestDO;

public class TestVO {

    private Integer testId;
    private String testName;

    /**
     * constructor
     */
    public TestVO() {
    }

    public TestVO(TestDO testDO) {
        this.testId = testDO.getTestId();
        this.testName = testDO.getTestName();
    }

    @Override
    public String toString() {
        return "c_test@{" +
                "testid:" + testId +
                ",testname:" + testName +
                "}";
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
