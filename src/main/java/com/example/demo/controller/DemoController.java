package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("api/v1")
@RestController
public class DemoController {

    @GetMapping(path= "{num1}")
    public Map<String,Integer> addTen(@PathVariable("num1") int num1){
     Map<String,Integer> map = new HashMap<>();
     map.put("sum",num1+10);
     return map;
    }
    @GetMapping(path="{num1}/{num2}")
    public Map<String,Integer> addTwo(@PathVariable("num1") int num1,@PathVariable("num2") int num2){
        Map<String,Integer> map = new HashMap<>();
        map.put("sum",num1+num2);
        return map;
    }
}
