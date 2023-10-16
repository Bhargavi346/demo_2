package com.example.demo.service.Impl;

import com.example.demo.service.TestService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public Map<String, String> getWelcomeMessage() {
        Map<String, String> res = new HashMap<>();
        res.put("Name", "Bhargavi");
        res.put("Message", "Welcome to my application");
        return res;
    }
}
