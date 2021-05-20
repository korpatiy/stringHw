package com.example.stringHw.beans;

import org.springframework.core.Ordered;

/**
 * Предоставляет методы для работы со строкой
 */
public interface StringModifier extends Ordered {

    /**
     * Модифицирует передаваемую строку
     * @param source строка
     * @return модифицированная строка
     */
    String modify(String source);
}
