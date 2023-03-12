package com.teligen.feign;

import com.teligen.entity.Student;
import com.teligen.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

//声明式接口,调用的provider的接口,如果出现错误就返回feignError的信息
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student>findAll();

    @GetMapping("/student/index")
    public String index();
}
