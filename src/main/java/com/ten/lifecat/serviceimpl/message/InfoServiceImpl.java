package com.ten.lifecat.serviceimpl.message;

import com.ten.lifecat.entity.entity.InfoDO;
import com.ten.lifecat.service.message.InfoService;
import com.ten.lifecat.serviceimpl.BaseServiceImpl;
import com.ten.lifecat.entity.vo.InfoVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * info service
 *
 * @author Administrator
 * @table c_info
 */
@Service
public class InfoServiceImpl extends BaseServiceImpl<InfoVO, InfoDO> implements InfoService {

    @Override
    public List<InfoVO> all() {
        return null;
    }

    @Override
    public List<InfoVO> list(InfoVO entity) {
        return null;
    }

    @Override
    public InfoVO get(InfoVO entity) {
        return null;
    }

    @Override
    public int create(InfoVO entity) {
        return 0;
    }

    @Override
    public int update(InfoVO entity) {
        return 0;
    }

    @Override
    public int delete(InfoVO entity) {
        return 0;
    }
}
