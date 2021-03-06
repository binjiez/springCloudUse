package com.example.servicefeign2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /** 注入服务"service-hi"的Feign客户端ServiceHi */
    @Autowired
    private ServiceHi serviceHi;

    /**
     * 调用Feign客户端提供的服务，自带负载均衡
     * @param name
     * @return
     */
    @GetMapping("/helloss/{name}")
    public String sayHi(@PathVariable String name){
        //调用Feign客户端ScheduleServiceHi的接口
        System.out.print("13");
        return serviceHi.sayHiFromServiceHi2(name);
    }
}
