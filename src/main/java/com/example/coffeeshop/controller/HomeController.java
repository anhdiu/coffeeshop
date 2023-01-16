package com.example.coffeeshop.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String home () {
        return "listProduct";
    }
}
