package com.design_pattern.demo.flyweightPattern.chess;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author sandu
 * @Date 2022-03-30 21:54
 */
public class ChesPieceUnitFactory {
    private static final Map<Integer,ChessPieceUnit> pieceMap = new HashMap<>();

    static {
        pieceMap.put(1,new ChessPieceUnit(1,"车",ChessPieceUnit.Color.BLACK));
        pieceMap.put(2,new ChessPieceUnit(2,"车",ChessPieceUnit.Color.BLACK));
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId){
        return pieceMap.get(chessPieceId);
    }
}
