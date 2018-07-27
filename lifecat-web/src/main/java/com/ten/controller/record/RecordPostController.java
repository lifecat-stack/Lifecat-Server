package com.ten.controller.record;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.record.RecordPostService;
import com.ten.vo.PostVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * record post
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/record/post")
public class RecordPostController extends BaseController<PostVO, ResponseResult> {

    @Autowired
    private RecordPostService recordPostService;

    /**
     * list
     */
    @Override
    public ResponseResult list(PostVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(PostVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(PostVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(PostVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(PostVO entity) {
        return null;
    }
}
