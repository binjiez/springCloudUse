package com.example.servicefeign2;

import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystrix implements ServiceHi {
    @Override
    public String sayHiFromServiceHi2(String name) {
        return "hello" + name +", this message send failed. By Hystrix.";
    }
}
