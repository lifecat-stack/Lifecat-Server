package com.ten.lifecat.server.controller.advertise;

import com.ten.lifecat.server.controller.BaseController;
import com.ten.lifecat.server.dto.ResponseCode;
import com.ten.lifecat.server.dto.ResultModel;
import com.ten.lifecat.server.entity.Advertise;
import com.ten.lifecat.server.service.AdvertiseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 广告推送
 */
@RestController
@RequestMapping(value = "/advertise")
public class AdvertiseController extends BaseController<Advertise> {
    private static final Logger logger = LoggerFactory.getLogger(AdvertiseController.class);

    private final AdvertiseService advertiseService;

    @Autowired
    public AdvertiseController(AdvertiseService advertiseService) {
        this.advertiseService = advertiseService;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public ResultModel get(Advertise advertise) {
        List<Advertise> advertiseList = advertiseService.select(advertise);
        if (advertiseList.size() < 1) {
            return new ResultModel(ResponseCode.EMPTY_RESOURCE);
        }
        return new ResultModel(ResponseCode.OK, advertiseList);
    }

    @Override
    public ResultModel post(Advertise advertise) {
        return null;
    }

    @Override
    public ResultModel update(Advertise advertise) {
        return null;
    }

    @Override
    public ResultModel delete(Advertise advertise) {
        return null;
    }
}
