package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        ChessMatch ch = new ChessMatch();
        Scanner sc = new Scanner(System.in);
        List<ChessPiece> captured = new ArrayList<>();

        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(ch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                boolean[][] possibleMoves = ch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(ch.getPieces(), possibleMoves);


                System.out.println("");
                System.out.print("Target:");

                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = ch.performChessMove(source, target);

                if (capturedPiece != null){
                    captured.add(capturedPiece);
                }
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
