package com.example.test.TestService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
