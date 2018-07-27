package com.ten.service.serviceimpl;

import com.ten.entity.TestDO;
import com.ten.mapper.TestMapper;
import com.ten.service.service.TestService;
import com.ten.vo.TestVO;
import com.ten.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service
public class TestServiceImpl extends BaseServiceImpl<TestVO, TestDO> implements TestService {

    @Override
    public List<TestVO> list(TestDO entity) {
        List<TestDO> testList = super.exeQueryList(entity);
        return null;
    }

    @Override
    public TestVO get(TestDO entity) {
        System.out.println("test service get");
        TestDO testDO = super.exeQuery(entity);
        TestVO testVO = new TestVO(testDO);
        return testVO;
    }

    @Override
    public int post(TestDO entity) {
        return 0;
    }

    @Override
    public int put(TestDO entity) {
        return 0;
    }

    @Override
    public int delete(TestDO entity) {
        return 0;
    }
}
