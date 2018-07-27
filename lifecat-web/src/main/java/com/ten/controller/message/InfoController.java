package com.ten.controller.message;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.message.InfoService;
import com.ten.vo.InfoVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * info
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/info")
public class InfoController extends BaseController<InfoVO, ResponseResult> {

    @Autowired
    private InfoService infoService;

    /**
     * list
     */
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
     * post
     */
    @Override
    public ResponseResult post(InfoVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(InfoVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(InfoVO entity) {
        return null;
    }
}
