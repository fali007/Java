package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class demo1Controller {
    RestTemplate restTemplate=new RestTemplate();
    String url="http://localhost:8080/home";
    @GetMapping("/call")
    public void home() {
        HttpEntity httpEntity = new HttpEntity<>("Hi Feliix");
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url,httpEntity,String.class);
        log.info(responseEntity.toString());
    }
}
