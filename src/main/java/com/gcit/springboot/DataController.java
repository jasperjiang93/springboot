package com.gcit.springboot;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableWebSecurity
@RestController
public class DataController {
    @RequestMapping("/")
    public String index() {
        return "This is a spring boot application";
    }
}
