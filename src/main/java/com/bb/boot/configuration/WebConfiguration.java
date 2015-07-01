package com.bb.boot.configuration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebConfiguration {
    @RequestMapping("/")
    String home() {
        return "And now his watch has ended";
    }

    @RequestMapping("/aruna")
    String pisica() {
        return "Priiiu Priiiu";
    }

    @RequestMapping("/betty")
    String catel() {
        return "Ham Ham";
    }

}
