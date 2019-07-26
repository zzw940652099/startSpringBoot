package com.hwason.service.template.root.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @RequestMapping("/world")
    public String sayWorld() {
        return "YO man, i am the world!";
    }
}
