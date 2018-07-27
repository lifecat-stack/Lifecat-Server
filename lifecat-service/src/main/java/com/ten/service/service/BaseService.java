package com.ten.service.service;

import java.util.List;

/**
 * base service and type is VO-DO
 *
 * @author Administrator
 */
public interface BaseService<VO> {
    /**
     * select list
     *
     * @param entity VO object
     */
    List<VO> list(VO entity);

    /**
     * select
     *
     * @param entity VO object
     */
    VO get(VO entity);

    /**
     * create
     *
     * @param entity VO object
     */
    int post(VO entity);

    /**
     * update
     *
     * @param entity VO object
     */
    int put(VO entity);

    /**
     * delete
     *
     * @param entity VO object
     */
    int delete(VO entity);
}
