package dev.autometrics.example.controller;

import dev.autometrics.bindings.Autometrics;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    @Autometrics
    public String test() {
        return "Hello World!";
    }
}
