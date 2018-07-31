package com.ten.controller.record;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.record.RecordServiceManager;
import com.ten.vo.AlbumVO;
import com.ten.vo.RecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ten.utils.ControllerCheckUtil.*;

/**
 * record
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/record")
public class RecordController extends BaseController<RecordVO, ResponseResult> {

    @Autowired
    private RecordServiceManager recordServiceManager;

    /**
     * listById
     * <p>
     * 获取用户所有Record信息
     *
     * @param userId user_id
     * @return list RecordVO
     */
    @RequestMapping(value = "/list/{userId}", method = RequestMethod.GET)
    @Override
    public ResponseResult listById(@PathVariable String userId) {
        // check
        checkRequestDataNotNull(userId);
        checkRequestDataFormatInt(userId);
        // execute
        int id = Integer.parseInt(userId);
        List<RecordVO> recordVOList = recordServiceManager.getUserRecordListByUserId(id);
        // return
        checkResourceNotNull(recordVOList);
        return new ResponseResult(recordVOList);
    }

    @Override
    public ResponseResult list(RecordVO entity) {
        return null;
    }

    /**
     * get
     * <p>
     * 获取某条Record信息
     *
     * @param entity RecordVO
     * @return RecordVO
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @Override
    public ResponseResult get(@PathVariable RecordVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        RecordVO recordVO = recordServiceManager.getRecordByEntity(entity);
        // return
        checkResourceNotNull(recordVO);
        return new ResponseResult(recordVO);
    }

    /**
     * create
     * <p>
     * 创建新的Record信息
     *
     * @param entity RecordVO
     * @return result
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody RecordVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = recordServiceManager.createRecord(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * update
     * <p>
     * 更新某条Record
     *
     * @param entity RecordVO
     * @return result
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody RecordVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = recordServiceManager.updateRecord(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * deleteById
     * <p>
     * 删除某条Record
     *
     * @param recordId record_id
     * @return result
     */
    @RequestMapping(value = "/{recordId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteById(@PathVariable String recordId) {
        // check
        checkRequestDataNotNull(recordId);
        checkRequestDataFormatInt(recordId);
        // execute
        int id = Integer.parseInt(recordId);
        int result = recordServiceManager.deleteRecordByPrimaryKey(id);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    @Override
    public ResponseResult delete(RecordVO entity) {
        return null;
    }
}
