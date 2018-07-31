package com.ten.manager.message;

import com.ten.service.service.message.InfoService;
import com.ten.service.service.message.LogService;
import com.ten.vo.InfoVO;
import com.ten.vo.LogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceManagerImpl implements MessageServiceManager {

    private final InfoService infoService;
    private final LogService logService;

    @Autowired
    public MessageServiceManagerImpl(InfoService infoService, LogService logService) {
        this.infoService = infoService;
        this.logService = logService;
    }

    @Override
    public List<InfoVO> getInfoListByUserId(Integer userId) {
        InfoVO entity = new InfoVO();
        entity.setUserId(userId);
        return infoService.list(entity);
    }

    @Override
    public int deleteInfoByPrimaryKey(Integer infoId) {
        InfoVO entity = new InfoVO();
        entity.setInfoId(infoId);
        return infoService.delete(entity);
    }

    @Override
    public List<LogVO> getAllLogs() {
        return logService.all();
    }
}
