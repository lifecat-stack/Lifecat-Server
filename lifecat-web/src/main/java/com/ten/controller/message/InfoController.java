package com.ten.controller.message;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.message.MessageServiceManager;
import com.ten.service.service.message.InfoService;
import com.ten.vo.AlbumVO;
import com.ten.vo.InfoVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ten.utils.ControllerCheckUtil.*;

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
     * listById
     * <p>
     * 获取用户所有Info信息
     *
     * @param userId user_id
     * @return listById InfoVO
     */
    @RequestMapping(value = "/list/{userId}", method = RequestMethod.GET)
    @Override
    public ResponseResult listById(@PathVariable String userId) {
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

    @Override
    public ResponseResult list(InfoVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(InfoVO entity) {
        return null;
    }

    /**
     * create
     */
    @Override
    public ResponseResult post(InfoVO entity) {
        return null;
    }

    /**
     * update
     */
    @Override
    public ResponseResult put(InfoVO entity) {
        return null;
    }


    /**
     * deleteById
     * <p>
     * 删除用户Info信息
     *
     * @param infoId info_id
     * @return result
     */
    @RequestMapping(value = "/{infoId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteById(@PathVariable String infoId) {
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

    @Override
    public ResponseResult delete(InfoVO entity) {
        return null;
    }
}
