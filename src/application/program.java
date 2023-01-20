package application;

import boardgame.Position;
import chess.ChessMatch;

public class program {

    public static void main(String[] args) {
       ChessMatch ch = new ChessMatch();
       
       UI.printBoard(ch.getPieces());
    }
}
