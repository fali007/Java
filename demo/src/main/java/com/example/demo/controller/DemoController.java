package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {
    @PostMapping("/home")
    public String home(@RequestBody String body){
        log.info(body);
        return "Hello World";
    }
}
