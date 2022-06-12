package com.example.springtutorial;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringTutorialApplication {
    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(SpringTutorialApplication.class, args);

//        ObjectMapper objectMapper = new ObjectMapper();
//
//        User2 user2 = new User2();
//        user2.setName("홍길동");
//        user2.setAge(10);
//
//        Car car1 = new Car();
//        car1.setName("k5");
//        car1.setCarNumber("11가1111");
//        car1.setType("sedan");
//
//        Car car2 = new Car();
//        car2.setName("Q5");
//        car2.setCarNumber("22가2222");
//        car2.setType("SUV");
//
//        List<Car> carList = Arrays.asList(car1, car2);
//        user2.setCars(carList);
//
//        System.out.println(user2);
//
//        String json = objectMapper.writeValueAsString(user2);
//        System.out.println(json);
//
//        JsonNode jsonNode = objectMapper.readTree(json);
//        String _name = jsonNode.get("name").asText();
//        int _age = jsonNode.get("age").asInt();
//        System.out.println("name : " + _name);
//        System.out.println("age : " + _age);
//
//        String _list = jsonNode.get("cars").asText();
//        System.out.println(_list);
//
//        JsonNode cars = jsonNode.get("cars");
//        ArrayNode arrayNode = (ArrayNode)cars;
//
//        List<Car> _cars = objectMapper.convertValue(arrayNode, new TypeReference<List<Car>>() {});
//        System.out.println(_cars);
//
//        ObjectNode objectNode = (ObjectNode) jsonNode;
//        objectNode.put("name", "steve");
//        objectNode.put("age", 20);
//        System.out.println(objectNode.toPrettyString());
    }
}
