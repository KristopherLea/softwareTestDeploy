package com.example.deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/breeds/")
public class DogController {

    @GetMapping("/image/random")
    public String getDog(){
   //     JSONObject jsonObject = new JSONObject();
//        jsonObject.put("message","https://images.dog.ceo/breeds/pointer-germanlonghair/hans2.jpg");
//        jsonObject.put("status", "success");
        String dog = "{\"message\":\"https://images.dog.ceo/breeds/pointer-germanlonghair/hans2.jpg\",\"status\":\"success\"}";
        return dog;

    }

}
