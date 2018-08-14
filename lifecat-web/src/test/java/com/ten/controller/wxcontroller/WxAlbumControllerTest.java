package com.ten.controller.wxcontroller;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * WxAlbumController Tester.
 * <p>
 * TODO
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 14, 2018</pre>
 */
public class WxAlbumControllerTest {

    @Autowired
    WxAlbumController wxAlbumController;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void before() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: listByUrl(@PathVariable String id)
     */
    @Test
    public void testListById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getByUrl(String id)
     */
    @Test
    public void testGetById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: add(AlbumVO entity)
     */
    @Test
    public void testAdd() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: deleteByUrl(String id)
     */
    @Test
    public void testDeleteById() throws Exception {
//TODO: Test goes here... 
    }


} 
