package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.IUserService;

@RestController
public class HelloController {


    @Autowired
    IUserService iHelloService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return iHelloService.sayHiFromClientOne( name );
    }
}
