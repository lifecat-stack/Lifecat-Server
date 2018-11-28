package com.ten.lifecat.server.controller.dynamic;

import com.ten.lifecat.server.controller.BaseController;
import com.ten.lifecat.server.dto.ResponseCode;
import com.ten.lifecat.server.dto.ResultModel;
import com.ten.lifecat.server.entity.Dynamic;
import com.ten.lifecat.server.service.DynamicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户个人动态
 */
@RestController
@RequestMapping(value = "/dynamic")
public class UserDynamicController extends BaseController<Dynamic> {
    private static final Logger logger = LoggerFactory.getLogger(UserDynamicController.class);

    private final DynamicService dynamicService;

    @Autowired
    public UserDynamicController(DynamicService dynamicService) {
        this.dynamicService = dynamicService;
    }

    @Override
    public ResultModel get(Dynamic dynamic) {
        dynamic.setIsDeleted(0);
        List<Dynamic> dynamicList = dynamicService.select(dynamic);
        return new ResultModel(ResponseCode.OK, dynamicList);
    }

    @Override
    public ResultModel post(Dynamic dynamic) {
        return null;
    }

    @Override
    public ResultModel update(Dynamic dynamic) {
        return null;
    }

    @Override
    public ResultModel delete(Dynamic dynamic) {
        return null;
    }
}
