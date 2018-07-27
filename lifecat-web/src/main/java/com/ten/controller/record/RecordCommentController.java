package com.ten.controller.record;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.record.RecordCommentService;
import com.ten.vo.CommentVO;
import com.ten.vo.RecordVO;
import com.ten.vo.TestVO;
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
public class RecordCommentController extends BaseController<CommentVO, ResponseResult> {

    @Autowired
    private RecordCommentService recordCommentService;

    /**
     * list
     */
    @Override
    public ResponseResult list(CommentVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(CommentVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(CommentVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(CommentVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(CommentVO entity) {
        return null;
    }
}
