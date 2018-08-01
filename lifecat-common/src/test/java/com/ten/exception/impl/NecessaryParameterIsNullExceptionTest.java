package com.ten.exception.impl;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.*;

/**
 * NecessaryParameterIsNullException Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 1, 2018</pre>
 */
public class NecessaryParameterIsNullExceptionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getErrorMsg()
     */
    @Test
    public void testGetErrorMsg() throws Exception {
        try {
            throw new NecessaryParameterIsNullException();
        } catch (NecessaryParameterIsNullException e) {
            assertNotNull(e.getErrorMsg());
        }
    }

    /**
     * Method: lock()
     */
    @Test
    public void testLock() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: println(Object var1)
     */
    @Test
    public void testPrintlnO() throws Exception {
//TODO: Test goes here... 
    }


} 
