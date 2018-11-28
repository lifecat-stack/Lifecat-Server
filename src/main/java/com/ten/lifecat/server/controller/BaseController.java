package com.ten.lifecat.server.controller;


import com.ten.lifecat.server.common.util.TimeGenerator;
import com.ten.lifecat.server.common.util.UidGenerator;
import com.ten.lifecat.server.dto.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class BaseController<Entity> {

    protected static final int NO_DELETED = 0;
    protected static final int IS_DELETED = 1;

    // UUID 生成器
    @Autowired
    UidGenerator uidGenerator;

    // TIME 生成器
    @Autowired
    TimeGenerator timeGenerator;

    /* Restful Interface */

    @RequestMapping(method = RequestMethod.GET)
    public abstract ResultModel get(Entity entity);

    @RequestMapping(method = RequestMethod.POST)
    public abstract ResultModel post(Entity entity);

    @RequestMapping(method = RequestMethod.PUT)
    public abstract ResultModel update(Entity entity);

    @RequestMapping(method = RequestMethod.DELETE)
    public abstract ResultModel delete(Entity entity);
}
