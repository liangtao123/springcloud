package com.teligen.feign.impl;

import com.teligen.entity.Student;
import com.teligen.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 容错机制，如果出现错误 提供友好的提示信息给用户
 */
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中........";
    }
}
