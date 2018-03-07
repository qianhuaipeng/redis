package com.redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * author: alan.peng
 * description:
 * date: create in 14:30 2018/3/7
 * modified By：
 */
public class JedisTest extends BaseTest {

    @Autowired
    private JedisPool jedisPool;

    @Test
    public void test(){
        Jedis jedis = jedisPool.getResource();

        jedis.set("testsss","testt");

        System.out.println(jedis.get("testsss"));
    }
}
