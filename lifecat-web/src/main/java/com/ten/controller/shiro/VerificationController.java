package com.ten.controller.shiro;

import com.ten.jms.AlertService;
import com.ten.service.service.shiro.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * shiro controller
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/verify")
public class VerificationController {

    /**
     * admin login
     */
    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public String adminLogin() {
        System.out.println("admin login verification");
        String adminName = "admin";
        String adminPassword = "1234";
        // verify
        UsernamePasswordToken token = new UsernamePasswordToken(adminName, adminPassword);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            // success: send message
//            AlertMessage message = new AlertMessage("admin login success");
//            userAlertService.sendLoginAlert(message);
            return "home";
        } catch (Exception e) {
            return "redirect:/index.html";
        }
    }

}
