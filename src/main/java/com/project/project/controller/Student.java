package com.project.project.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Student {

    Logger logger = LoggerFactory.getLogger(Student.class);
    @GetMapping("student")
    public String welcome(){
        logger.info("controller logger");
        return "hello student";
    }
}
