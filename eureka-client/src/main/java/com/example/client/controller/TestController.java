package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String home(String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
