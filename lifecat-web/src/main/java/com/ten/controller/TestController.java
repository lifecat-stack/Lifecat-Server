package com.ten.controller;

import com.ten.dto.ResponseResult;
import com.ten.service.service.TestService;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

import static com.ten.utils.ControllerCheckUtil.checkExecuteResultSuccess;
import static com.ten.utils.ControllerCheckUtil.checkRequestDataNotNull;
import static com.ten.utils.ControllerCheckUtil.checkRequestDataFormatInt;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController<TestVO, ResponseResult> {

    @Autowired
    private TestService testService;

    /**
     * list
     */
    @RequestMapping(value = "/list/{testId}", method = RequestMethod.GET)
    @Override
    public ResponseResult list(@PathVariable String testId) {
        // check
        checkRequestDataNotNull(testId);
        checkRequestDataFormatInt(testId);
        // execute
        int id = Integer.parseInt(testId);
        TestVO testVO = new TestVO();
        testVO.setTestId(id);
        // return
        return this.list(testVO);
    }

    @Override
    public ResponseResult list(TestVO entity) {
        List testList = (List) testService.list(entity);
        return new ResponseResult(testList);
    }

    /**
     * get
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @Override
    public ResponseResult get(String id) {
        return super.get(id);
    }

    @Override
    public ResponseResult get(@RequestBody TestVO entity) {
        return null;
    }

    /**
     * post
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody TestVO entity) {
        return null;
    }

    /**
     * put
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody TestVO entity) {
        return null;
    }

    /**
     * delete
     */
    @RequestMapping(method = RequestMethod.DELETE)
    @Override
    public ResponseResult delete(String id) {
        return super.delete(id);
    }

    @Override
    public ResponseResult delete(@RequestBody TestVO entity) {
        return null;
    }
}
