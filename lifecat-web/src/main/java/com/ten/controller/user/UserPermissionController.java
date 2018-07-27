package com.ten.controller.user;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.user.UserPermissionService;
import com.ten.vo.PostVO;
import com.ten.vo.UserPermissionVO;
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
public class UserPermissionController extends BaseController<UserPermissionVO, ResponseResult> {

    @Autowired
    private UserPermissionService userPermissionService;

    /**
     * list
     */
    @Override
    public ResponseResult list(UserPermissionVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(UserPermissionVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(UserPermissionVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(UserPermissionVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(UserPermissionVO entity) {
        return null;
    }
}
