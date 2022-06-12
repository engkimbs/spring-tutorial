package com.example.springtutorial.controller;

import com.example.springtutorial.dto.User3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User3 user() {
        var user = new User3();
        user.setName("steve");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
