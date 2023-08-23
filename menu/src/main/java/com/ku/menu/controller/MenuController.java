package com.ku.menu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MenuController {
    @GetMapping("")
    public String getHome() {
        return "Eureka Client application";
    }
}
