package com.oracle.db23c.springboot3withaop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String sayHello(String name){
        return "Hello World!" + name;
    }
}
