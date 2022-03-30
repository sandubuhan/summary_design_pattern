package com.design_pattern.demo.flyweightPattern.word;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-30 22:05
 */
public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}
