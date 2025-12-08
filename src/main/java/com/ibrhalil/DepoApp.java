package com.ibrhalil;

import jakarta.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DepoApp {

    public static void main(String[] args) {
        log.info("[*] Before run method...");
        SpringApplication.run(DepoApp.class, args);
        log.info("[*] After run method...");
    }

    @PostConstruct
    public void registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> log.info("[*] JVM Shutdown Hook: System is shutting down...")));
    }
}
