package com.ten.redis;

import redis.clients.jedis.Jedis;

/**
 * 测试redis连接
 *
 *
 * TODO redis
 *
 * @author wshten
 * @date 2018/8/9 0009
 */
public class RedisConnections {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        int i = 0;

        try {
            long start = System.currentTimeMillis();
            while (true) {
                long end = System.currentTimeMillis();
                if (end - start >= 1000) {
                    break;
                }
                i++;
                jedis.set("test" + i, i + "");
            }
        } finally {
            jedis.flushDB();
            jedis.close();
        }

        System.out.println("redis operating " + i + " per second");
    }
}
