package com.example.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-hi", fallback = ServiceHiHystrix.class)
public interface ServiceHi {
    /**
     * <p>通过Feign伪Http客户端调用service-hi提供的服务</p>
     * @author hanchao 2018/5/19 17:59
     **/
    @GetMapping("/hi/{name}")
    String sayHiFromServiceHi(@PathVariable(value = "name") String name);

}
