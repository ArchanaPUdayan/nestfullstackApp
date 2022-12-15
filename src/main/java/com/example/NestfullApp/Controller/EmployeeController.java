package com.example.NestfullApp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my page";
    }
    @PostMapping("/login")
    public String Login(){
        return "Welcome to my login page";
    }
    @PostMapping("/view")
    public String View(){
        return "welcome to my view page";
    }

}
