package com.design_pattern.demo.mementoPattern.one;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author sandu
 * @Date 2022-05-03 14:29
 */

public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public void setText(String text) {
        this.text.replace(0, this.text.length(), text);
    }
}

