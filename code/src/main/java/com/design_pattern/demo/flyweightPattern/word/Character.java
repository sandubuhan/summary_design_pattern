package com.design_pattern.demo.flyweightPattern.word;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-30 22:04
 */

public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}
