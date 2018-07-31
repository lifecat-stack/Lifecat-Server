package com.ten.controller.user;


import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.user.UserServiceManager;
import com.ten.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ten.utils.ControllerCheckUtil.*;
/**
 * user
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<UserVO, ResponseResult> {


    @Autowired
    private UserServiceManager userServiceManager;
    /**
     * listById
     */
    @Override
    public ResponseResult list(UserVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(UserVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(UserVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(UserVO entity) {
        return null;
    }

    /**
     * deleteById
     */
    @Override
    public ResponseResult delete(UserVO entity) {
        return null;
    }
}
