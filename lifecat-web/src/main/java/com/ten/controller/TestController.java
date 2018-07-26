package com.ten.controller;

import com.ten.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return testService.test("testControllerMsg");
    }
}
