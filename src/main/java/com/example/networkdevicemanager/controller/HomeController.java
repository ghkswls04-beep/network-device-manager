package com.example.networkdevicemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Network Device Manager Server";
    }
}
