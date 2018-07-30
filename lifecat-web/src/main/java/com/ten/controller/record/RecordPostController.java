package com.ten.controller.record;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.record.RecordPostService;
import com.ten.vo.RecordPostVO;
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
public class RecordPostController extends BaseController<RecordPostVO, ResponseResult> {

    @Autowired
    private RecordPostService recordPostService;

    /**
     * list
     */
    @Override
    public ResponseResult list(RecordPostVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(RecordPostVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(RecordPostVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(RecordPostVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(RecordPostVO entity) {
        return null;
    }
}
