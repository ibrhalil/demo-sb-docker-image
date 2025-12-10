package com.ibrhalil.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AppHealthIndicator implements HealthIndicator {

    //http://localhost:8090/actuator/health

    @Override
    public Health health() {
        try {
            log.debug("[*] Health check running...");
            boolean serviceOK = true;

            if (serviceOK) {
                return Health.up().withDetail("service", "OK").build();
            } else {
                return Health.down().withDetail("service", "FAILED").build();
            }
        } catch (Exception e) {
            log.error("[*] Health check error", e);
            return Health.down(e).build();
        }
    }
}
