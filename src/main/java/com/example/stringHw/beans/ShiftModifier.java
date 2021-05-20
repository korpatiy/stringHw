package com.example.stringHw.beans;

import org.springframework.stereotype.Component;

/**
 * Сдвигает строку на n символов вправо
 */
@Component
public class ShiftModifier implements StringModifier {

    @Override
    public String modify(String source) {
        System.out.println("im second " + source);
        return source.substring(source.length() - 2)
                + source.substring(0, source.length() - 2);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
