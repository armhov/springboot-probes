package com.epam.edp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pavlo_Yemelianov
 */
@RestController
public class HelloEdpController {

    @GetMapping(value = "/api/hello")
    public String hello() {
        return "Hello, KubeRocketCI!";
    }

    @GetMapping("/api/readiness")
    public String readiness() {
        return "readiness-ok";
    }

    @GetMapping("/api/liveness")
    public String liveness() {
        return "liveness-ok";
    }
}
