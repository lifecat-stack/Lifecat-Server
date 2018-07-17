package com.kevinten.wechat.controller;

import com.kevinten.wechat.dto.Result;
import com.kevinten.wechat.dto.UserDTO;
import com.kevinten.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

   /**
     * 获取所有user信息
     */
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Result<List<UserDTO>> getUserList() {
        System.out.println("user list request");
        return userService.getUserList();
    }


}
