package com.design_pattern.demo.flyweightPattern.word;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-30 22:04
 */

public class CharacterStyle {
    private Font font;
    private int size;
    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public boolean equals(Object o) {
        CharacterStyle otherStyle = (CharacterStyle) o;
        return font.equals(otherStyle.font)
                && size == otherStyle.size
                && colorRGB == otherStyle.colorRGB;
    }
}




