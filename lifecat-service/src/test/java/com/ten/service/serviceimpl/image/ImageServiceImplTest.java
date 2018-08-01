package com.ten.service.serviceimpl.image;

import com.ten.service.service.image.ImageService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ImageServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 1, 2018</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ImageServiceImplTest {

    @Autowired
    private ImageService imageService;

    @Before
    public void before() throws Exception {
        assert imageService != null;
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: all()
     */
    @Test
    public void testAll() throws Exception {

    }

    /**
     * Method: list(ImageVO entity)
     */
    @Test
    public void testList() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: get(ImageVO entity)
     */
    @Test
    public void testGet() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: create(ImageVO entity)
     */
    @Test
    public void testCreate() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: update(ImageVO entity)
     */
    @Test
    public void testUpdate() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: delete(ImageVO entity)
     */
    @Test
    public void testDelete() throws Exception {
//TODO: Test goes here... 
    }


} 
