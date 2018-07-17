package com.kevinten.wechat.utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Connection Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ÆßÔÂ 17, 2018</pre>
 */
public class ConnectionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: tryConn()
     */
    @Test
    public void testTryConn() throws Exception {
        Connection conn = new Connection();
        conn.tryConn();
    }


} 
