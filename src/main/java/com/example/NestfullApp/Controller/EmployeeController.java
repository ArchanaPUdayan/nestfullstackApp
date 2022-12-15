package com.example.NestfullApp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

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
    @Autowired
    EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> add(@RequestBody Employee e){
        HashMap<String,String> map = new HashMap<>();
        dao.save(e);
        map.put("status","success");
        return map;
    }

}
