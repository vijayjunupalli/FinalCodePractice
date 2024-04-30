package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class FinalTestController {
//
    @GetMapping("/test")
    public String test(){

        return "test!";
//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
    }
}