package com.example.demo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class AppController {

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        int latency = 4;
        log.info("Latency of app is {} ms", latency);
        return ResponseEntity.ok()
                .body("hello");
    }
}
