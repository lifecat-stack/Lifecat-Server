package com.ten.lifecat.server.controller.recommend;

import com.ten.lifecat.server.controller.BaseController;
import com.ten.lifecat.server.dto.ResponseCode;
import com.ten.lifecat.server.dto.ResultModel;
import com.ten.lifecat.server.entity.Dynamic;
import com.ten.lifecat.server.entity.RecommendDynamic;
import com.ten.lifecat.server.service.DynamicService;
import com.ten.lifecat.server.service.RecommendDynamicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 推荐动态
 */
@RestController
@RequestMapping(value = "/recommend/dynamic")
public class RecommendDynamicController extends BaseController<Dynamic> {
    private static final Logger logger = LoggerFactory.getLogger(RecommendDynamicController.class);

    private final DynamicService dynamicService;
    private final RecommendDynamicService recommendDynamicService;

    @Autowired
    public RecommendDynamicController(DynamicService dynamicService, RecommendDynamicService recommendDynamicService) {
        this.dynamicService = dynamicService;
        this.recommendDynamicService = recommendDynamicService;
    }

    @Override
    public ResultModel get(Dynamic dynamic) {
        RecommendDynamic entity = new RecommendDynamic();
        List<RecommendDynamic> recommendDynamicList = recommendDynamicService.select(entity);

        List<Dynamic> result = new ArrayList<>(8);

        for (RecommendDynamic recommendDynamic : recommendDynamicList) {
            String dynamicId = recommendDynamic.getDynamicId();
            Dynamic pojo = new Dynamic();
            pojo.setDynamicId(dynamicId);
            pojo.setIsDeleted(0);

            List<Dynamic> dynamics = dynamicService.select(pojo);
            if (dynamics.size() > 0) {
                result.add(dynamics.get(0));
            }
        }

        if (result.size() < 1) {
            return new ResultModel(ResponseCode.EMPTY_RESOURCE);
        }
        return new ResultModel(ResponseCode.OK, result);
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
