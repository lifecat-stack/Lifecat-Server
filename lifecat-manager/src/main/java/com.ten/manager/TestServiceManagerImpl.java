package com.ten.manager;

import com.ten.vo.TestVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceManagerImpl implements TestServiceManager {
    @Override
    public List<TestVO> getAllTest() {
        return null;
    }

    @Override
    public List<TestVO> getTestListByTestId(Integer testId) {
        return null;
    }

    @Override
    public List<TestVO> getTestListByEntity(TestVO entity) {
        return null;
    }

    @Override
    public TestVO getTestByTestId(Integer testId) {
        return null;
    }

    @Override
    public TestVO getTestByEntity(TestVO entity) {
        return null;
    }

    @Override
    public int createTest(TestVO entity) {
        return 0;
    }

    @Override
    public int updateTest(TestVO entity) {
        return 0;
    }

    @Override
    public int deleteTestById(Integer testId) {
        return 0;
    }

    @Override
    public int deleteTestByEntity(TestVO entity) {
        return 0;
    }
}
