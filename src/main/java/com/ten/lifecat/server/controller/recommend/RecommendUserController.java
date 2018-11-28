package com.ten.lifecat.server.controller.recommend;

import com.ten.lifecat.server.controller.BaseController;
import com.ten.lifecat.server.dto.ResponseCode;
import com.ten.lifecat.server.dto.ResultModel;
import com.ten.lifecat.server.entity.RecommendUser;
import com.ten.lifecat.server.entity.User;
import com.ten.lifecat.server.service.RecommendUserService;
import com.ten.lifecat.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 推荐好友
 */
@RestController
@RequestMapping(value = "/recommend/user")
public class RecommendUserController extends BaseController<User> {
    private static final Logger logger = LoggerFactory.getLogger(RecommendUserController.class);

    private final UserService userService;
    private final RecommendUserService recommendUserService;

    @Autowired
    public RecommendUserController(RecommendUserService recommendUserService, UserService userService) {
        this.recommendUserService = recommendUserService;
        this.userService = userService;
    }

    @Override
    public ResultModel get(User user) {
        RecommendUser entity = new RecommendUser();
        List<RecommendUser> recommendUserList = recommendUserService.select(entity);

        List<User> result = new ArrayList<>(8);

        for (RecommendUser recommendUser : recommendUserList) {
            String userId = recommendUser.getUserId();
            User pojo = new User();
            pojo.setUserId(userId);
            pojo.setIsDeleted(0);

            List<User> users = userService.select(pojo);
            if (users.size() > 0) {
                result.add(users.get(0));
            }
        }

        if (result.size() < 1) {
            return new ResultModel(ResponseCode.EMPTY_RESOURCE);
        }
        return new ResultModel(ResponseCode.OK, result);
    }

    @Override
    public ResultModel post(User user) {
        return null;
    }

    @Override
    public ResultModel update(User user) {
        return null;
    }

    @Override
    public ResultModel delete(User user) {
        return null;
    }
}
