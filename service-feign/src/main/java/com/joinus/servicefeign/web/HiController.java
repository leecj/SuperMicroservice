package com.joinus.servicefeign.web;

import com.joinus.servicefeign.clients.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    // 这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错，这警告
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
