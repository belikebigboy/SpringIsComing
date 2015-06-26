package com.bb.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/")
    String home() {
        return "And now his watch has ended";
    }

    @RequestMapping("/aruna")
    String pisica() {
        return "Priiiu Priiiu";
    }

    @RequestMapping("/Betty")
    String catel() {
        return "Ham Ham";
    }

}
