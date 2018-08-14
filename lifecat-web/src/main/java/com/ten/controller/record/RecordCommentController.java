package com.ten.controller.record;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.record.RecordServiceManager;
import com.ten.vo.RecordCommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ten.check.ControllerCheckUtil.*;

/**
 * record comment
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/record/comment")
public class RecordCommentController extends BaseController<RecordCommentVO, ResponseResult> {

    private final RecordServiceManager recordServiceManager;

    @Autowired
    public RecordCommentController(RecordServiceManager recordServiceManager) {
        this.recordServiceManager = recordServiceManager;
    }

    /**
     * listByUrl
     */
    @Override
    public ResponseResult listByUrl(@PathVariable String recordId) {
        // TODO
        return null;
    }

    /**
     * create
     * <p>
     * 创建新的Comment
     *
     * @param entity RecordCommentVO
     * @return result
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult add(@RequestBody RecordCommentVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = recordServiceManager.createRecordComment(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * updateWithEntity
     * <p>
     * 更新某条Comment信息
     *
     * @param entity RecordCommentVO
     * @return result
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult updateWithEntity(@RequestBody RecordCommentVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = recordServiceManager.updateRecordComment(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * deleteByUrl
     * <p>
     * 删除某条Comment信息
     *
     * @param commentId comment_id
     * @return result
     */
    @RequestMapping(value = "/{commentId}")
    @Override
    public ResponseResult deleteByUrl(String commentId) {
        // check
        checkRequestDataNotNull(commentId);
        checkRequestDataFormatInt(commentId);
        // execute
        int id = Integer.parseInt(commentId);
        int result = recordServiceManager.deleteRecordCommentByPrimaryKey(id);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

}
