package com.ibrhalil.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DestroyBeanExample implements DisposableBean {

    @Override
    public void destroy() {
        log.info("[*] DestroyBeanExample: call destroy() method.");
    }
}
