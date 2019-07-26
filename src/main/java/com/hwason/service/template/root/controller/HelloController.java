package com.hwason.service.template.root.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String rootPath() {
        return "Welcome to hwason!";
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hi, i am hello!";
    }
}
