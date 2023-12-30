package com.ntnguyen.pground.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${author.name}")
    private String authorName;

    @GetMapping
    public String greeting() {
        return "Hello " + authorName + "!";
    }
}
