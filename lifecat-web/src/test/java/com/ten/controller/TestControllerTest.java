package com.ten.controller;

import javafx.application.Application;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * TestController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 9, 2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestControllerTest {

    @Autowired
    TestController testController;

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
     * Method: all()
     */
    @Test
    public void testAll() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/test/all"))
                .andReturn();

        assertNotNull(result);
        System.out.println(result.getResponse().getContentAsString());
    }

    /**
     * Method: listById(@PathVariable String testId)
     */
    @Test
    public void testListById() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/test/list/{testId}",1))
                .andReturn();

        assertNotNull(result);
        System.out.println(result.getResponse().getContentAsString());
    }

    /**
     * Method: list(@RequestBody TestVO entity)
     */
    @Test
    public void testList() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/test/list"))
                .andReturn();

        assertNotNull(result);
        System.out.println(result.getResponse().getContentAsString());
    }

    /**
     * Method: getById(@PathVariable String testId)
     */
    @Test
    public void testGetById() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/test/get/{testId}",1))
                .andReturn();

        assertNotNull(result);
        System.out.println(result.getResponse().getContentAsString());
    }

    /**
     * Method: get(@RequestBody TestVO entity)
     */
    @Test
    public void testGet() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/test/get"))
                .andReturn();

        assertNotNull(result);
        System.out.println(result.getResponse().getContentAsString());
    }

    /**
     * Method: post(@RequestBody TestVO entity)
     */
    @Test
    public void testPost() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: put(@RequestBody TestVO entity)
     */
    @Test
    public void testPut() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: deleteById(@PathVariable String testId)
     */
    @Test
    public void testDeleteById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: delete(@RequestBody TestVO entity)
     */
    @Test
    public void testDelete() throws Exception {
//TODO: Test goes here... 
    }


} 
