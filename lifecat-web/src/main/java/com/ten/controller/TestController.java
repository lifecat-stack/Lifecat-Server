package com.ten.controller;

import com.ten.entity.TestDO;
import com.ten.service.service.TestService;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/list")
    public List<TestVO> list(TestDO test) {
        return testService.list(test);
    }

    @RequestMapping(value = "/get/{testId}", method = RequestMethod.GET)
    public TestVO get(@PathVariable String testId) {
        System.out.println("test controller get");
        TestDO testDO = new TestDO();
        testDO.setTestId(Integer.valueOf(testId));
        return testService.get(testDO);
    }

    @RequestMapping("/put")
    public int update(TestDO test) {
        return testService.put(test);
    }

    @RequestMapping("/post")
    public int save(TestDO test) {
        return testService.post(test);
    }

    @RequestMapping("/delete")
    public int delete(TestDO test) {
        return testService.delete(test);
    }
}
