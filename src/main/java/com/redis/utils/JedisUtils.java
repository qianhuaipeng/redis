package com.redis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;

/**
 * author: alan.peng
 * description:
 * date: create in 14:27 2018/3/7
 * modified By：
 */
@Component
public class JedisUtils {

    @Autowired
    private JedisPool jedisPool;


    public void set(){

    }
}
