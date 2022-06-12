package com.example.springtutorial.aop;

import com.example.springtutorial.dto.User3;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Aspect
@Component
public class DecodeAop {

    @Pointcut("execution(* com.example.springtutorial.controller..*.*(..))")
    public void cut() {}

    @Pointcut("@annotation(com.example.springtutorial.annotation.Decode)")
    private void enableDecode() {}

    @Before("cut() && enableDecode()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        for(Object arg: args) {
            if(arg instanceof User3) {
                User3 user3 = User3.class.cast(arg);
                String base64Email = user3.getEmail();
                String email = new String(Base64.getDecoder().decode(base64Email), StandardCharsets.UTF_8);
                user3.setEmail(email);
            }
        }
    }

    @AfterReturning(value = "cut() && enableDecode()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj) {
        if(returnObj instanceof User3) {
            User3 user3 = User3.class.cast(returnObj);
            String email = user3.getEmail();
            String base64Email = Base64.getEncoder().encodeToString(email.getBytes());
            user3.setEmail(base64Email);
        }
    }
}
