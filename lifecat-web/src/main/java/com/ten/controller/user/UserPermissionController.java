package com.ten.controller.user;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user permission
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user/permission")
public class UserPermissionController extends BaseController<UserAuthorizationVO, ResponseResult> {

    @Autowired
    private UserPermissionService userPermissionService;

    /**
     * list
     */
    @Override
    public ResponseResult list(UserAuthorizationVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(UserAuthorizationVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(UserAuthorizationVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(UserAuthorizationVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(UserAuthorizationVO entity) {
        return null;
    }
}
