package application;

import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        ChessMatch ch = new ChessMatch();
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            UI.printBoard(ch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.out.println("");
            System.out.print("Target:");
            
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = ch.performChessMove(source, target);
        }
    }
}
