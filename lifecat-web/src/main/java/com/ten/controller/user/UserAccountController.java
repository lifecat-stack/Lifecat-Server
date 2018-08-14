package com.ten.controller.user;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.user.UserServiceManager;
import com.ten.vo.UserAccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ten.check.ControllerCheckUtil.checkExecuteResultSuccess;
import static com.ten.check.ControllerCheckUtil.checkRequestDataNotNull;
import static com.ten.check.ControllerCheckUtil.*;

/**
 * user account
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user/account")
public class UserAccountController extends BaseController<UserAccountVO, ResponseResult> {

    private final UserServiceManager userServiceManager;

    @Autowired
    public UserAccountController(UserServiceManager userServiceManager) {
        this.userServiceManager = userServiceManager;
    }

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
     * create
     * <p>
     * 用户注册
     *
     * @param entity UserAccountVO
     * @return new UserAccountVO
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult add(@RequestBody UserAccountVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        UserAccountVO newUserAccountVO = userServiceManager.createUserAccountAndReturn(entity);
        // return
        checkResourceNotNull(newUserAccountVO);
        return new ResponseResult(newUserAccountVO);
    }

    /**
     * updateWithEntity
     * <p>
     * 更新用户账号密码 by user_id
     *
     * @param entity UserAccountVO
     * @return new UserAccountVO
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult updateWithEntity(UserAccountVO entity) {
        // check
        checkRequestDataNotNull(entity);
        checkRequestDataNotNull(entity.getUserId());
        // execute
        UserAccountVO newUserAccountVO = userServiceManager.updateUserPasswordAndReturn(entity);
        // return
        checkResourceNotNull(newUserAccountVO);
        return new ResponseResult(newUserAccountVO);
    }

    /**
     * deleteByUrl
     * <p>
     * 删除用户
     *
     * @param userId user_Id
     * @return result
     */
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteByUrl(@PathVariable String userId) {
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

}
