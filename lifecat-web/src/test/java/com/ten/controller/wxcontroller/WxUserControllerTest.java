package com.ten.controller.wxcontroller;

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
 * WxUserController Tester.
 * <p>
 * PASS
 * except 'login'
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>°ËÔÂ 10, 2018</pre>
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WxUserControllerTest {

    @Autowired
    WxUserController wxUserController;

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
     * Method: login(@RequestBody UserAccountVO userAccountVO)
     */
    @Test
    public void testLogin() throws Exception {
        // TODO org.springframework.web.util.NestedServletException: Request processing failed; nested exception is org.apache.shiro.UnavailableSecurityManagerException: No SecurityManager accessible to the calling code, either bound to the org.apache.shiro.util.ThreadContext or as a vm static singleton.  This is an invalid application configuration.
        Map<String, String> map = new HashMap<>(2);
        map.put("userAccountName", "ten");
        map.put("userAccountPassword", "ten");

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .post("/wx/user/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSONObject.toJSONString(map)))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("login:" + response);
    }

    /**
     * Method: register(@RequestBody UserAccountVO userAccountVO)
     */
    @Test
    public void testRegister() throws Exception {
        Map<String, String> map = new HashMap<>(2);
        map.put("userAccountName", "mockTest");
        map.put("userAccountPassword", "mockTest");

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .post("/wx/user/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSONObject.toJSONString(map)))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("register:" + response);
    }

    /**
     * Method: getUserProperty(@PathVariable String userAccountName)
     */
    @Test
    public void testGetUserProperty() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/wx/user/{userAccountName}", "ten"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("getProperty:" + response);
    }

    /**
     * Method: addUserProperty(@RequestBody UserPropertyVO userPropertyVO)
     */
    @Test
    public void testAddUserProperty() throws Exception {
        Map<String, String> map = new HashMap<>(2);
        map.put("userId", "15");
        map.put("userAccountName", "mockTest");
        map.put("userName", "userName");
        map.put("userSex", "1");
        map.put("userBirthday", "1997-1-15 00:00:00");
        map.put("userEmail", "userEmail");
        map.put("userLocation", "userLocation");
        map.put("userPhoneNumber", "userPhoneNumber");
        map.put("userIconUrl", "userIconUrl");
        map.put("userGmtCreate", "1997-1-15 00:00:00");
        map.put("userGmtModified", "1997-1-15 00:00:00");
        map.put("userLastLogin", "2000-1-15 00:00:00");
        map.put("userLoginCount", "999");

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .post("/wx/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSONObject.toJSONString(map)))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("post:" + response);
    }

    /**
     * Method: updateUserProperty(@RequestBody UserPropertyVO userPropertyVO)
     */
    @Test
    public void testUpdateUserProperty() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .put("/wx/user")
                .param("userId", "14")
                .param("userName", "updateuserName")
                .param("userSex", "1")
                .param("userBirthday", "1997-1-15 00:00:00")
                .param("userEmail", "updateuserEmail")
                .param("userLocation", "updateuserLocation")
                .param("userPhoneNumber", "updateuserPhoneNumber")
                .param("userIconUrl", "updateuserIconUrl"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("put:" + response);
    }

} 
