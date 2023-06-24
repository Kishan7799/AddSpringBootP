package com.example.controller;

import com.example.utility.AddUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/integer")
public class AddController {
    @PostMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return AddUtil.add(a, b);
    }
}
