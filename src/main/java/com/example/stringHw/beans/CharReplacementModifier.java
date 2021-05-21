package com.example.stringHw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Выполняет замену символов в соответствии с алфавитом
 */
@Component
public class CharReplacementModifier implements StringModifier {

    public final Map<String, String> alphabet;

    @Autowired
    public CharReplacementModifier(Map<String, String> alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public String modify(String source) {
        System.out.println("im fourth " + source);
        return replace(source);
    }

    @Override
    public int getOrder() {
        return 3;
    }

    /**
     * Заменяет вхождение символов строки в соответствии с алфавитом
     *
     * @param source исходная строка
     * @return модифицированная строка
     */
    private String replace(String source) {
        for (String key : alphabet.keySet()) {
            source = source.replaceAll(key, alphabet.get(key));
        }
        return source;
    }
}
