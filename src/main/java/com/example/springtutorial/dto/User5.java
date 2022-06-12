package com.example.springtutorial.dto;

import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User5 {

    @NotEmpty
    @Size(min= 1, max = 10)
    private String name;

    @Min(1)
    @NotNull
    private int age;
}
