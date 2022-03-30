package com.design_pattern.demo.flyweightPattern.chess;

import lombok.Data;

/**
 * 棋子
 *
 * @Author sandu
 * @Date 2022-03-30 21:39
 */
@Data
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit chessPieceUnit, int positionX, int positionY) {
        this.chessPieceUnit = chessPieceUnit;
        this.positionX = positionX;
        this.positionY = positionY;
    }


}
