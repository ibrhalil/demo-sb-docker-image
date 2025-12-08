package com.ibrhalil.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InitService {

    @PostConstruct
    public void init() {
        log.info("[*] InitService: Bean created and initialized.");

    }
}
