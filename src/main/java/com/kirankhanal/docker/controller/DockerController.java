package com.kirankhanal.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
    @GetMapping("/api")
    public String testMethod(){
        return "Hello I'm Docker";
    }
}
