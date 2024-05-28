package com.orm.hibernate.redis.config;

import com.orm.hibernate.entities.Employee;
import com.orm.hibernate.redis.serializers.EmployeeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {


    @Bean
    public RedisTemplate<String, Employee> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String, Employee> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new EmployeeSerializer());
        return redisTemplate;
    }
}
