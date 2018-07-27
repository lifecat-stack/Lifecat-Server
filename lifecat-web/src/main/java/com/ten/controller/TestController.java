package com.ten.controller;

import com.ten.dto.ResponseResult;
import com.ten.entity.TestDO;
import com.ten.service.service.TestService;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController<TestVO, ResponseResult> {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/list/{testId}", method = RequestMethod.GET)
    @Override
    public ResponseResult list(@PathVariable String id) {
        TestVO testVO = new TestVO();
        return this.list(testVO);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @Override
    public ResponseResult get(String id) {
        return super.get(id);
    }

    @Override
    public ResponseResult list(@RequestBody TestVO entity) {
        return null;
    }

    @Override
    public ResponseResult get(@RequestBody TestVO entity) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody TestVO entity) {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody TestVO entity) {
        return null;
    }

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
