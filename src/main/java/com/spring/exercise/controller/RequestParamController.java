package com.spring.exercise.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
    @RequestMapping(value ="/post")
    public String getPost(@RequestParam(name ="category") String category,
                          @RequestParam(name ="id") Integer id){
        System.out.println("여기 온다고 ? ");
        return "You request" + category +" - " + id +" post";
    }

    @SpringBootApplication
    public static class ExerciseApplication {

        public static void main(String[] args) {
            SpringApplication.run(ExerciseApplication.class, args);
        }

    }
}
