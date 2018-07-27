package com.ten.controller.message;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.message.LogService;
import com.ten.vo.LogVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * log
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/log")
public class LogController extends BaseController<LogVO, ResponseResult> {

    @Autowired
    private LogService logService;

    /**
     * list
     */
    @Override
    public ResponseResult list(LogVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(LogVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(LogVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(LogVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(LogVO entity) {
        return null;
    }
}
