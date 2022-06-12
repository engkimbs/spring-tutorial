package com.example.springtutorial.controller;

import com.example.springtutorial.annotation.Decode;
import com.example.springtutorial.annotation.Timer;
import com.example.springtutorial.dto.User3;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/test/get/{id}")
    public String testGet(@PathVariable Long id, @RequestParam String name) {
        return id + " " + name;
    }

    @PostMapping("/test/post")
    public User3 testPost(@RequestBody User3 user3) {
        return user3;
    }

    @Timer
    @DeleteMapping("/test/delete")
    public void delete() {
        try {
            Thread.sleep(1000*2);
        } catch (Exception e) {

        }
    }

    @Decode
    @PutMapping("/test/put")
    public User3 put(@RequestBody User3 user3) {
        return user3;
    }
}