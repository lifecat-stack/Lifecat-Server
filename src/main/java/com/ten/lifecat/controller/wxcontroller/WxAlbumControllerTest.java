package com.ten.lifecat.controller.wxcontroller;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
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
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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
