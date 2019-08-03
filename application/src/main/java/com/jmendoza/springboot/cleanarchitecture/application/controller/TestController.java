package com.jmendoza.springboot.cleanarchitecture.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "/")
    public ResponseEntity test(HttpServletRequest request) {
        return new ResponseEntity("Clean Architecture OK", HttpStatus.OK);
    }
}
