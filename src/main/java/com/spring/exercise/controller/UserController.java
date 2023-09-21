package com.spring.exercise.controller;

import com.spring.exercise.dto.SpecialtyDto;
import com.spring.exercise.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping(value="/user")
    public UserDto getUser(){
        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("Java","Ad"));
        specialties.add(new SpecialtyDto("Spring Boot", "basic"));

        return new UserDto (1, "kong", "kong@code.kr", specialties);
    }

}
