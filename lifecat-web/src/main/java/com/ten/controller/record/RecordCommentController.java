package com.ten.controller.record;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.record.RecordServiceManager;
import com.ten.service.service.record.RecordCommentService;
import com.ten.vo.RecordCommentVO;
import com.ten.vo.RecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.geom.GeneralPath;
import java.util.List;

import static com.ten.utils.ControllerCheckUtil.*;

/**
 * record comment
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/record/comment")
public class RecordCommentController extends BaseController<RecordCommentVO, ResponseResult> {

    @Autowired
    private RecordServiceManager recordServiceManager;

    /**
     * listById
     */
    @Override
    public ResponseResult listById(@PathVariable String recordId) {
        return null;
    }

    @Override
    public ResponseResult list(RecordCommentVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(RecordCommentVO entity) {
        return null;
    }

    /**
     * post
     * <p>
     * 创建新的Comment
     *
     * @param entity RecordCommentVO
     * @return result
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody RecordCommentVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = recordServiceManager.createRecordComment(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * put
     * <p>
     * 更新某条Comment信息
     *
     * @param entity RecordCommentVO
     * @return result
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody RecordCommentVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = recordServiceManager.updateRecordComment(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * deleteById
     * <p>
     * 删除某条Comment信息
     *
     * @param commentId comment_id
     * @return result
     */
    @RequestMapping(value = "/{commentId}")
    @Override
    public ResponseResult deleteById(String commentId) {
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

    @Override
    public ResponseResult delete(RecordCommentVO entity) {
        return null;
    }
}
