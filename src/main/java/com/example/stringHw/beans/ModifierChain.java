package com.example.stringHw.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Управляет очередью цепочки
 */
@Component
public class ModifierChain {

    private final List<StringModifier> modifiers;

    @Autowired
    public ModifierChain(List<StringModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public void introduce(String source) {
        for (StringModifier modifier : modifiers) {
            source = modifier.modify(source);
        }
        System.out.println("result: " + source);
    }
}
