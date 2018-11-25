package com.ten.lifecat.manager;

import com.ten.lifecat.service.TestService;
import com.ten.lifecat.entity.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceManagerImpl implements TestServiceManager {

    private final TestService testService;

    @Autowired
    public TestServiceManagerImpl(TestService testService) {
        this.testService = testService;
    }

    @Override
    public List<TestVO> getAllTest() {
        return testService.all();
    }

    @Override
    public List<TestVO> getTestListByTestId(Integer testId) {
        TestVO testVO = new TestVO();
        testVO.setTestId(testId);
        return testService.list(testVO);
    }

    @Override
    public List<TestVO> getTestListByEntity(TestVO entity) {
        return testService.list(entity);
    }

    @Override
    public TestVO getTestByTestId(Integer testId) {
        TestVO testVO = new TestVO();
        testVO.setTestId(testId);
        return testService.get(testVO);
    }

    @Override
    public TestVO getTestByEntity(TestVO entity) {
        return testService.get(entity);
    }

    @Override
    public int createTest(TestVO entity) {
        return testService.create(entity);
    }

    @Override
    public int updateTest(TestVO entity) {
        return testService.update(entity);
    }

    @Override
    public int deleteTestById(Integer testId) {
        TestVO testVO = new TestVO();
        testVO.setTestId(testId);
        return testService.delete(testVO);
    }

    @Override
    public int deleteTestByEntity(TestVO entity) {
        return testService.delete(entity);
    }
}
