package com.ten.controller;

import com.ten.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

    private final UserService userServicel;

    @Autowired
    public HomeController(UserService userServicel) {
        this.userServicel = userServicel;
    }

    @ResponseBody
    @RequestMapping("home")
    public String home() {
        UserDO userDO = userServicel.readUserByName("a");
        return userDO.getUserName();
    }

}