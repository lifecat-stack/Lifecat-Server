package com.ten.controller.message;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.message.MessageServiceManager;
import com.ten.vo.InfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ten.check.ControllerCheckUtil.*;

/**
 * info
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/info")
public class InfoController extends BaseController<InfoVO, ResponseResult> {

    private final MessageServiceManager messageServiceManager;

    @Autowired
    public InfoController(MessageServiceManager messageServiceManager) {
        this.messageServiceManager = messageServiceManager;
    }


    /**
     * listByUrl
     * <p>
     * 获取用户所有Info信息
     *
     * @param userId user_id
     * @return listByUrl InfoVO
     */
    @RequestMapping(value = "/list/{userId}", method = RequestMethod.GET)
    @Override
    public ResponseResult listByUrl(@PathVariable String userId) {
        // check
        checkRequestDataNotNull(userId);
        checkRequestDataFormatInt(userId);
        // execute
        int id = Integer.parseInt(userId);
        List<InfoVO> infoVOList = messageServiceManager.getInfoListByUserId(id);
        // return
        checkResourceNotNull(infoVOList);
        return new ResponseResult(infoVOList);
    }

    /**
     * create
     */
    @Override
    public ResponseResult add(InfoVO entity) {
        return null;
    }

    /**
     * updateWithEntity
     */
    @Override
    public ResponseResult updateWithEntity(InfoVO entity) {
        return null;
    }


    /**
     * deleteByUrl
     * <p>
     * 删除用户Info信息
     *
     * @param infoId info_id
     * @return result
     */
    @RequestMapping(value = "/{infoId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteByUrl(@PathVariable String infoId) {
        // check
        checkRequestDataNotNull(infoId);
        checkRequestDataFormatInt(infoId);
        // execute
        int id = Integer.parseInt(infoId);
        int result = messageServiceManager.deleteInfoByPrimaryKey(id);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }
}
