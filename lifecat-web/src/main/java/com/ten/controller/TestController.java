package com.ten.controller;

import com.ten.dto.ResponseResult;
import com.ten.manager.TestServiceManager;
import com.ten.service.service.TestService;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ten.utils.ControllerCheckUtil.*;

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
        List<TestVO> testVOList = testServiceManager.getAllTest();
        checkResourceNotNull(testVOList);
        return new ResponseResult(testVOList);
    }

    /**
     * listById
     */
    @RequestMapping(value = "/list/{testId}", method = RequestMethod.GET)
    @Override
    public ResponseResult listById(@PathVariable String testId) {
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
     * list
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @Override
    public ResponseResult list(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        List<TestVO> testVOList = testServiceManager.getTestListByEntity(entity);
        // return
        checkResourceNotNull(testVOList);
        return new ResponseResult(testVOList);
    }

    /**
     * getById
     */
    @RequestMapping(value = "/get/{testId}", method = RequestMethod.GET)
    @Override
    public ResponseResult getById(@PathVariable String testId) {
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
     * get
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @Override
    public ResponseResult get(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        TestVO testVO = testServiceManager.getTestByEntity(entity);
        // return
        checkResourceNotNull(testVO);
        return new ResponseResult(testVO);
    }

    /**
     * create
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = testServiceManager.createTest(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * update
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = testServiceManager.updateTest(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * deleteById
     */
    @RequestMapping(value = "/{testId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteById(@PathVariable String testId) {
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

    /**
     * delete
     */
    @RequestMapping(method = RequestMethod.DELETE)
    @Override
    public ResponseResult delete(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = testServiceManager.deleteTestByEntity(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }
}
