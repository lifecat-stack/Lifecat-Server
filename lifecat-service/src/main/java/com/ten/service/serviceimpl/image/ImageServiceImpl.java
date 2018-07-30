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
    public List<ImageVO> all() {
        return null;
    }

    @Override
    public List<ImageVO> list(ImageVO entity) {
        return null;
    }

    @Override
    public ImageVO get(ImageVO entity) {
        return null;
    }

    @Override
    public int post(ImageVO entity) {
        return 0;
    }

    @Override
    public int put(ImageVO entity) {
        return 0;
    }

    @Override
    public int delete(ImageVO entity) {
        return 0;
    }
}
