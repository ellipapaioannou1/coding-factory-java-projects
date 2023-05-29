package gr.aueb.cf.miniprojects;

import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char position;
        boolean player1 = true;
        boolean endOfGame = false;

        System.out.println("Welcome to the new round: ");

        createBoard();
        printBoard();
        System.out.println("");

        while(!endOfGame) {
            if (player1) {
                System.out.println("");
                System.out.println("Player I, your turn (X)");
                position = 'x';
            } else {
                System.out.println("");
                System.out.println("Player II, your turn (O)");
                position = 'o';
            }

            int row;
            int col;
            System.out.println("Please choose Row 0-2:");
            row = in.nextInt();
            System.out.println("Column 0-2: ");
            col = in.nextInt();
            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                System.out.println("Invalid choice, please try again!");
                continue;
            }
            if (board[row][col] != '_') {
                System.out.println("Please select an empty tile!");
                continue;
            }

            board[row][col] = position;
            printBoard();
            if (hasWon(board) == 'x') {
                System.out.println("Player I has won!");
                endOfGame = true;
            } else if (hasWon(board) == 'o') {
                System.out.println("Player II has won!");
                endOfGame = true;
            } else {
                if (fullBoard(board)) {
                    System.out.println("It's a tie!");
                    endOfGame = true;
                } else {
                    player1 = !player1;
                }
            }
        }
    }
    public static char hasWon(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '_' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }
        for (int j = 0; j < 3; j++){
            if (board[0][j] != '_' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return board[0][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '_' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[0][0];
            }
        }
         if(board[0][0] != '_' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
             return board[0][0];
         }
         if(board[2][0] != '_' && board[2][0] == board[1][1] && board[1][1] ==  board[0][2]) {
             return board[2][0];
         }
         else return ' ';
    }


    public static boolean fullBoard(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void createBoard() {

        for (int i = 0;i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }


}
