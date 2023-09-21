package com.spring.exercise.config;

import com.spring.exercise.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //설정 정보를 넣는 class로 이식함
public class AppConfig {
    @Bean
    public PostService postService2(){
        return new PostService();
    }

}
