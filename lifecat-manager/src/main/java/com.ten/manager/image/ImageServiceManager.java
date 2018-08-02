package com.ten.manager.image;

import com.ten.vo.AlbumVO;
import com.ten.vo.ImageVO;

import java.util.List;

/**
 * 图像模块管理器
 *
 * @author Administrator
 */
public interface ImageServiceManager {

    /* **********************************/
    /* ************* album **************/
    /* **********************************/

    List<AlbumVO> getAlbumListByUserId(Integer userId);

    AlbumVO getAlbumByEntity(AlbumVO albumVO);

    int createAlbum(AlbumVO albumVO);

    int updateAlbum(AlbumVO albumVO);

    int deleteAlbumByPrimaryKey(Integer albumId);

    /* **********************************/
    /* ************* album **************/
    /* **********************************/

    int uploadImageToAlbum(ImageVO imageVO);

    int updateImage(ImageVO imageVO);

    int deleteImageByPrimaryKey(Integer imageId);
}
