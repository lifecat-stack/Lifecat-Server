package com.ten.controller;

import org.springframework.web.bind.annotation.*;

/**
 * base controller
 * <p>
 * support :rest template
 * support :json response
 * support :aspect aop
 * <p>
 * support :seletive template
 *
 * @author Administrator
 */
@RestController
public abstract class BaseController<VO, DTO> {
    /**
     * GET URL
     */
    public DTO all() {
        return null;
    }

    public DTO list(Object param) {
        return null;
    }

    public DTO listById(String id) {
        return null;
    }

    public DTO get(Object param) {
        return null;
    }

    public DTO getById(String id) {
        return null;
    }

    /**
     * POST BODY
     */
    public DTO post(VO entity) {
        return null;
    }

    /**
     * PUT BODY
     */
    public DTO put(VO entity) {
        return null;
    }

    /**
     * DELETE URL
     */
    public DTO delete(Object param) {
        return null;
    }

    public DTO deleteById(String id) {
        return null;
    }

}
