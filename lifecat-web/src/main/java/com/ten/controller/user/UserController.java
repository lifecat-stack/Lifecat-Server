package com.ten.controller.user;


import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.user.UserService;
import com.ten.vo.PostVO;
import com.ten.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ten.utils.ControllerCheckUtil.checkResourceNotNull;

/**
 * user
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<UserVO, ResponseResult> {

    @Autowired
    private UserService userService;

    @Override
    public ResponseResult list(UserVO entity) {
        return null;
    }

    @Override
    public ResponseResult get(UserVO entity) {
        return null;
    }

    @Override
    public ResponseResult post(UserVO entity) {
        return null;
    }

    @Override
    public ResponseResult put(UserVO entity) {
        return null;
    }

    @Override
    public ResponseResult delete(UserVO entity) {
        return null;
    }
}
