package com.ten.controller;

import com.ten.service.service.BaseService;
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

    /* **********************************/
    /* ********** base methods***********/
    /* **********************************/

    public abstract DTO list(VO entity);

    public abstract DTO get(VO entity);

    public abstract DTO post(VO entity);

    public abstract DTO put(VO entity);

    public abstract DTO delete(VO entity);

    /* **********************************/
    /* ******** seletive methods*********/
    /* **********************************/

    public DTO all() {
        return null;
    }

    public DTO listById(String id) {
        return null;
    }

    public DTO getById(String id) {
        return null;
    }

    public DTO deleteById(String id) {
        return null;
    }

}
