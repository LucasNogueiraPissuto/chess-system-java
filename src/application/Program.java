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

        while (!ch.getCheckMate()) {
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
                System.out.print("Target: ");

                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = ch.performChessMove(source, target);

                if (capturedPiece != null){
                    captured.add(capturedPiece);
                }

                if (ch.getPromoted() != null){
                    System.out.println("Enter piece for promotion (B/N/R/Q): ");
                    String type = sc.nextLine().toUpperCase();
                    while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")){
                        System.out.println("Invalid value! Enter piece for promotion (B/N/R/Q): ");
                        type = sc.nextLine().toUpperCase();
                    }
                    ch.replacePromotedPiece(type);
                }

            } catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        UI.clearScreen();
        UI.printMatch(ch, captured);
    }
}
