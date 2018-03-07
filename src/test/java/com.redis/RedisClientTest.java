package com.redis;

import org.junit.Test;

/**
 * author: alan.peng
 * description:
 * date: create in 17:06 2018/3/6
 * modified By：
 */
public class RedisClientTest {

    @Test
    public void string(){
        try {
            RedisClient.string();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void zset(){
        RedisClient.zset();
    }

    @Test
    public void zsets(){
        RedisClient.zsets();
    }
}
