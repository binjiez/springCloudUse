package com.example.servicefeign2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-hi-2", fallback = ServiceHiHystrix.class)
public interface ServiceHi {

    @GetMapping("/hi/{name}")
    String sayHiFromServiceHi2(@PathVariable(value = "name") String name);
}