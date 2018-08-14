package com.ten.controller.user;

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
 * UserPropertyController Tester.
 * <p>
 * PASS
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 14, 2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserPropertyControllerTest {

    @Autowired
    UserPropertyController userPropertyController;

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
                .get("/user/property/all"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("all:" + response);
    }

    /**
     * Method: getByUrl(@PathVariable String userId)
     */
    @Test
    public void testGetByUrl() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/user/property/get/{userId}", "1"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("get:" + response);
    }

    /**
     * Method: add(@RequestBody UserPropertyVO entity)
     */
    @Test
    public void testAdd() throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("userId", "14");
        map.put("userName", "addmockTest");
        map.put("userSex", "1");
        map.put("userBirthday", "0000-0-0 00:00:00");
        map.put("userEmail", "test@qq.com");
        map.put("userLocation", "wx");
        map.put("userPhoneNumber", "18888888888");
        map.put("userIconUrl", "http://test.jpg");

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .post("/user/property")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSONObject.toJSONString(map)))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("post:" + response);
    }

    /**
     * Method: updateWithEntity(@RequestBody UserPropertyVO entity)
     */
    @Test
    public void testUpdateWithEntity() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .put("/user/property")
                .param("userId", "14")
                .param("userName", "update")
                .param("userPhoneNumber", "10129312"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("update:" + response);
    }

    /**
     * Method: deleteByUrl(@PathVariable String userId)
     */
    @Test
    public void testDeleteByUrl() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .delete("/user/property/{userId}", 14))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("delete:" + response);
    }


} 
