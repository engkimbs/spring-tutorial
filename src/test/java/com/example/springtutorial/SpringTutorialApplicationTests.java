package com.example.springtutorial;

import com.example.springtutorial.dto.User3;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class SpringTutorialApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User3 user3 = new User3("steve", 10);
        user3.setPhoneNumber("010-3354-5349");
        String text = objectMapper.writeValueAsString(user3);
        System.out.println(text);

        User3 objectUser3 = objectMapper.readValue(text, User3.class);
        System.out.println(objectUser3);
    }

}
