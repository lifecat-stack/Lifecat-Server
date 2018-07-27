//package com.ten.controller;
//
//import com.ten.service.service.BaseService;
//
//import java.util.List;
//
///**
// * base controller
// *
// * @author Administrator
// */
//public abstract class BaseController<VO,DO> {
//
//    /**
//     * VO :type of vo
//     */
//    private BaseService<VO,DO> service;
//
//    /**
//     * set service to base controller
//     *
//     * @param service service serviceimpl
//     */
//    public void setService(BaseService<VO> service) {
//        this.service = service;
//    }
//
//    ;
//
//    /**
//     * base list
//     *
//     * @param entity entity
//     */
//    public List<VO> list(VO entity) {
//        return service.list(entity);
//    }
//
//    /**
//     * base get
//     *
//     * @param entity entity
//     */
//    public VO get(VO entity) {
//        return service.get(entity);
//    }
//
//    /**
//     * base post
//     *
//     * @param obj VO object
//     */
//    public int post(VO obj) {
//        return service.post(obj);
//    }
//
//    /**
//     * base put
//     *
//     * @param obj VO object
//     */
//    public int put(VO obj) {
//        return service.put(obj);
//    }
//
//    /**
//     * base delete
//     *
//     * @param entity entity
//     */
//    public int delete(VO entity) {
//        return service.delete(entity);
//    }
//}
