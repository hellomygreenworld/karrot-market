package com.eunbin.karrotmarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
