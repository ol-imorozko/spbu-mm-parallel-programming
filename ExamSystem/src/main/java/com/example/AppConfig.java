package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ExamSystem examSystem() {
        return new OptimisticExamSystem();
    }
}
