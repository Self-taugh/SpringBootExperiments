package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TestRESTController {

    private static String template = "Hello, user %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/test")
    public ExampleRespond counter(@RequestParam(defaultValue = "World") String name) {
        return new ExampleRespond(counter.incrementAndGet(), template.formatted(name), 200);
    }
}
