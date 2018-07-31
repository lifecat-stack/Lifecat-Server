package com.ten.manager;

import com.ten.vo.TestVO;

import java.util.List;

public interface TestServiceManager {

    List<TestVO> getAllTest();

    List<TestVO> getTestListByTestId(Integer testId);

    List<TestVO> getTestListByEntity(TestVO entity);

    TestVO getTestByTestId(Integer testId);

    TestVO getTestByEntity(TestVO entity);

    int createTest(TestVO entity);

    int updateTest(TestVO entity);

    int deleteTestById(Integer testId);

    int deleteTestByEntity(TestVO entity);
}
