package com.ibrhalil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello, World! from the TestController time: {}", System.currentTimeMillis());
        return "application started successfully! Hello, World!";
    }
}
