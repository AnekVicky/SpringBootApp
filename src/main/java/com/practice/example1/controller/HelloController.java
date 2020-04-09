package com.practice.example1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String sayHi(){

        return "Hey there ,you have logged in ";
    }

}
