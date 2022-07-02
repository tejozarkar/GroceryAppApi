package com.demo.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HealthController {

    @GetMapping
    public String home(){
        return "Welcome!";
    }

    @GetMapping("/health")
    public String health(){
        return "Health OK!";
    }
}
