package com.ten.controller.wxcontroller;

import com.ten.dto.ResponseResult;
import com.ten.manager.user.UserServiceManager;
import com.ten.service.service.authorization.AuthorizationService;
import com.ten.vo.UserAccountVO;
import com.ten.vo.UserPropertyVO;
import com.ten.vo.constant.SEX;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import static com.ten.check.ControllerCheckUtil.*;

/**
 * wechat controller
 * <p>
 * PASS
 * except 'login'
 *
 * @author wshten
 * @date 2018/8/2 0002
 */
@RestController
@RequestMapping(value = "/wx/user")
public class WxUserController {

    private static Logger logger = LoggerFactory.getLogger(WxUserController.class);

    private final UserServiceManager userServiceManager;
    private final AuthorizationService authorizationService;

    @Autowired
    public WxUserController(UserServiceManager userServiceManager, AuthorizationService authorizationService) {
        this.userServiceManager = userServiceManager;
        this.authorizationService = authorizationService;
    }

    /**
     * login verify
     * <p>
     * 登录认证
     *
     * @param userAccountVO userAccountName + userAccountPassword
     * @return ResponseResult
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseResult login(@RequestBody UserAccountVO userAccountVO) {
        /* check */
        checkRequestDataNotNull(userAccountVO);
        // user account name
        String username = userAccountVO.getUserAccountName();
        // user account password
        String password = userAccountVO.getUserAccountPassword();
        checkRequestDataNotNull(username, password);
        /* execute */
        boolean success = authorizationService.verifyLogin(username, password);
        if (!success) {
            return new ResponseResult(400, "user login error");
        }
        return new ResponseResult();
    }

    /**
     * register
     * <p>
     * 注册
     *
     * @param userAccountVO userAccountName + userAccountPassword
     * @return ResponseResult
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseResult register(@RequestBody UserAccountVO userAccountVO) {
        /* check */
        checkRequestDataNotNull(userAccountVO);
        // user account name
        String username = userAccountVO.getUserAccountName();
        // user account password
        String password = userAccountVO.getUserAccountPassword();
        checkRequestDataNotNull(username, password);
        /* execute */
        UserAccountVO newUserAccount = userServiceManager.createUserAccountAndReturn(userAccountVO);
        /* return */
        checkRequestDataNotNull(newUserAccount);
        return new ResponseResult(newUserAccount);
    }

    /**
     * get
     * <p>
     * 获取用户资料数据
     *
     * @param userAccountName userAccountName (unique key)
     * @return ResponseResult (UserPropertyVO)
     */
    @RequestMapping(value = "/{userAccountName}", method = RequestMethod.GET)
    public ResponseResult getUserProperty(@PathVariable String userAccountName) {
        /* check */
        checkRequestDataNotNull(userAccountName);
        /* execute */
        UserPropertyVO entity = new UserPropertyVO();
        entity.setUserAccountName(userAccountName);
        UserPropertyVO userPropertyVO = userServiceManager.getUserPropertyByEntity(entity);
        /* return */
        checkResourceNotNull(userPropertyVO);
        return new ResponseResult(userPropertyVO);
    }

    /**
     * create
     * <p>
     * 添加用户资料
     *
     * @param userPropertyVO primary key(user_id) must be null
     * @return ResponseResult (UserPropertyVO)
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseResult addUserProperty(@RequestBody UserPropertyVO userPropertyVO) {
        /* check */
        checkRequestDataNotNull(userPropertyVO);
        /* execute */
        UserPropertyVO newUserProperty = userServiceManager.createUserPropertyAndReturn(userPropertyVO);
        /* return */
        checkRequestDataNotNull(newUserProperty);
        return new ResponseResult(newUserProperty);
    }

    /**
     * updateWithEntity
     * <p>
     * 修改用户资料
     *
     * @param userPropertyVO key(user_id) required
     * @return ResponseResult (UserPropertyVO)
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseResult updateUserProperty(UserPropertyVO userPropertyVO) {
        /* check */
        checkRequestDataNotNull(userPropertyVO);
        checkResourceNotNull(userPropertyVO.getUserId());
        /* execute */
        UserPropertyVO newUserProperty = userServiceManager.updateUserPropertyAndReturn(userPropertyVO);
        /* return */
        checkRequestDataNotNull(newUserProperty);
        return new ResponseResult(newUserProperty);
    }
}
