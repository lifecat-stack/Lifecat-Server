package com.ten.service.serviceimpl.record;

import com.ten.entity.AlbumDO;
import com.ten.entity.RecordDO;
import com.ten.service.service.image.AlbumService;
import com.ten.service.service.record.RecordService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.AlbumVO;
import com.ten.vo.RecordVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl extends BaseServiceImpl<RecordVO, RecordDO> implements RecordService {
    @Override
    public List<RecordVO> list(RecordDO entity) {
        return null;
    }

    @Override
    public RecordVO get(RecordDO entity) {
        return null;
    }

    @Override
    public int post(RecordDO entity) {
        return 0;
    }

    @Override
    public int put(RecordDO entity) {
        return 0;
    }

    @Override
    public int delete(RecordDO entity) {
        return 0;
    }
}
