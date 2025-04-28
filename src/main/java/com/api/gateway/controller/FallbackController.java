package com.api.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/fallback/user")
    public ResponseEntity<String> userServiceFallback() {
        return ResponseEntity.ok("User Service is temporarily unavailable. Please try again later.");
    }
}
