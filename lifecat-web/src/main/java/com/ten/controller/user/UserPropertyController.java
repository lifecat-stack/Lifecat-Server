package com.ten.controller.user;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.user.UserServiceManager;
import com.ten.vo.UserPropertyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ten.check.ControllerCheckUtil.*;

/**
 * user property
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/user/property")
public class UserPropertyController extends BaseController<UserPropertyVO, ResponseResult> {

    private final UserServiceManager userServiceManager;

    @Autowired
    public UserPropertyController(UserServiceManager userServiceManager) {
        this.userServiceManager = userServiceManager;
    }

    /**
     * all
     * <p>
     * 展示所有用户资料信息
     *
     * @return list UserPropertyVO
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @Override
    public ResponseResult all() {
        List<UserPropertyVO> userPropertyVOList = userServiceManager.getAllUserProperty();
        checkResourceNotNull(userPropertyVOList);
        return new ResponseResult(userPropertyVOList);
    }

    /**
     * getByUrl
     * <p>
     * 根据user_id获取用户资料信息
     *
     * @param userId user_id
     * @return userPropertyVO
     */
    @RequestMapping(value = "/get/{userId}", method = RequestMethod.GET)
    @Override
    public ResponseResult getByUrl(@PathVariable String userId) {
        // check
        checkRequestDataNotNull(userId);
        checkRequestDataFormatInt(userId);
        // execute
        int id = Integer.parseInt(userId);
        UserPropertyVO userPropertyVO = userServiceManager.getUserPropertyByUserId(id);
        // return
        checkResourceNotNull(userPropertyVO);
        return new ResponseResult(userPropertyVO);
    }

    /**
     * create
     * <p>
     * 上传用户资料信息 by user_id
     *
     * @param entity UserPropertyVO
     * @return new UserPropertyVO
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult add(@RequestBody UserPropertyVO entity) {
        // check
        checkRequestDataNotNull(entity);
        checkRequestDataNotNull(entity.getUserId());
        // execute
        UserPropertyVO newUserPropertyVO = userServiceManager.createUserPropertyAndReturn(entity);
        // return
        checkResourceNotNull(newUserPropertyVO);
        return new ResponseResult(newUserPropertyVO);
    }

    /**
     * updateWithEntity
     * <p>
     * 更新用户资料信息 by user_id
     *
     * @param entity UserPropertyVO
     * @return new UserPropertyVO
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult updateWithEntity(UserPropertyVO entity) {
        // check
        checkRequestDataNotNull(entity);
        checkRequestDataNotNull(entity.getUserId());
        // execute
        UserPropertyVO newUserPropertyVO = userServiceManager.updateUserPropertyAndReturn(entity);
        // return
        checkResourceNotNull(newUserPropertyVO);
        return new ResponseResult(newUserPropertyVO);
    }

    /**
     * deleteByUrl
     * <p>
     * 删除用户资料信息
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
        int result = userServiceManager.deleteUserPropertyByPrimaryKey(id);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

}
