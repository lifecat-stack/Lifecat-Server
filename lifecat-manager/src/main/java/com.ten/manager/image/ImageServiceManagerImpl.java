package com.ten.manager.image;

import com.ten.service.service.image.AlbumService;
import com.ten.service.service.image.ImageService;
import com.ten.vo.AlbumVO;
import com.ten.vo.ImageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceManagerImpl implements ImageServiceManager {

    private final AlbumService albumService;
    private final ImageService imageService;

    @Autowired
    public ImageServiceManagerImpl(AlbumService albumService, ImageService imageService) {
        this.albumService = albumService;
        this.imageService = imageService;
    }

    @Override
    public List<AlbumVO> getAlbumListByUserId(Integer userId) {
        AlbumVO entity = new AlbumVO();
        entity.setUserId(userId);
        return albumService.list(entity);
    }

    @Override
    public AlbumVO getAlbumByEntity(AlbumVO albumVO) {
        return albumService.get(albumVO);
    }

    @Override
    public int createAlbum(AlbumVO albumVO) {
        return albumService.create(albumVO);
    }

    @Override
    public int updateAlbum(AlbumVO albumVO) {
        return albumService.update(albumVO);
    }

    @Override
    public int deleteAlbumByPrimaryKey(Integer albumId) {
        AlbumVO entity = new AlbumVO();
        entity.setAlbumId(albumId);
        return albumService.delete(entity);
    }

    @Override
    public int uploadImageToAlbum(ImageVO imageVO) {
        return imageService.create(imageVO);
    }

    @Override
    public int updateImage(ImageVO imageVO) {
        return imageService.update(imageVO);
    }

    @Override
    public int deleteImageByPrimaryKey(Integer imageId) {
        ImageVO entity = new ImageVO();
        entity.setImageId(imageId);
        return imageService.delete(entity);
    }
}
