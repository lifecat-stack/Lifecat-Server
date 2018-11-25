package com.ten.lifecat.serviceimpl.image;

import com.ten.lifecat.entity.entity.ImageDO;
import com.ten.lifecat.service.image.ImageService;
import com.ten.lifecat.serviceimpl.BaseServiceImpl;
import com.ten.lifecat.entity.vo.ImageVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.ten.lifecat.common.check.ServiceCheckUtil.*;

/**
 * image service
 *
 * @author Administrator
 * @table c_image
 */
@Service
public class ImageServiceImpl extends BaseServiceImpl<ImageVO, ImageDO> implements ImageService {

    /**
     * select all image
     */
    @Override
    public List<ImageVO> all() {
        // execute
        List<ImageDO> imageDOS = exeQueryAll();
        List<ImageVO> imageVOS = new ArrayList<>(imageDOS.size());
        // DO -> VO
        for (ImageDO imageDO : imageDOS) {
            ImageVO entity = new ImageVO(imageDO);
            imageVOS.add(entity);
        }
        // return
        return imageVOS;
    }

    /**
     * select image list
     * by image
     */
    @Override
    public List<ImageVO> list(ImageVO entity) {
        // check parameter
        checkNecessaryParameterNotNull(entity.getAlbumId());
        // VO -> DO
        ImageDO imageDO = new ImageDO(entity);
        // execute
        List<ImageDO> imageDOS = exeQueryList(imageDO);
        // DO -> VO
        List<ImageVO> imageVOS = new ArrayList<>(imageDOS.size()+1);

        return null;
    }

    @Override
    public ImageVO get(ImageVO entity) {
        return null;
    }

    @Override
    public int create(ImageVO entity) {
        return 0;
    }

    @Override
    public int update(ImageVO entity) {
        return 0;
    }

    @Override
    public int delete(ImageVO entity) {
        return 0;
    }
}
