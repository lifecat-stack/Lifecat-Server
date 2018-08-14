package com.ten.controller.message;

import com.ten.controller.TestController;
import net.minidev.json.JSONObject;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

/**
 * LogController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 14, 2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LogControllerTest {

    @Autowired
    LogController logController;

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

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("all:" + response);    }

    /**
     * Method: add(LogVO entity)
     */
    @Test
    public void testAdd() throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("testId", "999");
        map.put("testName", "mockTest");

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .post("/test/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSONObject.toJSONString(map)))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("post:" + response);
    }

    /**
     * Method: updateWithEntity(LogVO entity)
     */
    @Test
    public void testUpdateWithEntity() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .put("/test/")
                .param("testId", "1")
                .param("testName", "mockTestUpdate"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("updateWithEntity:" + response);
    }


} 
