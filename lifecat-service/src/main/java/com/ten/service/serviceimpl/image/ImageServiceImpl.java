package com.ten.service.serviceimpl.image;

import com.ten.entity.ImageDO;
import com.ten.service.service.image.ImageService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.ImageVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl extends BaseServiceImpl<ImageVO, ImageDO> implements ImageService {
    @Override
    public List<ImageVO> list(ImageDO entity) {
        return null;
    }

    @Override
    public ImageVO get(ImageDO entity) {
        return null;
    }

    @Override
    public int post(ImageDO entity) {
        return 0;
    }

    @Override
    public int put(ImageDO entity) {
        return 0;
    }

    @Override
    public int delete(ImageDO entity) {
        return 0;
    }
}
