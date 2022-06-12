package com.example.springtutorial.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class User2 {

    private String name;
    private int age;
    private List<Car> cars;
}