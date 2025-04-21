package com.demo.googleAuthorization.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ControllerTest {

    @GetMapping("/")
    public String test() {
        return "test";
    }
    

}
