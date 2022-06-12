package com.example.springtutorial.controller;

import com.example.springtutorial.dto.User;
import com.example.springtutorial.dto.User4;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/apitest")
@Validated
public class ApiController {

    @PostMapping("/user")
    public ResponseEntity<String> user(@Valid @RequestBody User4 user4,
                                       BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError field = (FieldError) objectError;
                String message = objectError.getDefaultMessage();
                System.out.println(message);
            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user4.toString());
        }

        System.out.println(user4);

        return ResponseEntity.status(HttpStatus.CREATED).body(user4.toString());
    }

    @GetMapping("")
    public User get(
            @Size(min = 2)
            @RequestParam String name,

            @NotNull
            @Min(1)
            @RequestParam Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        int a = 10*age;

        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {
        System.out.println(user);
        return user;
    }

//
//    @GetMapping("/text")
//    public String text(@RequestParam String account) {
//        return "user100";
//    }
//
//    @PostMapping("/json")
//    public User json(@RequestBody User user) {
//        return user;
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<User> useUpdate(@RequestBody User user) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(user);
//    }
}
