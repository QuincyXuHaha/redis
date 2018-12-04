package com.quincy.redis.distributed.lock;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * redis 更好的方式实现分布式锁，不是使用setnx
 *
 * @author quinc
 * @date 2018/12/4 星期二
 */
@Component
public class RedLock {

    @Resource
    private StringRedisTemplate stringRedisTemplate;


    private boolean lock() {


        return false;
    }

}
