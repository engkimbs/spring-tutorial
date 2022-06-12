package com.example.springtutorial.dto;

import com.example.springtutorial.annotation.YearMonth;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Getter
@Setter
@ToString
public class User4 {

    @NotBlank
    private String name;

    @Max(value = 90, message = "90 이하이어야합니다.")
    private int age;

    @Email
    private String email;

    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message="핸드폰 번호의 양식과 맞지 않습니다.")
    private String phoneNumber;

    @YearMonth
    private String reqYearMonth;

    @Valid
    private List<Car> cars;
}
