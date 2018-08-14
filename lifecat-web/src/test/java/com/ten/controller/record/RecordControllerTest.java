package com.ten.controller.record;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

/**
 * RecordController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 14, 2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RecordControllerTest {

    @Autowired
    RecordController recordController;

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
     * Method: listByUrl(@PathVariable String userId)
     */
    @Test
    public void testListByUrl() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/record/list/{userId}", "1"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("list:" + response);
    }

    /**
     * Method: add(@RequestBody RecordVO entity)
     */
    @Test
    public void testAdd() throws Exception {
        // post
        Map<String, String> post = new HashMap<>(3);
        post.put("postTitle", "4");
        post.put("postContent", "4");
        post.put("postImageUrl", "4");
        // comments
        List<Map<String, String>> comments = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            Map<String, String> comment = new HashMap<>(3);
            comment.put("commentRecordId","5");
            comment.put("commentCustomerId","5");
            comment.put("commentContent", "comment");
            comments.add(comment);
        }
        // record
        Map<String, Object> map = new HashMap<>(3);
        map.put("userId", "1");
        map.put("post", post);
        map.put("comments", comments);

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .post("/record")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSONObject.toJSONString(map)))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("post:" + response);
    }

    /**
     * Method: updateWithEntity(@RequestBody RecordVO entity)
     */
    @Test
    public void testUpdateWithEntity() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .put("/record")
                .param("recordId", "4")
                .param("userId", "1")
                .param("postId", "5"))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("update:" + response);
    }

    /**
     * Method: deleteByUrl(@PathVariable String recordId)
     */
    @Test
    public void testDeleteByUrl() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .delete("/record/{recordId}", 4))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assertNotNull(response);
        System.out.println("delete:" + response);
    }

} 
