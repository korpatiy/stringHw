package com.example.stringHw;

import com.example.stringHw.beans.ModifierChain;
import com.example.stringHw.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StringHwApplication {

    private static final String INPUT = "Va%во~%оквеЙжa";

    public static void main(String[] args) {
        SpringApplication.run(StringHwApplication.class, args);
        /*Генерируем контекст*/
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        /*Получаем бин компонент с внедренным списком компонент-операций*/
        ModifierChain k = context.getBean(ModifierChain.class);
        k.introduce(INPUT);
    }

}
