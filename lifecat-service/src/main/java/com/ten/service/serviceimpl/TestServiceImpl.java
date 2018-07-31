package com.ten.service.serviceimpl;

import com.ten.entity.TestDO;
import com.ten.service.service.TestService;
import com.ten.vo.TestVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * test
 *
 * @author Administrator
 * @table c_test
 */
@Service
public class TestServiceImpl extends BaseServiceImpl<TestVO, TestDO> implements TestService {

    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    /**
     * selete all test
     */
    @Override
    public List<TestVO> all() {
        List<TestDO> testDOS = exeQueryAll();
        List<TestVO> testVOS = new ArrayList<>(16);
        for (TestDO testDO : testDOS) {
            TestVO testVO = new TestVO(testDO);
            testVOS.add(testVO);
        }
        return testVOS;
    }

    /**
     * selete all test
     */
    @Override
    public List<TestVO> list(TestVO entity) {
        List<TestDO> testDOS = exeQueryAll();
        List<TestVO> testVOS = new ArrayList<>(16);
        for (TestDO testDO : testDOS) {
            TestVO testVO = new TestVO(testDO);
            testVOS.add(testVO);
        }
        return testVOS;
    }

    /**
     * selete test :
     * test_id
     * test_name
     */
    @Override
    public TestVO get(TestVO entity) {
        TestDO testDO = new TestDO(entity);
        return new TestVO(exeQuery(testDO));
    }

    /**
     * create test :
     * test_id :auto
     * test_name
     */
    @Override
    public int create(TestVO entity) {
        TestDO testDO = new TestDO(entity);
        testDO.setTestId(null);
        return exeInsert(testDO);
    }

    /**
     * update test :
     * test_name
     * by test_id
     */
    @Override
    public int update(TestVO entity) {
        TestDO testDO = new TestDO(entity);
        return exeUpdate(testDO);
    }

    /**
     * delete test :
     * by test_id
     */
    @Override
    public int delete(TestVO entity) {
        TestDO testDO = new TestDO();
        testDO.setTestId(entity.getTestId());
        return exeDelete(testDO);
    }
}
