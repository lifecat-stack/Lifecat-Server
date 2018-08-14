package com.ten.controller.message;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.message.MessageServiceManager;
import com.ten.vo.LogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.ten.check.ControllerCheckUtil.*;

/**
 * log
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/log")
public class LogController extends BaseController<LogVO, ResponseResult> {

    private final MessageServiceManager messageServiceManager;

    @Autowired
    public LogController(MessageServiceManager messageServiceManager) {
        this.messageServiceManager = messageServiceManager;
    }

    /**
     * all
     * <p>
     * 获取所有Log信息
     *
     * @return all log
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @Override
    public ResponseResult all() {
        List<LogVO> infoVOList = messageServiceManager.getAllLogs();
        checkResourceNotNull(infoVOList);
        return new ResponseResult(infoVOList);
    }

    /**
     * create
     */
    @Override
    public ResponseResult add(LogVO entity) {
        return null;
    }

    /**
     * updateWithEntity
     */
    @Override
    public ResponseResult updateWithEntity(LogVO entity) {
        return null;
    }

}
