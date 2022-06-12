package com.example.springtutorial.controller;

import com.example.springtutorial.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody PostRequestDto postRequestDto) {
        System.out.println(postRequestDto);
    }
}