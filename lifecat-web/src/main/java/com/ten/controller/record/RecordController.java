package com.ten.controller.record;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.record.RecordService;
import com.ten.vo.RecordVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * record
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/record")
public class RecordController  extends BaseController<RecordVO, ResponseResult> {

    @Autowired
    private RecordService recordService;

    @Override
    public ResponseResult list(RecordVO entity) {
        return null;
    }

    @Override
    public ResponseResult get(RecordVO entity) {
        return null;
    }

    @Override
    public ResponseResult post(RecordVO entity) {
        return null;
    }

    @Override
    public ResponseResult put(RecordVO entity) {
        return null;
    }

    @Override
    public ResponseResult delete(RecordVO entity) {
        return null;
    }
}
