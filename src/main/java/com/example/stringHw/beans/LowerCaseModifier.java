package com.example.stringHw.beans;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Переводит строку в нижний регистр
 */
@Component
public class LowerCaseModifier implements StringModifier {

    @Override
    public String modify(String source) {
        System.out.println("im first " + source);
        return source.toLowerCase(Locale.ROOT);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
