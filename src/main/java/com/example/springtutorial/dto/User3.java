package com.example.springtutorial.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User3 {
    private String name;
    private Integer age;

    private String email;

    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;

    public User3(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}