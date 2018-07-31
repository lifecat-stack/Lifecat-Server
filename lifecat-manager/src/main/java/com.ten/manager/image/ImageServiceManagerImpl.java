package com.ten.manager.image;

import com.ten.vo.AlbumVO;
import com.ten.vo.ImageVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceManagerImpl implements ImageServiceManager{
    @Override
    public List<AlbumVO> getAlbumListByUserId(Integer userId) {
        return null;
    }

    @Override
    public AlbumVO getAlbumByEntity(AlbumVO albumVO) {
        return null;
    }

    @Override
    public int createAlbum(AlbumVO albumVO) {
        return 0;
    }

    @Override
    public int updateAlbum(AlbumVO albumVO) {
        return 0;
    }

    @Override
    public int deleteAlbumByPrimaryKey(Integer albumId) {
        return 0;
    }

    @Override
    public int uploadImageToAlbum(ImageVO imageVO) {
        return 0;
    }

    @Override
    public int updateImage(ImageVO imageVO) {
        return 0;
    }

    @Override
    public int deleteImageByPrimaryKey(Integer imageId) {
        return 0;
    }
}
