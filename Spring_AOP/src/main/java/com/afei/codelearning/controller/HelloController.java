package com.afei.codelearning.controller;

import com.afei.codelearning.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    FirstService firstService;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(firstService.getClass());
        firstService.world();
        return "hello world";
    }
}
