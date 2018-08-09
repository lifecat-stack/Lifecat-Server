package com.ten.controller.authorization;

import com.ten.vo.UserAccountVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.ten.check.ControllerCheckUtil.*;

/**
 * authorization controller
 *
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/verify")
public class AuthorizationController {

    /**
     * login
     *
     * @param userAccountVO UserAccountVO
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody UserAccountVO userAccountVO) {
        // check
        checkRequestDataNotNull(userAccountVO);
        String username = userAccountVO.getUserAccountName();
        String password = userAccountVO.getUserAccountPassword();
        checkRequestDataNotNull(username);
        checkRequestDataNotNull(password);
        // verify
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return "home";
        } catch (Exception e) {
            return "redirect:/index.html";
        }
    }
}
