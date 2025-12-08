package com.ibrhalil.service;

import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ShutdownService {

    @PreDestroy
    public void onExit() {
        log.info("[*] ShutdownService: Closing application...");

    }
}
