package com.afei.codelearning.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class FirstService {
    public static FirstService instance;

    public void world(){
        System.out.println("world!");
        System.out.println("My class is " + instance.getClass());
    }

    @PostConstruct
    public void init(){
        instance = this;
    }
}
