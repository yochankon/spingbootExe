package com.spring.exercise.service;

import com.spring.exercise.dto.PostDto;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public PostDto getPost(Integer id) {
        System.out.println("find post from database by" + id);
        System.out.println("validate data from database");
        System.out.println("process data if necessary");
        return new PostDto(id, "title", "this is content", "kong");
    }
}
