package com.example.springtutorial.controller;

import com.example.springtutorial.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api4")
public class GetApiController {

    @GetMapping(path="/hello")
    public String getHello() {
        return "get Hello";
    }

    @GetMapping("query-param02")
    public String queryParam02(@RequestParam Map<String, String> queryParameters) {
        StringBuilder sb = new StringBuilder();
        queryParameters.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);

            sb.append(key).append("=").append(value);
        });

        return sb.toString();
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) {
        System.out.println(userRequest.toString());

        return userRequest.toString();
    }

    @GetMapping("query-param05")
    public String queryParam05(UserRequest userRequest) {
        System.out.println(userRequest.toString());

        return userRequest.toString();
    }
}
