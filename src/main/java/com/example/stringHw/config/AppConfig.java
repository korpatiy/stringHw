package com.example.stringHw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для построения контекста Spring
 */
@Configuration
@ComponentScan("com.example.stringHw.beans")
public class AppConfig {

    @Bean
    public Map<String, String> alphabet() {
        Map<String, String> result = new HashMap<>();
        result.put("в", "д");
        result.put("о", "л");
        result.put("к", "ю");
        result.put("%", " ");
        result.put("~", "я");
        result.put("Ж", "J");
        result.put("п", "v");
        return result;
    }
}
