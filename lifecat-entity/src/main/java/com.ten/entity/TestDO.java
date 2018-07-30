package com.ten.entity;

import com.ten.vo.TestVO;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * c_test
 *
 * @author Administrator
 */
@Table(name = "c_test")
public class TestDO {
    @Id
    private Integer testId;
    private String testName;

    /**
     * constructor
     */
    public TestDO() {
    }

    public TestDO(TestVO testVO) {
        this.testId = testVO.getTestId();
        this.testName = testVO.getTestName();
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
