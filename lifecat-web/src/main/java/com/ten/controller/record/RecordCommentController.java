package com.ten.controller.record;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.record.RecordCommentService;
import com.ten.vo.RecordCommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * record comment
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/record/comment")
public class RecordCommentController extends BaseController<RecordCommentVO, ResponseResult> {

    @Autowired
    private RecordCommentService recordCommentService;

    /**
     * list
     */
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
     */
    @Override
    public ResponseResult post(RecordCommentVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(RecordCommentVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(RecordCommentVO entity) {
        return null;
    }
}
