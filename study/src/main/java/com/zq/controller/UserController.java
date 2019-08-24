package com.zq.controller;

import com.zq.model.User;
import com.zq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    @ResponseBody
    public User getUserId(@RequestParam int id){
        User user = new User();
        userService.getUserById(id);
        return user;
    }
}
