package com.design_pattern.demo.flyweightPattern.chess;

import java.util.HashMap;
import java.util.Map;

/**
 * 棋牌
 *
 * @Author sandu
 * @Date 2022-03-30 21:41
 */
public class ChessBoard {
    private Map<Integer ,ChessPiece> chessPieceMap = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init( ){
        chessPieceMap.put(1,new ChessPiece(ChesPieceUnitFactory.getChessPiece(1),0,0));
        chessPieceMap.put(2,new ChessPiece(ChesPieceUnitFactory.getChessPiece(2),0,0));
    }

    private void move(int chessPieceId,int toPositionX,int toPositionY){

    }
}
