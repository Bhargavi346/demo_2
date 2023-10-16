package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test {

    @Autowired
    private TestService testService;
    @GetMapping("/welcome")
    public Map<String, String> welcome() {
        return testService.getWelcomeMessage();
    }
}
