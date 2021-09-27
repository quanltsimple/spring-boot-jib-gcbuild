package com.example.gcp.build.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "{ Hello World from Spring Boot!! }";
    }
}
