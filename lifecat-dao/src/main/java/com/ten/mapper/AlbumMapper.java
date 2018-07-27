package com.ten.mapper;

import com.ten.entity.AlbumDO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * c_album
 *
 * @author Administrator
 */
@Repository
public interface AlbumMapper extends Mapper<AlbumDO> {
}
