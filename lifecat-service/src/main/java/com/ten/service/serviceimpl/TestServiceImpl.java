package com.ten.service.serviceimpl;

import com.ten.entity.TestDO;
import com.ten.mapper.TestMapper;
import com.ten.service.service.TestService;
import com.ten.utils.DataAndViewTranslator;
import com.ten.vo.TestVO;
import com.ten.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service
public class TestServiceImpl extends BaseServiceImpl<TestVO, TestDO> implements TestService {

    private final DataAndViewTranslator<TestDO, TestVO> translator;

    @Autowired
    public TestServiceImpl(DataAndViewTranslator<TestDO, TestVO> translator) {
        this.translator = translator;
    }

    @Override
    public List<TestVO> list(TestVO entity) {
        TestDO testDO = translator.transViewToData(entity);
        List<TestDO> testDOList = super.exeQueryList(testDO);
        List<TestVO> testVOList = translator.listTransDatasToViews(testDOList);
        return testVOList;
    }

    @Override
    public TestVO get(TestVO entity) {
        return null;
    }

    @Override
    public int post(TestVO entity) {
        return 0;
    }

    @Override
    public int put(TestVO entity) {
        return 0;
    }

    @Override
    public int delete(TestVO entity) {
        return 0;
    }
}
