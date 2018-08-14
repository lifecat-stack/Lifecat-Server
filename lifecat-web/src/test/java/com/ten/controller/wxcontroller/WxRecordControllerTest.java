package com.ten.controller.wxcontroller;

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
 * WxRecordController Tester.
 * <p>
 * TODO
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 10, 2018</pre>
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WxRecordControllerTest {

    @Autowired
    WxRecordController wxRecordController;

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
     * Method: getUserRecord(@RequestBody UserAccountVO userAccountVO)
     */
    @Test
    public void testGetUserRecord() throws Exception {
        // TODO
    }

    /**
     * Method: addUserRecord(@RequestBody UserAccountVO userAccountVO)
     */
    @Test
    public void testAddUserRecord() throws Exception {
        //TODO
    }


} 
