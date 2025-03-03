package com.example.springOauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class oauthController {
    @GetMapping("/")
    public String greet(){
        return "hi i am nilay";
    }
}
