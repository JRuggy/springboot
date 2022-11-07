package com.example.good.controllers;

//I commented the line below just because it brings the warning of import is never used 
// import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserController {
    @RequestMapping(path = "greetings",method = RequestMethod.GET)
    public String greetings(){
        return " This is Jaston Ruggy";
    }
}
