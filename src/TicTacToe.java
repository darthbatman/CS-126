// Rishi Masand
// University of Illinois at Urbana-Champaign
// CS 126 Fall 2017
// Lecture 2

import java.util.Scanner;

public class TicTacToe {

    public static int[][] winningSequences = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };

    public enum Evaluation {
        InvalidInput, NoWinner, Xwins, Owins, UnreachableState
    }

    public static Evaluation EvaluateBoard(String board){

        if (board.length() != 9){

            return Evaluation.InvalidInput;

        }

        String xSequence = "";
        String oSequence = "";

        for (int i = 0; i < board.length(); i++) {

            if (board.toLowerCase().charAt(i) == 'x'){

                xSequence += i;

            }
            else if (board.toLowerCase().charAt(i) == 'o'){

                oSequence += i;

            }

        }

        if (oSequence.length() > xSequence.length() || xSequence.length() > oSequence.length() + 1){

            return Evaluation.UnreachableState;

        }

        boolean xWins = false;
        boolean oWins = false;

        for (int i = 0; i < 8; i++) {

            if (xSequence.indexOf(Integer.toString(winningSequences[i][0])) != -1 && xSequence.indexOf(Integer.toString(winningSequences[i][1])) != -1 && xSequence.indexOf(Integer.toString(winningSequences[i][2])) != -1){

                xWins = true;

            }

            if (oSequence.indexOf(Integer.toString(winningSequences[i][0])) != -1 && oSequence.indexOf(Integer.toString(winningSequences[i][1])) != -1 && oSequence.indexOf(Integer.toString(winningSequences[i][2])) != -1){

                oWins = true;

            }

        }

        if (oWins && xWins){

            return Evaluation.UnreachableState;

        }
        else if (xWins){

            return Evaluation.Xwins;

        }
        else if (oWins){

            return Evaluation.Owins;

        }

        return Evaluation.NoWinner;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String board = scanner.nextLine();

        System.out.println(EvaluateBoard(board));

    }

}
