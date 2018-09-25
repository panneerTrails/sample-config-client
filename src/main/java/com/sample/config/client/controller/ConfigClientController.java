package com.sample.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${environment: default}")
    private String environment;

    @RequestMapping("/getEnvironment")
    String getEnvironment() {
        return this.environment;
    }
}
