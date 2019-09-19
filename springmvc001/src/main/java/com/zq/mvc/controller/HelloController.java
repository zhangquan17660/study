package com.zq.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.nio.file.Path;

@Controller
@RequestMapping("/test")
public class HelloController {
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello(){
        System.out.println("hello");
        return "success";
    }
}
