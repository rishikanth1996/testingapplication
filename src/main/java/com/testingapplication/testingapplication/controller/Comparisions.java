package com.testingapplication.testingapplication.controller;

import com.testingapplication.testingapplication.service.ComparisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Comparisions {

    @Autowired
    ComparisionService comparisionService;

    @GetMapping(value = "/findGreaterValue")
    public int findGreaterValue(@RequestBody List<Integer> numbers){
        return comparisionService.findGreaterValue(numbers);
    }

    @GetMapping(value = "/findSmallerValue")
    public int findSmallerValue(@RequestBody List<Integer> numbers){
        return comparisionService.findSmallerValue(numbers);
    }

    @GetMapping(value = "/compare")
    public String compare(@RequestParam int a, @RequestParam int b){
        return comparisionService.compare(a, b);
    }

}
