package com.example.stringHw.beans;

import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Переводит первый символ строки в верхний регистр
 */
@Component
public class UpperCaseModifier implements StringModifier {

    @Override
    public String modify(String source) {
        System.out.println("im third " + source);
        return source.substring(0,1).toUpperCase(Locale.ROOT) + source.substring(1);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
