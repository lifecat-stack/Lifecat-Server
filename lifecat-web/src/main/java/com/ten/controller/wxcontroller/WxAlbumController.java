package com.ten.controller.wxcontroller;

import com.ten.dto.ResponseResult;
import com.ten.vo.UserAccountVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ten.utils.ControllerCheckUtil.checkRequestDataNotNull;

/**
 * wechat controller
 *
 * @author wshten
 * @date 2018/8/2 0002
 */
@RestController
@RequestMapping(value = "/wx/album")
public class WxAlbumController {

    private static Logger logger = LoggerFactory.getLogger(WxAlbumController.class);

    @RequestMapping(value = "/get/album")
    public ResponseResult getUserAlbum(@RequestBody UserAccountVO userAccountVO) {
        // check
        checkRequestDataNotNull(userAccountVO);
        // execute

        // return
        return new ResponseResult();
    }


    @RequestMapping(value = "/add/album")
    public ResponseResult addUserAlbum(@RequestBody UserAccountVO userAccountVO) {
        // check
        checkRequestDataNotNull(userAccountVO);
        // execute

        // return
        return new ResponseResult();
    }
}
