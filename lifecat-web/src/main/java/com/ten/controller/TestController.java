package com.ten.controller;

import com.ten.dto.ResponseResult;
import com.ten.manager.TestServiceManager;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ten.check.ControllerCheckUtil.*;

/**
 * Test
 *
 * @author wshten
 * @date 2018/8/14 0014
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController<TestVO, ResponseResult> {

    private final TestServiceManager testServiceManager;

    @Autowired
    public TestController(TestServiceManager testServiceManager) {
        this.testServiceManager = testServiceManager;
    }

    /**
     * all
     * <p>
     * 获取所有test信息
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @Override
    public ResponseResult all() {
        System.out.println("test all recived");
        List<TestVO> testVOList = testServiceManager.getAllTest();
        checkResourceNotNull(testVOList);
        return new ResponseResult(testVOList);
    }

    /**
     * listByUrl
     */
    @RequestMapping(value = "/list/{testId}", method = RequestMethod.GET)
    @Override
    public ResponseResult listByUrl(@PathVariable String testId) {
        // check
        checkRequestDataNotNull(testId);
        checkRequestDataFormatInt(testId);
        // execute
        int id = Integer.parseInt(testId);
        List<TestVO> testVOList = testServiceManager.getTestListByTestId(id);
        // return
        checkResourceNotNull(testVOList);
        return new ResponseResult(testVOList);
    }

    /**
     * getByUrl
     */
    @RequestMapping(value = "/get/{testId}", method = RequestMethod.GET)
    @Override
    public ResponseResult getByUrl(@PathVariable String testId) {
        // check
        checkRequestDataNotNull(testId);
        checkRequestDataFormatInt(testId);
        // execute
        int id = Integer.parseInt(testId);
        TestVO testVO = testServiceManager.getTestByTestId(id);
        // return
        checkResourceNotNull(testVO);
        return new ResponseResult(testVO);
    }

    /**
     * create
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult add(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = testServiceManager.createTest(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * updateWithEntity
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult updateWithEntity(TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = testServiceManager.updateTest(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * deleteByUrl
     */
    @RequestMapping(value = "/{testId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteByUrl(@PathVariable String testId) {
        // check
        checkRequestDataNotNull(testId);
        checkRequestDataFormatInt(testId);
        // execute
        int id = Integer.parseInt(testId);
        int result = testServiceManager.deleteTestById(id);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

}
