package com.example.springtutorial.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api5")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId,
                       @RequestParam String account) {
        System.out.println(userId);
        System.out.println(account);
    }
}
