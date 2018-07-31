package com.ten.controller.user;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.user.UserServiceManager;
import com.ten.vo.UserAccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ten.utils.ControllerCheckUtil.checkExecuteResultSuccess;
import static com.ten.utils.ControllerCheckUtil.checkRequestDataNotNull;
import static com.ten.utils.ControllerCheckUtil.*;

/**
 * user account
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user/account")
public class UserAccountController extends BaseController<UserAccountVO, ResponseResult> {

    @Autowired
    private UserServiceManager userServiceManager;

    /**
     * all
     * <p>
     * 展示所有用户账号信息
     *
     * @return list UserAccountVO
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @Override
    public ResponseResult all() {
        List<UserAccountVO> userAccountVOList = userServiceManager.getAllUserAccount();
        checkResourceNotNull(userAccountVOList);
        return new ResponseResult(userAccountVOList);
    }

    /**
     * listById
     */
    @Override
    public ResponseResult list(UserAccountVO entity) {
        return null;
    }

    /**
     * get
     * <p>
     * 搜索单个用户账号信息
     *
     * @param entity UserAccountVO
     * @return UserAccountVO
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @Override
    public ResponseResult get(@RequestBody UserAccountVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        UserAccountVO recordVO = userServiceManager.getUserAccountByEntity(entity);
        // return
        checkResourceNotNull(recordVO);
        return new ResponseResult(recordVO);
    }

    /**
     * create
     * <p>
     * 用户注册
     *
     * @param entity UserAccountVO
     * @return new UserAccountVO
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody UserAccountVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        UserAccountVO newUserAccountVO = userServiceManager.createUserAccountAndReturn(entity);
        // return
        checkResourceNotNull(newUserAccountVO);
        return new ResponseResult(newUserAccountVO);
    }

    /**
     * update
     * <p>
     * 更新用户密码
     *
     * @param entity UserAccountVO
     * @return new UserAccountVO
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody UserAccountVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        UserAccountVO newUserAccountVO = userServiceManager.updateUserPasswordAndReturn(entity);
        // return
        checkResourceNotNull(newUserAccountVO);
        return new ResponseResult(newUserAccountVO);
    }

    /**
     * deleteById
     * <p>
     * 删除用户
     *
     * @param userId user_Id
     * @return result
     */
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteById(@PathVariable String userId) {
        // check
        checkRequestDataNotNull(userId);
        checkRequestDataFormatInt(userId);
        // execute
        int id = Integer.parseInt(userId);
        int result = userServiceManager.deleteUserByPrimaryKey(id);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    @Override
    public ResponseResult delete(UserAccountVO entity) {
        return null;
    }
}
