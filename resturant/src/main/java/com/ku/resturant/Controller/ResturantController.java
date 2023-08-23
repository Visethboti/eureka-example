package com.ku.resturant.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ResturantController {
    @GetMapping("")
    public String getHome() {
        return "Hello world";
    }
}
