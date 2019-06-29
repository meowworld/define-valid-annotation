package com.example.anno.dict.web;


import com.example.anno.dict.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello(@Valid Person person){

        System.out.println("ok，校验通过");

        return "OK";
    }


}

