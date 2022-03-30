package com.design_pattern.demo.flyweightPattern.chess;

import lombok.Data;

/**
 * @Author sandu
 * @Date 2022-03-30 21:45
 */
@Data
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public static enum Color{
        RED,BLACK
    }

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }
}
