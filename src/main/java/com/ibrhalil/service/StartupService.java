package com.ibrhalil.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class StartupService implements CommandLineRunner {
    @Override
    public void run(String... args) {
        log.info("[*] StartupService: Starting the application...");

    }
}
