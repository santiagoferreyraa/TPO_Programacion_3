package com.example.TPO_Programacion3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}