package com.orm.hibernate.redis.serializers;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orm.hibernate.entities.Employee;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.io.IOException;

public class EmployeeSerializer implements RedisSerializer<Employee> {

    private final ObjectMapper objectMapper;

    public EmployeeSerializer() {
        this.objectMapper = new ObjectMapper().enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.PROPERTY);
    }

    @Override
    public byte[] serialize(Employee employee) throws SerializationException {
        try {
            return objectMapper.writeValueAsBytes(employee);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee deserialize(byte[] bytes) throws SerializationException {
         if(bytes == null){
             return null;
         }

        try {
            return objectMapper.readValue(bytes, Employee.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
