package com.orm.hibernate.service;

import com.orm.hibernate.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CacheService {



    private final RedisTemplate<String, Employee> redisTemplate;

    @Autowired
    public CacheService(RedisTemplate<String, Employee> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    public void save(String key, Employee employee){
        redisTemplate.opsForValue().set(key, employee, 60, TimeUnit.SECONDS);
    }

    public Employee getEmployee(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
