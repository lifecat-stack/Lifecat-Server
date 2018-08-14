package com.ten.controller.wxcontroller;

import com.ten.dto.ResponseResult;
import com.ten.vo.UserAccountVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.ten.check.ControllerCheckUtil.checkRequestDataNotNull;

/**
 * wechat controller
 * <p>
 * TODO
 *
 * @author wshten
 * @date 2018/8/2 0002
 */
@RestController
@RequestMapping(value = "/wx/record")
public class WxRecordController {

    private static Logger logger = LoggerFactory.getLogger(WxRecordController.class);

    @RequestMapping(method = RequestMethod.GET)
    public ResponseResult getUserRecord(@RequestBody UserAccountVO userAccountVO) {
        /* check */
        checkRequestDataNotNull(userAccountVO);
        // execute
        // TODO
        // return
        return new ResponseResult();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseResult addUserRecord(@RequestBody UserAccountVO userAccountVO) {
        /* check */
        checkRequestDataNotNull(userAccountVO);
        // execute
        // TODO
        // return
        return new ResponseResult();
    }
}
