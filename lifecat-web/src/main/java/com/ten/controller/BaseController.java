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

    /*------ GET ------*/

    public DTO all() {
        return null;
    }

    /**
     * 1.@PathVariable
     */
    public DTO listByUrl(@PathVariable String id) {
        return null;
    }

    public DTO getByUrl(@PathVariable String id) {
        return null;
    }

    /**
     * 2.@RequestParam
     */
    public DTO listByParam(@RequestParam Object param) {
        return null;
    }

    public DTO getByParam(@RequestParam Object param) {
        return null;
    }


    /*------ POST ------*/

    /**
     * 1.@RequestBody JSON
     */
    public DTO add(@RequestBody VO entity) {
        return null;
    }

    /*------ PUT ------*/

    /**
     * 1.entity对象映射
     */
    public DTO updateWithEntity(VO entity) {
        return null;
    }

    /**
     * 2.@RequestParam
     */
    public DTO updateWithParams(@RequestParam Object... params) {
        return null;
    }


    /*------ DELETE ------*/

    /**
     * 1.@PathVariable
     */
    public DTO deleteByUrl(@PathVariable String id) {
        return null;
    }

    /**
     * 2.@RequestParam
     */
    public DTO deleteByParams(@RequestParam Object param) {
        return null;
    }

}
