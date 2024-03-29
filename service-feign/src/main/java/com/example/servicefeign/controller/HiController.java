package com.example.servicefeign.controller;

import com.example.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    public SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
