package com.ten.controller;

import com.ten.dto.ResponseResult;
import com.ten.service.service.TestService;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ten.utils.ControllerCheckUtil.*;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController<TestVO, ResponseResult> {

    @Autowired
    private TestService testService;

    /**
     * list
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @Override
    public ResponseResult list(@PathVariable String testId) {
        // check
        checkRequestDataNotNull(testId);
        checkRequestDataFormatInt(testId);
        // execute
        int id = Integer.parseInt(testId);
        TestVO testVO = new TestVO();
        testVO.setTestId(id);
        List<TestVO> testVOList = testService.list(testVO);
        // return
        checkResourceNotNull(testVOList);
        return new ResponseResult(testVOList);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @Override
    public ResponseResult list(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        List<TestVO> testVOList = testService.list(entity);
        // return
        checkResourceNotNull(testVOList);
        return new ResponseResult(testVOList);
    }

    /**
     * get
     */
    @RequestMapping(value = "/get/{testId}", method = RequestMethod.GET)
    @Override
    public ResponseResult get(@PathVariable String testId) {
        // check
        checkRequestDataNotNull(testId);
        checkRequestDataFormatInt(testId);
        // execute
        TestVO testVO = new TestVO();
        int id = Integer.parseInt(testId);
        testVO.setTestId(id);
        TestVO test = testService.get(testVO);
        // return
        checkResourceNotNull(test, "test not found where :" + test.toString());
        return new ResponseResult(test);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @Override
    public ResponseResult get(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        TestVO testVO = testService.get(entity);
        // return
        checkResourceNotNull(testVO, "test not found where :" + entity.toString());
        return new ResponseResult(testVO);
    }

    /**
     * post
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = testService.post(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * put
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = testService.put(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * delete by test_id
     */
    @RequestMapping(value = "/{testId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult delete(@PathVariable String testId) {
        // check
        checkRequestDataNotNull(testId);
        checkRequestDataFormatInt(testId);
        // execute
        TestVO testVO = new TestVO();
        int id = Integer.parseInt(testId);
        testVO.setTestId(id);
        int result = testService.delete(testVO);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @Override
    public ResponseResult delete(@RequestBody TestVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        TestVO testVO = new TestVO();
        int id = entity.getTestId();
        testVO.setTestId(id);
        int result = testService.delete(testVO);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }
}
