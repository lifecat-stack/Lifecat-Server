package com.ten.controller.user;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.user.UserAccountService;
import com.ten.vo.UserAccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user account
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user/account")
public class UserAccountController extends BaseController<UserAccountVO, ResponseResult> {

    @Autowired
    private UserAccountService userAccountService;

    /**
     * list
     */
    @Override
    public ResponseResult list(UserAccountVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(UserAccountVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(UserAccountVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(UserAccountVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(UserAccountVO entity) {
        return null;
    }
}
