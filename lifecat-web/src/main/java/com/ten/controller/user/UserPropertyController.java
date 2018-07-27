package com.ten.controller.user;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.user.UserPropertyService;
import com.ten.vo.PostVO;
import com.ten.vo.UserPropertyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user property
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user/property")
public class UserPropertyController extends BaseController<UserPropertyVO, ResponseResult> {

    @Autowired
    private UserPropertyService userPropertyService;

    /**
     * list
     */
    @Override
    public ResponseResult list(UserPropertyVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(UserPropertyVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(UserPropertyVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(UserPropertyVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(UserPropertyVO entity) {
        return null;
    }
}
