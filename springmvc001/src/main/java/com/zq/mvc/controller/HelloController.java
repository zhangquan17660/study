package com.zq.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/test")
public class HelloController {
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello(String username,String password){
        System.out.println("hello");
        System.out.println(username+password);
        return "success";
    }
}
